import { getPokemons } from "./useApi";
import { backup } from "./useLocalStorage";

export async function paintPokemons() {
  const poke = await getPokemons();
  backup("pokemons", poke);
  const main = document.getElementsByTagName("main")[0];

  poke.forEach((element) => {
    const { name, sprites, types } = element;
    const div = document.createElement("div");
    main.appendChild(div);
    div.innerHTML = `
    <img src='${sprites.front_default}'/>
    <span>${name}</span><br>
    <span>${types[0].type.name}</span>
    `;
  });
}
export async function paintSelectedPokemons() {}
