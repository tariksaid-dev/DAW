# 3 formas de hacer clases en Javascript

## 1. Usando "Class"

```javascript
class Alumno {
  constructor(nombre, apellido) {
    this._nombre = nombre;
    this._apellido = apellido;
  }

  get nombre() {
    return this._nombre;
  }

  set nombre(nuevoNombre) {
    this._nombre = nuevoNombre;
  }

  obtenerDatosAlumno() {
    return this;
  }

  static nota = 0;

  static agregarNota(nuevaNota) {
    Alumno.nota = nuevaNota;
  }
}

class AlumnoDAW extends Alumno {
  constructor(nombre, apellido, lenguaje) {
    super(nombre, apellido);
    this._lenguaje = lenguaje;
  }
}

const alumno = new AlumnoDAW("Tarik", "Said", "JavaScript");

// Para user el getter
console.log(alumno.nombre); // Tarik

// Para usar el setter
alumno.nombre = "Tarek";

Alumno.agregarNota(10);
Alumno.nota; // 10

alumno.obtenerDatosAlumno(); // "Tarik", "Said", "JavaScript"
```

## Usando funciones constructoras

```javascript
function Alumno(nombre, apellido) {
  this._nombre = nombre;
  this._apellido = apellido;

  this.getNombre = function () {
    return this._nombre;
  }

  this.getApellido = function () {
    return this._apellido:
  }

  this.obtenerDatosAlumno = function () {
    return this;
  }
}
```
