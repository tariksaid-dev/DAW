/**
 * @author Tarik Said Manjón
 * @description Hilo de ejecución principal. En este caso, hago las funciones de los test explícitamente y llamo a dichos métodos para que se vea el resultado por consola.
 */

import { Carrito } from "./Carrito";
import { Libro } from "./Libro";

function testLibro() {
  const libro = new Libro(
    "1234",
    "aaa",
    20,
    "Tarik",
    "HLanz",
    ["JS", "Front"],
    100,
    "*****",
    10
  );

  console.log(libro);
  libro.modificarPrecio(200);
  console.log(libro._precio); // 200
  libro.modificarValoracion("***");
  console.log(libro._valoracion); // ***
  libro.modificarStock(3);
  console.log(libro._stock); // 3
  libro.addTags("Genial");
  console.log(libro._tags); // "JS", "Front", "Genial"
}

const carro = new Carrito();

function testCarrito() {
  console.log(carro.carrito);

  // carro.agregarProducto("1234", 3); // Funciona pero las propiedades se llaman diferentes en Libro.js y datos.js

  console.log(carro.carrito.length); //12
  carro.eliminarProducto("978-0596517748");
  console.log(carro.carrito.length); // 11

  console.log(carro.carrito[0].precio); // 45.99
  carro.agregarDescuento();
  console.log(carro.carrito[0].precio); // 41.39

  console.log(carro.calcularTotalCarrito()); // 440.9

  carro.validarCompra(); // cada vez que se llama actualiza el ls agregando 1 venta extra. Si fuera una web, este método sería utilizado en el handler de un evento de un botón.
  console.log("menorstock");
  console.log(carro.menorStock());
  console.log(carro.buscarLibro("Effective Java")); // Respuesta con los libros
}

// testLibro();
// testCarrito();

// carro.libroMasVendido();

function validarCompra1() {
  const res = [
    {
      ticket: [...carro.carrito],
      cantidad: carro.carrito.length,
      total: carro.calcularTotalCarrito(),
    },
  ];

  console.log(res);

  if (localStorage.getItem("ventas")) {
    const oldData = JSON.parse(localStorage.getItem("ventas"));
    const updatedData = [].concat(oldData, res);
    localStorage.setItem("ventas", JSON.stringify(updatedData));
    return;
  }

  localStorage.setItem("ventas", JSON.stringify(res));
  return;
}
