export async function updateCheckin(url, id, data) {
  try {
    const response = await fetch(`${url}/${id}`, {
      method: "PUT",
      headers: {
        "Content-Type": "application/json",
      },
      body: JSON.stringify(data),
    });
    if (!response.ok) return new Error("Error al actualizar el checkin");
  } catch (error) {
    console.error("Error: ", error);
  }
}
