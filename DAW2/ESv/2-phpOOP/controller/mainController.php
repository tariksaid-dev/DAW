<?php
error_reporting(E_ALL);
ini_set('display_errors', 1);

// gestiona variables entrada
require_once("model/Publications.php");
require_once("model/PublicationsRepository.php");
require_once("model/User.php");
require_once("model/UserRepository.php");

session_start();
$pubs = PublicationsRepository::getPublications();

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
  PublicationsRepository::newPub($_POST, $_FILES);
  include("view/mainView.php");
  die;
}

if (isset($_GET["deletePub"])) {
  PublicationsRepository::deletePub($_GET["deletePub"]);
  include("view/mainView.php");
  die;
}

if (isset($_GET["editPub"])) {
  include("view/editView.php");
  die;
}

if(isset($_POST["submitEditPub"])) {
  PublicationsRepository::updatePubById($_POST["id"], $_POST["title"], $_POST["text"], $_POST["img"]??=null);
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

include("view/login.php");
?>