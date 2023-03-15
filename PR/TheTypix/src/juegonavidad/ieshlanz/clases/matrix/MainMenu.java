package juegonavidad.ieshlanz.clases.matrix;

import bpc.daw.consola.*;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.*;

public class MainMenu {
    private int option;
    private int width = Toolkit.getDefaultToolkit().getScreenSize().width;
    private int height = Toolkit.getDefaultToolkit().getScreenSize().height;
    private Sprite sprite;
    private boolean state;

    public MainMenu(CapaSprites sprites, Image imagen) {
        this.option = 0;
        this.state = true;
        this.sprite = sprites.crearSprite(
                imagen,
                new Rectangle(0, 0, imagen.getWidth(null), imagen.getHeight(null)),
                this.width / 3,
                this.height - (this.height - 200));
    }

    public void actuar(Teclado t, CapaSprites sprites, Selector s) throws InterruptedException {
        this.state = true;
        // Se puede cambiar de números a las arrows metiendo un thread.sleep muy corto
        // (1-3ms)2
        if (t.teclaPulsada(KeyEvent.VK_1)) {
            s.moverA1();
            Thread.sleep(5);
            this.option = 0;
        }
        if (t.teclaPulsada(KeyEvent.VK_2)) {
            s.moverA2();
            Thread.sleep(5);
            this.option = 1;
        }
        if (t.teclaPulsada(KeyEvent.VK_3)) {
            s.moverA3();
            Thread.sleep(5);
            this.option = 2;
        }
        if (t.teclaPulsada(KeyEvent.VK_ENTER)) {
            this.enter();
            Thread.sleep(50);
        }
    }

    // programar opciones
    private void enter() {
        if (this.option == 0) {
            // nueva partida
            this.state = false;
        }
        if (this.option == 1) {
            // cargar partida
            this.state = false;
        }
        if (this.option == 2) {
            this.state = false;
            System.exit(0);
        }
    }

    public void borrar(CapaSprites sprites) {
        sprites.eliminarSprite(this.sprite);
    }

    public boolean getState() {
        return this.state;
    }

    public int getOption() {
        return this.option;
    }

}
