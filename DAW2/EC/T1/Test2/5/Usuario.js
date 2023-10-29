export class Usuario {
  constructor(id, nombre, apellido, email) {
    this._id = id;
    this._nombre = nombre;
    this._apellido = apellido;
    this._email = email;
  }

  get id() {
    return this._id;
  }

  get nombre() {
    return this._nombre;
  }

  get apellido() {
    return this._apellido;
  }

  get email() {
    return this._email;
  }

  getComments(arr) {
    const res = [];

    arr.map((el) => {
      if (el.userId === this._id) {
        res.push(el.comment);
      }
    });

    return res;
  }
}
