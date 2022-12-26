package juegonavidad.ieshlanz.clases.matrix;
import bpc.daw.consola.*;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;
import javax.imageio.ImageIO;
import java.util.*;
import java.io.*;
import java.awt.*;
public class ElegirDificultad {
    private boolean done;
    private int option;
    private Sprite sprite;
    private int width = Toolkit.getDefaultToolkit().getScreenSize().width;
    private int height = Toolkit.getDefaultToolkit().getScreenSize().height;
    
    public ElegirDificultad(CapaSprites sprites, Image imagen) {
        this.done = false;
        this.option = 0;
        this.sprite = sprites.crearSprite(
            imagen, 
            new Rectangle (0, 0, imagen.getWidth(null), imagen.getHeight(null)),
            this.width/3, 
            this.height - (this.height - 200));
    }

    public void actuar(Teclado t, CapaSprites sprites, Selector s) throws InterruptedException{
        if(t.teclaPulsada(KeyEvent.VK_1)) {
            s.moverA1();
            Thread.sleep(5);
            this.option = 0;
        }
        if(t.teclaPulsada(KeyEvent.VK_2)) {
            s.moverA2();
            Thread.sleep(5);
            this.option = 1;
        }
        if(t.teclaPulsada(KeyEvent.VK_3)) {
            s.moverA3();
            Thread.sleep(5);
            this.option = 2;
        }
        if(t.teclaPulsada(KeyEvent.VK_ENTER)) {
            this.enter();
            Thread.sleep(5);
        }
    }

    private void enter() {
        if(this.option == 0) {
            // facil
            this.done = true;
        }
        if(this.option == 1) {
            // normal
            this.done = true;
        }
        if(this.option == 2) {
            // dificil
            this.done = true;
        }
    }

    public boolean isDone() {
        return this.done;
    }

    public void borrar(CapaSprites sprites) {
        sprites.eliminarSprite(this.sprite);
    }
}
