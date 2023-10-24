<?php
if (isset($_POST["submitComment"])) {
  CommentsRepository::createComment($_POST);
  header("Location: index.php?main=pub&watchId=" . $_SESSION['pub_id_watching']);
  die;
}

if (isset($_GET["deleteCommentById"])) {
  CommentsRepository::deleteCommentById($_GET["deleteCommentById"]);
  header("Location: index.php?main=pub&watchId=" . $_SESSION['pub_id_watching']);
  die;
}

// -- Navigation --

if (isset($_GET["comentar"])) {
  include("view/createCommentView.php");
  die;
}
