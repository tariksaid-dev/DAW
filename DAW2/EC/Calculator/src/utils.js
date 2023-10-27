export function saveInSession(key, item) {
  return sessionStorage.setItem(key, item);
}
