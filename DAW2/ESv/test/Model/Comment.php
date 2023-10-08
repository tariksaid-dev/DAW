<?php
class Comment{

    private id, comment, user, commentDate;

    public function __construct($datos){
        $this->id = $datos['id'];
        $this->comment = $datos['comment'];
        $this->commentDate = $datos['commentDate'];

        $this->user = UserRepository::getUserById($datos['id']);
    }
    {
        
    }
}


?>