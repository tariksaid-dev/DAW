import { useApi } from "./hooks/useApi";

const container = document.querySelector(".container");
const input = document.getElementById("input");
const btn = document.getElementById("btn");

const { displayData } = useApi();

btn.addEventListener("click", () => displayData(input, container));

input.addEventListener("keydown", (e) => {
  if (e.key === "Enter") {
    displayData(input, container);
  }
});
