<?php

if (isset($_GET["getUserOrder"])) {
  $carrito = $_SESSION["user"]->getCarrito();

  // echo serialize($carrito);
  echo json_encode($carrito->jsonSerialize(), JSON_PRETTY_PRINT | JSON_UNESCAPED_UNICODE);
}

if (isset($_GET["getOrderById"])) {
  $order = OrderRepository::getOrdersByUserId(1);
  echo json_encode($order, JSON_PRETTY_PRINT | JSON_UNESCAPED_UNICODE);
}

if (isset($_GET["getAllOrders"])) {
  $allOrders = OrderRepository::getAllOrders();
  echo json_encode($allOrders, JSON_PRETTY_PRINT | JSON_UNESCAPED_UNICODE);
}
