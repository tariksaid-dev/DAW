export async function deleteCheckin(url, id) {
  const response = await fetch(`${url}/${id}`, { method: "DELETE" });
}
