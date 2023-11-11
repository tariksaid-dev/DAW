<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <style>
    <?php include "styles.css" ?>
  </style>
  <title>TSM - CARRITO VIEW</title>
</head>

<body>
  <?php
  include("view/ui/header.php");
  ?>
  <h1 style="margin-top: 20px;">Carrito</h1>
  <?php

  if (count($carritoLines) == 0) {
    echo "<h1 style='margin-top: 100px;'>Tu carrito está vacío!</h1>";
  } else {
    echo "<a href='index.php?main=order&payOrder={$_SESSION["user"]->getCarrito()->getId()}' class='btn' style='margin-left: 20px;'>Confirmar compra</a>";

    if (isset($warning)) {
      echo "<h2 class='warning'>$warning</h2>";
    }
  }

  ?>
  <div class="pub-layout">
    <?php
    foreach ($carritoLines as $carritoLine) {

      $product = $carritoLine->getProduct();

      echo "<article class='pub-element'>";
      echo "<div class='pub-button-container'>";
      echo "<a href='index.php?main=line&deleteLine={$carritoLine->getId()}' class='btn'>Eliminar del carrito</a>";
      echo "</div>";

      echo "<img src='public/img/{$product->getImg()}'></img>";
      echo "<h1>{$product->getName()} x {$carritoLine->getCantidad()}</h1>";
      echo "<p>Descripción del producto: {$product->getDescription()}</p>";
      echo "<p>Stock disponible: <strong>{$product->getStock()}</strong></p>";
      echo "<p>Precio por unidad: <strong>{$product->getPrice()} €</strong></p>";
      echo "<p>Precio total: <strong>{$carritoLine->getprecioLinea()} €</strong></p>";
      echo "</article>";
    }
    ?>
  </div>
  <?php
  include("view/ui/footer.php");
  ?>
</body>

</html>