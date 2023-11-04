<?php

$songs = SongRepository::getAllSongs();

if (isset($_POST["newSong"])) {
  SongRepository::createNewSong($_POST, $_FILES);
  header("Location: index.php");
  die;
}

if (isset($_GET["deleteSong"])) {
  SongRepository::deleteSongById($_GET["deleteSong"]);
  header("Location: index.php");
  die;
}

if (isset($_POST["searchQuery"])) {
  $searchResults = SongRepository::findSongByQuery($_POST["searchQuery"], $_POST["param"]);
  include("view/searchResult.php");
  die;
}

// -- Navigation --
if (isset($_GET["createSong"])) {
  include("view/createSong.php");
  die;
}

if (isset($_GET["watchId"])) {
  $_SESSION["playlist_id_watching"] = $_GET["watchId"];
  include("view/playlistSongs.php");
  die;
}
