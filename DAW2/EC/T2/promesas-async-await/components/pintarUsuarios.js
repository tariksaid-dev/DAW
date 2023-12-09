export function pintarUsuarios(elementHTML, users) {
  const div = document.createElement("div");
  const ul = document.createElement("ul");

  console.log(users);

  users.forEach((element) => {
    const liName = document.createElement("li");
    liName.textContent = element.firstname + element.lastname;
    liName.style.color = "red";
    const liPassword = document.createElement("li");
    liPassword.textContent = element.login.password;
    const liEmail = document.createElement("li");
    liEmail.textContent = element.email;

    ul.appendChild(liName);
    ul.appendChild(liPassword);
    ul.appendChild(liEmail);
  });

  div.appendChild(ul);
  elementHTML.insertAdjacentHTML("afterend", div.innerHTML);
}
