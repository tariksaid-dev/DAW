export async function saveCheckin(url, data) {
  try {
    const response = await fetch(url, {
      method: "POST",
      headers: {
        "Content-Type": "application/json",
      },
      body: JSON.stringify(data),
    });

    if (!response.ok) return new Error("Error al guardar un checkin");
  } catch (error) {
    console.error("Error: ", error);
  }
}
