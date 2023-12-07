import pintarCallback from "./components/pintarCallback";

const div1 = document.getElementById("ej1");
const div2 = document.getElementById("ej2");
const div3 = document.getElementById("ej3");
const div4 = document.getElementById("ej4");

// Ejercicio 1
function realizarOperacion(num1, num2, callback) {
  setTimeout(() => {
    callback(num1 + num2);
  }, 1000);
}

function imprimirCallback(resultado) {
  pintarCallback(div, resultado);
}

realizarOperacion(7, 3, imprimirCallback);

// // Ejercicio 2

// function filtrarParesAsync(arr, callback) {
//   setTimeout(() => {
//     const numPares = arr.filter((num) => {
//       const x = num % 2 === 0;
//       return x;
//     });
//     callback(numPares);
//   }, 2000);
// }

// filtrarParesAsync([1, 2, 3, 4, 5, 6, 7, 8], (pares) => {
//   console.log(`Los números pares son: ${pares}`);
//   pintarCallback(div, pares);
// });

// async function iterarAsync(arr, callback) {
//   arr.forEach((element, index) => {
//     setTimeout(() => {
//       callback(element);
//     }, 3000 * (index + 1));
//   });
// }

// iterarAsync([1, 2, 3, 4, 5], (el) => {
//   console.log(el * 2);
// });

console.log("Start");

setTimeout(() => {
  console.log("setTimeout Callback");
}, 0);

Promise.resolve().then(() => {
  console.log("Promise Resolved");
});

console.log("End");
