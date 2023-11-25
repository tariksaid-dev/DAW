// No jsx no party :(
// export function createCardElement({ title, id, post }) {
//   return (
//     <div class="card" style="width: 18rem">
//       <div class="card-body">
//         <h5 class="card-title">{title}</h5>
//         <h6 class="card-subtitle mb-2 text-muted">{id}</h6>
//         <p class="card-text">{post}</p>
//         <button class="btn-primary" id="edit-post">
//           Editar
//         </button>
//         <button class="btn-primary" id="delete-post">
//           Eliminar
//         </button>
//       </div>
//     </div>
//   );
// }

export function createCardElement({ title, id, post }) {
  const card = document.createElement("div");
  card.className = "card";
  card.style.width = "18rem";

  const cardBody = document.createElement("div");
  cardBody.className = "card-body";

  const titleElement = document.createElement("h5");
  titleElement.className = "card-title";
  titleElement.textContent = title;

  const idElement = document.createElement("h6");
  idElement.className = "card-subtitle mb-2 text-muted";
  idElement.textContent = id;

  const postElement = document.createElement("p");
  postElement.className = "card-text";
  postElement.textContent = post;

  const editButton = document.createElement("button");
  editButton.className = "btn-primary";
  editButton.id = "edit-post";
  editButton.textContent = "Editar";

  const deleteButton = document.createElement("button");
  deleteButton.className = "btn-primary";
  deleteButton.id = "delete-post";
  deleteButton.textContent = "Eliminar";

  cardBody.appendChild(titleElement);
  cardBody.appendChild(idElement);
  cardBody.appendChild(postElement);
  cardBody.appendChild(editButton);
  cardBody.appendChild(deleteButton);

  card.appendChild(cardBody);

  return card;
}
