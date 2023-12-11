export function paso1(element) {
  return new Promise((resolve) => {
    setTimeout(() => {
      const span = document.createElement("span");
      span.id = "span";
      span.textContent = "Paso 1, creamos un span";
      element.appendChild(span);

      resolve(span);
    }, 1000);
  });
}

export function paso2(span) {
  return new Promise((resolve) => {
    setTimeout(() => {
      span.style.color = "blue";
      span.textContent = "Paso 2, cambiamos el color a azul";
      resolve(span);
    }, 1000);
  });
}

export function paso3(span) {
  return new Promise((resolve) => {
    setTimeout(() => {
      span.textContent = "Paso 3, Hola mundo!";
      resolve(span);
    }, 1000);
  });
}
