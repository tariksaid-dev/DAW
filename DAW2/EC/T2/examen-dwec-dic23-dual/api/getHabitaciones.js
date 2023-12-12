export async function getHabitaciones(url) {
  try {
    const response = await fetch(url);
    if (!response.ok) return new Error("Error al obtener las habitaciones");
    const data = await response.json();

    return data;
  } catch (error) {
    console.error("Error: ", error);
  }
}

export async function getSingleHabitacion(url, numeroHabitación) {
  try {
    const response = await fetch(
      `${url}?numero_habitacion=${numeroHabitación}`
    );
    if (!response.ok) return new Error("Error al obtener una sola habitación");
    const data = await response.json();

    return data[0];
  } catch (error) {
    console.error("Error:", error);
  }
}
