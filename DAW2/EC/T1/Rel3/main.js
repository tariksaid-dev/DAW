import { users } from "./constants";

localStorage.clear();
users.map((el) =>
  localStorage.setItem(el.login.username, btoa(el.login.password))
);

const username = document.getElementById("username");
const password = document.getElementById("password");
const form = document.getElementById("form");
const textarea = document.getElementById("text-area");
const loadButton = document.getElementById("load");

function handleSubmit(e) {
  e.preventDefault();
  checkIsInLocalStorage();
}

function handleTextArea(e) {
  e.preventDefault();
  loadUsers();
}

function checkIsInLocalStorage() {
  localStorage.getItem(username.value)
    ? alert("Ya esxiste")
    : localStorage.setItem(username.value, btoa(password.value));
}

function loadUsers() {
  textarea.value = Object.keys(localStorage).map(
    (el, i) => el + ": " + atob(Object.values(localStorage)[i]) + "\n"
  );
  textarea.value = textarea.value.replaceAll(",", "");
}

form.addEventListener("submit", handleSubmit);
loadButton.addEventListener("click", handleTextArea);
