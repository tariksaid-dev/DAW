<?php

namespace App\Controller;

use App\Entity\Comment;
use App\Entity\Foro;
use App\Entity\Tema;
use App\Form\TemaType;
use App\Repository\TemaRepository;
use DateTime;
use Doctrine\ORM\EntityManagerInterface;
use Symfony\Bundle\FrameworkBundle\Controller\AbstractController;
use Symfony\Component\HttpFoundation\File\Exception\FileException;
use Symfony\Component\HttpFoundation\Request;
use Symfony\Component\HttpFoundation\Response;
use Symfony\Component\Routing\Annotation\Route;
use Symfony\Component\String\Slugger\SluggerInterface;
use Symfony\Component\Validator\Constraints\Date;

#[Route('/tema')]
class TemaController extends AbstractController
{
  #[Route('/', name: 'app_tema_index', methods: ['GET'])]
  public function index(TemaRepository $temaRepository): Response
  {
    return $this->render('tema/index.html.twig', [
      'temas' => $temaRepository->findAll(),
    ]);
  }

  #[Route('/new/{id}', name: 'app_tema_new', methods: ['GET', 'POST'])]
  public function new(Foro $foro, Request $request, EntityManagerInterface $entityManager, SluggerInterface $slugger): Response
  {
    $tema = new Tema();
    $form = $this->createForm(TemaType::class, $tema);
    $form->handleRequest($request);

    $comment = new Comment();


    if ($form->isSubmitted() && $form->isValid()) {

      $commentText = $form->get("commentText")->getData();
      $comment->setText($commentText);
      $comment->setDate(new DateTime());
      $comment->setStatus(1);
      $comment->setUser($this->getUser());

      $tema->setDate(new DateTime());
      $tema->setStatus(1);
      $tema->setForo($foro);
      $tema->setUser($this->getUser());


      $img = $form->get("imagen")->getData();

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
      }

      $comment->setImagen($newFileName);
      $comment->setTema($tema);


      $entityManager->persist($comment);
      $entityManager->persist($tema);
      $entityManager->flush();

      return $this->redirectToRoute('app_tema_show', ["id" => $tema->getId()], Response::HTTP_SEE_OTHER);
    }

    return $this->render('tema/new.html.twig', [
      'tema' => $tema,
      'form' => $form,
    ]);
  }

  #[Route('/{id}', name: 'app_tema_show', methods: ['GET'])]
  public function show(Tema $tema): Response
  {
    return $this->render('tema/show.html.twig', [
      'tema' => $tema,
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
