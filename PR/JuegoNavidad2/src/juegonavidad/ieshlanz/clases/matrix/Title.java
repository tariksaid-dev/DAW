package juegonavidad.ieshlanz.clases.matrix;

import bpc.daw.consola.*;
import java.awt.Image;
import java.awt.*;

public class Title {
    private static Rectangle[] rectangulos = {
            new Rectangle(9, 9, 418, 192),
            new Rectangle(532, 9, 612, 192)
    };
    private Sprite sprite;
    private int width = Toolkit.getDefaultToolkit().getScreenSize().width;
    private int height = Toolkit.getDefaultToolkit().getScreenSize().height;

    public Title(CapaSprites sprites, Image imagen, int parte, CapaTexto ct) {
        int x = 0;
        int y = 0;
        if (parte == 0) {
            x = -300;
            y = 200;
        } else {
            x = this.width - 100;
            y = this.height - 650;
        }
        this.sprite = sprites.crearSprite(
                imagen,
                rectangulos[parte],
                x,
                y);
    }

    public void actuarThe() {
        if (this.sprite.getX() < Toolkit.getDefaultToolkit().getScreenSize().width / 2 - 100) {
            this.sprite.moverX(5);
        }
    }

    public void actuarMatrix() {
        if (this.sprite.getX() > Toolkit.getDefaultToolkit().getScreenSize().width / 2 - 300) {
            this.sprite.moverX(-5);
        }
    }

    public int getX() {
        return this.sprite.getX();
    }

    public void borrar(CapaSprites sprites) {
        sprites.eliminarSprite(this.sprite);
    }

}
