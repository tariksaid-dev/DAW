export async function saveOrderApi(url, content) {
  const response = await fetch(url, {
    method: "POST",
    headers: { "Content-Type": "application/json" },
    body: JSON.stringify(content),
  });
  const data = await response.json();

  return data;
}
