function getLocalStorage(key) {
  if (localStorage.getItem(key)) {
    return JSON.parse(localStorage.getItem(key));
  }
}

export function backup(key, data) {
  console.log(data);
  if (localStorage.getItem(key)) {
    const oldData = JSON.parse(localStorage.getItem(key));
    const updatedData = [].concat(oldData, data);
    console.log(updatedData);
    localStorage.setItem(key, JSON.stringify(updatedData));
    return;
  }
  localStorage.setItem(key, JSON.stringify(data));
  return;
}
