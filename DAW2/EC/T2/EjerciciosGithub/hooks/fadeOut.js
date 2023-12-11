export function fadeOut(element, duration) {
  return new Promise((resolve) => {
    element.addEventListener("transitionend", function transitionEndHandler() {
      element.removeEventListener("transitionend", transitionEndHandler);
      resolve();
    });

    element.classList.add("fade-out");

    element.style.transitionDuration = duration + "ms";

    setTimeout(() => {
      element.style.opacity = 0;
    }, 0);
  });
}
