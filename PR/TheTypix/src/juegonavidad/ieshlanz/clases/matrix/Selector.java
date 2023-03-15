package juegonavidad.ieshlanz.clases.matrix;

import bpc.daw.consola.*;
import java.awt.Image;
import java.awt.*;

public class Selector {
    private Sprite sprite;
    private int width = Toolkit.getDefaultToolkit().getScreenSize().width;
    private int height = Toolkit.getDefaultToolkit().getScreenSize().height;

    public Selector(CapaSprites sprites, Image imagen) {
        this.sprite = sprites.crearSprite(
                imagen,
                new Rectangle(0, 0, imagen.getWidth(null), imagen.getHeight(null)),
                this.width / 3 + 30,
                this.height - 830);
    }

    public void borrar(CapaSprites sprites) {
        sprites.eliminarSprite(this.sprite);
    }

    public void moverA1() {
        this.sprite.setPosicion(this.width / 3 + 30, height - 830);
    }

    public void moverA2() {
        this.sprite.setPosicion(this.width / 3 + 30, height - 730);
    }

    public void moverA3() {
        this.sprite.setPosicion(this.width / 3 + 30, height - 620);
    }

    public void moverNivel1() {
        this.sprite.setPosicion(610, 115);
    }

    public void moverNivel2() {
        this.sprite.setPosicion(610, 245);
    }

    public void moverNivel3() {
        this.sprite.setPosicion(610, 380);
    }

    public void moverNivel4() {
        this.sprite.setPosicion(610, 510);
    }

    public void moverNivel5() {
        this.sprite.setPosicion(610, 645);
    }

    public void moveTo(int x, int y) {
        this.sprite.setPosicion(x, y);
    }

}
