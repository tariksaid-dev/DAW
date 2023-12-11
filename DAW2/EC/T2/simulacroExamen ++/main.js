/**
 * @author: Tarik Said Manjón
 * @description: Web para hacer pedidos de comida y guardarla en una db
 */

import { getAllFood, getFoodById } from "./api/getFoodsApi";
import { updateFood } from "./api/updateFoodApi";
import { renderCardFoods } from "./components/renderCardFoods";
import { renderCardOrder } from "./components/renderCardOrder";

const URL = "http://localhost:3000/categories";
const ORDERURL = "http://localhost:3000/order";

const foodsDiv = document.querySelector(".row.mt-4.cards");
const orderDiv = document.querySelector(".col-md-4.order");

const searchInput = document.querySelector(".form-control.me-4");
const inputBtn = document.querySelector(".btn.btn-primary");

const data = await getAllFood(URL);

data.forEach((el) => {
  renderCardFoods(foodsDiv, el);
});

foodsDiv.addEventListener("click", async (e) => {
  if (e.target.textContent === "Añadir") {
    const card = e.target.closest(".col-md-4");
    const cardId = e.target.getAttribute("data-id");

    // Cambiamos la opacidad al dar click
    card.style.opacity = 0.5;

    // Movemos la tarjeta a la derecha
    const cardData = await getFoodById(URL, cardId);
    renderCardOrder(orderDiv, cardData);

    const newData = data[0];

    newData.strCategory = "desert";
    console.log(newData);

    await updateFood(URL, newData.id, newData);
  }
});
