/**
 * @author Tarik Said Manjón
 * @description Funciópn constructora que sirve como clase. Representa un libro, con sus distintos tipos de propiedades y diversos métodos para manipularlos.
 */

export function Libro(
  isbn,
  titulo,
  pagNum,
  autor,
  editorial,
  tags = [],
  precio,
  valoracion,
  stock
) {
  this._isbn = isbn;
  this._titulo = titulo;
  this._pagNum = pagNum;
  this._autor = autor;
  this._editorial = editorial;
  this._tags = tags;
  this._precio = precio;
  this._valoracion = valoracion;
  this._stock = stock;
}

Libro.prototype = {
  modificarPrecio(nuevoPrecio) {
    if (nuevoPrecio >= 0) {
      this._precio = nuevoPrecio;
    }
  },

  modificarValoracion(nuevaValoracion) {
    if (nuevaValoracion.length >= 0 && nuevaValoracion.length <= 5) {
      this._valoracion = nuevaValoracion;
    }
  },

  modificarStock(nuevoStock) {
    if (nuevoStock >= 0) {
      this._stock = nuevoStock;
    }
  },
  addTags(...nuevosTags) {
    if (!this._tags.includes(nuevosTags)) {
      this._tags.push(...nuevosTags);
    }
  },
};
