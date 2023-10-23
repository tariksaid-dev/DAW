<?php
if (isset($_POST["user"])) {
  if (isset($_POST["register"])) {
    UserRepository::createUser($_POST);
  }
  $_SESSION["user"] = UserRepository::userLogin($_POST["user"], $_POST["password"]);
  require_once("controller/publicationController.php");
  include("view/mainView.php");
  die;
}

if (isset($_GET["salir"])) {
  session_destroy();
  include("view/login.php");
  die;
}

if (isset($_GET["newUser"])) {
  include("view/newUser.php");
  die;
}
if (isset($_GET["adminPanel"])) {
  include("view/adminPanelView.php");
  die;
}
