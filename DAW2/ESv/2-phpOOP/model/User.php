<?php
class User
{
  private $id, $name, $rol;

  public function __construct($data)
  {
    $this->id = $data["id"];
    $this->name = $data["name"];
    $this->rol = $data["rol"];
  }

  public function getName()
  {
    return $this->name;
  }

  public function getRol()
  {
    return $this->rol;
  }

  public function checkRole()
  {
    return $this->getRol() > 0;
  }
}
?>