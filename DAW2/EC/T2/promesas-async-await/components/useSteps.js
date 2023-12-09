function paso1(target, callback) {
  return new Promise((resolve) => {
    callback(target, "Estoy en el paso 1");
    setTimeout(() => {
      resolve("Paso 1 completado");
    }, 1000);
  });
}

function paso2(target, callback) {
  return new Promise((resolve) => {
    callback(target, "Estoy en el paso 2");
    setTimeout(() => {
      resolve("Paso 2 completado");
    }, 1000);
  });
}

function paso3(target, callback) {
  return new Promise((resolve) => {
    callback(target, "Estoy en el paso 3");
    setTimeout(() => {
      resolve("Paso 3 completado");
    }, 1000);
  });
}

function useSteps(target, callback) {
  return paso1(target, callback)
    .then((result) => {
      callback(target, result);
      return paso2(target, callback);
    })
    .then((result) => {
      callback(target, result);
      return paso3(target, callback);
    })
    .then((result) => {
      callback(target, result);
      return "Secuencia completa";
    });
}

export default useSteps;
