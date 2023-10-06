import {
  HiArrowRightOnRectangle,
  HiOutlineMoon,
  HiOutlineUser,
} from "react-icons/hi2";

function HeaderMenu() {
  return (
    <ul className="flex gap-2">
      <li>
        <HiOutlineUser className="hover:cursor-pointer " />
      </li>
      <li>
        <HiOutlineMoon className="hover:cursor-pointer " />
      </li>
      <li>
        <HiArrowRightOnRectangle className="hover:cursor-pointer " />
      </li>
    </ul>
  );
}

export default HeaderMenu;
