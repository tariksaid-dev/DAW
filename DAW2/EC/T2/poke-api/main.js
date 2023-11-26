import { createSpinner } from "./src/components/Spinner";
import { layoutGenerator } from "./src/components/layoutGenerator";
import { paginator } from "./src/components/Paginator";
import { paintPokemons, paintSinglePokemon } from "./src/hooks/usePokemons";

export const POKE_API_URL = `${import.meta.env.VITE_URL_API}`;

localStorage.clear();
layoutGenerator();

const main = document.getElementById("main");
const input = document.querySelector(".input");

createSpinner(main);

setTimeout(async () => {
  document.querySelector(".spinner-container").remove();
  await paintPokemons(main);
  paginator();
}, 3000);

input.addEventListener("keydown", (event) => {
  if (event.key === "Enter") {
    const query = input.value;
    // const cardsToDelete = document.querySelectorAll("#main .card");
    // cardsToDelete.forEach((card) => card.remove());
    // podría hacer otro main como modal etc
    paintSinglePokemon(main, query);
  }
});
