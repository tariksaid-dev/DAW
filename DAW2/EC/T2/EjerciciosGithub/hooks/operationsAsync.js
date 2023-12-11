export function operationsAsync(num1, num2, operation) {
  return new Promise((resolve, reject) => {
    setTimeout(() => {
      const number1 = parseFloat(num1);
      const number2 = parseFloat(num2);

      if (isNaN(num1) || isNaN(num2)) {
        reject(new Error("Ambos operadores deben ser números válidos"));
        return;
      }

      switch (operation) {
        case "sumar":
          resolve(number1 + number2);
          break;
        case "restar":
          resolve(number1 - number2);
          break;
        case "multiplicar":
          resolve(number1 * number2);
          break;
        case "dividir":
          if (number2 === 0) {
            reject(new Error("No se puede dividir entre cero"));
          } else {
            resolve(number1 / number2);
          }
          break;
        default:
          reject(
            new Error(
              "Operación no válida. Usa 'sumar', 'restar', 'multiplicar' o 'dividir'"
            )
          );
      }
    }, 2000);
  });
}
