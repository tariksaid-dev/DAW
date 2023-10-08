<?php

class CommentRepository{
    
        public static function getCommentsByPubId($id){

            $bd=Conectar::conexion();
            $comments=[];
            $q="SELECT * FROM comments WHERE id_pub='".$id."'";
            $result=$bd->query($q);
            while($datos=$result->fetch_assoc()){
                $comments[] = new Comment($datos);
            }
            return $comments;
        }
}

?>