export const literalUser = {
  _name: "",
  _age: 0,
  _dni: "",

  get name() {
    return this._name;
  },

  set name(newName) {
    this._name = newName;
  },

  get age() {
    return this._age;
  },

  set age(newAge) {
    this._age = newAge;
  },

  get dni() {
    return this._dni;
  },

  set dni(newDni) {
    if (this.dniValidator(newDni)) {
      this._dni = newDni;
    } else {
      false;
    }
  },

  dniValidator(dni) {
    if (dni.length !== 9) return false;
    const dniLetters = "TRWAGMYFPDXBNJZSQVHLCKE";
    const number = dni.substring(0, 8);
    const letter = dni.substring(8, 9);

    return dniLetters.charAt(number % 23) === letter;
  },

  showInfo() {
    return `Name: ${this._name}\nAge: ${this._age}\nDNI: ${this._dni}`;
  },
};
