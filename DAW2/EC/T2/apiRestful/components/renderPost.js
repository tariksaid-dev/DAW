import { createCardElement } from "./Card";

/**
 *
 * @param {HTMLDivElement} element
 * @param {<post>Object>} posts
 */
export function renderPost(element, posts) {
  const cardElements = posts.map((post) => createCardElement(post));

  cardElements.forEach((cardElement) => {
    element.appendChild(cardElement);
  });
}
