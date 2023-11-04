<?php
if (isset($_GET["salir"])) {
  session_destroy();
  include("view/login.php");
  die;
}
