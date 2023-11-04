<header>
  <div class="user-header-settings">
    <?php
    echo "<a class='btn' href='index.php?main=song&createSong'>Crear canción</a>";
    echo "<a class='btn' href='index.php?main=playlist&createPlaylist'>Crear playlist</a>";
    echo "<a class='btn' href='index.php?main=playlist&allPlaylist'>Playlists no favoritas</a>";
    echo "<a class='btn' href='index.php?main=playlist&favoritePlaylist'>Playlist favoritas</a>";
    ?>
  </div>
  <div class="search-bar">
    <form action="index.php?main=song" method="POST" class="search-form">
      <select name="param">
        <option value="title" selected>Título</option>
        <option value="author">Autor</option>
      </select>
      <input type="text" placeholder="Buscar canción..." name="searchQuery">
    </form>
    <svg xmlns="http://www.w3.org/2000/svg" x="0px" y="0px" width="45" height="45" viewBox="0 0 50 50">
      <path d="M 21 3 C 11.601563 3 4 10.601563 4 20 C 4 29.398438 11.601563 37 21 37 C 24.355469 37 27.460938 36.015625 30.09375 34.34375 L 42.375 46.625 L 46.625 42.375 L 34.5 30.28125 C 36.679688 27.421875 38 23.878906 38 20 C 38 10.601563 30.398438 3 21 3 Z M 21 7 C 28.199219 7 34 12.800781 34 20 C 34 27.199219 28.199219 33 21 33 C 13.800781 33 8 27.199219 8 20 C 8 12.800781 13.800781 7 21 7 Z" fill="white"></path>
    </svg>

  </div>
  <div class="user-header-settings">
    <?php
    echo "<span>" . $_SESSION["user"]->getName() . "</span>";
    echo "<img src='public/img/default-user.jpg' class='user-img'/>";
    echo "<a class='btn' href='index.php'>Volver a tus listas</a>";
    echo "<a class='btn' href='index.php?main=user&salir' >SALIR</a>";
    ?>
  </div>
</header>