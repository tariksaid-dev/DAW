<?php
class Connect
{
  public static function setConection()
  {
    $conection = new mysqli("localhost", "root", "root", "tickets");
    $conection->query("SET NAMES 'utf8'");
    return $conection;
  }
}
