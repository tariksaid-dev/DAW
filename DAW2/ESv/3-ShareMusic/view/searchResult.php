<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <style>
    <?php include "styles.css" ?>
  </style>
  <title>TSM - SEARCH RESULTS</title>
</head>

<body>
  <?php
  include("view/ui/header.php");
  ?>
  <h1 style="margin-top: 20px;">Resultado de tu búsqueda</h1>
  <div class="pub-layout">
    <?php
    foreach ($searchResults as $searchResult) {
      echo "<article class='pub-element'>";
      echo "<img src='public/img/" . $searchResult->getImg() . "'></img>";
      echo "<h1>" . $searchResult->getTitle() . "</h1>";
      echo "<span>Autor de la canción: <strong>" . $searchResult->getAuthor() . "</strong></span>";
      echo "<span>Canción subida por: <strong>" . UserRepository::getUserById($searchResult->getUploaderId())->getName() . "</strong></span>";
      echo "<span>Duración de la canción: " . $searchResult->getDuration() . "</span>";
      echo "</article>";
    }
    ?>
  </div>
  <?php
  include("view/ui/footer.php");
  ?>
</body>

</html>