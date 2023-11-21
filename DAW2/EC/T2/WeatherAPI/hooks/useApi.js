import { API_KEY } from "../constants/constants";

export function useApi() {
  async function useApiWeather(lat, lon) {
    const api = `https://api.openweathermap.org/data/2.5/weather?lat=${lat}&lon=${lon}&appid=${API_KEY}`;
    const res = await fetch(api);
    const data = await res.json();

    return data;
  }

  async function useApiGeo(city) {
    const api = `http://api.openweathermap.org/geo/1.0/direct?q=${city}&limit=1&appid=${API_KEY}`;
    const res = await fetch(api);
    const data = await res.json();

    return data[0];
  }

  async function displayData(input, container) {
    const { lat, lon } = await useApiGeo(input.value);

    const data = await useApiWeather(lat, lon);
    if (!data.code === 200) return new Error("Error al fetchear");

    Object.entries(data.main).forEach(([k, v]) => {
      const span = document.createElement("span");
      span.innerText = `${k} : ${v}`;
      container.appendChild(span);
    });
  }

  return { useApiWeather, useApiGeo, displayData };
}
