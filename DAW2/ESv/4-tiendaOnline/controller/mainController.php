<?php
error_reporting(E_ALL);
ini_set('display_errors', 1);

require_once("model/Line.php");
require_once("model/LineRepository.php");
require_once("model/Order.php");
require_once("model/OrderRepository.php");
require_once("model/Product.php");
require_once("model/ProductRepository.php");
require_once("model/User.php");
require_once("model/UserRepository.php");

session_start();

if (isset($_GET["main"])) {
  $_GET["main"] == "auth" && require_once("controller/authController.php");
  $_GET["main"] == "user" && require_once("controller/userController.php");
  $_GET["main"] == "product" && require_once("controller/productController.php");
  $_GET["main"] == "line" && require_once("controller/lineController.php");
  $_GET["main"] == "order" && require_once("controller/orderController.php");
  $_GET["main"] == "api" && require_once("controller/apiController.php");
} else {
  if (empty($_SESSION) || empty($_SESSION["user"])) {
    include("view/login.php");
    die;
  }

  if (isset($_SESSION)) {
    require_once("controller/productController.php");
    include("view/main.php");
    die;
  }
}
