export function taskFiltered(event, ulElement) {
  const query = event.target.value.toLowerCase();
  const liElements = ulElement.querySelectorAll("li");

  liElements.forEach((element) => {
    const liText = element.textContent.toLowerCase();

    if (liText.includes(query)) {
      element.style.border = "2px solid black";

      setTimeout(() => {
        element.style.border = "1px solid #ddd";
      }, 5000);
    } else {
      element.style.border = "1px solid #ddd";
    }
  });
}
