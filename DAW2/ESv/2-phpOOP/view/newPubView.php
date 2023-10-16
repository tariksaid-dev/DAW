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
  echo "<form action='index.php' method='POST' enctype='multipart/form-data' class='insert-pub-form-layout'>";
  echo "<input type='text' placeholder='Título' name='title'>";
  echo "<textarea name='text' placeholder='Escribe tu artículo'></textarea>";
  echo "<input type='file' name='img'>";
  echo "<input class='btn' type='submit' name='newPub' value='Enviar'>";
  echo "</form>";
  ?>
</body>

</html>