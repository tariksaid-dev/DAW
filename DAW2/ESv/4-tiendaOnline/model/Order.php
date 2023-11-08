<?php
class Order
{
  private $id, $userId, $date, $lines, $state;

  public function __construct($data)
  {
    $this->id = $data["id"];
    $this->userId = $_SESSION["user"]->getId();

    // check
    $this->date = $data["time"];
    $this->lines = LineRepository::getLinesByOrderId($this->id);
    $this->state = 0;
  }

  public function getId()
  {
    return $this->id;
  }

  public function getLines()
  {
    return $this->lines;
  }

  public function getUserId()
  {
    return $this->userId;
  }
  public function getTime()
  {
    return $this->date;
  }

  public function getState()
  {
    return $this->state;
  }
}
