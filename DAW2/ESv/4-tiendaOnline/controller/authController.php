<?php
if (isset($_POST["user"])) {
  if (isset($_POST["register"])) {
    UserRepository::createNewUser($_POST);
  }
  $_SESSION["user"] = UserRepository::userLogin($_POST["user"], $_POST["password"]);

  require_once("controller/productController.php");
  include("view/main.php");
  die;
}

if (isset($_GET["newUser"])) {
  include("view/signin.php");
  die;
}

include("view/login.php");
