<?php

namespace App\Controller;

use App\Entity\Pokemon;
use App\Form\PokemonType;
use App\Repository\PokemonRepository;
use Doctrine\ORM\EntityManagerInterface;
use Symfony\Bundle\FrameworkBundle\Controller\AbstractController;
use Symfony\Component\HttpFoundation\File\Exception\FileException;
use Symfony\Component\HttpFoundation\Request;
use Symfony\Component\HttpFoundation\Response;
use Symfony\Component\Routing\Annotation\Route;
use Symfony\Component\String\Slugger\SluggerInterface;

#[Route('/pokemon')]
class PokemonController extends AbstractController
{
  #[Route('/', name: 'app_pokemon_index', methods: ['GET'])]
  public function index(PokemonRepository $pokemonRepository): Response
  {

    // dd($this->getUser());
    $userPokedex = $this->getUser()->getPokedex();

    return $this->render('pokemon/index.html.twig', [
      'pokemon' => $pokemonRepository->findAll(),
      "userPokedex" => $userPokedex,
    ]);
  }

  #[Route('/new', name: 'app_pokemon_new', methods: ['GET', 'POST'])]
  public function new(Request $request, EntityManagerInterface $entityManager, SluggerInterface $slugger): Response
  {
    $pokemon = new Pokemon();
    $form = $this->createForm(PokemonType::class, $pokemon);
    $form->handleRequest($request);

    if ($form->isSubmitted() && $form->isValid()) {

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

      $pokemon->setImagen($newFileName);

      $entityManager->persist($pokemon);
      $entityManager->flush();

      return $this->redirectToRoute('app_pokemon_index', [], Response::HTTP_SEE_OTHER);
    }

    return $this->render('pokemon/new.html.twig', [
      'pokemon' => $pokemon,
      'form' => $form,
    ]);
  }

  #[Route('/{id}', name: 'app_pokemon_show', methods: ['GET'])]
  public function show(Pokemon $pokemon): Response
  {
    return $this->render('pokemon/show.html.twig', [
      'pokemon' => $pokemon,
    ]);
  }

  #[Route('/{id}/edit', name: 'app_pokemon_edit', methods: ['GET', 'POST'])]
  public function edit(Request $request, Pokemon $pokemon, EntityManagerInterface $entityManager): Response
  {
    $form = $this->createForm(PokemonType::class, $pokemon);
    $form->handleRequest($request);

    if ($form->isSubmitted() && $form->isValid()) {
      $entityManager->flush();

      return $this->redirectToRoute('app_pokemon_index', [], Response::HTTP_SEE_OTHER);
    }

    return $this->render('pokemon/edit.html.twig', [
      'pokemon' => $pokemon,
      'form' => $form,
    ]);
  }

  #[Route('/{id}', name: 'app_pokemon_delete', methods: ['POST'])]
  public function delete(Request $request, Pokemon $pokemon, EntityManagerInterface $entityManager): Response
  {
    if ($this->isCsrfTokenValid('delete' . $pokemon->getId(), $request->request->get('_token'))) {
      $entityManager->remove($pokemon);
      $entityManager->flush();
    }

    return $this->redirectToRoute('app_pokemon_index', [], Response::HTTP_SEE_OTHER);
  }
}
