export function saveTasksToLocalStorage(key, data) {
  localStorage.setItem(key, JSON.stringify(data));
}

export function loadFromLocalStorage(key) {
  if (localStorage.getItem(key)) {
    return JSON.parse(localStorage.getItem(key));
  }
  return null;
}
