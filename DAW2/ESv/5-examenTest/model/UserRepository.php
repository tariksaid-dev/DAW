<?php
class UserRepository
{

  public static function getAllUsers()
  {
    $q = "SELECT * FROM user";
    $bd = Connect::setConection();
    $result = $bd->query($q);
    while ($data = $result->fetch_assoc()) {
      $user[] = new User($data);
    }
    return $user;
  }

  public static function getUserById($id)
  {
    $bd = Connect::setConection();
    $q = "SELECT * FROM user WHERE id = $id";
    $result = $bd->query($q);
    $data = $result->fetch_assoc();
    return new User($data);
  }

  public static function createNewUser($data)
  {
    $username = $data["user"];
    $password = $data["password"];

    $q = "INSERT INTO user(name, password, rol) values ('$username', '$password', 0)";
    $db = Connect::setConection();

    if ($db->query($q)) {
      return self::userLogin($data);
    }
    return null;
  }

  public static function deleteUserById($id)
  {
    $q = "DELETE FROM user WHERE id = $id";
    $db = Connect::setConection();
    return $db->query($q);
  }

  public static function changeRoleById($id, $rol)
  {
    $q = "UPDATE user SET rol = $rol WHERE id = $id";
    $db = Connect::setConection();
    return $db->query($q);
  }


  // LOGIN
  public static function userLogin($data)
  {

    $user = $data["user"];
    $password = $data["password"];

    $q = "SELECT * FROM user WHERE name ='$user'";
    $db = Connect::setConection();
    $result = $db->query($q);
    if ($data = $result->fetch_assoc()) {
      if ($data['password'] == $password)
        return new User($data);
    } else
      return null;
  }
}
