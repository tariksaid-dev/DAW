import { paintLocalStoragePokemons, paintPokemons } from "../hooks/usePokemons";

// Página actual
let currentPage = 1;

// Total de páginas
let totalPages = 1;

function createNewPage(htmlElement) {
  currentPage++;
  const cardsToDelete = document.querySelectorAll("#main .card");
  cardsToDelete.forEach((card) => card.remove());
  paintPokemons(htmlElement);
}

function prevPage(htmlElement) {
  currentPage--;
  const cardsToDelete = document.querySelectorAll("#main .card");
  cardsToDelete.forEach((card) => card.remove());
  paintLocalStoragePokemons(currentPage, htmlElement);
}

function nextPage(htmlElement) {
  currentPage++;
  const cardsToDelete = document.querySelectorAll("#main .card");
  cardsToDelete.forEach((card) => card.remove());
  paintLocalStoragePokemons(currentPage, htmlElement);
}

export function paginator() {
  const btnBefore = document.getElementById("btn-before");
  const btnNext = document.getElementById("btn-next");
  const main = document.getElementById("main");

  btnBefore.addEventListener("click", () => {
    if (currentPage !== 1) {
      prevPage(main);
    }
  });

  btnNext.addEventListener("click", () => {
    if (currentPage === totalPages) {
      totalPages++;
      createNewPage(main);
    } else {
      nextPage(main);
    }
  });
}
