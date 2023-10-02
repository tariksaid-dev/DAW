<?php
class PublicationRepository
{
  public static function getPublications()
  {
    // consultar bd
    $bd = Conectar::conexion();

    $q = "SELECT * FROM publication";

    $result = $bd->query($q);

    while ($datos = $result->fetch_assoc()) {
      $pubs[] = new Publication($datos);
    }
    return $pubs;

    // construir modelo
    // devolver array
  }
}
?>