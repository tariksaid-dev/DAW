<?php
error_reporting(E_ALL);
ini_set('display_errors', 1);

require_once("model/Publications.php");
require_once("model/PublicationsRepository.php");
require_once("model/User.php");
require_once("model/UserRepository.php");
require_once("model/Comments.php");
require_once("model/CommentsRepository.php");

require_once("db.php");

session_start();


if (isset($_GET["main"])) {
  $_GET["main"] == "user" && require_once("controller/userController.php");
  $_GET["main"] == "auth" && require_once("controller/authController.php");
  $_GET["main"] == "pub" && require_once("controller/publicationController.php");
  $_GET["main"] == "comment" && require_once("controller/commentController.php");
  die;
} else {

  if (empty($_SESSION)) {
    include("view/login.php");
    die;
  }

  if (isset($_SESSION)) {
    require_once("controller/publicationController.php");
    include("view/mainView.php");
    die;
  }
}
