/**
 * @author: Tarik Said Manjón
 * @description: Web de control de habitaciones y aforo de un hotel, con sección de checkins y checkouts
 * @version: 1.0
 */

import { cashiering } from "./api/cashiering";
import { deleteCheckin } from "./api/deleteCheckin";
import { getCheckin, getSingleCheckin } from "./api/getCheckin";
import { getHabitaciones, getSingleHabitacion } from "./api/getHabitaciones";
import { saveCheckin } from "./api/saveCheckin";
import { saveCheckout } from "./api/saveCheckout";
import { updateCheckin } from "./api/updateCheckin";
import { renderCheckin } from "./components/renderCheckin";
import { isValid } from "./utils/formValidation";
import { priceCalculator } from "./utils/priceCalculator";
import { randomSelector } from "./utils/randomSelector";

// constantes URL
const URL_CHECKIN = "http://localhost:3000/checkins";
const URL_HABITACIONES = "http://localhost:3000/habitaciones";
const URL_CHECKOUTS = "http://localhost:3000/checkouts";

// DOM general
const section = document.querySelector(".tabla");

// DOM tabla
const tbody = document.getElementsByTagName("tbody")[0];

// DOM formulario
const form = document.querySelector(".contact__form");
const formBtn = document.querySelector(".contact__cta");
const formNombreCliente = document.getElementById("nombre");
const formEmailCliente = document.getElementById("email");
const formNumeroPersonas = document.getElementById("numero-personas");
const formFechaEntrada = document.getElementById("fecha-entrada");
const formFechaSalida = document.getElementById("fecha-salida");

// DOM botón cash
const btnCash = document.querySelector(".btn-cash");

const currentCheckin = await getCheckin(URL_CHECKIN);
const habitacionesTotales = await getHabitaciones(URL_HABITACIONES);

currentCheckin.forEach((element) => {
  renderCheckin(tbody, element);
});

formBtn.addEventListener("click", async (e) => {
  e.preventDefault();

  // Si el botón es pulsado, hago las validaciones pertinentes (tanto para editar como para crear)
  if (
    !isValid(
      formNombreCliente,
      formEmailCliente,
      formNumeroPersonas,
      formFechaEntrada,
      formFechaSalida
    )
  ) {
    throw new Error("Error en el formulario");
  }

  if (formBtn.textContent === "Editar") {
    // Consigo la data del checking mediante el id
    const checkinId = formBtn.getAttribute("data-id");
    const checkinData = await getSingleCheckin(URL_CHECKIN, checkinId);

    // Consigo la data de la habitación
    const numeroHabitacion = checkinData.numero_habitacion;
    const habitacionData = await getSingleHabitacion(
      URL_HABITACIONES,
      numeroHabitacion
    );

    // Recalculo el precio final
    const precioFinal = priceCalculator(
      habitacionData,
      formFechaEntrada.value,
      formFechaSalida.value,
      formNumeroPersonas.value
    );

    // creo el nuevo objeto
    const obj = {
      nombre: formNombreCliente.value,
      correo: formEmailCliente.value,
      numero_habitacion: numeroHabitacion,
      numero_personas: Number(formNumeroPersonas.value),
      fecha_entrada: formFechaEntrada.value,
      fecha_salida: formFechaSalida.value,
      precio_facturado: precioFinal,
    };

    // Hago el update
    await updateCheckin(URL_CHECKIN, checkinId, obj);

    // Actualizo el front y el botón vuelve a la normalidad
    // Reinicio form
    form.reset();

    //Cambio textContent de botón
    formBtn.textContent = "Check-In";
    formBtn.style.backgroundColor = null;

    // Actualizo tabla
    tbody.innerHTML = `
    <tr>
      <th>Num</th>
      <th>Cliente</th>
      <th>Personas</th>
      <th>F. entrada</th>
      <th>F. salida</th>
      <th>Precio</th>
      <th>Editar</th>
      <th>Checkout</th>
    </tr>
    `;

    // consigo la nueva data
    const newData = await getCheckin(URL_CHECKIN);

    // vuelvo a pintar el tbody
    newData.forEach((el) => renderCheckin(tbody, el));
  } else {
    // MANIPULACIÓN HABITACIONES
    // Hago un nuevo array con las habitaciones ocupadas
    const habitacionesOcupadas = currentCheckin.map((el) => {
      return el.numero_habitacion;
    }); // [101, 202, 303]

    // Saco los números de todas las habitaciones
    const habitacionesTotalesNumero = habitacionesTotales.map(
      (el) => el.numero_habitacion
    );

    // Filtro entre las habitaciones totales las libres
    const habitacionesLibres = habitacionesTotalesNumero.filter(
      (el) => !habitacionesOcupadas.includes(el)
    );

    // Creo un índice aleatorio entre el tamaño de mi array habitacionesLibres
    const index = randomSelector(habitacionesLibres);

    // Selecciono la habitación aleatoria
    const habitaciónAleatoria = habitacionesLibres[index];

    // Consigo el precio de la habitación
    // 1. Fetcheo la habitación
    const habitaciónData = await getSingleHabitacion(
      URL_HABITACIONES,
      habitaciónAleatoria
    );

    // 2. Utilizo los datos de la habitación y los campos del formulario para calcular el precio final
    const precioFinal = priceCalculator(
      habitaciónData,
      formFechaEntrada.value,
      formFechaSalida.value,
      formNumeroPersonas.value
    );

    // Creo mi objeto
    const obj = {
      nombre: formNombreCliente.value,
      correo: formEmailCliente.value,
      numero_habitacion: habitaciónAleatoria,
      numero_personas: Number(formNumeroPersonas.value),
      fecha_entrada: formFechaEntrada.value,
      fecha_salida: formFechaSalida.value,
      precio_facturado: precioFinal,
    };

    // Fetcheo mis datos mediante POST y acabo con el back
    saveCheckin(URL_CHECKIN, obj);

    // Paso al front
    // Limpio el tbody
    tbody.innerHTML = `
    <tr>
      <th>Num</th>
      <th>Cliente</th>
      <th>Personas</th>
      <th>F. entrada</th>
      <th>F. salida</th>
      <th>Precio</th>
      <th>Editar</th>
      <th>Checkout</th>
    </tr>
    `;

    // consigo la nueva data
    const newData = await getCheckin(URL_CHECKIN);

    // vuelvo a pintar el tbody
    newData.forEach((el) => renderCheckin(tbody, el));
  }
});

