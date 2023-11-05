export class Empresa {
  constructor(nombre, empleados = []) {
    this._nombre = nombre;
    this._empleados = empleados;
  }

  get nombre() {
    return this._nombre;
  }

  get empleados() {
    return this._empleados;
  }

  agregarEmpleados(...newEmpleados) {
    this._empleados.push(...newEmpleados);
  }

  pagarSalarios() {
    console.log(this._empleados);

    this._empleados.map((el) => {
      console.log(el);
      console.log(el.salario);
      console.log(el.dinero);

      el.dinero += el.salario;
    });
  }
}
