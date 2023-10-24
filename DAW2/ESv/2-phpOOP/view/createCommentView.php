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
      echo "<a class='btn' href='index.php?salir' >SALIR</a>";
      ?>
    </div>
  </header>
  <?php
  $pub = PublicationsRepository::getPublicationById($_GET["comentar"]);
  ?>
  <div class="edit-view-layout">
    <aside class="col-1">
      <h1 style="margin-bottom: 2rem;">Noticia a comentar 👇</h1>
      <?php
      echo "<article class='pub-element'>";
      echo "<img src='public/img/" . $pub->getImage() . "' ></img>";
      echo "<h1>" . $pub->getTitle() . "</h1>";
      echo "<span>" . $pub->getText() . "</span>";
      echo "</article>";
      // 
      ?>
    </aside>
    <main class="col-2">
      <?php
      echo "<form class='edit-form' action='index.php?main=comment' method='POST'>";
      echo "<textarea class='com-text' name='text' placeholder='Escribe tu comentario'></textarea>";
      echo "<input class='btn' type='submit' name='submitComment' value='Enviar'>";
      echo "</form>";
      ?>
    </main>
  </div>

</body>

</html>