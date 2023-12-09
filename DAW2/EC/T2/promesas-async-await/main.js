import useMath from "./components/useMath";
import useSteps from "./components/useSteps";
import { pintarLayout } from "./components/pintarLayout";
import { pintarPromesas } from "./components/pintarPromesas";
import { useCounter } from "./components/useCounter";
import { useUsers } from "./components/useUsers";
import { USERURL } from "./assets/constants";
import { pintarUsuarios } from "./components/pintarUsuarios";

const app = document.querySelector("#app");

pintarLayout(app);

app.addEventListener("click", async (e) => {
  if (e.target.textContent === "Ejercicio 1") {
    useMath(5, 3, "sumar")
      .then((resultado) => {
        pintarPromesas(e.target, `Suma: ${resultado}`);
        return useMath(8, 2, "restar");
      })
      .then((resultado) => {
        pintarPromesas(e.target, `Resta: ${resultado}`);
        return useMath(4, 6, "multiplicar");
      })
      .then((resultado) => {
        pintarPromesas(e.target, `Multiplicación: ${resultado}`);
        return useMath(10, 2, "dividir");
      })
      .then((resultado) => {
        pintarPromesas(e.target, `División: ${resultado}`);
      })
      .catch((error) => {
        console.error("Error:", error);
      });

    setTimeout(() => {
      Array.from(document.getElementsByTagName("span")).forEach((el) =>
        el.remove()
      );
    }, 7000);
  }

  if (e.target.textContent === "Ejercicio 2") {
    useSteps(e.target, pintarPromesas)
      .then((res) => {
        pintarPromesas(e.target, res);
      })
      .catch((err) => console.error(err));

    setTimeout(() => {
      Array.from(document.getElementsByTagName("span")).forEach((el) =>
        el.remove()
      );
    }, 7000);
  }

  if (e.target.textContent === "Ejercicio 3") {
    useCounter(5, e.target, pintarPromesas).then((res) => {
      pintarPromesas(e.target, res);
    });

    setTimeout(() => {
      Array.from(document.getElementsByTagName("span")).forEach((el) =>
        el.remove()
      );
    }, 7000);
  }

  if (e.target.textContent === "Ejercicio 4") {
    useUsers(USERURL)
      .then((res) => {
        res.forEach((el) => pintarPromesas(e.target, JSON.stringify(el)));
      })
      .catch((err) => pintarPromesas(e.target, err));

    setTimeout(() => {
      Array.from(document.getElementsByTagName("span")).forEach((el) =>
        el.remove()
      );
    }, 5000);
  }

  if (e.target.textContent === "Ejercicio 5") {
    useUsers(USERURL).then((res) => {
      pintarUsuarios(e.target, res);
    });

    setTimeout(() => {
      Array.from(document.getElementsByTagName("ul")).forEach((el) =>
        el.remove()
      );
    }, 5000);
  }
});
