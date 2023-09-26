function sumaArrays() {
  const arr1 = [1, 2, 3, 4];
  const arr2 = [1, 2, 3, 4];

  return arr1.map((el, i) => (el = el + arr2[i]));
}

function eliminarDuplicados() {
  const arr = [1, 7, 5, 5, 2, 2, 2, 1];
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
    ? arr.slice(0, i).concat(arr.slice(i + 1))
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
    max: Math.max.apply(null, arr),
    min: Math.min.apply(null, arr),
  };
}
