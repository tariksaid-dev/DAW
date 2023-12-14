import { getUsers } from "./api/usersApi";
import { renderForm } from "./renderForm";
import { renderLogin } from "./renderLogged";
import { renderRegister } from "./renderRegister";

const users_url = "http://localhost:3000/users";

const container = document.getElementById("app");
let isLogin = localStorage.getItem("isLogged");
console.log(isLogin);
if (!isLogin) {
  renderForm(container);
} else {
  renderLogin(container);
}

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

    localStorage.setItem("isLogged", isLogin);

    if (isLogin) {
      container.innerHTML = "";
      renderLogin(container);
    }
  }

  if (e.target.textContent == "Log out") {
    localStorage.removeItem("isLogged");
    globalThis.location.reload();
  }

  if (e.target.id == "register") {
    container.innerHTML = "";
    renderRegister(container);
  }
});
