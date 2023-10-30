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

import { backup, getLocalStorage } from "./utils";

class Citas {
  constructor(dni, fecha, hora, datosPaciente) {
    this._dni = dni;
    this._fecha = fecha;
    this._hora = hora;
    this._datosPaciente = datosPaciente;
  }

  get dni() {
    return this._dni;
  }

  get fecha() {
    return this._fecha;
  }

  get hora() {
    return this._hora;
  }

  get datosPaciente() {
    return this._datosPaciente;
  }

  set dni(newDni) {
    this._dni = newDni;
  }

  set fecha(newFecha) {
    this._fecha = newFecha;
  }

  set hora(newHora) {
    this._hora = newHora;
  }

  set datosPaciente(newDatos) {
    this._datosPaciente = newDatos;
  }

  obtenerInformacion() {
    return this;
  }

  static citas = getLocalStorage("Citas");

  static agregarCita(cita) {
    if (!Citas.citas.some((el) => el._dni === cita.dni)) {
      Citas.citas.push(cita);
      backup("Citas", Citas.citas);
    } else {
      alert("El dni existe");
    }
  }
}

class CitasMedicas extends Citas {
  constructor(dni, fecha, hora, datosPaciente, especialidad) {
    super(dni, fecha, hora, datosPaciente);
    this._especialidad = especialidad;
  }

  get especialidad() {
    return this._especialidad;
  }

  set especialidad(newEspecialidad) {
    this._especialidad = newEspecialidad;
  }
}

const cita1 = new CitasMedicas(
  "12345678Z",
  "11-02-2023",
  "16:00",
  {
    nombre: "Tarik",
    apellidos: "Said Manjón",
  },
  "General"
);

CitasMedicas.agregarCita(cita1);

console.log((cita1.dni = "aaa"));

console.log(cita1.dni);
