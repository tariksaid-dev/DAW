// 2. Crear una secuencia de tres funciones asíncronas llamada paso1, paso2, paso3. Cada función debe de indicar en qué paso está (estoy en el paso1, 2, 3...). La última función debe devolver una promesa que muestre la secuencia de promesas anteriores.

function paso1() {
  return new Promise((resolve) => {
    console.log("Estoy en el paso 1");
    setTimeout(() => {
      resolve("Paso 1 completado");
    }, 1000);
  });
}

function paso2() {
  return new Promise((resolve) => {
    console.log("Estoy en el paso 2");
    setTimeout(() => {
      resolve("Paso 2 completado");
    }, 1000);
  });
}

function paso3() {
  return new Promise((resolve) => {
    console.log("Estoy en el paso 3");
    setTimeout(() => {
      resolve("Paso 3 completado");
    }, 1000);
  });
}

function useSteps() {
  return paso1()
    .then((result) => {
      console.log(result);
      return paso2();
    })
    .then((result) => {
      console.log(result);
      return paso3();
    })
    .then((result) => {
      console.log(result);
      return "Secuencia completa";
    });
}

export default useSteps;
