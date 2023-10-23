<?php

class Comments
{
  private $id, $author, $pub_id, $text, $date;

  public function __construct($data)
  {
    $this->id = $data["id"];
    // $this->user_id = $data["user_id"];
    $this->pub_id = $data["pub_id"];
    $this->text = $data["text"];
    $this->date = $data["date"];
    $this->author = UserRepository::getUserById($data["user_id"]);
  }

  public function getId()
  {
    return $this->id;
  }

  // public function getUserId() {
  //     return $this->user_id;
  // }

  public function getPubId()
  {
    return $this->pub_id;
  }

  public function getText()
  {
    return $this->text;
  }

  public function getDate()
  {
    return $this->date;
  }

  public function getAuthor()
  {
    return $this->author;
  }
}
