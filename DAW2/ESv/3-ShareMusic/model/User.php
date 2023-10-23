<?php
class User
{
  private $id, $name, $rol, $img;

  public function __construct($data)
  {
    $this->id = $data["id"];
    $this->name = $data["name"];
    $this->rol = $data["rol"];
    $this->img = $data["img"];
  }

  public function getId() {
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

  public function getImg() {
    return $this->img;
  }
  
  public function isAdmin()
  {
    return $this->getRol() > 0;
  }
}
