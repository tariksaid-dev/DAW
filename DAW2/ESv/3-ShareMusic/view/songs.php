<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <style>
    <?php include "styles.css" ?>
  </style>
  <title>TSM - PUB VIEW</title>
</head>

<body>
  <?php
  include("view/ui/header.php");
  ?>
  <h1 style="margin-top: 20px;">Canciones disponibles</h1>
  <div class="pub-layout">
    <?php

    foreach ($playlists as $playlist) {
      echo "<article class='pub-element'>";
      echo "<div class='pub-button-container'>";
      echo "<a href='index.php?main=playlist&añadirCancion=" . $playlist->getId() . "' class='btn'>Añadir canción</a>";

      if ($_SESSION["user"]->isAdmin()) {
        echo "<a href='index.php?main=playlist&deletePlaylist=" . $playlist->getId() . "' class='btn'>Borrar</a>";
      }

      echo "</div>";
      echo "<a href='index.php?main=song&watchId=" . $playlist->getId() . "'>";
      echo "<img src='public/img/" . $playlist->getSongs()[0]->getImg() . "'></img>";
      echo "<h1>" . $playlist->getTitle() . "</h1>";
      echo "<span>Lista de reproducción creada por: <strong>" . UserRepository::getUserById($playlist->getCreatorId())->getName() . "</strong></span>";
      echo "</a>";
      echo "</article>";
    }
    ?>
  </div>
  <?php
  include("view/ui/footer.php");
  ?>
</body>

</html>