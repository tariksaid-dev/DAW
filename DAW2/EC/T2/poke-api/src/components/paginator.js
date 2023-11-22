import { getLocalStorage } from "../hooks/useLocalStorage";
import { paintPokemons } from "../hooks/usePokemons";

let page = 1;

const pages = getLocalStorage("pokemons");
let pagesSize = pages.length;

function regenerateMain() {
  const main = document.getElementsByTagName("main")[0];
  const nav = document.getElementsByTagName("nav")[0];

  main.remove();

  const mainNew = document.createElement("main");
  nav.insertAdjacentElement("afterend", mainNew);
  mainNew.className = "main";
}

function nextPage() {
  if (pagesSize / 9 === page) {
    regenerateMain();
    paintPokemons();
  } else {
    const actualIndex = page * 9;
    const endINdex = page * 9;
  }
}

function prevPage() {}

console.log(pagesSize);
console.log(pages);

export function paginator() {
  const btnBefore = document.getElementById("btn-before");
  const btnNext = document.getElementById("btn-next");

  btnBefore.addEventListener("click", () => {
    page--;
    regenerateMain();
  });

  btnNext.addEventListener("click", () => {
    page++;
    if (pagesSize / 9 === page) {
      getPokemonsFromLocalStorage();
    } else {
      regenerateMain();
      paintPokemons();
    }
  });
}
