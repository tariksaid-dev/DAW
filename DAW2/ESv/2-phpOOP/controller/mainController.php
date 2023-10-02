<?php

// gestiona variables entrada
require_once("model/publication.php");
require_once("model/publicationRepository.php");

// usa el modelo y aplica cambios a BD
$pubs = PublicationRepository::getPublications();

// carga la vista correcta
include("view/main.phtml");
?>