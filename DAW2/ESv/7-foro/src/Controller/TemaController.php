<?php

namespace App\Controller;

use App\Entity\Comment;
use App\Entity\Foro;
use App\Entity\Tema;
use App\Form\CommentType;
use App\Form\TemaType;
use App\Repository\TemaRepository;
use Doctrine\ORM\EntityManagerInterface;
use Symfony\Bundle\FrameworkBundle\Controller\AbstractController;
use Symfony\Component\HttpFoundation\File\Exception\FileException;
use Symfony\Component\HttpFoundation\Request;
use Symfony\Component\HttpFoundation\Response;
use Symfony\Component\Routing\Annotation\Route;
use Symfony\Component\String\Slugger\SluggerInterface;

#[Route('/tema')]
class TemaController extends AbstractController
{
  #[Route('/', name: 'app_tema_index', methods: ['GET'])]
  public function index(TemaRepository $temaRepository): Response
  {

    $temas = $temaRepository->findAll();

    $foro ??= $temas[0]->getForo();

    return $this->render('tema/index.html.twig', [
      'temas' => $temas,
      "foro" => $foro,
    ]);
  }

  #[Route('/new/{id}', name: 'app_tema_new', methods: ['GET', 'POST'])]
  public function new(Foro $foro, Request $request, EntityManagerInterface $entityManager, SluggerInterface $slugger): Response
  {

    $tema = new Tema();
    $tema->setStatus(1);
    $tema->setUser($this->getUser());
    $tema->setDate(new \DateTime("now"));
    $tema->setForo($foro);

    $comment = new Comment();
    $comment->setDate(new \DateTime("now"));
    $comment->setStatus(1);
    $comment->setUser($this->getUser());

    // Asociamos el comentario con el tema


    $mainForm = $this->createFormBuilder()
      ->add("tema", TemaType::class, ["data" => $tema])
      ->add("comment", CommentType::class, ["data" => $comment])
      ->getForm();
    $mainForm->handleRequest($request);


    // $commentForm = $this->createForm(CommentType::class, $comment);


    // $form = $this->createForm(TemaType::class, $tema);
    // $form->handleRequest($request);

    if ($mainForm->isSubmitted() && $mainForm->isValid()) {

      $tema = $mainForm->get("tema")->getData();
      $comment = $mainForm->get("comment")->getData();

      $comment->setTema($tema);
      $tema->addComment($comment);

      $img = $mainForm->get("comment")["imagen"]->getData();

      if ($img) {
        $originalFilename = pathinfo($img->getClientOriginalName(), PATHINFO_FILENAME);
        $safeFileName = $slugger->slug($originalFilename);
        $newFileName = $safeFileName . "-" . uniqid() . "." . $img->guessExtension();

        try {
          $img->move(
            $this->getParameter("img_directory"),
            $newFileName,
          );
        } catch (FileException $e) {
          dd($e);
        }

        $comment->setImagen($newFileName);
        $tema->addComment($comment);
      }

      $entityManager->persist($tema);
      $entityManager->persist($comment);
      $entityManager->flush();

      return $this->redirectToRoute('app_tema_show', ["id" => $tema->getId()], Response::HTTP_SEE_OTHER);
    }

    return $this->render('tema/new.html.twig', [
      'tema' => $tema,
      'mainForm' => $mainForm->createView(),
      "foro" => $foro,
      // "commentForm" => $commentForm->createView(),
    ]);
  }

  #[Route('/{id}', name: 'app_tema_show', methods: ['GET'])]
  public function show(Tema $tema): Response
  {

    $comment = new Comment();
    $form = $this->createForm(CommentType::class, $comment, [
      "action" => $this->generateUrl("app_comment_new", ["id" => $tema->getId()])
    ]);


    return $this->render('tema/show.html.twig', [
      'tema' => $tema,
      "form" => $form->createView(),
    ]);
  }

  #[Route('/{id}/edit', name: 'app_tema_edit', methods: ['GET', 'POST'])]
  public function edit(Request $request, Tema $tema, EntityManagerInterface $entityManager): Response
  {
    $form = $this->createForm(TemaType::class, $tema);
    $form->handleRequest($request);

    if ($form->isSubmitted() && $form->isValid()) {
      $entityManager->flush();

      return $this->redirectToRoute('app_tema_index', [], Response::HTTP_SEE_OTHER);
    }

    return $this->render('tema/edit.html.twig', [
      'tema' => $tema,
      'form' => $form,
    ]);
  }

  #[Route('/{id}', name: 'app_tema_delete', methods: ['POST'])]
  public function delete(Request $request, Tema $tema, EntityManagerInterface $entityManager): Response
  {
    if ($this->isCsrfTokenValid('delete' . $tema->getId(), $request->request->get('_token'))) {
      $entityManager->remove($tema);
      $entityManager->flush();
    }

    return $this->redirectToRoute('app_tema_index', [], Response::HTTP_SEE_OTHER);
  }
}
