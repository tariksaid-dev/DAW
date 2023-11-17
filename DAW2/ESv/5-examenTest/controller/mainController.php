<?php
error_reporting(E_ALL);
ini_set('display_errors', 1);

require_once("model/Ticket.php");
require_once("model/TicketRepository.php");
require_once("model/User.php");
require_once("model/UserRepository.php");
require_once("model/Line.php");
require_once("model/LineRepository.php");

session_start();


if (isset($_GET["main"])) {
  $_GET["main"] == "auth" && require_once("controller/authController.php");
  $_GET["main"] == "user" && require_once("controller/userController.php");

  $_GET["main"] == "ticket" && require_once("controller/ticketController.php");
} else {
  if (empty($_SESSION) || empty($_SESSION["user"])) {
    include("view/login.php");
    die;
  }

  if (isset($_SESSION)) {
    require_once("controller/ticketController.php");
    include("view/main.php");
    die;
  }
}

include("view/main.php");
die;
