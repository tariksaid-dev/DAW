import { paintSinglePokemon } from "../hooks/usePokemons";

export function createDialogElement(container, query) {
  const dialog = document.createElement("dialog");
  dialog.className = "dialog";
  container.appendChild(dialog);

  paintSinglePokemon(dialog, query);

  return dialog;
}
