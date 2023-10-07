import {
  HiArrowRightOnRectangle,
  HiOutlineSun,
  HiOutlineUser,
} from "react-icons/hi2";

function HeaderMenu() {
  return (
    <ul className="flex gap-2 text-[#4f46e5]">
      <li>
        <HiOutlineUser className="hover:cursor-pointer " />
      </li>
      <li>
        <HiOutlineSun className="hover:cursor-pointer " />
      </li>
      <li>
        <HiArrowRightOnRectangle className="hover:cursor-pointer " />
      </li>
    </ul>
  );
}

export default HeaderMenu;
