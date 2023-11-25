export function updatePostApi(url, postId, data, callback) {
  fetch(`${url}/${postId}`, {
    method: "PUT",
    headers: { "Content-Type": "application/json" },
    body: data,
  })
    .then((response) => {
      if (!response.ok) throw new Error("error");
      callback();
    })
    .catch((err) => console.error(err));
}
