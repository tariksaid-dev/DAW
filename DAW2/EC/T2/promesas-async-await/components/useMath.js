async function useMath(num1, num2, string) {
  switch (string) {
    case "sumar":
      await new Promise((resolve) => resolve(num1 + num2));
    case "restar":
      await new Promise((resolve) => resolve(num1 - num2));
    case "multiplicar":
      await new Promise((resolve) => resolve(num1 * num2));
    case "dividir":
      await new Promise((resolve, reject) => {
        if (num2 !== 0) {
          resolve(num1 / num2);
        } else {
          reject("No se puede dividir entre 0");
        }
      });
  }
}

export default useMath;
