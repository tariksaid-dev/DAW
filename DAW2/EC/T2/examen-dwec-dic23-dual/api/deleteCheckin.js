export async function deleteCheckin(url, id) {
  try {
    const response = await fetch(`${url}/${id}`, { method: "DELETE" });
    if (!response.ok) return new Error("Error al eliminar del checkin");
  } catch (error) {
    console.error("Error: ", error);
  }
}
