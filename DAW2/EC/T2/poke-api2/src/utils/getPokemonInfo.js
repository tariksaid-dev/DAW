import fetch from "node-fetch";
import fs from "fs/promises";

const URL = "https://pokeapi.co/api/v2/pokemon/";

export async function getPokemonInfo() {
  try {
    const response = await fetch(URL);
    const data = await response.json();

    const pokeArray = [];

    for (const pokemon of data.results) {
      let obj = {};

      const resp = await fetch(pokemon.url);
      const pokemons = await resp.json();

      const nombre = pokemons.name;
      const images = {
        imgFront: pokemons.sprites.front_default,
        imgBack: pokemons.sprites.back_default,
      };

      const abilities = [];

      pokemons.abilities.forEach((ab) => {
        abilities.push(ab.ability.name);
      });

      // Definir las propiedades del objeto
      obj.url = pokemon.url;
      obj.name = nombre;
      obj.images = images;
      obj.abilities = abilities;

      pokeArray.push(obj);
    }
    await fs.writeFile(
      "./server/pokemons.json",
      JSON.stringify({ pokeArray }, null, 2)
    );
  } catch (err) {
    console.log("Error obteniendo pokemons", err.message);
  }
}

getPokemonInfo();
