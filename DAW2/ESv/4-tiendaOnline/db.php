<?php
class Connect
{
  public static function setConection()
  {
    $conexion = new mysqli("localhost", "root", "root", "tienda");
    $conexion->query("SET NAMES 'utf8'");
    return $conexion;
  }
}
