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
  <header>
    <div class="user-header-settings">
      <?php
      if ($_SESSION["user"]->checkRole()) {
        echo "<a class='btn' href='index.php?createPublication' >Nueva publicación</a>";
      }
      ?>
    </div>
    <div class="user-header-settings">
      <?php
      echo "<span>" . $_SESSION["user"]->getName() . "</span>";
      echo "<img src='public/img/default-user.jpg' class='user-img'/>";
      echo "<a class='btn secondary' href='index.php?salir' >SALIR</a>";
      ?>
    </div>
  </header>
  <div class="pub-layout">
    <?php
    foreach ($pubs as $pub) {
      echo "<article class='pub-element'>";
      echo "<div class='pub-button-container'>";
      echo "<a href='index.php?editPub=" . $pub->getId() . "' class='btn'>Editar</a>";
      echo "<a href='index.php?deletePub=" . $pub->getId() . "' class='btn'>Borrar</a></div>";
      echo "<img src='public/img/" . $pub->getImage() . "' ></img>";
      echo "<h1>" . $pub->getTitle() . "</h1>";
      echo "<span>" . $pub->getText() . "</span>";
      echo "</article>";
    }
    ?>
  </div>
</body>

</html>