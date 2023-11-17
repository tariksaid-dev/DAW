<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <style>
    <?php include "styles.css" ?>
  </style>
  <title>TICKET DETAILS</title>
</head>

<body>
  <?php
  include("view/ui/header.php");
  ?>

  <article class="single-view-layout">
    <?php

    if ($_SESSION["user"]->isEmployee()) {
      echo "<a class='btn' href='index.php?main=ticket&contestar&ticketId={$ticket->getId()}&employeeId={$_SESSION['user']->getId()}'>Contestar</a>";

      if ($ticket->getStatus() == "open") {
        echo "<a class='btn' href='index.php?main=ticket&cerrarTicket={$ticket->getId()}'>Cerrar ticket</a>";
      }
    }

    if ($_SESSION["user"]->isClient() && $ticket->getStatus() == "close") {
      echo "<form action='index.php?main=ticket&userValoracion' method='POST' class='button-form'>";
      echo "<input class='btn' type='submit' name='addValoracion' value='Enviar valoración'>";
      echo "<input hidden name='ticketId' value='{$ticket->getId()}' >";
      echo "<select name='cantidad'>";
      for ($i = 1; $i < 6; $i++) {
        echo "<option>$i</option>";
      }
      echo "</select>";
      echo "</form>";
    }
    echo "<h1>" . $ticket->getTitle() . "</h1>";
    echo "<h2>Status: {$ticket->getStatus()}</h2>";

    foreach ($ticket->getLines() as $line) {
      echo UserRepository::getUserById($line->getUserId())->getName() . " escribió:  {$line->getText()}<br>";
    }
    ?>
  </article>
  </div>
</body>

</html>