export async function getAllFood(url) {
  const response = await fetch(url);
  if (!response.ok) return new Error("Error al fetchear toda la bd");
  const data = await response.json();

  return data;
}

export async function getFoodById(url, id) {
  const response = await fetch(`${url}/${id}`);
  if (!response.ok) return new Error("Error al coger una sola comidas");
  const data = await response.json();

  return data;
}
