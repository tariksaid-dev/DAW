<?php
class Playlist
{
  private $id, $title, $songs, $date;

  public function __construct($data)
  {
    $this->id = $data["id"];
    $this->title = $data["title"];
    $this->songs = $data["songs"];
    $this->date = $data["created_at"];
  }

  public function getId()
  {
    return $this->id;
  }

  public function getTitle()
  {
    return $this->title;
  }

  public function getSongs()
  {
    return $this->songs;
  }

  public function getDate()
  {
    return $this->date;
  }
}
