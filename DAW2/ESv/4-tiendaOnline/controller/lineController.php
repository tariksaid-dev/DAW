<?php

if (isset($_POST["addNewLine"])) {
  $currentLines = $_SESSION["user"]->getCarrito()->getLines();

  foreach ($currentLines as $line) {
    if ($line->getProduct()->getId() == $_POST["productId"]) {
      LineRepository::updateProductQuantityFromLineById($line->getId(), $_POST["cantidad"]);
      $_SESSION["user"]->getCarrito()->updateLines();
      require_once("controller/productController.php");
      include("view/main.php");
      die;
    }
  }

  LineRepository::createNewLine($_POST);
  $_SESSION["user"]->getCarrito()->updateLines();
  require_once("controller/productController.php");
  include("view/main.php");
  die;
}

if (isset($_GET["deleteLine"])) {
  LineRepository::deleteLineById($_GET["deleteLine"]);
  $_SESSION["user"]->getCarrito()->updateLines();
  header("Location: index.php?main=order&verCarrito");
  die;
}
