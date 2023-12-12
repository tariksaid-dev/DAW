export function isValid(
  formNombreCliente,
  formEmailCliente,
  formNumeroPersonas,
  formFechaEntrada,
  formFechaSalida
) {
  if (
    formNombreCliente.value.length == 0 ||
    formEmailCliente.value.length == 0 ||
    formNumeroPersonas.value.length == 0 ||
    formFechaEntrada.value.length == 0 ||
    formFechaSalida.value.length == 0
  )
    return false;

  if (formNumeroPersonas.value < 1 || formNumeroPersonas.value > 4)
    return false;

  const dateFechaEntrada = new Date(formFechaEntrada.value).getTime();
  const dateFechaSalida = new Date(formFechaSalida.value).getTime();

  if (dateFechaEntrada > dateFechaSalida) return false;

  return true;
}
