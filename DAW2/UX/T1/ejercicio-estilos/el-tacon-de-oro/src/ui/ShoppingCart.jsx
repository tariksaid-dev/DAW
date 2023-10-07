import { HiOutlineShoppingBag } from "react-icons/hi2";

function ShoppingCart() {
  return (
    <div className="flex gap-5 items-center p-4 hover:cursor-pointer text-yellow-600">
      <HiOutlineShoppingBag className="text-4xl" />
      <span className="text-xl">0</span>
    </div>
  );
}

export default ShoppingCart;
