export function createCardElement({ name, sprite, types }) {
  const card = document.createElement("div");
  card.className = "card";

  const img = document.createElement("img");
  img.src = sprite;

  const nameSpan = document.createElement("span");
  nameSpan.textContent = name.charAt(0).toUpperCase() + name.slice(1);
  nameSpan.className = "card-name";

  const typeSpan = document.createElement("span");

  typeSpan.textContent =
    types.length === 1 ? types[0] : `${types[0]} | ${types[1]}`;
  typeSpan.className = "card-type";

  card.appendChild(img);
  card.appendChild(nameSpan);
  card.appendChild(typeSpan);

  return card;
}

export function createCardElementForDialog({ name, sprite, types }) {
  const card = document.createElement("div");
  card.className = "dialog-card";

  const img = document.createElement("img");
  img.src = sprite;

  const nameSpan = document.createElement("span");
  nameSpan.textContent = name.charAt(0).toUpperCase() + name.slice(1);
  nameSpan.className = "card-name";

  const typeSpan = document.createElement("span");

  typeSpan.textContent =
    types.length === 1 ? types[0] : `${types[0]} | ${types[1]}`;
  typeSpan.className = "card-type";

  card.appendChild(img);
  card.appendChild(nameSpan);
  card.appendChild(typeSpan);

  return card;
}
