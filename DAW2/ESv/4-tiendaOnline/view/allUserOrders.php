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
  <h1 style="margin-top: 20px;">Pedidos Realizados</h1>
  <div class="pub-layout">
    <?php
    foreach ($orders as $order) {
      $lines = $order->getLines();

      // echo "<pre>";
      // var_dump($order);
      // echo "</pre>";


      echo "<article class='pub-element'>";
      echo "<h4>Fecha compra: {$order->getDate()}</h4>";

      foreach ($lines as $line) {
        $product = $line->getProduct();

        echo "<div class='user-header-settings'>";
        echo "<img src='public/img/{$product->getImg()}' class='user-img'></img>";
        echo "<h1>{$product->getName()} x {$line->getCantidad()}</h1>";
        echo "<p><strong>{$line->getprecioLinea()} €</strong></p>";
        echo "</div>";
      }
      echo "<hr>";
      echo "<h1>Total: {$order->getTotalPrice()} €";
      echo "</article>";
    }
    ?>
  </div>
  <?php
  include("view/ui/footer.php");
  ?>
</body>

</html>