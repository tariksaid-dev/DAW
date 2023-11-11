<?php
if (isset($_GET["verCarrito"])) {
  $carritoLines = $_SESSION["user"]->getCarrito()->getLines();
  include("view/carrito.php");
  die;
}

if (isset($_GET["payOrder"])) {
  $currentOrder = $_SESSION["user"]->getCarrito();

  if ($currentOrder->isEnoughStockForEveryLine()) {
    foreach ($currentOrder->getLines() as $line) {
      ProductRepository::updateStockByProductId($line->getProduct()->getId(), $line->getProduct()->getStock() - $line->getCantidad());
    }
    OrderRepository::confirmCurrentOrder($_GET["payOrder"]);
    OrderRepository::createNewOrder();
    $_SESSION["user"]->updateCarrito();
    header("Location: index.php");
    die;
  } else {
    $warning = "No hay stock suficiente para alguno de tus pedidos. Puedes eliminarlos del carrito o esperar a que vuelva a haber existencias.";
    $carritoLines = $_SESSION["user"]->getCarrito()->getLines();
    include("view/carrito.php");
    die;
  }
}

if (isset($_GET["watchAllUserOrders"])) {
  $orders = OrderRepository::getFinishedOrdersByUserId($_SESSION["user"]->getId());
  include("view/allUserOrders.php");
  die;
}
