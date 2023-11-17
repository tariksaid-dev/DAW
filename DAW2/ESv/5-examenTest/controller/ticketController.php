<?php

if ($_SESSION["user"]->isAdmin()) {
  $tickets = TicketRepository::getAllTickets();
}

if ($_SESSION["user"]->isClient()) {
  $tickets = TicketRepository::getAllTicketsByUserId($_SESSION["user"]->getId());
}

if ($_SESSION["user"]->isEmployee()) {
  $tickets = TicketRepository::getEmployeeTicketsByEmployeeId($_SESSION["user"]->getId());
}


if (isset($_POST["newTicket"])) {
  TicketRepository::createNewTicket($_POST);
  header("Location: index.php");
  die;
}

if (isset($_GET["cerrarTicket"])) {

  $ticketToClose = TicketRepository::getTicketById($_GET["cerrarTicket"]);

  if (!$ticketToClose->getEmployeeId()) {
    TicketRepository::assignTicketToEmployeeByTicketId2($ticketToClose->getId(), $_SESSION["user"]->getId());
  }

  TicketRepository::closeTicket($_GET["cerrarTicket"]);
  header("Location: index.php");
  die;
}

if (isset($_GET["contestar"])) {
  TicketRepository::assignTicketToEmployeeByTicketId($_GET);
  include("view/contestarView.php");
  die;
}

if (isset($_POST["addValoracion"])) {
  TicketRepository::updateValoracionByTicketId($_POST);
  header("Location: index.php");
  die;
}

if (isset($_POST["createLine"])) {
  TicketRepository::createLine($_POST);
  include("view/contestarView.php");
  die;
}

// NAVIGATION
if (isset($_GET["crearTicket"])) {
  include("view/crearTicket.php");
  die;
}

if (isset($_GET["watchTicket"])) {
  $ticket = TicketRepository::getTicketById($_GET["watchTicket"]);
  include("view/ticketDetails.php");
  die;
}
