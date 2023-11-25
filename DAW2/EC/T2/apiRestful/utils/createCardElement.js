export function createCardElement({ title, id, post }) {
  return (
    <div class="card" style="width: 18rem">
      <div class="card-body">
        <h5 class="card-title">{title}</h5>
        <h6 class="card-subtitle mb-2 text-muted">{id}</h6>
        <p class="card-text">{post}</p>
        <button class="btn-primary" id="edit-post">
          Editar
        </button>
        <button class="btn-primary" id="delete-post">
          Eliminar
        </button>
      </div>
    </div>
  );
}
