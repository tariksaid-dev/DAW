<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <style>
      <?php include "styles.css" ?>
  </style>
  <title>TSM - EDIT PUB</title>
</head>
<body>
  <header>
    <div class="user-header-settings">
      <a class='btn' href='index.php?returnToMainView'>Volver a publicaciones</a>
    </div>
    <div class="user-header-settings">
      <?php
      echo "<span>" . $_SESSION["user"]->getName() . "</span>";
      echo "<img src='public/img/default-user.jpg' class='user-img'/>";
      echo "<a class='btn secondary' href='index.php?salir' >SALIR</a>";
      ?>
    </div>
  </header>
    <?php
      $pub = PublicationsRepository::getPublicationById($_GET["editPub"]);
    ?>
  <div class="edit-view-layout">
    <aside class="col-1">
      <h1 style="margin-bottom: 2rem;">Noticia original 👇</h1>
      <?php
        echo "<article class='pub-element'>";
        echo "<img src='public/img/" . $pub->getImage() . "' ></img>";
        echo "<h1>" . $pub->getTitle() . "</h1>";
        echo "<span>" . $pub->getText() . "</span>";
        echo "</article>";
      // ?>
    </aside>
    <main class="col-2">
      <?php
      // DEVUELVO OBJETO O ARRAY?

        echo "<form class='edit-form' action='index.php' method='POST' enctype='multipart/form-data' class='insert-pub-form-layout'>";
        echo "<div class='inline-flex'>";
        echo "<input type='text' placeholder='Edita el título' name='title' value='".$pub->getTitle()."'>";
        echo "<div class='inline-flex'>";
        echo "<label>ID:</label>";
        echo "<input type='text' name='id' value='".$pub->getId()."' readonly>";
        echo "</div>";
        echo "</div>";
        echo "<textarea name='text' placeholder='Edita el artículo'>".$pub->getText()."</textarea>";
        echo "<input type='file' name='img'>";
        echo "<input class='btn' type='submit' name='submitEditPub' value='Editar'>";
        echo "</form>";
      ?>
    </main>
  </div>

</body>
</html>