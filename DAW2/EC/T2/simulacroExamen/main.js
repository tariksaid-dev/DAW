/**
 * @author: Tarik Said Manjón
 * @description: Web para hacer pedidos de comida y guardarla en una db
 */

import { findFoodsApi } from "./api/findFoodsApi";
import {
  getFoodApiById,
  getFoodsApi,
  getFoodsApiById,
} from "./api/getFoodsApi";
import { saveOrderApi } from "./api/saveOrderApi";
import { renderButton } from "./components/renderButton";
import { renderCardFoods } from "./components/renderCardFoods";
import { renderCardOrder } from "./components/renderCardOrder";
import { dataTransform } from "./utils/dataTransform";
import { backup } from "./utils/useLocalStorage";

const URL = "http://localhost:3000/categories";
const ORDERURL = "http://localhost:3000/order";

const foodsDiv = document.querySelector(".row.mt-4.cards");
const orderDiv = document.querySelector(".col-md-4.order");

const searchInput = document.querySelector(".form-control.me-4");
const inputBtn = document.querySelector(".btn.btn-primary");

const foodData = await getFoodsApi(URL);

let totalPrice = 0;

foodData.forEach((el) => {
  renderCardFoods(foodsDiv, el);
});

foodsDiv.addEventListener("click", async (e) => {
  if (e.target.textContent === "Añadir") {
    const card = e.target.closest(".col-md-4");
    card.style.opacity = 0.5;

    const cardId = e.target.getAttribute("data-id");
    const cardData = await getFoodApiById(URL, cardId);

    renderCardOrder(orderDiv, cardData);

    // añado botón si es la primera card
    if (orderDiv.querySelectorAll(".col").length == 1) {
      renderButton(orderDiv);
    }

    // manipulo el precio
    const priceElement = card.querySelectorAll(".card-text")[0];
    const itemPrice = priceElement.getAttribute("data-price");
    const totalOrderPrice = orderDiv.getElementsByTagName("span")[0];

    totalPrice += Number(itemPrice);
    totalOrderPrice.textContent = totalPrice;
  }
});

orderDiv.addEventListener("click", async (e) => {
  if (e.target.textContent === "Quitar") {
    const card = e.target.closest(".col");
    const cardId = e.target.getAttribute("data-id");

    // elimino opacidad
    const originalCardBtn = foodsDiv.querySelector(`[data-id="${cardId}"]`);
    const originalCard = originalCardBtn.closest(".col-md-4");
    originalCard.style.opacity = 1;

    // manipulo el precio
    const priceElement = card.querySelectorAll(".card-text")[0];
    const itemPrice = priceElement.getAttribute("data-price");
    totalPrice -= itemPrice;
    const totalOrderPrice = orderDiv.getElementsByTagName("span")[0];
    totalOrderPrice.textContent = totalPrice;

    card.remove();

    // Elimino botón si no hay cards
    if (orderDiv.querySelectorAll(".col").length == 0) {
      const divPagar = orderDiv.querySelector(".d-flex.p-2.text-light");
      divPagar.remove();
    }
  }

  if (e.target.textContent === "Pagar") {
    const anchors = orderDiv.getElementsByTagName("a");

    const ids = Array.from(anchors).map((el) => {
      return el.getAttribute("data-id");
    });

    // guardando en ls
    const data = await getFoodsApiById(URL, ids);

    const newData = {
      platos: data,
      totalPrice: data.reduce((acc, el) => (acc += el.price), 0),
    };

    // MANERA 2
    // const data = await getFoodsApi(URL);

    // const myData = data.filter((el) => {
    //   if (ids.includes(el.id)) return el;
    // });

    // const newData = {
    //   platos: myData,
    //   totalPrice: myData.reduce((acc, el) => (acc += el.price), 0),
    // };

    backup("OrdersFood", newData);

    // guardando en el endpoint
    await saveOrderApi(ORDERURL, newData);

    // limpiar todo el front
    globalThis.location.reload();
  }
});

inputBtn.addEventListener("click", async (e) => {
  const query = searchInput.value;
  const data = await findFoodsApi(URL, query);
  console.log(data);

  foodsDiv.innerHTML = "";
  renderCardFoods(foodsDiv, data);
});

searchInput.addEventListener("keydown", (e) => {
  if (e.key === "Escape" || (searchInput.value == "" && e.key === "Enter")) {
    foodsDiv.innerHTML = "";
    foodData.forEach((el) => {
      renderCardFoods(foodsDiv, el);
    });
  }
});
