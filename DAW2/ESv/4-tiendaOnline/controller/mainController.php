<?php
error_reporting(E_ALL);
ini_set('display_errors', 1);

// require_once("model/User.php");
// require_once("model/UserRepository.php");
// require_once("model/Playlist.php");
// require_once("model/PlaylistRepository.php");
// require_once("model/Song.php");
// require_once("model/SongRepository.php");

session_start();

if (isset($_GET["main"])) {
  // $_GET["main"] == "auth" && require_once("controller/authController.php");
  // $_GET["main"] == "user" && require_once("controller/userController.php");
  // $_GET["main"] == "song" && require_once("controller/songController.php");
  // $_GET["main"] == "playlist" && require_once("controller/playlistController.php");
} else {
  if (empty($_SESSION) || empty($_SESSION["user"])) {
    include("view/login.php");
    die;
  }

  // if (isset($_SESSION)) {
  //   require_once("controller/playlistController.php");
  //   include("view/main.php");
  //   die;
  // }
}
