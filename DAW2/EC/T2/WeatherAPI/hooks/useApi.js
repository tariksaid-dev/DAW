import { API_KEY } from "../constants/constants";

export function useApi() {
  const testName = "Granada";

  async function useApiWeather(lat, lon) {
    const api = `https://api.openweathermap.org/data/2.5/weather?lat=${lat}&lon=${lon}&appid=${API_KEY}`;
    const res = await fetch(api);
    const data = await res.json();

    return data;
  }

  async function useApiGeo() {
    const api = `http://api.openweathermap.org/geo/1.0/direct?q=${testName}&limit=1&appid=${API_KEY}`;
    const res = await fetch(api);
    const data = await res.json();

    return data[0];
  }

  return { useApiWeather, useApiGeo };
}
