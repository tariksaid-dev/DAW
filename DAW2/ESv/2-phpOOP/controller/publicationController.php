<?php

$pubs = PublicationsRepository::getPublications();

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

if (isset($_POST["submitEditPub"])) {
  PublicationsRepository::updatePubById($_POST["id"], $_POST["title"], $_POST["text"], $_POST["img"] ??= null);
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

if (isset($_GET["watchId"])) {
  $_SESSION["pub_id_watching"] = $_GET["watchId"];
  include("view/dinamicView.php");
  die;
}
