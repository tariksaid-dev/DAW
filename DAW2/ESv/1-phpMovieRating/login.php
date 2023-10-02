<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <link rel="stylesheet" href="styles.css" type="text/css">
  <title>TSM - Login</title>
</head>

<body>
  <?php
  session_start();
  require_once("db.php");
  $bd = Conectar::conexion();

  // $_session reset
  if (!empty($_SESSION))
    session_destroy();

  // alert for login succes/fail
  if (!empty($info))
    echo "<script>alert('" . $info . "')</script>";

  if (!empty($_POST["login"])) {
    $q = "SELECT * FROM users WHERE name='" . $_POST["user"] . "'";
    $result = $bd->query($q);
    if ($datos = $result->fetch_assoc()) {
      if ($datos["password"] == $_POST["password"]) {
        $_SESSION["user_id"] = $datos["id"];
        $_SESSION["loged"] = true;
        $_SESSION["username"] = $datos["name"];
        $_SESSION["rol"] = $datos["rol"];
        $_SESSION["deleted"] = $datos["deleted"];
        header("Location: /1-phpMovieRating/main.php");
      } else {
        $info = "La contraseña es incorrecta";
      }
    } else {
      $info = "El nombre de usuario es incorrecto";
    }
  }

  if (!empty($info))
    echo "<script>alert('" . $info . "')</script>";
  ?>

  <form action='login.php' class="flex-box" method='POST'>
    <input type='text' id='user' name='user' placeholder='Username'>
    <input type='password' id='password' name='password' placeholder='Password'>
    <input type='submit' name='login' class="btn">
  </form>

</body>

</html>