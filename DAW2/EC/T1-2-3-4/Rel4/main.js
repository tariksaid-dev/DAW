/**
 * Crear una aplicación web que a través de un formulario me permita recoger los datos del nombre, edad y dni.
 * Cuando pulsemos el botóin de insertar usuario automáticamente creará, utilizando la herencia por prototipos, un usuario de tipo "UsuarioLiteral" y guardará en un array dichos objetos.
 *
 *  Si el dni no está repetido en la clave del localstorage donde se almacene mi array de objetos, entonces se almacenará.
 */

import { literalUser } from "./literalUser";
const nameInput = document.getElementById("name");
const ageInput = document.getElementById("age");
const dniInput = document.getElementById("dni");
const sendButton = document.getElementById("sendButton");
const correctDni = document.getElementById("correct");
const wrongDni = document.getElementById("wrong");
const existsDni = document.getElementById("exists");

function createUser(user) {
  const newUser = Object.create(user);
  newUser.name = nameInput.value;
  newUser.age = ageInput.value;
  newUser.dni = dniInput.value;
  if (!newUser.dni) return false;
  return newUser;
}

function helperAlertDisplay(foo) {
  foo
    ? (correctDni.style.display = "block")
    : (wrongDni.style.display = "block");
  setTimeout(() => {
    correctDni.style.display = "none";
    wrongDni.style.display = "none";
  }, 5000);
}

function dniExistsAlert() {
  existsDni.style.display = "block";

  setTimeout(() => {
    existsDni.style.display = "none";
  }, 5000);
}

function localStorageSave(storageKey, newUser) {
  if (isInLocalStorage(storageKey).includes(newUser.dni)) {
    console.log("ya existe");
    dniExistsAlert();
    return;
  }

  let newStorage = [];
  if (localStorage.getItem(storageKey)) {
    newStorage = newStorage.concat(
      ...JSON.parse(localStorage.getItem(storageKey)),
      newUser
    );
  } else {
    newStorage = [newUser];
  }
  localStorage.setItem(storageKey, JSON.stringify(newStorage));
}

function isInLocalStorage(storageKey) {
  let values = [];
  if (localStorage.getItem(storageKey)) {
    values = JSON.parse(localStorage.getItem(storageKey)).map((el) => el._dni);
  }
  return values;
}

function handleSend(e) {
  e.preventDefault();
  const newUser = createUser(literalUser);
  helperAlertDisplay(newUser);
  if (newUser) localStorageSave("datosUsuarios", newUser);
}

sendButton.addEventListener("click", handleSend);
