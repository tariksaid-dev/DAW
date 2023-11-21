import { API_KEY } from "../constants/constants";

export function useApiPromises() {
  const testName = "Granada";

  function useApiWeather(lat, lon) {
    const api = `https://api.openweathermap.org/data/2.5/weather?lat=${lat}&lon=${lon}&appid=${API_KEY}`;

    return fetch(api)
      .then((res) => res.json())
      .then((data) => data);
  }

  function useApiGeo() {
    const api = `http://api.openweathermap.org/geo/1.0/direct?q=${testName}&limit=1&appid=${API_KEY}`;

    return fetch(api)
      .then((res) => res.json())
      .then((data) => data[0]);
  }

  return { useApiWeather, useApiGeo };
}
