import { POKE_API_URL } from "../../main";
import { createRandomNumber } from "../../utils/createRandom";

export async function getPokemons() {
  const pokemons = Array.from({ length: 9 }).map(async () => {
    const url = POKE_API_URL + createRandomNumber();
    const res = await fetch(url);
    const data = await res.json();

    return data;
  });

  const res = await Promise.all(pokemons);
  return res;
}
