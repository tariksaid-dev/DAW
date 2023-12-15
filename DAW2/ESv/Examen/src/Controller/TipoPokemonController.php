<?php

namespace App\Controller;

use App\Entity\TipoPokemon;
use App\Form\TipoPokemonType;
use App\Repository\TipoPokemonRepository;
use Doctrine\ORM\EntityManagerInterface;
use Symfony\Bundle\FrameworkBundle\Controller\AbstractController;
use Symfony\Component\HttpFoundation\Request;
use Symfony\Component\HttpFoundation\Response;
use Symfony\Component\Routing\Annotation\Route;

#[Route('/tipo/pokemon')]
class TipoPokemonController extends AbstractController
{
    #[Route('/', name: 'app_tipo_pokemon_index', methods: ['GET'])]
    public function index(TipoPokemonRepository $tipoPokemonRepository): Response
    {
        return $this->render('tipo_pokemon/index.html.twig', [
            'tipo_pokemons' => $tipoPokemonRepository->findAll(),
        ]);
    }

    #[Route('/new', name: 'app_tipo_pokemon_new', methods: ['GET', 'POST'])]
    public function new(Request $request, EntityManagerInterface $entityManager): Response
    {
        $tipoPokemon = new TipoPokemon();
        $form = $this->createForm(TipoPokemonType::class, $tipoPokemon);
        $form->handleRequest($request);

        if ($form->isSubmitted() && $form->isValid()) {
            $entityManager->persist($tipoPokemon);
            $entityManager->flush();

            return $this->redirectToRoute('app_tipo_pokemon_index', [], Response::HTTP_SEE_OTHER);
        }

        return $this->render('tipo_pokemon/new.html.twig', [
            'tipo_pokemon' => $tipoPokemon,
            'form' => $form,
        ]);
    }

    #[Route('/{id}', name: 'app_tipo_pokemon_show', methods: ['GET'])]
    public function show(TipoPokemon $tipoPokemon): Response
    {
        return $this->render('tipo_pokemon/show.html.twig', [
            'tipo_pokemon' => $tipoPokemon,
        ]);
    }

    #[Route('/{id}/edit', name: 'app_tipo_pokemon_edit', methods: ['GET', 'POST'])]
    public function edit(Request $request, TipoPokemon $tipoPokemon, EntityManagerInterface $entityManager): Response
    {
        $form = $this->createForm(TipoPokemonType::class, $tipoPokemon);
        $form->handleRequest($request);

        if ($form->isSubmitted() && $form->isValid()) {
            $entityManager->flush();

            return $this->redirectToRoute('app_tipo_pokemon_index', [], Response::HTTP_SEE_OTHER);
        }

        return $this->render('tipo_pokemon/edit.html.twig', [
            'tipo_pokemon' => $tipoPokemon,
            'form' => $form,
        ]);
    }

    #[Route('/{id}', name: 'app_tipo_pokemon_delete', methods: ['POST'])]
    public function delete(Request $request, TipoPokemon $tipoPokemon, EntityManagerInterface $entityManager): Response
    {
        if ($this->isCsrfTokenValid('delete'.$tipoPokemon->getId(), $request->request->get('_token'))) {
            $entityManager->remove($tipoPokemon);
            $entityManager->flush();
        }

        return $this->redirectToRoute('app_tipo_pokemon_index', [], Response::HTTP_SEE_OTHER);
    }
}
