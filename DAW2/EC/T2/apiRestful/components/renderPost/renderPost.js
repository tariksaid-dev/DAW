/**
 *
 * @param {HTMLDivElement} element
 * @param {<post>Object>} posts
 */
let divPost = "";
export function renderPost(element, posts) {
  posts.forEach((post) => {
    divPost += `<div class="card" style="width: 18rem">
    <div class="card-body">
      <h5 class="card-title">${post.title}</h5>
      <h6 class="card-subtitle mb-2 text-muted">${post.id}</h6>
      <p class="card-text">
        ${post.post}
      </p>
      <button class="btn-primary" id="edit-post">Editar</button>
      <button class="btn-primary" id="delete-post">Eliminar</button>
    </div>
  </div>`;
  });

  console.log(divPost);
  element.innerHTML = divPost;
}
