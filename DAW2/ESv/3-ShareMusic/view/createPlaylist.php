<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <style>
    <?php include "styles.css" ?>
  </style>
  <title>UPLOAD PUB</title>
</head>

<body>
  <?php
  include("view/ui/header.php");

  echo "<h1 style='margin-top: 20px;'>Crear nueva lista de reproducción</h1>";

  echo "<form action='index.php' method='POST' class='insert-pub-form-layout'>";
  echo "<input type='text' placeholder='Nombre de la playlist' name='title'>";
  echo "<label>Canciones seleccionadas: </label>";
  echo "<input type='text' value='";
  if (isset($_SESSION["selectedSongNames"])) {
    // Une el array y devuelve un string separado por el primer param
    echo implode(", ", $_SESSION["selectedSongNames"]);
  }
  echo "' readonly>";
  echo "<input class='btn' type='submit' name='newPlaylist' value='Crear playlist'>";
  echo "</form>";
  ?>
  <!-- <h1>Todas las canciones</h1> -->
  <div class="pub-layout">

    <?php
    foreach ($songs as $song) {
      if (!in_array($song->getId(), $_SESSION["selectedSongs"])) {
        echo "<article class='pub-element'>";
        echo "<div class='pub-button-container'>";
        echo "<a href='index.php?main=playlist&añadirCancion=" . $song->getId() . "' class='btn'>Añadir</a></div>";
        echo "<img src='public/img/" . $song->getImg() . "' ></img>";
        echo "<h1>" . $song->getTitle() . "</h1>";
        echo "<span>Autor: <strong>" . $song->getAuthor() . "</strong></span>";
        echo "<span>Duración de la canción: <strong>" . $song->getDuration() . "</strong></span>";
        echo "<span>Subida por: <strong>" . UserRepository::getUserById($song->getUploaderId())->getName() . "</strong></span>";
        echo "</article>";
      }
    }
    ?>
  </div>
  <?php
  include("view/ui/footer.php");
  ?>

</body>

</html>