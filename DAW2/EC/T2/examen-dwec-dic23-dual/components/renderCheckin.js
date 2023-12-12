export function renderCheckin(
  element,
  {
    id,
    nombre,
    numero_habitacion,
    numero_personas,
    fecha_entrada,
    fecha_salida,
    precio_facturado,
  }
) {
  const tr = document.createElement("tr");

  tr.innerHTML = `
  <tr>
  <td>${numero_habitacion}</td>
  <td>${nombre}</td>
  <td>${numero_personas}</td>
  <td>${fecha_entrada}</td>
  <td>${fecha_salida}</td>
  <td>$${precio_facturado}</td>
  <td><button class="editar" data-id=${id}>Editar</button></td>
  <td><button class="check-out" data-id=${id}>Check-Out</button></td>
</tr>
  `;

  element.appendChild(tr);
}
