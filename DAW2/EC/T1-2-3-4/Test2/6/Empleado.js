export class Empleado {
  _dinero = 1;

  constructor(nombre, apellido, salario) {
    this._nombre = nombre;
    this._apellido = apellido;
    this._salario = salario;
  }

  get nombre() {
    return this._nombre;
  }

  get apellido() {
    return this._apellido;
  }

  get salario() {
    return this._salario;
  }

  get dinero() {
    return this._dinero;
  }

  set dinero(newDinero) {
    this._dinero = newDinero;
  }
}
