export function FunctionalUser(name, age = 0) {
  this._name = name;
  this._age = age;
  this._dni = "";

  Object.defineProperty(this, "name", {
    get: function () {
      return this._nombre;
    },
    set: function (newName) {
      this._name = newName;
    },
  });

  Object.defineProperty(this, "age", {
    get: function () {
      return this._age;
    },
    set: (newAge) => (this._age = newAge),
  });

  Object.defineProperty(this, "dni", {
    get: function () {
      return this._dni;
    },
    set: function (newDni) {
      // wrong, fix, dni wasnt settd
      if (newDni.length !== 9) return false;
      const dniLetters = "TRWAGMYFPDXBNJZSQVHLCKE";
      const number = newDni.substring(0, 8);
      const letter = newDni.substring(8, 9);

      return dniLetters.charAt(number % 23) === letter;
    },
  });
}

FunctionalUser.prototype.showInfo = () =>
  console.log(`Name: ${this.name}\nAge: ${this.age}\nDNI: ${this.dni}`);
