import { getUsers } from "./api/usersApi";
import { renderForm } from "./renderForm";

const users_url = "http://localhost:3000/users";

const container = document.getElementById("app");

let isLogin = false;

renderForm(container);

container.addEventListener("click", async (e) => {
  e.preventDefault();
  if (e.target.id === "4rxuon1gxqp") {
    const card = e.target.closest("[data-v0-t='card']");

    const usernameElement = card.querySelector("#username");
    const passwordElement = card.querySelector("#password");

    const formData = {
      username: usernameElement.value,
      password: passwordElement.value,
    };

    const serverData = await getUsers(users_url);

    serverData.forEach((el) => {
      if (
        el.username == formData.username &&
        el.password == formData.password
      ) {
        isLogin = true;
      }
    });

    if (isLogin) {
      container.innerHTML = "<h1>Estás logeado</h1>";
    }
  }
});
