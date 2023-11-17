<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <style>
    <?php include "styles.css" ?>
  </style>
  <title>CONTESTAR TICKET</title>
</head>

<body>
  <?php

  $ticket = TicketRepository::getTicketById($_GET["ticketId"]);

  include("view/ui/header.php");
  echo "<form action='index.php?main=ticket&createLine' method='POST' class='insert-pub-form-layout'>";
  echo "<textarea name='text' placeholder='Describe el problema que te has encontrado'></textarea>";
  echo "<input hidden name='ticketId' value='{$ticket->getId()}' >";
  echo "<input class='btn' type='submit' name='newLine' value='Enviar'>";
  echo "</form>";
  ?>
</body>

</html>