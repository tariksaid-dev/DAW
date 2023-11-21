import { useApiPromises } from "./hooks/useApiPromises";

const container = document.querySelector(".container");
const input = document.getElementById("input");
const btn = document.getElementById("btn");

const { useApiGeo, useApiWeather } = useApiPromises();

btn.addEventListener("click", () => {
  useApiGeo()
    .then(({ lat, lon }) => useApiWeather(lat, lon))
    .then((data) => {
      console.log(data);
      Object.entries(data.main).forEach(([k, v]) => {
        const span = document.createElement("span");
        span.innerText = `${k} : ${v}`;
        container.appendChild(span);
        console.log(k, v);
      });
    })
    .catch((error) => {
      console.error("Error al obtener datos:", error);
    });
});
