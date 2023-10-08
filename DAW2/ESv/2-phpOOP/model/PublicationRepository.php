<?php
class PublicationRepository
{
  public static function getPublications()
  {
    $bd = Conect::setConection();
    $q = "SELECT * FROM publication";
    $result = $bd->query($q);
    while ($data = $result->fetch_assoc()) {
      $pubs[] = new Publication($data);
    }
    return $pubs;
  }

  public static function newPub($data, $image)
  {
    $title = $data["title"];
    $text = $data["text"];
    $imgName = $image["img"]["name"];

    move_uploaded_file($image["img"]["tmp_name"], "public/img/" . $imgName);

    $bd = Conect::setConection();
    $q = "INSERT INTO publication (title, text, pubdate, img) VALUES('$title', '$text', NOW(), '$imgName')";
    $bd->query($q);
    return $bd->insert_id;
  }
}
?>