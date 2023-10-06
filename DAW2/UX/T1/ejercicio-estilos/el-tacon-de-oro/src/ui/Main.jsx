import { useEffect, useState } from "react";

function Main() {
  const [items, setItems] = useState();

  useEffect(() => {
    async function fetchItems() {
      const res = await fetch("https://fakestoreapi.com/products");
      const data = await res.json();
      console.log(data);
      setItems(data);
    }
    fetchItems();
  }, []);

  return (
    <main className="bg-white p-[4rem,4.8rem,6.4rem]  overflow-y-auto">
      <div className="gap-[3.2rem] grid grid-cols-[repeat(auto-fill,minmax(150px,1fr))] p-16">
        {items?.map((el) => (
          <div
            className="flex flex-col gap-3 text-center hover:cursor-pointer"
            key={el.id}
          >
            <img src={el.image} alt="Product Image" />
            <span className="text-sm">{el.title}</span>
            <span className="font-extrabold">{el.price}€</span>
          </div>
        ))}
      </div>
    </main>
  );
}

export default Main;
