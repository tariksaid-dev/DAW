/**
 * @author Tarik Said Manjón
 * @description Clase carrito, la cuál representa un carrito de la compra en el que manejo los productos y sus precios, y puedo añadir, eliminar, calcular totales, etc.
 */

import { Libro } from "./Libro";
import { bdExamen } from "./assets/datos";

export class Carrito {
  carrito = [...bdExamen.libros];

  agregarProducto(_ISBN, cantidad) {
    let flag = false;

    this.carrito.forEach((libro) => {
      if (libro.ISBN !== _ISBN && libro.stock >= cantidad) {
        flag = true;
      }
    });

    if (flag === true) {
      for (let i = 0; i < cantidad; i++) {
        this.carrito.push(new Libro(_ISBN));
      }
    }
  }

  eliminarProducto(_ISBN) {
    this.carrito = this.carrito.filter((el) => {
      return el.ISBN !== _ISBN;
    });
  }

  agregarDescuento() {
    this.carrito.forEach((el) => {
      el.precio = el.precio - el.precio * 0.1;
    });
  }

  calcularTotalCarrito() {
    let res = 0;

    this.carrito.forEach((el) => {
      res += el.precio * 1.1;
    });

    return res;
  }

  validarCompra() {
    const data = [];

    this.carrito.map((el) => {
      data.push(el);
    });

    const res = [
      {
        venta: [...data],
        cantidad: this.carrito.length,
        total: this.calcularTotalCarrito(),
      },
    ];

    if (localStorage.getItem("ventas")) {
      const oldData = JSON.parse(localStorage.getItem("ventas"));
      const updatedData = [].concat(oldData, res);
      localStorage.setItem("ventas", JSON.stringify(updatedData));
      return;
    }
    localStorage.setItem("ventas", JSON.stringify(res));
    return;
  }

  menorStock() {
    const resArr = [...this.carrito].sort((a, b) => {
      return a["stock"] - b["stock"];
    });

    return new Set(resArr.slice(0, 3));
  }

  /**
   * Busca los libros que pertenezcan a la editorial o que tengan el título que introduzca el usuario.
   * @param {String} query Palabras por las que se buscará en nuestro carrityo
   * @returns {Array} Un array de objetos "Libro" (en este examen no es así, ya que los elementos los cojo de una fuente externa y no presentan los métodos del prototipo Libro)
   */
  buscarLibro(query) {
    const res = [];

    this.carrito.forEach((el) => {
      if (el.titulo === query || el.editorial === query) {
        res.push(el);
      }
    });

    return res;
  }

  libroMasVendido() {
    // no funciona bien :(
    const res = {};
    const res2 = [];

    if (localStorage.getItem("ventas")) {
      const oldData = JSON.parse(localStorage.getItem("ventas"));
      oldData.forEach((venta) => {
        venta.venta.forEach((el) => {
          res2.push(el.titulo);
        });
      });
    }
    console.log(res2);

    res2.forEach((titulo) => {
      if (!Object.keys(res).includes(titulo)) {
        res[titulo] = 0;
      } else {
        res[titulo]++;
      }
    });

    [{ libronombre1: 7 }];
    console.log(res);
  }
}
