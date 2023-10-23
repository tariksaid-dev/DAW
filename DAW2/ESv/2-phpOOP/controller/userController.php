<?php

if (isset($_GET["deleteUser"])) {
  UserRepository::deleteUserById($_GET["deleteUser"]);
  header("Location: index.php?main=auth&adminPanel");
  die;
}

if (isset($_GET["updateRol"])) {
  UserRepository::changeRoleById($_GET["updateRol"], $_GET["rol"]);
  header("Location: index.php?main=auth&adminPanel");
  die;
}

if (isset($_GET["salir"])) {
  session_destroy();
  include("view/login.php");
  die;
}
