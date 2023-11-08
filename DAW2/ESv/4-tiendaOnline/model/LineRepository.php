<?php

class LineRepository
{
  public static function getAllLines()
  {
    $bd = Connect::setConection();
    $q = "SELECT * FROM line";
    $result = $bd->query($q);
    $lines = [];
    while ($data = $result->fetch_assoc()) {
      $lines[] = new Line($data);
    }
    return $lines;
  }

  public static function getLineById($id)
  {
    $bd = Connect::setConection();
    $q = "SELECT * FROM line WHERE id = $id";
    $result = $bd->query($q);

    if ($result->num_rows > 0) {
      $data = $result->fetch_assoc();
      return new Line($data);
    }
    return null;
  }

  public static function getLinesByOrderId($orderId)
  {
    $bd = Connect::setConection();
    $q = "SELECT * FROM line WHERE order_id=$orderId";
    $result = $bd->query($q);
    $lines = [];
    while ($data = $result->fetch_assoc()) {
      $lines[] = new Line($data);
    }
    return $lines;
  }

  public static function getLinesByUserId($userId)
  {
    $bd = Connect::setConection();
    $q = "SELECT * FROM line WHERE user_id = $userId";
    $result = $bd->query($q);
    $lines = [];
    while ($data = $result->fetch_assoc()) {
      $lines[] = new Line($data);
    }
    return $lines;
  }

  public static function getCurrentLinesByUserId($userId)
  {
    $bd = Connect::setConection();
    $q = "SELECT * FROM line WHERE order_id IN (SELECT id FROM order WHERE id_user = $userId AND state=0)";
    $result = $bd->query($q);
    $lines = [];
    while ($data = $result->fetch_assoc()) {
      $lines[] = new Line($data);
    }
    return $lines;
  }

  public static function createNewLine($data)
  {
    $productId = $data["product_id"];
    $userId = $_SESSION["user"]->getId();
    $cantidad = $data["cantidad"];
    $precioProducto = ProductRepository::getProductById($productId)->getPrice();

    $bd = Connect::setConection();

    try {
      $q = "INSERT INTO line (productId, userId, cantidad, precio_producto) VALUES($productId, $userId, $cantidad, $precioProducto)";
      $bd->query($q);
    } catch (Error $e) {
      throw new Error("Error al crear una nueva línea. Error: $e");
    }
    return true;
  }

  public static function deleteLineById($id)
  {
    try {
      $bd = Connect::setConection();
      $q = "DELETE FROM line WHERE id = $id";
      $bd->query($q);
    } catch (Error $e) {
      throw new Error("Error al borrar una línea. Error: $e");
    }
    return true;
  }
}