// EventListener para el section entero, ya que es lo que está dinámicamente en el html
section.addEventListener("click", async (e) => {
  // Si hacemos click en el botón Editar
  if (e.target.textContent === "Editar") {
    // Consigo el ID que había insertado en el botón en la función de renderizar las filas
    const id = e.target.getAttribute("data-id");

    // Fetcheo para conseguir el objeto habitación
    const data = await getSingleCheckin(URL_CHECKIN, id);

    // Con los datos disponibles, relleno el formulario superior
    formNombreCliente.value = data.nombre;
    formEmailCliente.value = data.correo;
    formNumeroPersonas.value = data.numero_personas;
    formFechaEntrada.value = data.fecha_entrada;
    formFechaSalida.value = data.fecha_salida;

    // Como necesito diferenciar un POST de un PUT, cambio el contenido del botón del formulario para poder hacer una acción u otra dependiendo del textContent del mismo
    formBtn.textContent = "Editar";
    formBtn.style.backgroundColor = "grey";
    formBtn.setAttribute("data-id", id);

    // Prosigo en el if del eventListener del botón del formulario
  }

  if (e.target.textContent === "Check-Out") {
    // Cojo los datos para trabajar en el back
    const id = e.target.getAttribute("data-id");
    const data = await getSingleCheckin(URL_CHECKIN, id);

    // elimino el id
    const newData = {
      nombre: data.nombre,
      correo: data.correo,
      numero_habitacion: data.numero_habitacion,
      numero_personas: data.numero_personas,
      fecha_entrada: data.fecha_entrada,
      fecha_salida: data.fecha_salida,
      precio_facturado: data.precio_facturado,
    };

    // Guardo los datos en el endpoint de checkout
    await saveCheckout(URL_CHECKOUTS, newData);

    // Elimino los datos del checkin
    await deleteCheckin(URL_CHECKIN, id);

    // Actualizo el front
    tbody.innerHTML = `
    <tr>
      <th>Num</th>
      <th>Cliente</th>
      <th>Personas</th>
      <th>F. entrada</th>
      <th>F. salida</th>
      <th>Precio</th>
      <th>Editar</th>
      <th>Checkout</th>
    </tr>
    `;

    // consigo la nueva data
    const newCheckinData = await getCheckin(URL_CHECKIN);

    // vuelvo a pintar el tbody
    newCheckinData.forEach((el) => renderCheckin(tbody, el));
  }
});

btnCash.addEventListener("click", async (e) => {
  // Saco el contenedor padre del botón, donde pintaré el dinero
  const figure = btnCash.closest(".contact__picture");

  // Saco el dinero mediante mi función cashiering
  const data = await cashiering(URL_CHECKOUTS);

  // Creo un nuevo elemento en el dom
  const span = document.createElement("span");
  span.textContent = `Se ha facturado $${data.money} con ${data.numeroCashOut} clientes!`;
  span.classList.add("span-cash");

  // Agrego al contenedor padre mi nuevo elemento
  figure.appendChild(span);

  // Quiero que el span desaparezca para que no se acumule
  setTimeout(() => {
    span.remove();
  }, 4000);
});
