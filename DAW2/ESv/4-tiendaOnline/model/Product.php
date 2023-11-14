<?php
class Product implements JsonSerializable
{
  private $id, $name, $description, $img, $price, $stock;

  public function __construct($data)
  {
    $this->id = $data["id"];
    $this->name = $data["name"];
    $this->description = $data["description"];
    $this->img = $data["img"];
    $this->price = $data["price"];
    $this->stock = $data["stock"];
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

  public function getName()
  {
    return $this->name;
  }

  public function getDescription()
  {
    return $this->description;
  }

  public function getImg()
  {
    return $this->img;
  }

  public function getPrice()
  {
    return $this->price;
  }

  public function getStock()
  {
    return $this->stock;
  }
}
