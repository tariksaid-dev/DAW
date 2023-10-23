<?php

if (isset($_GET["deleteUser"])) {
  UserRepository::deleteUserById($_GET["deleteUser"]);
  header("Location: index.php?main=auth&adminPanel");
  die;
}
