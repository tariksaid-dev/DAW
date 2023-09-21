package hlanz.framework.consola;

import java.awt.*;
import bpc.daw.consola.*;

public abstract class SpriteGameObject extends GameObject {
    private Sprite sprite;
    private Image imagen;
    private Point puntoInicial;

    public SpriteGameObject(Image img, int x, int y) {
        this.imagen = img;
        this.sprite = null;
        this.puntoInicial = new Point(x, y);
    }

    @Override
    public void inicializar() {
        this.sprite = this.consola.getCapaSprites().crearSprite(this.imagen,
                new Rectangle(0, 0, getAnchura(), getAltura()),
                puntoInicial.x, puntoInicial.y);
    }

    @Override
    public void finalizar() {
        this.consola.getCapaSprites().eliminarSprite(this.sprite);
    }

    public int getX() {
        return this.puntoInicial.x;
    }

    public int getY() {
        return this.puntoInicial.y;
    }

    public int getAltura() {
        return this.imagen.getHeight(null);
    }

    public int getAnchura() {
        return this.imagen.getWidth(null);
    }

    public void moverX(int cx) {
        this.sprite.moverX(cx);
    }

    public void moverY(int cy) {
        this.sprite.moverY(cy);
    }

    public void setX(int x) {
        moverX(x - this.sprite.getX());
    }

    public void setY(int y) {
        moverX(y - this.sprite.getY());
    }
}
