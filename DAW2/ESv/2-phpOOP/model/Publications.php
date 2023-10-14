<?php
class Publications
{
  private $title;
  private $text;
  private $date;
  private $id;
  private $img;

  public function __construct($data)
  {
    $this->id = $data["id"];
    $this->title = $data["title"];
    $this->text = $data["text"];
    $this->date = $data["pubdate"];
    $this->img = $data["img"];
  }

  public function getId()
  {
    return $this->id;
  }

  public function getTitle()
  {
    return $this->title;
  }

  public function getText()
  {
    return $this->text;
  }

  public function getDate()
  {
    return $this->date;
  }

  public function getImage()
  {
    return $this->img;
  }
}

?>