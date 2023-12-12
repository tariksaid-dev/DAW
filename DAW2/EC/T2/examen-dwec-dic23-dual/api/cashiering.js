/**
 *
 * @param {string} url La url que donde están los checkouts
 * @returns {object} Devuelve un objeto con el dínero facturado y con el número de clientes que han pasado
 */
export async function cashiering(url) {
  try {
    const response = await fetch(url);
    if (!response.ok) return new Error("Error al fetchear todos los checkouts");

    const data = await response.json();

    const money = data.reduce((acc, el) => (acc += el.precio_facturado), 0);

    const numeroCashOut = data.length;

    const obj = {
      money,
      numeroCashOut,
    };

    return obj;
  } catch (error) {
    console.error("Error: ", error);
  }
}
