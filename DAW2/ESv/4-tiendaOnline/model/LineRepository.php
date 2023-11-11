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
    $q = "SELECT * FROM line WHERE order_id IN (SELECT id FROM orders WHERE user_id = $userId AND state=0)";
    $result = $bd->query($q);
    $lines = [];
    while ($data = $result->fetch_assoc()) {
      $lines[] = new Line($data);
    }

    return $lines;
  }

  public static function createNewLine($data)
  {
    $productId = $data["productId"];
    $cantidad = $data["cantidad"];
    $precioProducto = ProductRepository::getProductById($productId)->getPrice() * $cantidad;
    $orderId = $_SESSION["user"]->getCarrito()->getId();

    try {
      $bd = Connect::setConection();
      $q = "INSERT INTO line (product_id, order_id, cantidad, line_price) VALUES($productId, $orderId, $cantidad, $precioProducto)";

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

  public static function updateProductQuantityFromLineById($id, $quantity)
  {
    try {
      $bd = Connect::setConection();
      $q = "UPDATE line SET cantidad = cantidad + $quantity WHERE id = $id";
      $bd->query($q);
    } catch (Error $e) {
      throw new Error("Error al actualizar la línea. Error: $e");
    }
    return true;
  }
}
