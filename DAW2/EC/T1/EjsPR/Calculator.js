class Calculadora {
  sumar(a, b) {
    return a + b;
  }

  restar(a, b) {
    return a - b;
  }

  multiplicar(a, b) {
    return a * b;
  }

  dividir(a, b) {
    if (b === 0) {
      return "No es posible dividir por cero.";
    }
    return a / b;
  }
}

const calculadora = new Calculadora();

console.log(calculadora.sumar(5, 3)); // 8
console.log(calculadora.restar(10, 4)); // 6
console.log(calculadora.multiplicar(6, 7)); // 42
console.log(calculadora.dividir(8, 2)); // 4
console.log(calculadora.dividir(5, 0)); // "No es posible dividir por cero."
