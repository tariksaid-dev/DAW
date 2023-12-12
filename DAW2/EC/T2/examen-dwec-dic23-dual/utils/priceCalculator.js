export async function priceCalculator(
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

  return precioFinal;
}
