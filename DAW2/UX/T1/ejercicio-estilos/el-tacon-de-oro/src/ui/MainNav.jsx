function MainNav() {
  return (
    <nav>
      <ul className="flex flex-col gap-3">
        <li className="hover:cursor-pointer hover:text-blue-400">
          <span>Tacones altos</span>
        </li>

        <li className="hover:cursor-pointer hover:text-blue-400">
          <span>Tacones bajos</span>
        </li>

        <li className="hover:cursor-pointer hover:text-blue-400">
          <span>Zapatos</span>
        </li>

        <li className="hover:cursor-pointer hover:text-blue-400">
          <span>Bolsos</span>
        </li>

        <li className="hover:cursor-pointer hover:text-blue-400">
          <span>Bolsos de fiesta</span>
        </li>
      </ul>
    </nav>
  );
}

export default MainNav;
