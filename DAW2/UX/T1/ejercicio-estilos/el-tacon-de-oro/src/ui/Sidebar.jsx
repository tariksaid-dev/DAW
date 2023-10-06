import Logo from "./Logo";
import MainNav from "./MainNav";

function Sidebar() {
  return (
    <aside className="bg-gray-400 py-[3.2rem] border border-solid border-gray-100 row-span-full flex flex-col gap-[3.2rem] items-center">
      <Logo />
      <MainNav />
    </aside>
  );
}

export default Sidebar;
