import { useApi } from "./hooks/useApi";

const container = document.querySelector(".container");
const input = document.getElementById("input");
const btn = document.getElementById("btn");

const { useApiGeo, useApiWeather } = useApi();

btn.addEventListener("click", async () => {
  const { lat, lon } = await useApiGeo();

  const data = await useApiWeather(lat, lon);
  if (!data.code === 200) return new Error("Error al fetchear");

  Object.entries(data.main).forEach(([k, v]) => {
    const span = document.createElement("span");
    span.innerText = `${k} : ${v}`;
    container.appendChild(span);
  });
});
