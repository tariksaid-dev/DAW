function Footer() {
  return (
    <footer className="bg-gray-800 py-2 px-20 flex gap-10 items-center justify-evenly text-xs text-center border-t border-gray-700 text-gray-300">
      <ul>
        <li className="text-sm font-semibold">Ayuda</li>
        <li className="hover:cursor-pointer">Atención al cliente</li>
        <li className="hover:cursor-pointer">Preguntas frecuentes</li>
        <li className="hover:cursor-pointer">Nuestras tiendas</li>
      </ul>
      <ul>
        <li className="text-sm font-semibold">Redes</li>
        <li className="hover:cursor-pointer">Instagram</li>
        <li className="hover:cursor-pointer">Facebook</li>
        <li className="hover:cursor-pointer">Twitter</li>
      </ul>
      <ul>
        <li className="text-sm font-semibold">Quienes somos</li>
        <li className="hover:cursor-pointer">Sobre nosotros</li>
        <li className="hover:cursor-pointer">Información de contacto</li>
        <li className="hover:cursor-pointer">TSM asociados</li>
      </ul>
      <ul>
        <li className="text-sm font-semibold">Políticas</li>
        <li className="hover:cursor-pointer">Aviso de cookies</li>
        <li className="hover:cursor-pointer">Privacidad</li>
      </ul>
    </footer>
  );
}

export default Footer;
