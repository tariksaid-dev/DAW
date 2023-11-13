import { useEffect, useState } from "react";

function Main() {
  const [items, setItems] = useState();

  useEffect(() => {
    async function fetchItems() {
      const res = await fetch("https://fakestoreapi.com/products");
      const data = await res.json();
      setItems(data);
    }
    fetchItems();
  }, []);

  return (
    <main className="bg-gray-900 p-[4rem,4.8rem,6.4rem] overflow-y-auto">
      <div className="gap-[1.2rem] grid grid-cols-[repeat(auto-fill,minmax(250px,1fr))] p-16">
        {items?.map((el) => (
          <article
            className="flex flex-col gap-3 text-center hover:cursor-pointer border border-gray-700 p-2 text-gray-300 bg-slate-800 rounded-xl"
            key={el.id}
          >
            <img
              src={el.image}
              alt="Product Image"
              className="rounded-lg max-h-64"
            />
            <span className="text-sm">{el.title}</span>
            <span className="font-extrabold">{el.price}€</span>
          </article>
        ))}
      </div>
    </main>
  );
}

export default Main;
