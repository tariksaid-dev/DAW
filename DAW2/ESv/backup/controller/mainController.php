<?php
// gestiona variables entrada
require_once("model/Publication.php");
require_once("model/PublicationRepository.php");
require_once("model/User.php");
require_once("model/UserRepository.php");

session_start();

// global declaration, esta bien??
$pubs = PublicationRepository::getPublications();

// LOGIN
if (isset($_GET["salir"])) {
  session_destroy();
  include("view/login.php");
  die;
}

// LOGIN ACT
// ugly
// si cargamos las publicaciones aquí, tenemos el problema de que solo podremos volver a este bloque o petará. Para ello, chequear post y gets y actuar en consecuencia ( mejorar diseño)
if (isset($_POST["user"])) {
  if (isset($_POST["register"])) {
    UserRepository::createUser($_POST);
  }
  $_SESSION["user"] = UserRepository::userLogin($_POST["user"], $_POST["password"]);
  include("view/mainView.php");
  die;
}

// DUDA -> No se puede hacer lo de arriba y esto?
// if (isset($_SESSION["user"])) {
//   include("view/mainView.php");
//   die;
// }

// REGISTER - cambiar formularios
if (isset($_GET["newUser"])) {
  include("view/newUser.php");
  die;
}

if (isset($_POST["newPub"])) {
  PublicationRepository::newPub($_POST, $_FILES);
  include("view/mainView.php");
  die;
}

if (isset($_GET["createPublication"])) {
  include("view/newPubView.php");
  die;
}

if (isset($_GET["returnToMainView"])) {
  include("view/mainView.php");
  die;
}


?>