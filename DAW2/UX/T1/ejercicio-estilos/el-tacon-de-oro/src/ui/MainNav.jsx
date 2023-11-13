function MainNav() {
  return (
    <nav>
      <ul className="flex flex-col gap-3">
        <li className="hover:cursor-pointer hover:text-blue-400 font-lato">
          <span>Tacones altos</span>
        </li>

        <li className="hover:cursor-pointer hover:text-blue-400 font-lato">
          <span>Tacones bajos</span>
        </li>

        <li className="hover:cursor-pointer hover:text-blue-400 font-lato">
          <span>Zapatos</span>
        </li>

        <li className="hover:cursor-pointer hover:text-blue-400 font-lato">
          <span>Bolsos</span>
        </li>

        <li className="hover:cursor-pointer hover:text-blue-400 font-lato">
          <span>Bolsos de fiesta</span>
        </li>
      </ul>
    </nav>
  );
}

export default MainNav;
