/**
 * @author: Tarik Said Manjón
 * @description: Web para hacer pedidos de comida y guardarla en una db
 */

const URL = "http://localhost:3000/categories";
const ORDERURL = "http://localhost:3000/order";

const foodsDiv = document.querySelector(".row.mt-4.cards");
const orderDiv = document.querySelector(".col-md-4.order");

const searchInput = document.querySelector(".form-control.me-4");
const inputBtn = document.querySelector(".btn.btn-primary");

