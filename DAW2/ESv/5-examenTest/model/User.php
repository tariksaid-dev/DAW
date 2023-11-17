<?php
class User
{
  private $id, $name, $rol, $ticket;

  public function __construct($data)
  {
    $this->id = $data["id"];
    $this->name = $data["name"];
    $this->rol = $data["rol"];
    $this->ticket = TicketRepository::getTicketsByUserRoleAndByUserId($data["rol"], $data["id"]);
  }

  public function getId()
  {
    return $this->id;
  }

  public function getName()
  {
    return $this->name;
  }

  public function getRol()
  {
    return $this->rol;
  }

  public function isAdmin()
  {
    return $this->getRol() == 2;
  }

  public function isClient()
  {
    return $this->getRol() == 0;
  }

  public function isEmployee()
  {
    return $this->getRol() == 1;
  }

  public function userRoleState()
  {
    return [
      0 => "User",
      1 => "Worker",
      2 => "Admin",
    ];
  }
}
