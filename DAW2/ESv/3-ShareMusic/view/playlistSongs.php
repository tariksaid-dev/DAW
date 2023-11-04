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
  echo "<h1 style='margin-top: 20px;'>Canciones de la lista de reproducción " . PlaylistRepository::getPlaylistById($_GET["watchId"])->getTitle() . "</h1>";
  ?>
  <div class="pub-layout">
    <?php
    foreach (PlaylistRepository::getPlaylistById($_GET["watchId"])->getSongs() as $song) {
      echo "<article class='pub-element'>";
      echo "<div class='pub-button-container'>";

      echo "<audio controls>";
      echo "<source src='/public/music/" . $song->getFile() . "' type='audio/mpeg'>";
      echo "</audio>";

      echo "</div>";

      echo "<img src='public/img/" . $song->getImg() . "' ></img>";
      echo "<h1>" . $song->getTitle() . "</h1>";
      echo "<span>Autor de la canción: <strong>" . $song->getAuthor() . "</strong></span>";
      echo "<span>Duración de la canción: <strong>" . $song->getDuration() . "</strong></span>";
      echo "<span>Canción subida por: <strong>" . UserRepository::getUserById($song->getUploaderId())->getName() . "</strong></span>";
      echo "</article>";
    }
    ?>
  </div>
  <?php
  include("view/ui/footer.php");
  ?>
</body>

</html>