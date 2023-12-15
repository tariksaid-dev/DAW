<?php

namespace App\Controller;

use App\Entity\Pokemon;
use App\Entity\User;
use Doctrine\ORM\EntityManagerInterface;
use Symfony\Bundle\FrameworkBundle\Controller\AbstractController;
use Symfony\Component\HttpFoundation\Request;
use Symfony\Component\HttpFoundation\Response;
use Symfony\Component\Routing\Annotation\Route;

class EquipoController extends AbstractController
{
  #[Route('/equipo', name: 'app_equipo')]
  public function index(): Response
  {
    return $this->render('equipo/index.html.twig', [
      'controller_name' => 'EquipoController',
    ]);
  }

  #[Route('/mostrar', name: 'app_equipo_show', methods: ['GET'])]
  public function show(): Response
  {

    $equipo = $this->getUser()->getEquipo();
    // dd($pokemon);
    // dd($equipo);

    return $this->render('equipo/index.html.twig', [
      "equipo" => $equipo,
    ]);
  }

  #[Route('/{id}/edit', name: 'app_equipo_edit', methods: ['GET', 'POST'])]
  public function edit(Request $request, Pokemon $pokemon, EntityManagerInterface $entityManager): Response
  {

    $user = $this->getUser();
    // $equipo = $user->getEquipo();

    $user->addEquipo($pokemon);

    $pokedex = $user->getPokedex();
    $entityManager->flush();

    return $this->redirectToRoute('app_equipo_show', ['id' => $pokedex->getId()], Response::HTTP_SEE_OTHER);
  }
}
