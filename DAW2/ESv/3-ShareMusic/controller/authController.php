<?php
if (isset($_POST["user"])) {
  if (isset($_POST["register"])) {
    UserRepository::createNewUser($_POST);
  }
  $_SESSION["user"] = UserRepository::userLogin($_POST["user"], $_POST["password"]);

  // array de canciones seleccionadas, se debería mover
  $_SESSION["selectedSongs"] = array();
  $_SESSION["selectedSongsName"] = array();

  require_once("controller/playlistController.php");
  include("view/main.php");
  die;
}

if (isset($_GET["newUser"])) {
  include("view/signin.php");
  die;
}

include("view/login.php");
