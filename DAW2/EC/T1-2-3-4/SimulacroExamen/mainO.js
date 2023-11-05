/**
 * **Ejercicio 1: Gestión de Citas Médicas**

En una clínica médica, necesitas gestionar las citas de los pacientes. Debes crear una estructura de programación orientada a objetos (POO) basada en _**Prototipos**_ que represente las citas médicas con las siguientes características:

- Atributos: `dni` `datos del paciente`, `fecha`, `hora`.
- Métodos: `obtenerInformacion` para obtener la información completa de la cita.

**Tres Variantes:**

1. Usando Objetos Literales.
2. Usando funciones constructoras.
3. Usando la clase de JavaScript.
 */

import { getLocalStorage } from "./utils";

const Citas = {
  _dni: "",
  _fecha: "",
  _hora: "",
  _datosPaciente: "",

  obtenerInformacion() {
    return this;
  },

  get dni() {
    return this._dni;
  },

  get fecha() {
    return this._fecha;
  },

  get hora() {
    return this._hora;
  },

  get datosPaciente() {
    return this._datosPaciente;
  },

  set dni(newDni) {
    this._dni = newDni;
  },

  set fecha(newFecha) {
    this._fecha = newFecha;
  },

  set hora(newHora) {
    this._hora = newHora;
  },

  set datosPaciente(newDatos) {
    this._datosPaciente = newDatos;
  },

  citas: getLocalStorage("Citas"),

  agregarCita(cita) {
    if (!Citas.citas.some((el) => el._dni === cita.dni)) {
      Citas.citas.push(cita);
      backup("Citas", Citas.citas);
    } else {
      alert("El DNI ya existe");
    }
  },
};

const a = Object.create(Citas);

a.dni = "12345678Z";
a.fecha = "22-03-2032";
a.hora = "22:00";
a.datosPaciente = {
  nombre: "Tarik",
  apellidos: "Said Manjón",
};

console.log(a);
