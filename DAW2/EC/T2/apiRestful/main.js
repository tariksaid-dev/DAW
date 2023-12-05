import { renderPost } from "./components/renderPost";
import { createPostApi } from "./utils/createPost";
import { deletePostApi } from "./utils/deletePostsApi";
import { getPostApi } from "./utils/getPostApi";
import { updatePostApi } from "./utils/updatePost";

const URL = `${import.meta.env.VITE_URL_API}/posts`;

// DOM elements
const postList = document.querySelector(".post-list");
const addPostForm = document.querySelector(".add-post-form");
const formInput = document.getElementById("title-post");
const formTextarea = document.getElementById("content-post");
const formButton = document.querySelector(".btn.btn-primary.mt-2.mb-3");

getPostApi(URL, (data) => {
  renderPost(postList, data);
});

addPostForm.addEventListener("submit", (e) => {
  e.preventDefault();

  const postData = {
    title: formInput.value,
    post: formTextarea.value,
  };

  if (formButton.classList.contains("btn-primary")) {
    createPostApi(URL, postData, (data) => renderPost(postList, [data]));
  }

  if (formButton.classList.contains("btn-secondary")) {
    const postId = formButton.getAttribute("data-id");

    const formInputValue = formInput.value;
    const formTextareaValue = formTextarea.value;

    updatePostApi(URL, postId, JSON.stringify(postData), () => {
      const myCard = document.querySelector(`.card[data-id="${postId}"]`);

      myCard.querySelector(".card-title").textContent = formInputValue;
      myCard.querySelector(".card-text").textContent = formTextareaValue;
    });

    formButton.classList.replace("btn-secondary", "btn-primary");
    formButton.textContent = "Añadir Post";
    addPostForm.reset();
  }
});

postList.addEventListener("click", (e) => {
  if (e.target && e.target.id === "delete-post") {
    const cardBody = e.target.closest(".card-body");
    const cardContainer = cardBody.closest(".card");

    const postId = cardBody.querySelector(".card-subtitle").textContent;

    deletePostApi(URL, postId, () => {
      cardContainer.remove();
    });
  }

  if (e.target && e.target.id === "edit-post") {
    const cardBody = e.target.closest(".card-body");
    const titleElement = cardBody.querySelector(".card-title");
    const postElement = cardBody.querySelector(".card-text");
    const postId = cardBody.querySelector(".card-subtitle").textContent;

    cardBody.closest(".card").setAttribute("data-id", postId);

    formButton.classList.replace("btn-primary", "btn-secondary");
    formButton.setAttribute("data-id", postId);
    formButton.textContent = "Editar Post";

    formInput.value = titleElement.textContent;
    formTextarea.value = postElement.textContent;
  }
});
