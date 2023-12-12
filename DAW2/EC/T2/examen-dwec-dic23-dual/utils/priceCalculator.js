/**
 *
 * @param {Object} habitacionData El objeto con la habitación
 * @param {string} fechaEntrada La fecha de entrada sacada del formulario
 * @param {string} fechaSalida La fecha de salida sacada del formulario
 * @param {number} numeroPersonas El número de personas sacado del formulario
 * @returns
 */
export function priceCalculator(
  habitacionData,
  fechaEntrada,
  fechaSalida,
  numeroPersonas
) {
  const precioHabitacion = habitacionData.precio_dia;

  const dateEntrada = new Date(fechaEntrada).getTime();
  const dateSalida = new Date(fechaSalida).getTime();

  const diasEstancia = (dateSalida - dateEntrada) / 1000 / 60 / 60 / 24;

  const precioFinal = precioHabitacion * numeroPersonas * diasEstancia;

  if (numeroPersonas == 4) return precioFinal * 0.8;

  return precioFinal;
}
