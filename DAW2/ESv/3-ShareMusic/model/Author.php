<?php
class Author
{
  private $id, $name, $songs, $img;

  public function __construct($data)
  {
    $this->id = $data["id"];
    $this->name = $data["name"];
    $this->songs = $data["songs"];
    $this->img = $data["img"];
  }

  public function getId()
  {
    return $this->id;
  }

  public function getName()
  {
    return $this->name;
  }

  public function getSongs()
  {
    return $this->songs;
  }
  public function getImg()
  {
    return $this->img;
  }
}
