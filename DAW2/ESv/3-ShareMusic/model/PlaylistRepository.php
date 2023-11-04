<?php
require_once("db.php");

class PlaylistRepository
{
  public static function getAllPlaylist()
  {
    $bd = Connect::setConection();
    $q = "SELECT * FROM playlist";
    $result = $bd->query($q);
    $playlist = [];
    while ($data = $result->fetch_assoc()) {
      $playlist[] = new Playlist($data);
    }
    return $playlist;
  }

  public static function getPlaylistById($id)
  {
    $bd = Connect::setConection();
    $q = "SELECT * FROM playlist WHERE id = $id";
    $result = $bd->query($q);

    if ($result->num_rows > 0) {
      $data = $result->fetch_assoc();
      return new Playlist($data);
    }

    return null;

    // playlistbyId siempre nos devolverá 1 o ningún elemento, no tiene sentido hacer un array asociativo aquí
    // while ($data = $result->fetch_assoc()) {
    //   $playlist[] = new Playlist($data);
    // }
    // return $playlist;
  }

  public static function getPlaylistByUserId($userId)
  {
    $bd = Connect::setConection();
    $q = "SELECT * FROM playlist WHERE creator_id = $userId";
    $result = $bd->query($q);
    $playlist = [];
    while ($data = $result->fetch_assoc()) {
      $playlist[] = new Playlist($data);
    }
    return $playlist;
  }

  public static function createNewPlaylist($data)
  {
    $title = $data["title"];
    $selectedSongs = $_SESSION["selectedSongs"];

    $bd = Connect::setConection();

    // insertando la playlist en la tabla playlist para obtener su id
    $q = "INSERT INTO playlist (title, creator_id) VALUES('$title', " . $_SESSION["user"]->getId() . ")";
    $bd->query($q);
    $playlistId = $bd->insert_id;

    // insertando las asociacinoes entre la playlist y las canciones seleccionadas

    foreach ($selectedSongs as $songId) {
      $q2 = "INSERT INTO playlist_song (playlist_id, song_id) VALUES ($playlistId, $songId)";
      $bd->query($q2);
    }

    // limpiando canciones de session
    unset($_SESSION["selectedSongs"]);
    unset($_SESSION["selectedSongsName"]);

    return $playlistId;
  }

  public static function deletePlaylistById($id)
  {
    $bd = Connect::setConection();
    $q = "DELETE FROM playlist WHERE id = $id";
    $bd->query($q);

    $q2 = "DELETE FROM playlist_song WHERE playlist_id = $id";
    $bd->query($q2);
    return true;
  }

  public static function addSongToPlaylistById($playlist_id, $song_id)
  {
    $bd = Connect::setConection();
    $q = "INSERT INTO playlist_song (playlist_id, song_id) VALUES ($playlist_id, $song_id)";
    $bd->query($q);
    return true;
  }

  // FAVS

  public static function addPlaylistToUser($userId, $playlistId)
  {
    $bd = Connect::setConection();
    $q = "INSERT INTO playlist_user (playlist_id, user_id) VALUES ($playlistId, $userId)";
    $bd->query($q);
    return true;
  }

  public static function getFavsPlaylistByUserId($userId)
  {
    $bd = Connect::setConection();
    $q = "SELECT * FROM playlist_user WHERE user_id = $userId";
    $result = $bd->query($q);
    $playlists = [];

    while ($data = $result->fetch_assoc()) {
      $playlistId = $data["playlist_id"];
      $playlist = self::getPlaylistById($playlistId);

      if ($playlist) {
        $playlists[] = $playlist;
      }
    }

    return $playlists;
  }
}
