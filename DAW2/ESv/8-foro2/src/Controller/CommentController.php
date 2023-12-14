<?php

namespace App\Controller;

use App\Entity\Comment;
use App\Entity\Tema;
use App\Form\CommentType;
use App\Repository\CommentRepository;
use DateTime;
use Doctrine\ORM\EntityManagerInterface;
use Symfony\Bundle\FrameworkBundle\Controller\AbstractController;
use Symfony\Component\HttpFoundation\File\Exception\FileException;
use Symfony\Component\HttpFoundation\Request;
use Symfony\Component\HttpFoundation\Response;
use Symfony\Component\Routing\Annotation\Route;
use Symfony\Component\String\Slugger\SluggerInterface;

#[Route('/comment')]
class CommentController extends AbstractController
{
  #[Route('/', name: 'app_comment_index', methods: ['GET'])]
  public function index(CommentRepository $commentRepository): Response
  {
    return $this->render('comment/index.html.twig', [
      'comments' => $commentRepository->findAll(),
    ]);
  }

  #[Route('/new/{id}', name: 'app_comment_new', methods: ['GET', 'POST'])]
  public function new(Tema $tema, Request $request, EntityManagerInterface $entityManager, SluggerInterface $slugger): Response
  {
    $comment = new Comment();
    $form = $this->createForm(CommentType::class, $comment);
    $form->handleRequest($request);

    if ($form->isSubmitted() && $form->isValid()) {
      $comment->setDate(new DateTime());
      $comment->setStatus(1);
      $comment->setUser($this->getUser());
      $comment->setTema($tema);

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

      $entityManager->persist($comment);
      $entityManager->flush();

      return $this->redirectToRoute('app_tema_show', ["id" => $comment->getTema()->getId()], Response::HTTP_SEE_OTHER);
    }

    return $this->render('comment/new.html.twig', [
      'comment' => $comment,
      'form' => $form,
    ]);
  }

  #[Route('/{id}', name: 'app_comment_show', methods: ['GET'])]
  public function show(Comment $comment): Response
  {
    return $this->render('comment/show.html.twig', [
      'comment' => $comment,
    ]);
  }

  #[Route('/{id}/edit', name: 'app_comment_edit', methods: ['GET', 'POST'])]
  public function edit(Request $request, Comment $comment, EntityManagerInterface $entityManager): Response
  {
    $form = $this->createForm(CommentType::class, $comment);
    $form->handleRequest($request);

    if ($form->isSubmitted() && $form->isValid()) {
      $entityManager->flush();

      return $this->redirectToRoute('app_comment_index', [], Response::HTTP_SEE_OTHER);
    }

    return $this->render('comment/edit.html.twig', [
      'comment' => $comment,
      'form' => $form,
    ]);
  }

  #[Route('/{id}', name: 'app_comment_delete', methods: ['POST'])]
  public function delete(Request $request, Comment $comment, EntityManagerInterface $entityManager): Response
  {
    if ($this->isCsrfTokenValid('delete' . $comment->getId(), $request->request->get('_token'))) {
      $entityManager->remove($comment);
      $entityManager->flush();
    }

    return $this->redirectToRoute('app_comment_index', [], Response::HTTP_SEE_OTHER);
  }
}
