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
      if ($_SESSION["user"]->isAdmin()) {
        echo "<a class='btn' href='index.php?main=pub&createPublication'>Nueva publicación</a>";
        echo "<a class='btn' href='index.php?main=auth&adminPanel'>Admin panel</a>";
      }
      ?>
    </div>
    <div class="search-bar">
      <form action="index.php?main=pub" method="GET" class="search-form">
        <select name="order">
          <option value="ASC" selected>Ascendente</option>
          <option value="DESC">Descendente</option>
        </select>
        <input type="text" placeholder="Buscar..." name="searchQuery">
        <input type="hidden" name="page" value="0">

      </form>
      <svg xmlns="http://www.w3.org/2000/svg" x="0px" y="0px" width="45" height="45" viewBox="0 0 50 50">
        <path d="M 21 3 C 11.601563 3 4 10.601563 4 20 C 4 29.398438 11.601563 37 21 37 C 24.355469 37 27.460938 36.015625 30.09375 34.34375 L 42.375 46.625 L 46.625 42.375 L 34.5 30.28125 C 36.679688 27.421875 38 23.878906 38 20 C 38 10.601563 30.398438 3 21 3 Z M 21 7 C 28.199219 7 34 12.800781 34 20 C 34 27.199219 28.199219 33 21 33 C 13.800781 33 8 27.199219 8 20 C 8 12.800781 13.800781 7 21 7 Z" fill="white"></path>
      </svg>

    </div>
    <div class="user-header-settings">
      <?php
      echo "<span>" . $_SESSION["user"]->getName() . "</span>";
      echo "<img src='public/img/default-user.jpg' class='user-img'/>";
      echo "<a class='btn' href='index.php?main=auth&salir' >SALIR</a>";
      ?>
    </div>
  </header>
  <?php
  if (isset($_SESSION["fetch_error"]))
    echo "<h1 style='margin-top: 2rem;'>" . $_SESSION["fetch_error"] . "</h1>";
  ?>
  <div class="pub-layout">
    <?php

    foreach ($pubs as $pub) {
      echo "<article class='pub-element'>";
      echo "<div class='pub-button-container'>";
      echo "<a href='index.php?main=pub&editPub=" . $pub->getId() . "' class='btn'>Editar</a>";
      echo "<a href='index.php?main=pub&deletePub=" . $pub->getId() . "' class='btn'>Borrar</a></div>";
      echo "<a href='index.php?main=pub&watchId=" . $pub->getId() . "'>";
      echo "<img src='public/img/" . $pub->getImage() . "' ></img>";
      echo "<h1>" . $pub->getTitle() . "</h1>";
      echo "<span>" . $pub->getText() . "</span>";
      echo "</a>";
      echo "</article>";
    }
    ?>
  </div>
  <footer>
    <?php


    $totalPages = ceil($totalPubsFinded / 2);
    var_dump($totalPubsFinded);
    var_dump($totalPages);

    if (isset($_GET['page'])) {
      $currentPage = max(1, min((int)$_GET['page'], $totalPages));
    } else {
      $currentPage = 1;
    }

    $start = ($currentPage - 1) * 2;

    for ($i = 1; $i <= $totalPages; $i++) {
      if ($i == $currentPage) {
        echo "<strong>$i</strong> "; // Página actual
      } else {
        echo "<a href='index.php?order=ASC&searchQuery=a&page=$i'>$i</a> ";
      }
    }
    ?>
  </footer>
</body>

</html>