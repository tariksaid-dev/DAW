<?php 
require_once("db.php");
require_once("Comments.php");

class CommentsRepository
{
  public static function getAllComments() 
  {
    $q = "SELECT * FROM comments";
    $bd = Connect::setConection();
    $result = $bd->query($q);
    while ($data = $result->fetch_assoc()) {
      $comms[] = new Comments($data);
    }
    return $comms;
  }

  public static function getCommentsByPubId($pub_id) {
    $bd = Connect::setConection();
    $q = "SELECT * FROM comments WHERE pub_id = $pub_id";
    $result = $bd->query($q);
    while ($data = $result->fetch_assoc()) {
      $comments[] = new Comments($data);
    }
    return $comments;
  }

  public static function createComment($data) {
    $user_id = $_SESSION["user"]->getId();
    $pub_id = $_SESSION["pub_id_watching"];
    $text = $data["text"];
    
    $bd = Connect::setConection();
    $q = "INSERT INTO comments (user_id, pub_id, text, date) VALUES($user_id, $pub_id, '$text', NOW())";
    $bd->query($q);

    return $bd->insert_id;
  }

  public static function deleteCommentById($id) {
    $bd = Connect::setConection();
    $q = "DELETE FROM comments WHERE id = $id";
    $bd->query($q);
    return true;
  }
}
?>