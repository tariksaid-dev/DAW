import { Empleado } from "./Empleado";

export class Gerente extends Empleado {
  constructor(nombre, apellido, salario, bono) {
    super(nombre, apellido, salario);
    this._bono = bono;
  }

  get bono() {
    return this._bono;
  }
}
