import { createRandomNumber } from "../../utils/createRandom";
import { API_URL } from "../../constants/constants";

export async function getPokemons() {
  const pokemons = Array.from({ length: 9 }).map(async () => {
    const url = API_URL + createRandomNumber();
    const res = await fetch(url);
    const data = await res.json();

    return data;
  });

  const res = await Promise.all(pokemons);
  return res;
}
