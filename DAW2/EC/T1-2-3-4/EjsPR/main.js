/**
 * @author Tarik Said
 * @description Crea una calculadora científica en JavaScript. Define una clase Calculadora con métodos para realizar operaciones matemáticas como suma, resta, multiplicación, división y operaciones avanzadas como raíz cuadrada y potenciación.
 */

import { Calculator } from "./Calculator";

// CONSTANTS
const PI = Math.PI;
const E = Math.E;

// ELEMENTS
const screen = document.getElementById("screen");
const allButtons = Array.from(document.getElementsByTagName("button"));

// OBJECT
const calc = new Calculator(screen);

/**
 * Imperative function that updates the screen based on the button pressed. Modifies the content if the button contains special characters.
 * @param {HTMLElement} btn The button that triggers the onClick action.
 */
function handleClick(btn) {
  switch (btn.textContent) {
    // FUNCTIONALITY
    case "AC":
      screen.value = "";
      break;
    case "C":
      screen.value = screen.value.substring(0, screen.value.length - 1);
      break;

    // MATH EXPRESSIONS
    case "cos":
      screen.value += "Math.cos(";
      break;
    case "log":
      screen.value += "Math.log(";
      break;
    case "tan":
      screen.value += "Math.tan(";
      break;
    case "sin":
      screen.value += "Math.sin(";
      break;
    case "√":
      screen.value += "Math.sqrt(";
      break;
    case "EXP":
      screen.value += " * 10 ** ";
      break;
    case "^":
      screen.value += "**";
      break;

    // CONSTANTS
    case "𝝅":
      screen.value += PI;
      break;
    case "e":
      screen.value += E;
      break;

    // RESOLVE
    case "=":
      screen.value = calc.resolve();
      break;

    // PRINT
    default:
      screen.value += btn.textContent;
  }
}

allButtons.forEach((btn) => {
  btn.addEventListener("click", () => {
    handleClick(btn);
  });
});
