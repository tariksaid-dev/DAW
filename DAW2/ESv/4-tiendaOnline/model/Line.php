<?php
class Line
{
  private $id, $product, $orderId, $cantidad, $precioLinea;

  public function __construct($data)
  {
    $this->id = $data["id"];
    $this->product = ProductRepository::getProductById($data["product_id"]);
    $this->orderId = $data["order_id"];
    $this->cantidad = $data["cantidad"];
    $this->precioLinea = $this->product->getPrice() * $this->cantidad;
  }

  public function getId()
  {
    return $this->id;
  }

  public function getProduct()
  {
    return $this->product;
  }
  public function getCantidad()
  {
    return $this->cantidad;
  }

  public function getprecioLinea()
  {
    return $this->precioLinea;
  }

  public function getOrderId()
  {
    return $this->orderId;
  }

  public function isEnoughStock()
  {
    if ($this->cantidad <= $this->product->getStock()) {
      return true;
    }
    return false;
  }
}
