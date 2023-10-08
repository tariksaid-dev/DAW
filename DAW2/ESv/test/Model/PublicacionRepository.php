<?php

class PublicacionRepository{


    public static function getPublicaciones(){
        //consultar a la BBDD 

        $bd=Conectar::conexion();
        $q="SELECT * FROM publicacion";

        $result=$bd->query($q);
        while($datos=$result->fetch_assoc()){
            $pubs[]=new Publicacion($datos);
        }

        //construir con el modelo un array de publicaciones

        //devolver el array
        return $pubs;

    }

    public static function newPub($datos, $img){
        $image=$img['img']['name'];


        move_uploaded_file($img['img']['tmp_name'],'public/img/'.$image);

        $bd=Conectar::conexion();
        $q="INSERT INTO publicacion VALUES (NULL, '".$datos['title']."', '".$datos['text']."', NOW(), '".$image."')";

        $bd->query($q);
        return $bd->insert_id;
    }


}



?>