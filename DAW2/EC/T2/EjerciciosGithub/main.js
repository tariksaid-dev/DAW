import { renderEnunciado } from "./components/renderEnunciado";
import { renderLayout } from "./components/renderLayout";
import { enunciados } from "./constants/Enunciados";
import { fadeOut } from "./hooks/fadeOut";
import { loadAsync } from "./hooks/loadAsync";
import { operationsAsync } from "./hooks/operationsAsync";
import { paso1, paso2, paso3 } from "./hooks/useSteps";

const app = document.getElementById("app");

renderLayout(app);

app.addEventListener("click", (e) => {
  // EJERCICIO 1
  if (e.target.textContent === "Ejercicio 1") {
    const div = e.target.closest("#div-1");

    const titulo = enunciados.ejercicio1.titulo;
    const texto = enunciados.ejercicio1.texto;

    renderEnunciado(div, titulo, texto);

    loadAsync("vite.svg", div)
      .then((loaded) => console.log("Imagen cargada con éxito", loaded))
      .catch((err) =>
        console.error("Error al cargar la imagen: ", err.message)
      );

    setTimeout(() => {
      div.innerHTML = `<button type="button">Ejercicio 1</button>`;
    }, 5000);
  }

  // EJERCICIO 2
  if (e.target.textContent === "Ejercicio 2") {
    const div = e.target.closest("#div-2");

    const titulo = enunciados.ejercicio2.titulo;
    const texto = enunciados.ejercicio2.texto;

    renderEnunciado(div, titulo, texto);

    const inputNum1 = document.createElement("input");
    const inputNum2 = document.createElement("input");
    const inputOperation = document.createElement("input");
    const button = document.createElement("button");
    button.textContent = "Calcular";

    inputNum1.placeholder = "Introduce aquí el primer número";
    inputNum2.placeholder = "Introduce aquí el segundo número";
    inputOperation.placeholder =
      "Introduce sumar, restar, multiplicar o dividir";

    div.appendChild(inputNum1);
    div.appendChild(inputNum2);
    div.appendChild(inputOperation);
    div.appendChild(button);

    button.addEventListener("click", (e) => {
      operationsAsync(inputNum1.value, inputNum2.value, inputOperation.value)
        .then((result) => {
          const resultado = document.createElement("span");
          resultado.innerText = "El resultado es: " + result;
          div.appendChild(resultado);
        })
        .catch((err) => {
          console.error("Error: ", err.message);
        });

      setTimeout(() => {
        div.innerHTML = `<button type="button">Ejercicio 2</button>`;
      }, 5000);
    });
  }

  if (e.target.textContent === "Ejercicio 3") {
    const div = e.target.closest("#div-3");

    const titulo = enunciados.ejercicio3.titulo;
    const texto = enunciados.ejercicio3.texto;
    const button = document.createElement("button");
    button.textContent = "Click para fade-out";
    button.style.marginTop = "20px";

    renderEnunciado(div, titulo, texto);
    div.appendChild(button);

    button.addEventListener("click", () => {
      fadeOut(div, 2000).then(() => console.log("Animación completada"));
    });

    setTimeout(() => {
      div.innerHTML = `<button type="button">Ejercicio 3</button>`;
      div.style = null;
    }, 5000);
  }

  if (e.target.textContent === "Ejercicio 4") {
    const div = e.target.closest("#div-4");

    const titulo = enunciados.ejercicio4.titulo;
    const texto = enunciados.ejercicio4.texto;
    const button = document.createElement("button");
    button.textContent = "Click para empezar";
    button.style.marginTop = "20px";

    renderEnunciado(div, titulo, texto);
    div.appendChild(button);

    button.addEventListener("click", () => {
      paso1(div)
        .then(paso2)
        .then(paso3)
        .then((span) => {
          console.log("Secuencia completada con éxito, span: ", span);
        })
        .catch((err) => console.error("Error: ", err));

      setTimeout(() => {
        div.innerHTML = `<button type="button">Ejercicio 4</button>`;
      }, 6000);
    });
  }

  // TODO
  if (e.target.textContent === "Ejercicio 5") {
    const div = e.target.closest("#div-5");

    const titulo = enunciados.ejercicio5.titulo;
    const texto = enunciados.ejercicio5.texto;

    renderEnunciado(div, titulo, texto);
  }

  // TODO
  if (e.target.textContent === "Ejercicio 6") {
    const div = e.target.closest("#div-6");

    const titulo = enunciados.ejercicio6.titulo;
    const texto = enunciados.ejercicio6.texto;

    renderEnunciado(div, titulo, texto);
  }
});
