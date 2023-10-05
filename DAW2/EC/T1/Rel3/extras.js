function fetchUsers(arr) {
  return arr
    .filter((el) => el.email.endsWith(".com"))
    .reduce(
      (acc, curr) => acc.set(curr.firstname + "_" + curr.lastname, curr.email),
      new Map()
    );
}

function fetchReduce(arr) {
  return arr.reduce(
    (acc, curr) =>
      curr.email.endsWith(".com")
        ? acc.set(curr.firstname + "_" + curr.lastname, curr.email)
        : acc,
    new Map()
  );
}
