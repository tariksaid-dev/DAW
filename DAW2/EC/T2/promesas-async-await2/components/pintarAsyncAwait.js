export async function pintarAsyncAwait(component) {
  const usuarios = await getUsersWithAsyncAwait();

  usuarios.forEach((element) => {
    component.innerHTML += `<ul style='border: 1px solid #fff; border-radius: 5px; padding: 1rem; list-style: none;'>
    <li>Username: ${element.login.username}</li>
    <li>Password: ${element.login.password}</li>
    <li>${element.address.city}</li>
    </ul>`;
  });
}

async function getUsersWithAsyncAwait() {
  const res = await fetch("https://jsonplaceholder.org/users");
  if (!res.ok) return new Error("Error");
  const data = await res.json();
  return data;
}
