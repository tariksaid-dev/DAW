export function pintarPromesas(component) {
  getUsersWithPromise()
    .then((users) => {
      users.forEach((element) => {
        component.innerHTML += `<p>${element.firstname}</p>`;
      });
    })
    .catch((err) => console.error(err));
}

function getUsersWithPromise() {
  return new Promise((resolve, reject) => {
    fetch("https://jsonplaceholder.org/users")
      .then((res) => {
        if (!res.ok) reject(new Error("Couldn't fetch users"));
        return res.json();
      })
      .then((data) => resolve(data))
      .catch((err) => reject(err));
  });
}
