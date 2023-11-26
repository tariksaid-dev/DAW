import { createSpinner } from "./src/components/Spinner";
import { layoutGenerator } from "./src/components/layoutGenerator";
import { paginator } from "./src/components/paginator";
import { paintPokemons } from "./src/hooks/usePokemons";

export const POKE_API_URL = `${import.meta.env.VITE_URL_API}`;

localStorage.clear();
layoutGenerator();

const main = document.getElementById("main");
const btnNext = document.getElementById("btn-next");
const btnBefore = document.getElementById("btn-before");

createSpinner(main);

setTimeout(async () => {
  document.querySelector(".spinner-container").remove();
  await paintPokemons(main);
  paginator();
}, 3000);
