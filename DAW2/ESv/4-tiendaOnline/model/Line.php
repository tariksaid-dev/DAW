<?php
class Line
{
  private $id, $productId, $userId, $orderId,  $cantidad, $precioProducto;

  public function __construct($data)
  {
    $this->id = $data["id"];
    $this->productId = $data["productId"];
    $this->userId = $_SESSION["user"]->getId();
    $this->orderId = OrderRepository::getCurrentOrderByUserId($_SESSION["user"]->getId())->getId();
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

  public function getOrderId()
  {
    return $this->orderId;
  }
}
