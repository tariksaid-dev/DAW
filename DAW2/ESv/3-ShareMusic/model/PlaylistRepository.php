<?php
require_once("db.php");

class PublicationsRepository
{
  public static function getAllPlaylist()
  {
    $bd = Connect::setConection();
    $q = "SELECT * FROM playlist";
    $result = $bd->query($q);

    while ($data = $result->fetch_assoc()) {
      $pubs[] = new Playlist($data);
    }
    return $pubs;
  }

  public static function getPlaylistById($id)
  {
    $bd = Connect::setConection();
    $q = "SELECT * FROM playlist WHERE id = $id";
    $result = $bd->query($q);
    $data = $result->fetch_assoc();
    return new Playlist($data);
  }

  public static function createNewPlaylist($data, $songs)
  {
    $name = $data["name"];
    $id_user = $data["id_user"];
    $songs; // derived 

    $bd = Connect::setConection();
    $q = "INSERT INTO publications (title, text, pubdate, img) VALUES('$title', '$text', NOW(), '$imgName')";
    $bd->query($q);
    return $bd->insert_id;
  }

  public static function deletePub($id)
  {
    $bd = Connect::setConection();
    $q = "DELETE FROM publications WHERE id = $id";
    $bd->query($q);
    return true;
  }

  public static function updatePubById($id, $title = null, $text = null, $image = null)
  {
    $bd = Connect::setConection();

    $title ??= self::getPublicationById($id)->getTitle();
    $text ??= self::getPublicationById($id)->getText();
    $image ??= self::getPublicationById($id)->getImage();

    $q = "UPDATE publications SET title = '$title', text = '$text', img = '$image' WHERE id = $id";
    $bd->query($q);

    return true;
  }

  public static function findPublicationByQuery($query, $order, $page)
  {

    if ($page != 0) $page = $page * 2;

    $bd = Connect::setConection();
    $q = "SELECT * FROM publications WHERE text LIKE '%$query%' ORDER BY title $order LIMIT $page, 2";
    $result = $bd->query($q);
    while ($data = $result->fetch_assoc()) {
      $pubs[] = new Publications($data);
    }

    if (!$pubs) {
      $pubs = self::getPublications();
      $_SESSION["fetch_error"] = "No se encuentra tu búsqueda. Mostrando todos los resultados";
      return $pubs;
    } else {
      if ($_SESSION["fetch_error"]) {
        unset($_SESSION["fetch_error"]);
      }
      return $pubs;
    }
  }

  public static function findPublicationByQueryCount($query)
  {
    $bd = Connect::setConection();
    $q = "SELECT COUNT(*) AS total FROM publications WHERE text LIKE '%$query%'";
    $result = $bd->query($q);
    $row = $result->fetch_assoc();

    if ($row && isset($row["total"])) {
      return (int)$row["total"];
    }
    return 0;
  }
}
