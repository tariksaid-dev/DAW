export function pintarPromesas(elementHTML, string) {
  const div = document.createElement("div");
  const span = document.createElement("span");

  span.textContent = string;

  div.appendChild(span);
  elementHTML.insertAdjacentHTML("afterend", div.innerHTML);
}
