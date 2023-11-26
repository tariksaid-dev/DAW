function useMath(num1, num2, string) {
  return new Promise((resolve, reject) => {
    setTimeout(() => {
      let response;

      switch (string) {
        case "sumar":
          response = num1 + num2;
          break;
        case "restar":
          response = num1 - num2;
          break;
        case "multiplicar":
          response = num1 * num2;
          break;
        case "dividir":
          if (num2 !== 0) {
            response = num1 / num2;
          } else {
            reject("No se puede dividir entre 0");
            return;
          }
          break;
        default:
          reject("Operación no válida");
      }
      resolve(response);
    }, 1000);
  });
}

export default useMath;
