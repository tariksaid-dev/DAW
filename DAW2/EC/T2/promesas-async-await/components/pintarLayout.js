import javascriptLogo from "../javascript.svg";
import viteLogo from "/vite.svg";

export function pintarLayout(element) {
  element.innerHTML = `
<div>
  <a href="https://vitejs.dev" target="_blank">
    <img src="${viteLogo}" class="logo" alt="Vite logo" />
  </a>
  <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript" target="_blank">
    <img src="${javascriptLogo}" class="logo vanilla" alt="JavaScript logo" />
  </a>
  <h1>Promesas</h1>
  <div class="card">
  <button>Ejercicio 1</button>
  <button>Ejercicio 2</button>
  <button>Ejercicio 3</button>
  <button>Ejercicio 4</button>
  <button>Ejercicio 5</button>
    
  </div>

</div>
`;
}
