import { useApiPromises } from "./hooks/useApiPromises";

const container = document.querySelector(".container");
const input = document.getElementById("input");
const btn = document.getElementById("btn");

const { useApiGeo, useApiWeather, displayData } = useApiPromises();

btn.addEventListener("click", () => displayData(input, container));

input.addEventListener("keydown", (e) => {
  if (e.key === "Enter") {
    displayData(input, container);
  }
});
