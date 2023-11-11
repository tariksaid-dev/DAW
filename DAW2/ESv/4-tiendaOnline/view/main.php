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
      if ($product->getStock() == 0) {
        echo "<h1>En estos momentos no hay stock de este producto</h1>";
      } else {
        echo "<form action='index.php?main=line' method='POST' class='button-form'>";
        echo "<input class='btn' type='submit' name='addNewLine' value='Añadir al carrito'>";
        echo "<input hidden name='productId' value='{$product->getId()}' >";
        echo "<select name='cantidad'>";
        for ($i = 1; $i < $product->getStock() + 1; $i++) {
          echo "<option>$i</option>";
        }
        echo "</select>";
        echo "</form>";
      }
      echo "</div>";
      echo "<img src='public/img/{$product->getImg()}'></img>";
      echo "<h1>{$product->getName()}</h1>";
      echo "<p>Descripción del producto: {$product->getDescription()}</p>";
      echo "<p>Stock disponible: <strong>{$product->getStock()}</strong></p>";
      echo "<p>Precio por unidad: <strong>{$product->getPrice()} €</strong></p>";
      echo "</article>";
    }
    ?>
  </div>
  <?php
  include("view/ui/footer.php");
  ?>
</body>

</html>