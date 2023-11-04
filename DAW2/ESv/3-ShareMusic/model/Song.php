<?php
class Song
{
  private $id, $uploader_id, $title, $author, $img, $file, $duration;

  public function __construct($data)
  {
    $this->id = $data["id"];
    $this->uploader_id = $data["uploader_id"];
    $this->title = $data["title"];
    $this->author = $data["author"];
    $this->img = $data["img"];
    $this->file = $data["file"];
    $this->duration = $data["duration"];
  }

  public function getId()
  {
    return $this->id;
  }

  public function getUploaderId()
  {
    return $this->uploader_id;
  }

  public function getTitle()
  {
    return $this->title;
  }

  public function getAuthor()
  {
    return $this->author;
  }

  public function getFile()
  {
    return $this->file;
  }

  public function getImg()
  {
    return $this->img;
  }

  public function getDuration()
  {
    return $this->duration;
  }
}
