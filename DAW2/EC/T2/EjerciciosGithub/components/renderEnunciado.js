export function renderEnunciado(element, title, text) {
  const h3 = document.createElement("h3");
  const span = document.createElement("span");

  h3.textContent = title;
  span.textContent = text;

  element.appendChild(h3);
  element.appendChild(span);
}
