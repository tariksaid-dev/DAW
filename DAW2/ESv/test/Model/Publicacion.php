<?php

class Publicacion {
    private $title ="";
    private $text ="";
    private $date = NULL; // new DateTime();
    private $img;
    private $comments;

    public function __construct($datos)
    {
        $this->title = $datos['title'];
        $this->text = $datos['text'];
        $this->date = $datos['pubdate'];
        
        $this->img = $datos['img'];
        $this->comments = CommentRepository::getCommentsByPubId($datos['id']);
    }

    public function getText(){
        return $this->text;
    }
    public function getTitle(){
        return $this->title;
    }
    public function getImage(){
        return $this->img;
    }
    public function setText($t){
        $this->text=$t;
    }

}

?>