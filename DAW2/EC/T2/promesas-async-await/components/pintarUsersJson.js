function fetchApiJson(url) {
  return new Promise((resolve, reject) => {
    fetch(url)
      .then((res) => {
        if (!res.ok) throw new Error("Failed to fetch");
        return res.json();
      })
      .then((data) => resolve(data))
      .catch((err) => reject(err));
  });
}
