<?php
class User
{
  private $id, $name, $rol, $img, $carrito, $orders;

  public function __construct($data)
  {
    $this->id = $data["id"];
    $this->name = $data["name"];
    $this->rol = $data["rol"];
    $this->img = $data["img"];
    //extras TODO
    $this->carrito = LineRepository::getCurrentLinesByUserId($this->id);
    $this->orders = OrderRepository::getOrdersByUserId($this->id);
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

  public function getImg()
  {
    return $this->img;
  }

  public function getCarrito()
  {
    return $this->carrito;
  }

  public function getOrder()
  {
    return $this->orders;
  }

  public function isAdmin()
  {
    return $this->getRol() == 2;
  }
}
