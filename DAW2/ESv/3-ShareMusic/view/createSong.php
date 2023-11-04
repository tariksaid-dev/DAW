<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <style>
    <?php include "styles.css" ?>
  </style>
  <title>CREATE SONG - TSM</title>
</head>

<body>
  <?php
  include("view/ui/header.php");
  echo "<form action='index.php?main=song&createSong' method='POST' enctype='multipart/form-data' class='insert-pub-form-layout'>";
  echo "<input type='text' placeholder='Título de la canción' name='title'>";
  echo "<input type='text' placeholder='Autor' name='author'>";
  echo "<input type='text' placeholder='Duración de la canción en segundos' name='duration'>";
  // Necesito labels y tal vez estilo para añadir ambos archivos (el input se ve idéntico)
  echo "<label>Imágen de la canción:</label>";
  echo "<input type='file' name='img'>";
  echo "<label>Archivo de la canción:</label>";
  echo "<input type='file' name='song'>";
  echo "<input class='btn' type='submit' name='newSong' value='Enviar'>";
  echo "</form>";

  ?>
  <?php
  include("view/ui/footer.php");
  ?>
</body>

</html>