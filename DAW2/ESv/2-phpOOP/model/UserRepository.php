<?php
require_once("db.php");
require_once("User.php");

class UserRepository
{

  public static function getAllUsers() {
    $q = "SELECT * FROM users";
    $bd = Connect::setConection();
    $result = $bd->query($q);
    while ($data = $result->fetch_assoc()) {
      $users[] = new User($data);
    }
    return $users;
  }
  
  public static function getUserById($id) {
    $bd = Connect::setConection();
    $q = "SELECT * FROM users WHERE id = $id";
    $result = $bd->query($q);
    $data = $result->fetch_assoc();
    return new User($data);
  }

  public static function userLogin($user, $password)
  {
    $q = "SELECT * FROM users WHERE name ='$user'";
    $db = Connect::setConection();
    $result = $db->query($q);
    if ($data = $result->fetch_assoc()) {
      if ($data['password'] == $password)
        return new User($data);
    } else
      return null;
  }

  public static function createUser($POST)
  {
    $userName = $POST["user"];
    $password = $POST["password"];

    $q = "INSERT INTO users(name, password, rol) values ('$userName', '$password', 0)";
    $db = Connect::setConection();
    // insert no devuelve lo que ha insertado al parecer, por lo que no podemos hacer $data = $result etc. De momentos llamamos al otro método y hacemos un select, pero buscar solucion asap
    if ($db->query($q)) {
      return self::userLogin($userName, $password);
    }
    return null;
  }
}
?>