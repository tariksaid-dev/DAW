import javascriptLogo from "../javascript.svg";
import viteLogo from "/vite.svg";

export function renderLayout(element) {
  element.innerHTML = `
  <div>
    <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript" target="_blank">
      <img src="${javascriptLogo}" class="logo vanilla" alt="JavaScript logo" />
    </a>
    <h1>Ejercicios EC GitHub</h1>
    <div class="card">
      <div id="div-1">
        <button type="button">Ejercicio 1</button>
      </div>      
      <div id="div-2">
        <button type="button">Ejercicio 2</button>
      </div>
      <div id="div-3">
        <button type="button">Ejercicio 3</button>
      </div>
      <div id="div-4">
        <button type="button">Ejercicio 4</button>
      </div>
      <div id="div-5">
        <button type="button">Ejercicio 5</button>
      </div>
      <div id="div-6">
        <button type="button">Ejercicio 6</button>
      </div>
    </div>
  </div>
`;
}
