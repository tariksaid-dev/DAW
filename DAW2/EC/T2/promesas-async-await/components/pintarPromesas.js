import { users } from "../assets/users";

export function pintarPromesas(element) {
  const id = 1;
  findUser(id)
    .then((user) => (element.innerHTML = user.login.username))
    .catch((err) => (element.innerHTML = err.message));
}

function findUser(id) {
  return new Promise((resolve, reject) => {
    const user = users.find((user) => user.id === id);
    if (user) {
      resolve(user);
      return;
    }
    reject(new Error("Error"));
  });
}
