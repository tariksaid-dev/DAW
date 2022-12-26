package juegonavidad.ieshlanz.clases.matrix;
import bpc.daw.consola.*;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;
import javax.imageio.ImageIO;
import java.util.*;
import java.util.List;
import java.io.*;
import java.awt.*;
public class Letras {

    private static Rectangle[][] rectangulosLetras = {
        {
            new Rectangle (9, 11, 38, 51),
            new Rectangle (69, 11, 38, 51),
            new Rectangle (138, 11, 38, 51),
            new Rectangle(202, 11, 38, 51),
            new Rectangle(267, 11, 38, 51),
            new Rectangle(332, 11, 38, 51),
            new Rectangle(404, 11, 38, 51),
            new Rectangle (467, 11, 38, 51),
        }, 
        {
            new Rectangle (0, 95, 38, 51),
            new Rectangle (69, 95, 38, 51),
            new Rectangle (137, 95, 38, 51),
            new Rectangle (200, 95, 38, 51),
            new Rectangle (271, 95, 38, 51),
            new Rectangle (335, 95, 38, 51),
            new Rectangle (406, 95, 38, 51),
            new Rectangle (465, 95, 38, 51),
        }, 
        {
            new Rectangle (0, 175, 38, 51), // resize Q
            new Rectangle (69, 179, 38, 51),
            new Rectangle (138, 179, 38, 51),
            new Rectangle (203, 179, 38, 51),
            new Rectangle (269, 179, 38, 51),
            new Rectangle (337, 179, 38, 51),
            new Rectangle (410, 179, 38, 51), // resize W
            new Rectangle (470, 179, 38, 51),
        },
        {
            new Rectangle (7, 264, 38, 51),
            new Rectangle (71, 264, 38, 51),
        }
    };
    private boolean done = false;
    private String nombre;
    private int filaLetra = 0;
    private int columnaLetra = 0;
    private Sprite sprite; 
    private int PosicionY = 360;
    private List <Integer> posicionLetra = new ArrayList <>(List.of(780, 840, 900, 960, 1020, 1080, 1140));
    private int posicionPuntero;

    public Letras(CapaSprites sprite, Image imagen) {
        this.done = false;
        this.nombre = "";
        this.posicionPuntero = 0;
    }

