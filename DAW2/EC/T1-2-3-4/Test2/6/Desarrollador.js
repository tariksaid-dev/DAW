import { Empleado } from "./Empleado";

export class Desarrollador extends Empleado {
  constructor(nombre, apellido, salario, lenguaje) {
    super(nombre, apellido, salario);
    this._lenguaje = lenguaje;
  }

  get lenguaje() {
    return this._lenguaje;
  }
}
