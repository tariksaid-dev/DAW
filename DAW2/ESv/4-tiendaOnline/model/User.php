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
    $this->carrito = OrderRepository::getCurrentOrderByUserId($data["id"]);
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

  public function getAllOrders()
  {
    return  OrderRepository::getOrdersByUserId($this->id);
  }

  public function isAdmin()
  {
    return $this->getRol() == 1;
  }

  public function updateCarrito()
  {
    $this->carrito = OrderRepository::getCurrentOrderByUserId($this->id);
  }

  public function userRoleState()
  {
    return [
      0 => "User",
      1 => "Admin",
    ];
  }
}
