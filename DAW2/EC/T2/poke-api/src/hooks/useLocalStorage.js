export function getLocalStorage(key) {
  if (localStorage.getItem(key)) {
    return JSON.parse(localStorage.getItem(key));
  } else return [];
}

export function backup(key, data) {
  if (localStorage.getItem(key)) {
    const oldData = JSON.parse(localStorage.getItem(key));
    const updatedData = [].concat(oldData, data);
    localStorage.setItem(key, JSON.stringify(updatedData));
    return;
  }
  localStorage.setItem(key, JSON.stringify(data));
  return;
}
