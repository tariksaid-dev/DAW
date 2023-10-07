import HeaderMenu from "./HeaderMenu";
import ShoppingCart from "./ShoppingCart";
import UserAvatar from "./UserAvatar";

function Header() {
  return (
    <header className="bg-gray-800 py-5 px-20 flex gap-10 items-center justify-end">
      <ShoppingCart />
      <UserAvatar />
      <HeaderMenu />
    </header>
  );
}

export default Header;
