function Footer() {
  return (
    <footer className="bg-gray-400 py-2 px-20 border border-solid border-gray-100 flex gap-10 items-center justify-evenly text-xs text-center">
      <ul>
        <li className="text-sm font-semibold">Ayuda</li>
        <li>Atención al cliente</li>
        <li>Preguntas frecuentes</li>
        <li>Nuestras tiendas</li>
      </ul>
      <ul>
        <li className="text-sm font-semibold">Redes</li>
        <li>Instagram</li>
        <li>Facebook</li>
        <li>Twitter</li>
      </ul>
      <ul>
        <li className="text-sm font-semibold">Quienes somos</li>
        <li>Sobre nosotros</li>
        <li>Información de contacto</li>
        <li>TSM asociados</li>
      </ul>
      <ul>
        <li className="text-sm font-semibold">Políticas</li>
        <li>Aviso de cookies</li>
        <li>Privacidad</li>
      </ul>
    </footer>
  );
}

export default Footer;
