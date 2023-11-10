<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <style>
    <?php include "styles.css" ?>
  </style>
  <title>TSM - MAIN VIEW (PRODUCTS)</title>
</head>

<body>
  <?php
  include("view/ui/header.php");
  ?>
  <h1 style="margin-top: 20px;">Productos disponibles</h1>
  <div class="pub-layout">
    <?php
    foreach ($products as $product) {
      echo "<article class='pub-element'>";
      echo "<div class='pub-button-container'>";
      echo "<a href='index.php?main=playlist&añadirCancionToPlaylist=" . $product->getId() . "' class='btn'>Añadir canción</a>";

      if ($_SESSION["user"]->isAdmin()) {
        echo "<a href='index.php?main=playlist&deletePlaylist=" . $product->getId() . "' class='btn'>Borrar</a>";
      }

      echo "</div>";
      echo "<a href='index.php?main=song&watchId=" . $product->getId() . "'>";
      echo "<img src='public/img/" . $product->getImg() . "'></img>";
      echo "<h1>" . $product->getName() . "</h1>";
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