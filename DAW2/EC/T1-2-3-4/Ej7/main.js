/**
 * Crea un sistema de reservas de hoteles en JavaScript que incluye las siguientes clases: Hotel, Habitacion, Reserva. El sistema debe permitir la creación de hoteles con habitaciones, la realización de reservas y el cálculo del costo total de las reservas.
 */

import { backup } from "./utils";

function Hotel(nombre, habitaciones = []) {
  this._nombre = nombre;
  this._habitaciones = habitaciones;
  this._reservas = [];
}

Hotel.prototype = {
  get nombre() {
    return this._nombre;
  },
  set nombre(newNombre) {
    this._nombre = newNombre;
  },

  get habitaciones() {
    return this._habitaciones;
  },

  set habitaciones(newHabitaciones) {
    this._habitaciones.push(newHabitaciones);
  },

  get reservas() {
    return this._reservas;
  },

  set reservas(newReserva) {
    this._reservas.push(newReserva);
  },

  getPrecioReservas: function () {
    let res = 0;
    this._reservas.forEach((el) => {
      res += el._precio;
    });
    return res;
  },
};

function Habitacion(numero, camas, tipo) {
  this._numero = numero;
  this._camas = camas;
  this._tipo = tipo;
  this._isReserved = false;
}

Habitacion.prototype = {
  get numero() {
    return this._numero;
  },

  set numero(newNumero) {
    this._numero = newNumero;
  },

  get camas() {
    return this._camas;
  },

  set camas(newCamas) {
    this._camas = newCamas;
  },

  get tipo() {
    return this._tipo;
  },

  set tipo(newTipo) {
    this._tipo = newTipo;
  },

  get isReserved() {
    return this._isReserved;
  },

  set isReserved(newReserved) {
    this._isReserved = newReserved;
  },
};

function Reserva(datosPersona, precio, fecha, datosHabitacion) {
  this._datosPersona = datosPersona;
  this._precio = precio;
  this._fecha = fecha;
  this._datosHabitacion = datosHabitacion;
}

Reserva.prototype = {
  get datosPersona() {
    return this._datosPersona;
  },

  set datosPersona(newDatosPersona) {
    this._datosPersona = newDatosPersona;
  },

  get precio() {
    return this._precio;
  },

  set precio(newPrecio) {
    this._precio = newPrecio;
  },

  get fecha() {
    return this._fecha;
  },

  set fecha(newFecha) {
    this._fecha = newFecha;
  },

  get datosHabitacion() {
    return this._datosHabitacion;
  },

  set datosHabitacion(newDatosHabitacion) {
    this._datosHabitacion = newDatosHabitacion;
  },
};

const habitacion1 = new Habitacion("2323", 3, "Deluxe");
const habitacion2 = new Habitacion("2424", 2, "Normal");

const miHotel = new Hotel("HotelTarik", [habitacion1, habitacion2]);

miHotel.reservas = new Reserva(
  { nombre: "Tarik", apellidos: "Said Manjón" },
  200,
  "22-03",
  habitacion1
);

miHotel.reservas = new Reserva(
  { nombre: "Pepe", apellidos: "Pepito" },
  100,
  "23-03",
  habitacion2
);

console.log(miHotel);

console.log(miHotel.getPrecioReservas());

localStorage.clear();
backup("Hotel", miHotel);
