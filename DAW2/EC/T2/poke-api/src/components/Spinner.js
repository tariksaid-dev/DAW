export function createSpinner(htmlElement) {
  const spinner = "../../assets/spinner.svg";

  const absoluteContainer = document.createElement("div");
  absoluteContainer.className = "spinner-container";

  const imgContainer = document.createElement("img");
  imgContainer.src = spinner;

  absoluteContainer.appendChild(imgContainer);

  htmlElement.appendChild(absoluteContainer);
}
