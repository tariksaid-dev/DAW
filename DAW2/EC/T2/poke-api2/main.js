import { getData } from "./hooks/useApi";
import { renderCardPokemon } from "./src/components/renderCardPokemon";
import { getSinglePokemonData } from "./src/utils/getSinglePokemonData";

const URL = "http://localhost:4000/pokeArray";
const divApp = document.querySelector("#app");
divApp.className = "main";

const data = await getData(URL);

data.forEach((element) => {
  divApp.appendChild(renderCardPokemon(element));
});

divApp.addEventListener("dblclick", async (e) => {
  if (e.target.classList.contains("card-img-top")) {
    const card = e.target.closest(".card");
    const cardBody = card.querySelector(".card-body");
    const cardName = card.querySelector(".card-title");
    const cardText = card.querySelector(".card-text");

    const name = cardName.textContent;

    const data = await getSinglePokemonData(URL, name);

    const img = card.querySelector(".card-img-top");

    if (img.src === data.images.imgFront) {
      img.src = data.images.imgBack;
      cardText.style.display = "none";

      const ul = document.createElement("ul");

      cardBody.appendChild(ul);
      data.abilities.forEach((el) => {
        const li = document.createElement("li");
        li.textContent = el;
        ul.appendChild(li);
      });
    } else {
      img.src = data.images.imgFront;
      cardText.style.display = "inline-block";

      const ul = card.querySelector("ul");
      ul.remove();
    }
  }
});
