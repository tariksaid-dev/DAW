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
  $pub = PublicationsRepository::getPublicationById($_GET["watchId"]);
  $comments = CommentsRepository::getCommentsByPubId($_GET["watchId"]);
  ?>
  <article class="single-view-layout">
    <?php
    echo "<h1>" . $pub->getTitle() . "</h1>";
    echo "<img src='public/img/" . $pub->getImage() . "'>";
    echo "<p>" . $pub->getText() . "</p>";
    ?>
  </article>
  <hr>

  <!-- comentarios -->
  <section class="comment-layout">
    <header class="comment-section-header">
      <span>Comentarios 👇</span>
      <?php
      if (!empty($_SESSION)) {
        echo "<a class='btn' href='index.php?main=comment&comentar=" . $_GET["watchId"] . "'>Comenta</a>";
      } else {
        echo "<span><a href='index.php?salir'>Inicia sesión para comentar</a></span>";
      }
      ?>
    </header>
    <div>
      <?php
      foreach ($comments as $com) {
        // main div
        echo "<div class='comment'>";
        //header div
        echo "<div class='comment-header'>";
        // inline group div
        echo "<div class='user-header-settings'>";
        echo "<img src='public/img/" . $com->getAuthor()->getImg() . "' class='user-img'>";
        echo "<span>" . $com->getAuthor()->getName() . "</span>";
        echo "</div>";
        echo "<div class='user-headre-settings'>";
        echo "<span>" . $com->getDate() . "</span>";
        echo "</div>";
        echo "</div>";
        // body
        echo "<div class='comment-body'>";
        echo "<p>" . $com->getText() . "</p>";
        echo "</div>";
        if ($_SESSION["user"]->isAdmin()) {
          echo "<div><a class='btn' href='index.php?main=comment&deleteCommentById=" . $com->getId() . "'>Eliminar</a></div>";
        }
        echo "</div>";
      }
      ?>
    </div>
  </section>
</body>

</html>