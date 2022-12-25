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
        }, 
        {
            new Rectangle (32, 0, 32, 32),
        }
    };
    private boolean done = false;
    private String nombre;
    private int filaLetra = 0;
    private int columnaLetra = 0;
    private Sprite sprite; 
    private int PosicionY = 360;
    private List <Integer> posicionLetra = new ArrayList <>(List.of(1140, 1080, 1020, 960, 900, 840, 780));
    private int posicionPuntero;

    public Letras(CapaSprites sprite, Image imagen) {
        this.done = false;
        this.nombre = "";
        this.posicionPuntero = 0;
    }

    public void actuar(Teclado t, Image imagen, CapaSprites sprite) throws Exception{
        if (t.teclaPulsada(KeyEvent.VK_DELETE)){
            if(this.posicionPuntero > 0) {
                this.posicionPuntero--;
                this.nombre = this.nombre.substring(1); // posible fallo
                // Thread.sleep(150);
                this.sprite.setAlfa(0);
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

    public boolean isDone() {
        return this.done;
    }

}

// Para que las letras no hagan overlap, modificar la imagen letrasGreen cambiando la transparencia por negro (así tapan la de abajo).
