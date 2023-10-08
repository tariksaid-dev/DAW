<?php
class UserRepository{

    public static function checkLogin($u,$p){
        $bd=Conectar::conexion();
        $q="SELECT * FROM users WHERE username='".$u."'";
        $result=$bd->query($q);
        if($datos=$result->fetch_assoc()){
            if($datos['password']==md5($p))
                return new User($datos);
        }
        else return NULL;

    }

    public static function getUserById($id){
        $bd=Conectar::conexion();
        $q="SELECT * FROM users WHERE id='".$id."'";
        $result=$bd->query($q);
        if($datos=$result->fetch_assoc()){
            return new User($datos);
        }

    }
}


?>