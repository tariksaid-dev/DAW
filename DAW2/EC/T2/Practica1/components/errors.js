export function errors(message, element) {
  const newDiv = document.createElement("div");
  newDiv.textContent = message;
  newDiv.classList.add("errors");
  element.parentNode.insertBefore(newDiv, element.nextSibling);

  setTimeout(() => {
    newDiv.remove();
  }, 3000);
}
