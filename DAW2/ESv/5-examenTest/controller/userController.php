<?php
if (isset($_GET["salir"])) {
  session_destroy();
  include("view/login.php");
  die;
}

if (isset($_GET["adminPanel"])) {
  $users = UserRepository::getAllUsers();
  include("view/adminPanel.php");
  die;
}


if (isset($_GET["updateRol"])) {
  UserRepository::changeRoleById($_GET["updateRol"], $_GET["rol"]);
  header("Location: index.php?main=user&adminPanel");
  die;
}
