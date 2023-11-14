<?php
class OrderRepository
{
  public static function getAllOrders()
  {
    $bd = Connect::setConection();
    $q = "SELECT * FROM orders";
    $result = $bd->query($q);
    $orders = [];
    while ($data = $result->fetch_assoc()) {
      $orders[] = new Order($data);
    }
    return $orders;
  }

  public static function getOrderById($id)
  {
    $bd = Connect::setConection();
    $q = "SELECT * FROM orders WHERE id = $id";
    $result = $bd->query($q);

    if ($result->num_rows > 0) {
      $data = $result->fetch_assoc();
      return new Order($data);
    }
    return null;
  }

  public static function getOrdersByUserId($userId)
  {
    $bd = Connect::setConection();
    $q = "SELECT * FROM orders WHERE user_id = $userId";
    $result = $bd->query($q);
    $orders = [];
    while ($data = $result->fetch_assoc()) {
      $orders[] = new Order($data);
    }
    return $orders;
  }

  public static function getFinishedOrdersByUserId($userId)
  {
    $bd = Connect::setConection();
    $q = "SELECT * FROM orders WHERE user_id = $userId AND state = 1";
    $result = $bd->query($q);
    $orders = [];
    while ($data = $result->fetch_assoc()) {
      $orders[] = new Order($data);
    }
    return $orders;
  }

  public static function getCurrentOrderByUserId($userId)
  {
    try {
      $bd = Connect::setConection();
    } catch (Exception $e) {
      throw new Error("Error al conectar con la base de datos. Error: $e");
    }

    $q = "SELECT * FROM orders WHERE user_id = $userId AND state = 0";
    $result = $bd->query($q);

    if ($result->num_rows > 0) {
      $data = $result->fetch_assoc();
      return new Order($data);
    }
    return null;
  }

  public static function createNewOrder()
  {
    $userId = $_SESSION["user"]->getId();

    $bd = Connect::setConection();

    try {
      $q = "INSERT INTO orders (user_id, date, state) VALUES($userId, NOW(), 0)";
      $bd->query($q);
    } catch (Error $e) {
      throw new Error("Error al crear una nueva órden. Error: $e");
    }
    return true;
  }

  public static function deleteOrderById($id)
  {
    try {
      $bd = Connect::setConection();
      $q = "DELETE FROM orders WHERE id = $id";
      $bd->query($q);
    } catch (Error $e) {
      throw new Error("Error al borrar una órden. Error: $e");
    }
    return true;
  }

  public static function confirmCurrentOrder($orderId)
  {
    try {
      $bd = Connect::setConection();

      $q = "UPDATE orders SET state = 1, date = NOW() WHERE id = $orderId";
      $bd->query($q);
    } catch (Error $e) {
      throw new Error("Error al actualizar una órden. Error: $e");
    }
    return true;
  }
}
