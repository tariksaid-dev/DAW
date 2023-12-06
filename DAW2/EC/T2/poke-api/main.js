import { createSpinner } from "./src/components/Spinner";
import { layoutGenerator } from "./src/components/layoutGenerator";
import { paginator } from "./src/components/Paginator";
import { paintPokemons } from "./src/hooks/usePokemons";
import { createDialogElement } from "./src/components/Dialog";

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

input.addEventListener("keydown", async (event) => {
  if (event.key === "Enter") {
    const oldDialog = document.getElementsByTagName("dialog");
    if (oldDialog[0]) oldDialog[0].remove();

    const query = input.value;

    const dialog = createDialogElement(main, query);
    dialog.showModal();

    dialog.addEventListener("click", (e) => {
      dialog.close();
    });
  }
});
