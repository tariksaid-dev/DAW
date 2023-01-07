package juegonavidad.ieshlanz.clases.matrix;

import bpc.daw.consola.*;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;
import javax.imageio.ImageIO;
import java.io.*;
import java.awt.*;

public class MenuNiveles {

    private static int option;
    private boolean done;
    private Image image;
    private Sprite sprite;
    private int nivelesDesbloqueados = 5;

    public void actuar(Teclado t, Selector s, Graphics g, CapaSprites sprites) throws IOException {
        this.movimientoSelector(t, s);
        if (t.teclaPulsada(KeyEvent.VK_ENTER)) {
            this.done = true;
            s.borrar(sprites);
            sprites.eliminarSprite(sprite); // sprite? posible delete
        }
    }

    public void generarPantallaCarga(Graphics g, Selector s, CapaSprites sprites) throws IOException {
        s.moveTo(620, 140);
        if (nivelesDesbloqueados == 1) {
            this.sprite = sprites.crearSprite(
                    ImageIO.read(new File("img/1nivel.png")),
                    new Rectangle(0, 0, 1920, 1080),
                    0, 0);
        } else if (nivelesDesbloqueados == 2) {
            this.sprite = sprites.crearSprite(
                    ImageIO.read(new File("img/2niveles.png")),
                    new Rectangle(0, 0, 1920, 1080),
                    0, 0);
        } else if (nivelesDesbloqueados == 3) {
            this.sprite = sprites.crearSprite(
                    ImageIO.read(new File("img/3niveles.png")),
                    new Rectangle(0, 0, 1920, 1080),
                    0, 0);
        } else if (nivelesDesbloqueados == 4) {
            this.sprite = sprites.crearSprite(
                    ImageIO.read(new File("img/4niveles.png")),
                    new Rectangle(0, 0, 1920, 1080),
                    0, 0);
        } else if (nivelesDesbloqueados == 5) {
            this.sprite = sprites.crearSprite(
                    ImageIO.read(new File("img/5niveles.png")),
                    new Rectangle(0, 0, 1920, 1080),
                    0, 0);
        }
    }

    private void movimientoSelector(Teclado t, Selector s) {
        if (t.teclaPulsada(KeyEvent.VK_1) && this.nivelesDesbloqueados >= 1) {
            s.moveTo(640, 120);
            option = 1;
        }
        if (t.teclaPulsada(KeyEvent.VK_2) && this.nivelesDesbloqueados >= 2) {
            s.moveTo(640, 260);
            option = 2;
        }
        if (t.teclaPulsada(KeyEvent.VK_3) && this.nivelesDesbloqueados >= 3) {
            s.moveTo(640, 400);
            option = 3;
        }

        if (t.teclaPulsada(KeyEvent.VK_4) && this.nivelesDesbloqueados >= 4) {
            s.moveTo(640, 540);
            option = 4;
        }
        if (t.teclaPulsada(KeyEvent.VK_5) && this.nivelesDesbloqueados >= 5) {
            s.moveTo(640, 680);
            option = 5;
        }
    }
}
