export class Calculator {
  response = {};
  constructor(screen, ansScreen) {
    this.screen = screen;
    this.ansScreen = ansScreen;
    this.response = {
      exp: this.screen.value,
      msg: "",
    };
  }

  /**
   * Calculates the factorial of a non-negative integer.
   * @param {number} num The number for which the factorial will be calculated.
   * @returns {number} The result of the factorial calculation.
   */
  factorialResolve(num) {
    var result = num;
    if (num === 0 || num === 1) return 1;
    while (num > 1) {
      num--;
      result *= num;
    }
    return result;
  }

  /**
   * Parses a string to find a number preceding the factorial symbol '!' and extracts it.
   * @param {string} str The string to search for the factorial number.
   * @returns {number | null} The extracted number or null if not found.
   */
  parseFactorialNumber(str) {
    const regex = /(\d+)!/;
    const matches = str.match(regex);

    if (matches && matches[1]) {
      return matches[1];
    }
    return null;
  }

  /**
   * Iteratively parses a string to find and resolve multiple factorial expressions and returns the modified string.
   * @param {string} str The string to process, potentially containing multiple factorial expressions.
   * @returns {string} The modified string with factorial expressions resolved.
   */
  parseFactorial(str) {
    while (str.includes("!")) {
      str = str.replace(
        this.parseFactorialNumber(str).concat("!"),
        this.factorialResolve(this.parseFactorialNumber(str))
      );
    }
    return str;
  }

  factorialRestrictions({ exp }) {
    if (exp.includes("!")) {
      if (this.parseFactorialNumber(exp).length > 7) {
        return (this.response.msg = "ERR! TOO MANY FACTORIAL DIGITS");
      }
      return this.parseFactorial(exp);
    }
    return exp;
  }

  /**
   * Parses and evaluates a mathematical expression potentially containing factorial calculations and returns the result.
   * @returns {string} The calculated result or an error message in case of syntax or factorial errors.
   */
  resolve() {
    this.factorialRestrictions(this.response.expression);

    try {
      this.response.expression = eval(expression); //
    } catch (error) {
      return "ERR! CHECK SYNTAXIS ";
    }
  }
}
