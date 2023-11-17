<?php
class LineRepository
{
  public static  function createNewLine($data)
  {

    $userId = $_SESSION["user"]->getId();
    $title = $data["title"];

    $bd = Connect::setConection();
    $q = "INSERT INTO ticket_line (ticket_id, status, title) VALUES ($userId, 'open',  $title)";
    $bd->query($q);
    return true;
  }

  public static function getLinesByTicketId($ticketId)
  {
    $bd = Connect::setConection();
    $q = "SELECT * FROM ticket_line WHERE ticket_id = $ticketId";
    $result = $bd->query($q);
    $lines = [];
    while ($data = $result->fetch_assoc()) {
      $lines[] = new Line($data);
    }
    return $lines;
  }
}
