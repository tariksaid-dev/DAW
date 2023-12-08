export async function getFoodsApi(url) {
  const response = await fetch(url);
  const data = await response.json();
  return data;
}

export async function getFoodApiById(url, id) {
  const response = await fetch(`${url}/${id}`);
  const data = await response.json();
  return data;
}

export async function getFoodsApiById(url, arrayId) {
  const result = arrayId.map(async (el) => {
    const response = await fetch(`${url}/${el}`);
    const data = await response.json();
    return data;
  });

  const res = await Promise.all(result);

  return res;
}
