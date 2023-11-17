<?php
class Ticket
{
  private $id, $userId, $status, $title, $lines, $employee_id, $valoracion;

  public function __construct($data)
  {
    $this->id = $data["id"];
    $this->userId = $data["user_id"];
    $this->status = $data["status"];
    $this->title = $data["title"];
    $this->employee_id = $data["employee_id"];
    $this->lines = LineRepository::getLinesByTicketId($this->id);
    $this->valoracion = $data["valoracion"];
  }
  public function getId()
  {
    return $this->id;
  }

  public function getUserId()
  {
    return $this->userId;
  }

  public function getStatus()
  {
    return $this->status;
  }

  public function getTitle()
  {
    return $this->title;
  }

  public function getLines()
  {
    return $this->lines;
  }

  public function getEmployeeId()
  {
    return $this->employee_id;
  }

  public function getEmployee()
  {
    if ($this->employee_id) {
      return UserRepository::getUserById($this->employee_id);
    }
    return false;
  }

  public function getValoracion()
  {
    return $this->valoracion;
  }
}
