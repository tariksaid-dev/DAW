export function renderCardPokemon(pokemonData) {
  const card = document.createElement("div");
  card.classList.add("card");
  card.style.width = "18rem";

  card.innerHTML = `
  <img src="${pokemonData.images.imgFront}" class="card-img-top" alt="${pokemonData.name}">
  <div class="card-body">
    <h5 class="card-title">${pokemonData.name}</h5>
    <p class="card-text">Lorem Ipsum</p>
  </div>
  `;

  return card;
}
