<?php
class Vehiculo
{
  private $color, $peso;

  public function __construct($color, $peso)
  {
    $this->color = $color;
    $this->peso = $peso;
  }

  public function circula()
  {
    print "El vehículo circula\n";
  }

  public function añadirPersona($pesoPersona)
  {
    $this->peso += $pesoPersona;
  }

  public function getColor()
  {
    return $this->color;
  }

  public function getPeso()
  {
    return $this->peso;
  }
}
