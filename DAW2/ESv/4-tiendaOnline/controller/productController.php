<?php

$products = ProductRepository::getAllProducts();

if (isset($_POST["newProduct"])) {
  ProductRepository::createNewProduct($_POST, $_FILES);
  header("Location: index.php");
  die;
}

if (isset($_GET["deleteProduct"])) {
  ProductRepository::deleteProductById($_GET["deleteProduct"]);
  header("Location: index.php");
  die;
}

// NAVIGATION
if (isset($_GET["addProduct"])) {
  include("view/addNewProduct.php");
  die;
}
