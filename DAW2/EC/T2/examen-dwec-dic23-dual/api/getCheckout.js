export async function getCheckout(url) {
  try {
    const response = await fetch(url);

    if (!response.ok) return new Error("Error al obtener los checkouts");

    const data = await response.json();

    console.log(data);
    return data;
  } catch (error) {
    console.error("Error: ", error);
  }
}
