export async function getSinglePokemonData(url, query) {
  const response = await fetch(url + "?name=" + query);
  const data = await response.json();

  return data[0];
}
