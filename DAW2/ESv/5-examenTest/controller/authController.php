<?php
if (isset($_POST["user"])) {
  if (isset($_POST["register"])) {
    UserRepository::createNewUser($_POST);
  }
  $_SESSION["user"] = UserRepository::userLogin($_POST);

  require_once("controller/ticketController.php");
  include("view/main.php");
  die;
}

if (isset($_GET["newUser"])) {
  include("view/signin.php");
  die;
}

include("view/login.php");
