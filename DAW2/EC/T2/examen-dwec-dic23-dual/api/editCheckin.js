export async function editCheckin(url, id, data) {
  try {
    const response = await fetch(`${url}/${id}`, {
      method: "PUT",
      headers: {
        "Content-Type": "application/json",
      },
      body: JSON.stringify(data),
    });
    if (!response.ok) return new Error("Error al editar un checkin");
  } catch (error) {
    console.error("Error: ", error);
  }
}
