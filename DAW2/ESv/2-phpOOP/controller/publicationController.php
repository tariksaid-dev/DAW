<?php

$pubs = PublicationsRepository::findPublicationByQuery($_GET["searchQuery"] ??= "", $_GET["order"] ??= "ASC", $_GET["page"] ??= 0);

$totalPubsFinded = PublicationsRepository::findPublicationByQueryCount($_GET["searchQuery"] ??= "");

if (isset($_POST["newPub"])) {
  PublicationsRepository::newPub($_POST, $_FILES);
  header("Location: index.php");
  die;
}

if (isset($_GET["deletePub"])) {
  PublicationsRepository::deletePub($_GET["deletePub"]);
  header("Location: index.php");
  die;
}

if (isset($_POST["submitEditPub"])) {
  PublicationsRepository::updatePubById($_POST["id"], $_POST["title"], $_POST["text"], $_POST["img"] ??= null);
  header("Location: index.php");
  die;
}

// -- Navigation --
if (isset($_GET["editPub"])) {
  include("view/editView.php");
  die;
}

if (isset($_GET["returnToMainView"])) {
  include("view/mainView.php");
  die;
}

if (isset($_GET["createPublication"])) {
  include("view/newPubView.php");
  die;
}

if (isset($_GET["watchId"])) {
  $_SESSION["pub_id_watching"] = $_GET["watchId"];
  include("view/dinamicView.php");
  die;
}
