import { renderCardPokemon } from "./src/components/renderCardPokemon/renderCardPokemon";

const URL = "http://localhost:4000/pokeArray";
const divApp = document.querySelector("#app");

const img = document.querySelector(".card-img-top");

fetch(URL)
  .then((response) => {
    if (!response.ok) {
      throw new Error("no se ha podido sacar la data");
    }
    return response.json();
  })
  .then((data) => {
    data.map((pokemon) => {
      renderCardPokemon(divApp, pokemon, () => console.log("Hola mundo!"));
    });
  })
  .catch((err) => {
    console.log(err);
  });

img.addEventListener("dbl-click", () => {
  fetch(URL)
    .then((response) => {
      if (!response.ok) {
        throw new Error("no se ha podido sacar la data");
      }
      return response.json();
    })
    .then((data) => {
      data.map((pokemon) => {
        renderCardPokemon(divApp, pokemon, () => console.log("Hola mundo!"));
      });
    })
    .catch((err) => {
      console.log(err);
    });
});
