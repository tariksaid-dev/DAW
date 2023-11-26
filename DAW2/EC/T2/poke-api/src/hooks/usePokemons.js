import { createCardElement } from "../components/Card";
import { getPokemons } from "./useApi";
import { backup } from "./useLocalStorage";

export async function paintPokemons(htmlElement) {
  const pokeObj = await pokeTransform();
  const pokeCards = pokeObj.map((poke) => createCardElement(poke));

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
