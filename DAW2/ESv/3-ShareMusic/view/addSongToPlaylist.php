<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <style>
    <?php include "styles.css" ?>
  </style>
  <title>TSM - ADD SONG TO PLAYLIST</title>
</head>

<body>
  <?php
  include("view/ui/header.php");
  $playlist = PlaylistRepository::getPlaylistById($_GET["añadirCancionToPlaylist"]);

  echo "<h1 style='margin-top: 20px;'>Canciones para añadir a tu lista de reproducción {$playlist->getTitle()} </h1>
  <div class='pub-layout'>";

  $playlistSongs = $playlist->getSongs();

  foreach ($songs as $song) {
    $isSongInPlaylist = false;
    foreach ($playlistSongs as $playlistSong) {
      if ($playlistSong->getId() == $song->getId()) {
        $isSongInPlaylist = true;
        break;
      }
    }
    if (!$isSongInPlaylist) {
      echo "<article class='pub-element'>";
      echo "<div class='pub-button-container'>";

      echo "<a href='index.php?main=playlist&añadirCancionToPlaylist=" . $playlist->getId() . "&songId=" . $song->getId() . "' class='btn'>Añadir canción</a></div>";

      echo "<img src='public/img/" . $song->getImg() . "'></img>";
      echo "<h1>" . $song->getTitle() . "</h1>";
      echo "<span>Autor de la canción: <strong>" . $song->getAuthor() . "</strong></span>";
      echo "<span>Canción subida por: <strong>" . UserRepository::getUserById($song->getUploaderId())->getName() . "</strong></span>";
      echo "<span>Duración de la canción: " . $song->getDuration() . "</span>";
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