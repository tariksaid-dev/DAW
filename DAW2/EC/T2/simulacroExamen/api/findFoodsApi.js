export async function findFoodsApi(url, query) {
  const newQuery = query.split("")[0].toUpperCase().concat(query.slice(1));

  const finalUrl = `${url}?strCategory=${newQuery}`;

  const response = await fetch(finalUrl);
  const data = await response.json();
  return data[0];
}
