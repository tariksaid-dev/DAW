import { createSpinner } from "./src/components/Spinner";
import { layoutGenerator } from "./src/components/layoutGenerator";
import { paginator } from "./src/components/paginator";
import { paintPokemons } from "./src/hooks/usePokemons";

export const POKE_API_URL = `${import.meta.env.VITE_URL_API}`;

localStorage.clear();
layoutGenerator();

const main = document.getElementById("main");

createSpinner(main);

setTimeout(() => {
  document.querySelector(".spinner-container").remove();
  paintPokemons(main);
}, 3000);

paginator();
