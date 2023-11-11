<?php
class ProductRepository
{

  // GET
  public static function getAllProducts()
  {
    $q = "SELECT * FROM product";
    try {
      $bd = Connect::setConection();
    } catch (Exception $e) {
      throw new Error("Error al conectar con la base de datos. Error: " . $e);
    }
    $result = $bd->query($q);
    while ($data = $result->fetch_assoc()) {
      $products[] = new Product($data);
    }
    return $products;
  }

  public static function getProductById($id)
  {
    try {
      $bd = Connect::setConection();
    } catch (Exception $e) {
      throw new Error("Error al conectar con la base de datos. Error: " . $e);
    }
    $q = "SELECT * FROM product WHERE id = $id";
    $result = $bd->query($q);
    $data = $result->fetch_assoc();
    return new Product($data);
  }

  // CREATE
  public static function createNewProduct($data, $files)
  {
    $name = $data["name"];
    $description = $data["description"];
    $price = $data["price"];
    $imgName = $files["img"]["name"];
    $stock = $data["stock"];

    try {
      move_uploaded_file($files["img"]["tmp_name"], "public/img/" . $imgName);
    } catch (Exception $e) {
      throw new Error("Problema al subir imagen. Error: $e");
    }

    try {
      $db = Connect::setConection();
      $q = "INSERT INTO product(name, description, price, img, stock) values ('$name', '$description', $price, '$imgName', $stock)";
      $db->query($q);
    } catch (Exception $e) {
      throw new Error("Error al insertar en la base de datos. Error: $e");
    }
    return $db->insert_id;
  }

  // DELETE
  public static function deleteProductById($id)
  {
    try {
      $q = "DELETE FROM product WHERE id = $id";
      $db = Connect::setConection();
    } catch (Exception $e) {
      throw new Error("Error al borrar en la base de datos. Error: $e");
    }
    return $db->query($q);
  }

  // UPDATE
  public static function updateStockByProductId($id, $stock)
  {
    try {
      $bd = Connect::setConection();
      $q = "UPDATE product SET stock = $stock WHERE id=$id";
      $bd->query($q);
    } catch (Exception $e) {
      throw new Error("Error al modificar el stock. Error: $e");
    }
    return true;
  }
}
