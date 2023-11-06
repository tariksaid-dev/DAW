<?php
class Line
{
  private $id, $productId, $userId, $cantidad, $precioProducto;

  public function __construct($data)
  {
    $this->id = $data["id"];
    $this->productId = $data["productId"];
    $this->userId = $_SESSION["user"]->getId();
    $this->cantidad = $data["cantidad"];
    $this->precioProducto = ProductRepository::getProductById($this->productId)->getPrice();
  }

  public function getId()
  {
    return $this->id;
  }

  public function getProductId()
  {
    return $this->productId;
  }

  public function userId()
  {
    return $this->userId;
  }

  public function getCantidad()
  {
    return $this->cantidad;
  }

  public function getPrecioProducto()
  {
    return $this->precioProducto;
  }
}
