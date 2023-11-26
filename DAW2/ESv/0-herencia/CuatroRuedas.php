<?php

class CuatroRuedas extends Vehiculo
{
  private $numeroPuertas;

  public function __construct($numeroPuertas)
  {
    $this->numeroPuertas = $numeroPuertas;
  }

  public function repintar($color)
  {
    // $this->color = $color;
  }

  public function getNumeroPuertas()
  {
    return $this->numeroPuertas;
  }
}
