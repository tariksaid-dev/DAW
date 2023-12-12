export async function getHabitaciones(url) {
  const response = await fetch(url);
  const data = await response.json();

  return data;
}

export async function getSingleHabitacion(url, numeroHabitación) {
  const response = await fetch(`${url}?numero_habitacion=${numeroHabitación}`);
  const data = await response.json();

  return data[0];
}
