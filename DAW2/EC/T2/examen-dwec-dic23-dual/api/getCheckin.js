export async function getCheckin(url) {
  const response = await fetch(url);
  if (!response.ok) return new Error("Error al obtener todos los checkin");

  const data = await response.json();

  return data;
}

export async function getSingleCheckin(url, id) {
  const response = await fetch(`${url}/${id}`);
  if (!response.ok) return new Error("Error al obtener una sola reserva");

  const data = await response.json();

  return data;
}
