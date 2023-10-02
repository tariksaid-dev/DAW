<?php
class Publication
{
  private $title;
  private $text;
  private $date;
  private $id;

  private function __construct($data)
  {
    $this->id = $data["id"];
    $this->title = $data["title"];
    $this->text = $data["text"];
    $this->date = $data["pubdate"];
  }

  public function getText()
  {
    return $this->text;
  }

  public function setText($t)
  {
    $this->text = $t;
  }
}

?>