<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <style>
    <?php include "styles.css" ?>
  </style>
  <title>CREATE TICKET</title>
</head>

<body>
  <?php
  include("view/ui/header.php");
  echo "<form action='index.php?main=ticket&createTicket' method='POST' class='insert-pub-form-layout'>";
  echo "<input type='text' placeholder='Nombre del ticket' name='title'>";
  echo "<textarea name='text' placeholder='Describe el problema que te has encontrado'></textarea>";
  echo "<input class='btn' type='submit' name='newTicket' value='Enviar'>";
  echo "</form>";
  ?>
</body>

</html>