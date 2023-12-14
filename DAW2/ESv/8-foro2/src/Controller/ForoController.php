<?php

namespace App\Controller;

use App\Entity\Foro;
use App\Form\ForoType;
use App\Repository\ForoRepository;
use Doctrine\ORM\EntityManagerInterface;
use Symfony\Bundle\FrameworkBundle\Controller\AbstractController;
use Symfony\Component\HttpFoundation\Request;
use Symfony\Component\HttpFoundation\Response;
use Symfony\Component\Routing\Annotation\Route;

#[Route('/foro')]
class ForoController extends AbstractController
{
  #[Route('/', name: 'app_foro_index', methods: ['GET'])]
  public function index(ForoRepository $foroRepository): Response
  {
    return $this->render('foro/index.html.twig', [
      'foros' => $foroRepository->findAll(),
    ]);
  }

  #[Route('/new', name: 'app_foro_new', methods: ['GET', 'POST'])]
  public function new(Request $request, EntityManagerInterface $entityManager): Response
  {
    $foro = new Foro();
    $form = $this->createForm(ForoType::class, $foro);
    $form->handleRequest($request);

    if ($form->isSubmitted() && $form->isValid()) {
      $entityManager->persist($foro);
      $entityManager->flush();

      return $this->redirectToRoute('app_foro_index', [], Response::HTTP_SEE_OTHER);
    }

    return $this->render('foro/new.html.twig', [
      'foro' => $foro,
      'form' => $form,
    ]);
  }

  #[Route('/{id}', name: 'app_foro_show', methods: ['GET'])]
  public function show(Foro $foro): Response
  {
    return $this->render('foro/show.html.twig', [
      'foro' => $foro,
    ]);
  }

  #[Route('/{id}/edit', name: 'app_foro_edit', methods: ['GET', 'POST'])]
  public function edit(Request $request, Foro $foro, EntityManagerInterface $entityManager): Response
  {
    $form = $this->createForm(ForoType::class, $foro);
    $form->handleRequest($request);

    if ($form->isSubmitted() && $form->isValid()) {
      $entityManager->flush();

      return $this->redirectToRoute('app_foro_index', [], Response::HTTP_SEE_OTHER);
    }

    return $this->render('foro/edit.html.twig', [
      'foro' => $foro,
      'form' => $form,
    ]);
  }

  #[Route('/{id}', name: 'app_foro_delete', methods: ['POST'])]
  public function delete(Request $request, Foro $foro, EntityManagerInterface $entityManager): Response
  {
    if ($this->isCsrfTokenValid('delete' . $foro->getId(), $request->request->get('_token'))) {
      $entityManager->remove($foro);
      $entityManager->flush();
    }

    return $this->redirectToRoute('app_foro_index', [], Response::HTTP_SEE_OTHER);
  }
}
