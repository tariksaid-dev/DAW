<?php
class Order implements JsonSerializable
{
  private $id, $userId, $date, $lines, $state;

  public function __construct($data)
  {
    $this->id = $data["id"];
    $this->userId = $data["user_id"];
    $this->date = $data["date"];
    $this->lines = LineRepository::getLinesByOrderId($this->id);
    $this->state = 0;
  }

  #[\ReturnTypeWillChange]
  public function jsonSerialize()
  {
    return get_object_vars($this);
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
  public function getDate()
  {
    return $this->date;
  }

  public function getState()
  {
    return $this->state;
  }

  public function updateLines()
  {
    $newLines = LineRepository::getLinesByOrderId($this->id);
    $this->lines = $newLines;
  }

  public function isEnoughStockForEveryLine()
  {
    $flag = true;

    foreach ($this->lines as $line) {
      if (!$line->isEnoughStock()) {
        $flag = false;
      } else {
      }
    }
    return $flag;
  }

  public function getTotalPrice()
  {
    $total = 0;
    foreach ($this->lines as $line) {
      $total += $line->getprecioLinea();
    }
    return $total;
  }
}
