import { users } from "./constants";

const username = document.getElementById("username");
const password = document.getElementById("password");
const form = document.getElementById("form");
const textarea = document.getElementById("text-area");
const loadButton = document.getElementById("load");

function handleSubmit(e) {
  e.preventDefault();
  checkIsInLocalStorage("users", username.value);
}

function handleTextArea(e) {
  e.preventDefault();
  loadUsers();
}

function addAllToLocalStorage() {
  localStorage.setItem(
    "users",
    JSON.stringify(
      users.map((el) => ({ [el.login.username]: btoa(el.login.password) }))
    )
  );
}

// JavaScript terrorism
function addNewToLocalStorage() {
  localStorage.setItem(
    "users",
    localStorage
      .getItem("users")
      .slice(0, -1)
      .concat(`,{"${username.value}":"${btoa(password.value)}"}]`)
  );
}

function checkIsInLocalStorage(key, name) {
  JSON.parse(localStorage.getItem(key))
    .reduce((acc, el) => acc.concat(Object.keys(el)), [])
    .includes(name)
    ? alert("Ya existe")
    : addNewToLocalStorage();
}

function loadUsers() {
  textarea.value = JSON.parse(localStorage.getItem("users"))
    .map((el) =>
      Object.entries(el).map(([key, value]) => `${key}: ${atob(value)}`)
    )
    .join(", \n");
}

localStorage.clear();
addAllToLocalStorage();

form.addEventListener("submit", handleSubmit);
loadButton.addEventListener("click", handleTextArea);
