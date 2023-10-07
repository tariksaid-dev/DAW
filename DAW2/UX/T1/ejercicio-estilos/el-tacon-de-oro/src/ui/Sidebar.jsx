import Logo from "./Logo";
import MainNav from "./MainNav";

function Sidebar() {
  return (
    <aside className="bg-gray-800 text-slate-300 py-[3.2rem] border-r border-solid border-gray-700 row-span-full flex flex-col gap-[3.2rem] items-center">
      <Logo />
      <MainNav />
    </aside>
  );
}

export default Sidebar;
