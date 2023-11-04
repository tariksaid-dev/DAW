<?php
require_once("db.php");

class SongRepository
{
  public static function getAllSongs()
  {
    $bd = Connect::setConection();
    $q = "SELECT * FROM song";
    $result = $bd->query($q);

    $songs = [];

    while ($data = $result->fetch_assoc()) {
      $songs[] = new Song($data);
    }
    return $songs;
  }

  public static function getSongsById($id)
  {
    $bd = Connect::setConection();
    $q = "SELECT * FROM song WHERE id = $id";
    $result = $bd->query($q);
    $data = $result->fetch_assoc();
    return new Song($data);
  }

  public static function getSongNameById($id)
  {
    $bd = Connect::setConection();
    $q = "SELECT title FROM song WHERE id = $id";
    $result = $bd->query($q);
    $data = $result->fetch_assoc();
    return $data["title"];
  }

  public static function createNewSong($data, $files)
  {
    $uploader_id = $_SESSION["user"]->getId();
    $title = $data["title"];
    $author = $data["author"];
    $duration = $data["duration"];
    $imgName = $files["img"]["name"];
    $songName = $files["song"]["name"];

    move_uploaded_file($files["img"]["tmp_name"], "public/img/" . $imgName);

    move_uploaded_file($files["song"]["tmp_name"], "public/music/" . $songName);

    $bd = Connect::setConection();
    $q = "INSERT INTO song (uploader_id, title, author, img, file, duration) VALUES('$uploader_id', '$title', '$author', '$imgName', '$songName', $duration)";
    $bd->query($q);
    return $bd->insert_id;
  }

  public static function deleteSongById($id)
  {
    $bd = Connect::setConection();
    $q = "DELETE FROM song WHERE id = $id";
    $bd->query($q);
    return true;
  }

  public static function getSongDataById($id)
  {
    $bd = Connect::setConection();
    $q = "SELECT * FROM song WHERE id = $id";
    $result = $bd->query($q);

    if ($result->num_rows > 0) {
      return $result->fetch_assoc();
    } else {
      return null;
    }
  }

  public static function getPlaylistSongsByPlaylistId($id)
  {
    $bd = Connect::setConection();
    $q = "SELECT song_id FROM playlist_song WHERE playlist_id = $id";
    $result = $bd->query($q);

    $songs = [];
    while ($data = $result->fetch_assoc()) {
      $songId = $data["song_id"];
      $songData = SongRepository::getSongDataById($songId);
      if ($songData) {
        $songs[] = new Song($songData);
      }
    }

    return $songs;
  }

  // public static function updatePubById($id, $title = null, $text = null, $image = null)
  // {
  //   $bd = Connect::setConection();

  //   $title ??= self::getPublicationById($id)->getTitle();
  //   $text ??= self::getPublicationById($id)->getText();
  //   $image ??= self::getPublicationById($id)->getImage();

  //   $q = "UPDATE publications SET title = '$title', text = '$text', img = '$image' WHERE id = $id";
  //   $bd->query($q);

  //   return true;
  // }

  public static function findSongByQuery($query, $param)
  {
    $bd = Connect::setConection();
    $q = "";

    if ($param == "title") {
      $q = "SELECT * FROM song WHERE title LIKE '%$query%'";
    } else {
      $q = "SELECT * FROM song WHERE author LIKE '%$query%'";
    }

    $result = $bd->query($q);
    $songs = [];
    while ($data = $result->fetch_assoc()) {
      $songs[] = new Song($data);
    }

    return $songs;
  }

  // public static function findPublicationByQueryCount($query)
  // {
  //   $bd = Connect::setConection();
  //   $q = "SELECT COUNT(*) AS total FROM publications WHERE text LIKE '%$query%'";
  //   $result = $bd->query($q);
  //   $row = $result->fetch_assoc();

  //   if ($row && isset($row["total"])) {
  //     return (int)$row["total"];
  //   }
  //   return 0;
  // }
}
