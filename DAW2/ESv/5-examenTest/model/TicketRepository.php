<?php
class TicketRepository
{

  public static function getAllTickets()
  {
    $q = "SELECT * FROM ticket";
    $bd = Connect::setConection();
    $result = $bd->query($q);
    $ticket = [];
    while ($data = $result->fetch_assoc()) {
      $ticket[] = new Ticket($data);
    }
    return $ticket;
  }

  public static function getAllTicketsByUserId($userId)
  {
    $q = "SELECT * FROM ticket where user_id = $userId";
    $bd = Connect::setConection();
    $result = $bd->query($q);
    $ticket = [];
    while ($data = $result->fetch_assoc()) {
      $ticket[] = new Ticket($data);
    }
    return $ticket;
  }

  public static function getEmployeeTicketsByEmployeeId($employeeId)
  {
    $q = "SELECT * FROM ticket WHERE status = 'open' AND (employee_id IS NULL OR employee_id = $employeeId)";
    $bd = Connect::setConection();
    $result = $bd->query($q);
    $ticket = [];
    while ($data = $result->fetch_assoc()) {
      $ticket[] = new Ticket($data);
    }
    return $ticket;
  }

  public static function getTicketById($id)
  {
    $bd = Connect::setConection();
    $q = "SELECT * FROM ticket WHERE id = $id";
    $result = $bd->query($q);
    $data = $result->fetch_assoc();
    return new Ticket($data);
  }

  public static function getTicketByUserId($userId)
  {
    $bd = Connect::setConection();
    $q = "SELECT * FROM ticket WHERE user_id = $userId";
    $result = $bd->query($q);
    $data = $result->fetch_assoc();
    return new Ticket($data);
  }

  public static  function createNewTicket($data)
  {

    $userId = $_SESSION["user"]->getId();
    $title = $data["title"];
    $text = $data["text"];

    $bd = Connect::setConection();
    $q = "INSERT INTO ticket (user_id, status, title) VALUES ($userId, 'open',  '$title')";

    if ($bd->query($q)) {
      $ticketId = $bd->insert_id;
      $q2 = "INSERT INTO ticket_line (ticket_id, text, user_id) VALUES ($ticketId, '$text' , $userId)";
      $bd->query($q2);
    }

    return true;
  }

  public static function getTicketsByUserRoleAndByUserId($rol, $id)
  {
    $bd = Connect::setConection();
    $q = "";

    if ($rol == 0) {
      $q = "SELECT * FROM ticket where user_id = $id";
    } else if ($rol == 1) {
      $q = "SELECT * FROM ticket WHERE status = 'open' AND (employee_id IS NULL OR employee_id = $id)";
    } else if ($rol == 2) {
      $q = "SELECT * FROM ticket";
    }

    $result = $bd->query($q);
    $ticket = [];
    while ($data = $result->fetch_assoc()) {
      $ticket[] = new Ticket($data);
    }
    return $ticket;
  }

  public static function closeTicket($ticketId)
  {
    $bd = Connect::setConection();
    $q = "UPDATE ticket SET status = 'close' WHERE id = $ticketId";
    return $bd->query($q);
  }

  public static function assignTicketToEmployeeByTicketId($data)
  {
    $ticketId = $data["ticketId"];
    $employeeId = $data["employeeId"];

    $bd = Connect::setConection();
    $q = "UPDATE ticket SET employee_id = $employeeId WHERE id = $ticketId";
    return $bd->query($q);
  }

  public static function assignTicketToEmployeeByTicketId2($ticketId, $employeeId)
  {


    $bd = Connect::setConection();
    $q = "UPDATE ticket SET employee_id = $employeeId WHERE id = $ticketId";
    return $bd->query($q);
  }

  public static function updateValoracionByTicketId($data)
  {

    $valoracion = $data["cantidad"];
    $ticketId = $data["ticketId"];

    $bd = Connect::setConection();
    $q = "UPDATE ticket SET valoracion = $valoracion WHERE id = $ticketId";
    return $bd->query($q);
  }

  public static function createLine($data)
  {
    $ticketId = $data["ticketId"];
    $text = $data["text"];
    $userId = $_SESSION["user"]->getId();

    $bd = Connect::setConection();
    $q = "INSERT INTO ticket_line (ticket_id, text, user_id) VALUES ($ticketId, '$text' , $userId)";
    return $bd->query($q);
  }
}