    public void actuar(Teclado t, Image imagen, CapaSprites sprite) throws Exception{
        if (t.teclaPulsada(KeyEvent.VK_BACK_SPACE)){
            if(this.posicionPuntero > 0) {
                System.out.println("traza delete");
                this.posicionPuntero--;
                this.rellenarHueco(sprite);
                this.nombre = this.nombre.substring(this.nombre.length());
            } else {
                System.out.println("traza delete pos 0");
                this.rellenarHueco(sprite);
                this.nombre = "";
            }
        }
        if (t.teclaPulsada(KeyEvent.VK_ENTER)) {
            this.done = true;
        }

        if(t.teclaPulsada(KeyEvent.VK_A)) {
            this.columnaLetra = 0;
            this.filaLetra = 0;
            this.nuevaLetra(sprite);
            this.nombre += "A";
        }
        if(t.teclaPulsada(KeyEvent.VK_B)) {
            this.columnaLetra = 1;
            this.filaLetra = 0;
            this.nuevaLetra(sprite);
            this.nombre += "B";
        }
        if(t.teclaPulsada(KeyEvent.VK_C)) {
            this.columnaLetra = 2;
            this.filaLetra = 0;
            this.nuevaLetra(sprite);
            this.nombre += "C";
        }
        if(t.teclaPulsada(KeyEvent.VK_D)) {
            this.columnaLetra = 3;
            this.filaLetra = 0;
            this.nuevaLetra(sprite);
            this.nombre += "D";
        }
        if(t.teclaPulsada(KeyEvent.VK_E)) {
            this.columnaLetra = 4;
            this.filaLetra = 0;
            this.nuevaLetra(sprite);
            this.nombre += "E";
        }
        if(t.teclaPulsada(KeyEvent.VK_F)) {
            this.columnaLetra = 5;
            this.filaLetra = 0;
            this.nuevaLetra(sprite);
            this.nombre += "F";
        }
        if(t.teclaPulsada(KeyEvent.VK_G)) {
            this.columnaLetra = 6;
            this.filaLetra = 0;
            this.nuevaLetra(sprite);
            this.nombre += "G";
        }
        if(t.teclaPulsada(KeyEvent.VK_H)) {
            this.columnaLetra = 7;
            this.filaLetra = 0;
            this.nuevaLetra(sprite);
            this.nombre += "H";
        }
        if(t.teclaPulsada(KeyEvent.VK_I)) {
            this.columnaLetra = 0;
            this.filaLetra = 1;
            this.nuevaLetra(sprite);
            this.nombre += "I";
        }
        if(t.teclaPulsada(KeyEvent.VK_J)) {
            this.columnaLetra = 1;
            this.filaLetra = 1;
            this.nuevaLetra(sprite);
            this.nombre += "J";
        }
        if(t.teclaPulsada(KeyEvent.VK_K)) {
            this.columnaLetra = 2;
            this.filaLetra = 1;
            this.nuevaLetra(sprite);
            this.nombre += "K";
        }
        if(t.teclaPulsada(KeyEvent.VK_L)) {
            this.columnaLetra = 3;
            this.filaLetra = 1;
            this.nuevaLetra(sprite);
            this.nombre += "L";
        }
        if(t.teclaPulsada(KeyEvent.VK_M)) {
            this.columnaLetra = 4;
            this.filaLetra = 1;
            this.nuevaLetra(sprite);
            this.nombre += "M";
        }
        if(t.teclaPulsada(KeyEvent.VK_N)) {
            this.columnaLetra = 5;
            this.filaLetra = 1;
            this.nuevaLetra(sprite);
            this.nombre += "N";
        }
        if(t.teclaPulsada(KeyEvent.VK_O)) {
            this.columnaLetra = 6;
            this.filaLetra = 1;
            this.nuevaLetra(sprite);
            this.nombre += "O";
        }
        if(t.teclaPulsada(KeyEvent.VK_P)) {
            this.columnaLetra = 7;
            this.filaLetra = 1;
            this.nuevaLetra(sprite);
            this.nombre += "P";
        }
        if(t.teclaPulsada(KeyEvent.VK_Q)) {
            this.columnaLetra = 0;
            this.filaLetra = 2;
            this.nuevaLetra(sprite);
            this.nombre += "Q";
        }
        if(t.teclaPulsada(KeyEvent.VK_R)) {
            this.columnaLetra = 1;
            this.filaLetra = 2;
            this.nuevaLetra(sprite);
            this.nombre += "R";
        }
        if(t.teclaPulsada(KeyEvent.VK_S)) {
            this.columnaLetra = 2;
            this.filaLetra = 2;
            this.nuevaLetra(sprite);
            this.nombre += "S";
        }
        if(t.teclaPulsada(KeyEvent.VK_T)) {
            this.columnaLetra = 3;
            this.filaLetra = 2;
            this.nuevaLetra(sprite);
            this.nombre += "T";
        }
        if(t.teclaPulsada(KeyEvent.VK_U)) {
            this.columnaLetra = 4;
            this.filaLetra = 2;
            this.nuevaLetra(sprite);
            this.nombre += "U";
        }
        if(t.teclaPulsada(KeyEvent.VK_V)) {
            this.columnaLetra = 5;
            this.filaLetra = 2;
            this.nuevaLetra(sprite);
            this.nombre += "V";
        }
        if(t.teclaPulsada(KeyEvent.VK_W)) {
            this.columnaLetra = 6;
            this.filaLetra = 2;
            this.nuevaLetra(sprite);
            this.nombre += "W";
        }
        if(t.teclaPulsada(KeyEvent.VK_X)) {
            this.columnaLetra = 7;
            this.filaLetra = 2;
            this.nuevaLetra(sprite);
            this.nombre += "X";
        }
        if(t.teclaPulsada(KeyEvent.VK_Y)) {
            this.columnaLetra = 0;
            this.filaLetra = 3;
            this.nuevaLetra(sprite);
            this.nombre += "Y";
        }
        if(t.teclaPulsada(KeyEvent.VK_Z)) {
            this.columnaLetra = 1;
            this.filaLetra = 3;
            this.nuevaLetra(sprite);
            this.nombre += "Z";
        }

        
    }

    private void nuevaLetra(CapaSprites sprite) throws Exception {
        Image foto = ImageIO.read(new File("img/letrasGreen.png"));
        sprite.crearSprite(
            foto,
            rectangulosLetras[this.filaLetra][this.columnaLetra],
            this.posicionLetra.get(this.posicionPuntero),
            this.PosicionY);
        if (this.posicionPuntero == 6) {
            this.posicionPuntero = 6;
        } else {
            this.posicionPuntero++;
        }
    }

    private void rellenarHueco(CapaSprites sprite) throws Exception {
        Image foto = ImageIO.read(new File("img/justBlack.png"));
        sprite.crearSprite(
            foto,
            new Rectangle(0, 0, 38, 51), 
            this.posicionLetra.get(this.posicionPuntero),
            this.PosicionY);
    }


    public boolean isDone() {
        return this.done;
    }

    public String getNombre() {
        return this.nombre;
    }
    public int getPosicionPuntero() {
        return this.posicionPuntero;
    }

    public void borrar(CapaSprites sprites) throws Exception {
        sprites.eliminarSprite(this.sprite);
    }

    
}
