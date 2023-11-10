<?php
class Connect
{
  public static function setConection()
  {
    $conection = new mysqli("localhost", "root", "root", "tienda");
    $conection->query("SET NAMES 'utf8'");
    return $conection;
  }
}
