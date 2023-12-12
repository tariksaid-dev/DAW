export async function getCheckin(url) {
  try {
    const response = await fetch(url);
    if (!response.ok) return new Error("Error al obtener todos los checkin");

    const data = await response.json();

    return data;
  } catch (error) {
    console.error("Error: ", error);
  }
}

export async function getSingleCheckin(url, id) {
  try {
    const response = await fetch(`${url}/${id}`);
    if (!response.ok) return new Error("Error al obtener una sola reserva");

    const data = await response.json();

    return data;
  } catch (error) {
    console.error("Error: ", error);
  }
}
