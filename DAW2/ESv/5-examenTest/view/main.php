<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <style>
    <?php include "styles.css" ?>
  </style>
  <title>MAIN TICKETS</title>
</head>

<body>
  <?php
  include("view/ui/header.php");

  if (isset($tickets)) {
    echo "<h1 style='margin-top: 20px;'>Tus tickets disponibles</h1>";
    echo '<div class="pub-layout">';
    foreach ($tickets as $ticket) {
      echo "<article class='pub-element'>";
      echo "<div class='pub-button-container'>";
      echo "<a href='index.php?main=ticket&watchTicket={$ticket->getId()}' class='btn'>Ver ticket</a>";
      echo "</div>";
      echo "<h1>Problema: {$ticket->getTitle()}</h1>";
      echo "<p>Usuario que ha abierto el titcket: " . UserRepository::getUserById($ticket->getUserId())->getName() . "</p>";
      echo "<p>Status del ticket: {$ticket->getStatus()}</p>";
      echo "<p>Trabajador asignado: ";

      if ($ticket->getEmployee()) {
        echo $ticket->getEmployee()->getName();
      } else {
        echo "Ninguno";
      }

      echo "</p>";
      echo "</article>";
    }
  } else {
    echo "<h1 style='margin-top: 20px;'>No tienes tickets disponibles</h1>";
  }
  ?>
  </div>
</body>

</html>