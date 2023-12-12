import { getCheckout } from "./getCheckout";

export async function cashiering(url) {
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
}
