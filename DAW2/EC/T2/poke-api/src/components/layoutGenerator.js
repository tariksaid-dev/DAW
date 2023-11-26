export function layoutGenerator() {
  const nav = document.createElement("nav");
  const navInnerContainer = document.createElement("div");
  const navBtn = document.createElement("button");
  const navInput = document.createElement("input");
  const main = document.createElement("main");
  const footer = document.createElement("footer");
  const footerContainer = document.createElement("div");
  const btnBefore = document.createElement("button");
  const btnNext = document.createElement("button");

  document.body.className = "layout";
  document.body.appendChild(nav);
  nav.appendChild(navInnerContainer);
  navInnerContainer.appendChild(navBtn);
  navInnerContainer.append(navInput);

  navBtn.textContent = "Buscar";
  navBtn.className = "btn";
  navInput.className = "input";
  navInnerContainer.className = "inline-flex";

  document.body.appendChild(main);
  main.className = "main";
  main.id = "main";

  document.body.appendChild(footer);
  footer.appendChild(footerContainer);
  footerContainer.className = "inline-flex";
  footerContainer.appendChild(btnBefore);
  footerContainer.append(btnNext);
  btnBefore.className = "btn";
  btnNext.className = "btn";
  btnBefore.innerHTML = "&larr;";
  btnNext.innerHTML = "&rarr;";
  btnBefore.style.fontSize = "24px";
  btnNext.style.fontSize = "24px";
  btnBefore.id = "btn-before";
  btnNext.id = "btn-next";
}
