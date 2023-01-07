package juegonavidad.ieshlanz.clases.matrix;

import bpc.daw.consola.*;
import java.awt.Image;
import java.awt.event.KeyEvent;
import javax.imageio.ImageIO;
import java.io.*;
import java.awt.*;

public class ElegirNivel {
    private boolean done;
    public static int option;
    private Sprite sprite;
    private Image imagen;

    public ElegirNivel(CapaSprites sprites, Selector s) throws IOException {
        if (Guardar.dificultad.get(MenuCargar.getOption()) == 1) {
            this.imagen = ImageIO.read(new File("img/1nivel.png"));
        } else if (Guardar.dificultad.get(MenuCargar.getOption()) == 2) {
            this.imagen = ImageIO.read(new File("img/2niveles.png"));
        } else if (Guardar.dificultad.get(MenuCargar.getOption()) == 3) {
            this.imagen = ImageIO.read(new File("img/3niveles.png"));
        } else if (Guardar.dificultad.get(MenuCargar.getOption()) == 4) {
            this.imagen = ImageIO.read(new File("img/4niveles.png"));
        } else if (Guardar.dificultad.get(MenuCargar.getOption()) == 5) {
            this.imagen = ImageIO.read(new File("img/5niveles.png"));
        }
        this.done = false;
        option = 1;
        this.sprite = sprites.crearSprite(
                this.imagen,
                new Rectangle(0, 0, this.imagen.getWidth(null), this.imagen.getHeight(null)),
                0, 0);
        s.moverNivel1();
    }

    public void actuar(Teclado t, CapaSprites sprites, Selector s) throws InterruptedException {
        if (t.teclaPulsada(KeyEvent.VK_1)) {
            s.moverNivel1();
            Thread.sleep(5);
            option = 1;
        }
        if (t.teclaPulsada(KeyEvent.VK_2) && Guardar.dificultad.get(MenuCargar.getOption()).intValue() > 1) {
            s.moverNivel2();
            Thread.sleep(5);
            option = 2;
        }
        if (t.teclaPulsada(KeyEvent.VK_3) && Guardar.dificultad.get(MenuCargar.getOption()).intValue() > 2) {
            s.moverNivel3();
            Thread.sleep(5);
            option = 3;
        }
        if (t.teclaPulsada(KeyEvent.VK_4) && Guardar.dificultad.get(MenuCargar.getOption()).intValue() > 3) {
            s.moverNivel4();
            Thread.sleep(5);
            option = 4;
        }
        if (t.teclaPulsada(KeyEvent.VK_5) && Guardar.dificultad.get(MenuCargar.getOption()).intValue() > 4) {
            s.moverNivel5();
            Thread.sleep(5);
            option = 5;
        }
        if (t.teclaPulsada(KeyEvent.VK_ENTER)) {
            this.enter();
            Thread.sleep(5);
        }
    }

    private void enter() {
        if (option == 1) {
            this.done = true;
        }
        if (option == 2) {
            this.done = true;
        }
        if (option == 3) {
            this.done = true;
        }
        if (option == 4) {
            this.done = true;
        }
        if (option == 5) {
            this.done = true;
        }
    }

    public boolean isDone() {
        return this.done;
    }

    public void borrar(CapaSprites sprites) {
        sprites.eliminarSprite(this.sprite);
    }

    public static int getOption() {
        return option;
    }
}
