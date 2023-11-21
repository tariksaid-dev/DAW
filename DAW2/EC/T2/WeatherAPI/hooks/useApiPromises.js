import { API_KEY } from "../constants/constants";

export function useApiPromises() {
  function useApiWeather(lat, lon) {
    const api = `https://api.openweathermap.org/data/2.5/weather?lat=${lat}&lon=${lon}&appid=${API_KEY}`;

    return fetch(api)
      .then((res) => res.json())
      .then((data) => data);
  }

  function useApiGeo(city) {
    const api = `http://api.openweathermap.org/geo/1.0/direct?q=${city}&limit=1&appid=${API_KEY}`;

    return fetch(api)
      .then((res) => res.json())
      .then((data) => data[0]);
  }

  function displayData(input, container) {
    useApiGeo(input.value)
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
  }

  return { useApiWeather, useApiGeo, displayData };
}
