<?php
class PublicationsRepository
{
  public static function getPublications()
  {
    $bd = Conect::setConection();
    $q = "SELECT * FROM publications";
    $result = $bd->query($q);
    while ($data = $result->fetch_assoc()) {
      $pubs[] = new Publications($data);
    }
    return $pubs;
  }

  public static function getPublicationById($id) {
    $bd = Conect::setConection();
    $q = "SELECT * FROM publications WHERE id = $id";
    $result = $bd->query($q);
    $data = $result->fetch_assoc();
    return new Publications($data);
  }

  public static function newPub($data, $image)
  {
    $title = $data["title"];
    $text = $data["text"];
    $imgName = $image["img"]["name"];

    move_uploaded_file($image["img"]["tmp_name"], "public/img/" . $imgName);

    $bd = Conect::setConection();
    $q = "INSERT INTO publications (title, text, pubdate, img) VALUES('$title', '$text', NOW(), '$imgName')";
    $bd->query($q);
    return $bd->insert_id;
  }

  public static function deletePub($id) {
    $bd = Conect::setConection();
    $q = "DELETE FROM publications WHERE id = $id";
    $bd->query($q);
    return true;
  }

  public static function updatePubById($id, $title = null, $text = null, $image = null) {
    $bd = Conect::setConection();

    $title ??= self::getPublicationById($id)->getTitle();
    $text ??= self::getPublicationById($id)->getText();
    $image ??= self::getPublicationById($id)->getImage();
    
    // CAMPO DATE?
    $q = "UPDATE publications SET title = '$title', text = '$text', img = '$image' WHERE id = $id";
    $bd->query($q);

    return true;
  }
}
?>