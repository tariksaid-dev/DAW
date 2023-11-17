<?php
class Line
{
  private $id, $ticket_id, $text, $user_id;

  public function __construct($data)
  {
    $this->id = $data["id"];
    $this->ticket_id = $data["ticket_id"];
    $this->text = $data["text"];
    $this->user_id = $data["user_id"];
  }

  public function getId()
  {
    return $this->id;
  }

  public function getTicketId()
  {
    return $this->ticket_id;
  }

  public function getText()
  {
    return $this->text;
  }
  public function getUserId()

  {
    return $this->user_id;
  }
}
