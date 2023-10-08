<?php

//gestiona variables entrada
require_once('Model/Publicacion.php');
require_once("Model/PublicacionRepository.php");
require_once("Model/User.php");
require_once("Model/UserRepository.php");
session_start();

if(!empty($_POST['login'])){
    //llamar a un metodo que valide
    $_SESSION['user']=UserRepository::checkLogin($_POST['username'],$_POST['password']);
}

if(!empty($_GET['newPub'])){
    include("View/newPubView.phtml");
    die;
}

if(!empty($_POST['newPub'])){
    /* opcion en la propia clase
    $datos['title']=slkafl
    $p=new Publicacion($datos)
    $p->save()

    */
    PublicacionRepository::newPub($_POST, $_FILES);
    
}

//usa el modelo y aplica cambios a BD
$pubs= PublicacionRepository::getPublicaciones();

//carga la vista correcta
include("View/mainView.phtml");
?>