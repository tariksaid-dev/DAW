import fetch from "node-fetch";
import fs from "fs/promises";

const URL = "https://pokeapi.co/api/v2/pokemon/";
const filePath = "./server/db.json";

async function fetchAndSave() {
  // Accederá a pokeApi, me traeré los 20 primeros pokemons y guardaré la información en "server/db.json".

  try {
    // Voy a realizar una petición a pokeApi
    const response = await fetch(URL);
    const data = await response.json();

    const { results } = data;

    await fs.writeFile(filePath, JSON.stringify({ results }, null, 2));
  } catch (err) {
    console.log("Error en acceso a la API", err.message);
  }
}

fetchAndSave();
