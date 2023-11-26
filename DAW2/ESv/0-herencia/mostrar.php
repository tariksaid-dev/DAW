
<?php

include("Vehiculo.php");

$vehiculo = new Vehiculo("negro", 1500);

$vehiculo->circula();

$vehiculo->añadirPersona(70);

print($vehiculo->getPeso()); // 1570
