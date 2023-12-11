export function renderCardOrder(
  container,
  { id, strCategory, strCategoryThumb, price }
) {
  const card = document.createElement("div");
  card.className = "col";

  card.innerHTML = `
<div class="card">
  <img
    src=${strCategoryThumb}
    class="card-img-top"
    alt="Imagen de comida"
  />
  <div class="card-body">
    <h5 class="card-title">${strCategory}</h5>
    <p class="card-text" data-price=${price}>Precio: $${price}</p>
    <a href="#" class="btn btn-link card-link" data-id=${id}>Añadir</a>
  </div>
</div>
`;

  container.appendChild(card);
}
