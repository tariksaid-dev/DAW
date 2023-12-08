export function renderButton(element) {
  const pagarDiv = document.createElement("div");
  pagarDiv.className = "d-flex p-2 text-light";

  const button = document.createElement("button");
  button.textContent = "Pagar";
  button.className = "btn btn-warning";

  const paragraph = document.createElement("p");
  paragraph.textContent = "Total: $";

  const span = document.createElement("span");
  span.textContent = 0;

  pagarDiv.appendChild(button);
  pagarDiv.appendChild(paragraph);
  paragraph.appendChild(span);

  element.insertBefore(pagarDiv, element.firstChild);
}
