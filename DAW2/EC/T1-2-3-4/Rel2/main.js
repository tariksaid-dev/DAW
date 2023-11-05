// 1
function ej1(obj) {
  return obj.country ? obj.country : "No se encuentra";
}

// 2
function ej2(obj, arr) {
  return arr in obj;
}

// 3
function ej3(obj, arr) {
  return obj.hasOwnProperty(arr) && arr !== false;
}

// 4
function ej4(arr) {
  return { key: arr };
}

// 5
function ej5(arr1, arr2) {
  return { [arr1]: arr2 };
}

// 6 -> chatgipiti made this
function crearObjetoDesdeMatrices(a, b) {
  if (a.length !== b.length) {
    throw new Error("Las matrices deben tener la misma longitud.");
  }

  const resultado = {};

  for (let i = 0; i < a.length; i++) {
    if (a[i].length !== b[i].length) {
      throw new Error("Las submatrices deben tener la misma longitud.");
    }

    for (let j = 0; j < a[i].length; j++) {
      resultado[a[i][j]] = b[i][j];
    }
  }

  return resultado;
}

// Ejemplo de uso:
const matrizA = [
  ["nombre", "edad"],
  ["ciudad", "país"],
];
const matrizB = [
  ["Ejemplo", 30],
  ["Nueva York", "EE. UU."],
];

const objetoResultado = crearObjetoDesdeMatrices(matrizA, matrizB);
console.log(objetoResultado);
