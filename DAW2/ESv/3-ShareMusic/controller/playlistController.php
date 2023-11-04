<?php

$playlists = PlaylistRepository::getPlaylistByUserId($_SESSION["user"]->getId());
$songs = SongRepository::getAllSongs();

if (isset($_POST["newPlaylist"])) {
  PlaylistRepository::createNewPlaylist($_POST);
  header("Location: index.php");
  die;
}

if (isset($_GET["deletePlaylist"])) {
  PlaylistRepository::deletePlaylistById($_GET["deletePlaylist"]);
  header("Location: index.php");
  die;
}

// añadiendo canciones en creando playlist !!!
if (isset($_GET["añadirCancion"])) {
  // id
  $songId = $_GET["añadirCancion"];
  // name
  $songName = SongRepository::getSongNameById($songId);

  if (!in_array($songId, $_SESSION["selectedSongs"])) {
    $_SESSION["selectedSongs"][] = $songId;
    $_SESSION["selectedSongNames"][] = $songName;
  }
  header("Location: index.php?main=playlist&createPlaylist");
  die;
}

if (isset($_GET["añadirCancionToPlaylist"]) && isset($_GET["songId"])) {
  PlaylistRepository::addSongToPlaylistById($_GET["añadirCancionToPlaylist"], $_GET["songId"]);
  header("Location: index.php?main=playlist&añadirCancionToPlaylist=8");
  die;
}

// favs
if (isset($_GET["añadirPlaylistToFavoritas"])) {
  PlaylistRepository::addPlaylistToUser($_SESSION["user"]->getId(), $_GET["añadirPlaylistToFavoritas"]);
  header("Location: index.php?main=playlist&allPlaylist");
  die;
}

// -- Navigation --
// navegación a editar playlist
if (isset($_GET["añadirCancionToPlaylist"])) {
  include("view/addSongToPlaylist.php");
  die;
}

if (isset($_GET["returnToMainView"])) {
  include("view/main.php");
  die;
}

if (isset($_GET["createPlaylist"])) {
  include("view/createPlaylist.php");
  die;
}

if (isset($_GET["watchId"])) {
  $_SESSION["pub_id_watching"] = $_GET["watchId"];
  include("view/dinamicView.php");
  die;
}

// favs
if (isset($_GET["allPlaylist"])) {
  $allPlaylists = PlaylistRepository::getAllPlaylist();
  $favoritePlaylists = PlaylistRepository::getFavsPlaylistByUserId($_SESSION["user"]->getId());
  include("view/allPlaylist.php");
  die;
}

if (isset($_GET["favoritePlaylist"])) {
  $favoritePlaylists = PlaylistRepository::getFavsPlaylistByUserId($_SESSION["user"]->getId());
  include("view/favoritePlaylist.php");
  die;
}
