export function loadAsync(src, element) {
  return new Promise((resolve, reject) => {
    const span = document.createElement("span");
    span.innerHTML = "<br><br>Loading...";
    element.appendChild(span);

    setTimeout(() => {
      const img = new Image();

      img.onload = () => {
        element.appendChild(img);
        resolve(img);
      };

      img.onerror = () => {
        reject(new Error("Error cargando imagen"));
      };

      img.src = src;
      span.remove();
    }, 2000);
  });
}
