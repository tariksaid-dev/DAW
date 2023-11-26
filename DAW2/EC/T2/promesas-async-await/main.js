import "./style.css";
import javascriptLogo from "./javascript.svg";
import viteLogo from "/vite.svg";
import useMath from "./components/useMath";
import useSteps from "./components/useSteps";

document.querySelector("#app").innerHTML = `
  <div>
    <a href="https://vitejs.dev" target="_blank">
      <img src="${viteLogo}" class="logo" alt="Vite logo" />
    </a>
    <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript" target="_blank">
      <img src="${javascriptLogo}" class="logo vanilla" alt="JavaScript logo" />
    </a>
    <h1>Promesas</h1>
    <div class="card">

    </div>

  </div>
`;

// useMath(5, 3, "sumar")
//   .then((resultado) => {
//     console.log("Suma:", resultado);
//     return useMath(8, 2, "restar");
//   })
//   .then((resultado) => {
//     console.log("Resta:", resultado);
//     return useMath(4, 6, "multiplicar");
//   })
//   .then((resultado) => {
//     console.log("Multiplicación:", resultado);
//     return useMath(10, 2, "dividir");
//   })
//   .then((resultado) => {
//     console.log("División:", resultado);
//   })
//   .catch((error) => {
//     console.error("Error:", error);
//   });

useSteps()
  .then((res) => {
    console.log(res);
  })
  .catch((err) => console.error(err));
