function sumaArrays() {
  const arr1 = [1, 2, 3, 4];
  const arr2 = [4, 3, 2, 1];

  arr1.reduce();
  return arr1.map((el, i) => el + arr2[i]);
}

function eliminarDuplicados() {
  const arr = [1, 7, 2, 5, 5, 2, 2, 2, 1, 7];
  return arr.filter((num, i, array) => array.indexOf(num) === i);
}

function filtrarPares() {
  const arr = [1, 2, 3, 4, 5, 6];
  return arr.filter((num) => num % 2 === 0);
}

function unionArrays1(arr1, arr2) {
  return arr1.concat(arr2);
}

function unionArrays2(...arr) {
  return [].concat(...arr);
}

// function conteoPalabras() {
// }

function ordenarNumeros() {
  const arr = [2, 3, 6, 1, 5, 4];
  return arr.sort();
}

function eliminarElementos() {
  const arr = [1, 2, 2, 2, 3, 4, 5, 6];
  const el = 2;
  return arr.indexOf(el) !== -1
    ? arr.slice(0, el).concat(arr.slice(el + 1))
    : arr;
}

function eliminarElementos2() {
  const arr = [1, 2, 2, 2, 3, 4, 5, 6];
  const el = 2;
  return arr.filter(
    (num, i, arr) => i !== arr.indexOf(el) || arr.indexOf(el, i + 1) === -1
  );
}

function encontrarMaxMin() {
  const arr = [1, 2, 3, 4, 5, 6];
  return {
    max: Math.max(...arr),
    min: Math.min(...arr),
  };
}

// 11

// 12

// 13

// 14.
function rangoNumeros() {
  const inicio = 1;
  const fin = 13;

  return Array.from(
    { length: fin - inicio + 1 },
    (num, index) => index + inicio
  );<
}

// 15.

// 16.
function capitalizarPalabras() {
  const text = "Ahí hay un burro que dice ay";
  return text
    .split(" ")
    .map((word) => word.charAt(0).toUpperCase() + word.slice(1));
}

// 17.
function multiplicarMatrizPorEscalar(matriz, escalar) {
  return matriz.map((arr) => arr.map((el) => el * escalar));
}

// 18.
function combinarArrays(orden, ...arr) {
  return orden === "decreciente"
    ? [].concat(...arr).sort((a, b) => b - a)
    : [].concat(...arr).sort();
}

// 19.
function esPalindromo(pal) {
  return pal === pal.split("").reverse().join("");
}

// 20.
function diferenciaArrays(arr1, arr2) {
  return arr1
    .filter((num) => !arr2.includes(num))
    .concat(arr2.filter((num) => !arr1.includes(num)));
}

// 21.
function rotarArrays(arr, pasos) {
  return pasos < 0
    ? arr.slice(-pasos).concat(arr.slice(0, -pasos))
    : arr.slice(arr.length - pasos).concat(arr.slice(0, arr.length - pasos));
}

// 25.
function numerosFaltantes(arr, n1, n2) {
  const array = [];
  for (let i = n1; i <= n2; i++) {
    if (!arr.includes(i)) array.push(i);
  }
  return array;
}

function numerosFaltantes2(arr, n1, n2) {
  return Array.from({ length: n2 - n1 + 1 }, (num, i) => i + n1).filter(
    (num) => !arr.includes(num)
  );
}
