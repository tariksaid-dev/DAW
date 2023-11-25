import { renderPost } from "./components/renderPost/renderPost";
import { createPostApi } from "./utils/createPost";
import { deletePostApi } from "./utils/deletePostsApi";
import { getPostApi } from "./utils/getPostApi";
import { updatePostApi } from "./utils/updatePost";

const URL = `${import.meta.env.VITE_URL_API}/posts`;

// DOM elements
const postList = document.querySelector(".post-list");
const addPostForm = document.querySelector(".add-post-form");
const titlePost = document.getElementById("title-post");
const contentPost = document.getElementById("content-post");

getPostApi(URL, (data) => {
  renderPost(postList, data);
});

addPostForm.addEventListener("submit", (e) => {
  e.preventDefault();

  const postData = {
    title: titlePost.value,
    post: contentPost.value,
  };

  createPostApi(URL, postData, (data) => {
    const arrayPost = [];
    arrayPost.push(data);

    renderPost(postList, arrayPost);
  });
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
});

postList.addEventListener("click", (e) => {
  if (e.target && e.target.id === "edit-post") {
    const cardBody = e.target.closest(".card-body");
    const titleElement = cardBody.querySelector(".card-title");
    const postElement = cardBody.querySelector(".card-text");

    const postId = cardBody.querySelector(".card-subtitle").textContent;

    const title = prompt("Nuevo título:");
    const post = prompt("Nuevo mensaje:");

    const data = {
      title,
      post,
    };

    updatePostApi(URL, postId, JSON.stringify(data), () => {
      titleElement.textContent = title;
      postElement.textContent = post;
    });
  }
});
