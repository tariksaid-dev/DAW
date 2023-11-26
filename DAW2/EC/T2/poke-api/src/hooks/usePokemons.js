import { createCardElement } from "../components/Card";
import { getPokemons } from "./useApi";
import { backup, getLocalStorage } from "./useLocalStorage";

export async function paintPokemons(htmlElement) {
  const pokeObj = await pokeTransform();
  const pokeCards = pokeObj.map((poke) => createCardElement(poke));

  backup("pokemons", pokeObj);

  pokeCards.forEach((card) => {
    htmlElement.appendChild(card);
  });
}

async function pokeTransform() {
  const poke = await getPokemons();

  const pokeTransformed = poke.map((el) => ({
    name: el.name,
    sprite: el.sprites.front_default,
    types: el.types.map((element) => element.type.name),
  }));

  return pokeTransformed;
}

export function paintLocalStoragePokemons(page, htmlElement) {
  const localStoragePokemons = getLocalStorage("pokemons");

  const itemsPerPage = 9;
  const startIndex = (page - 1) * itemsPerPage;
  const endIndex = startIndex + itemsPerPage;

  const pokeCards = localStoragePokemons
    .slice(startIndex, endIndex)
    .map((poke) => createCardElement(poke));

  pokeCards.forEach((card) => {
    htmlElement.appendChild(card);
  });
}
