import java.awt.*;

public abstract class Nave {
    private int energia;
    private Point posicion;

    public Nave() {
        this.energia = 100;
        this.posicion = new Point(800, 400);
    }

    public void moverArriba() {
        this.posicion.y--;
    }

    public void moverAbajo() {
        this.posicion.y++;
    }

    public void moverDerecha() {
        this.posicion.x--;
    }

    public void moverIquierda() {
        this.posicion.x++;
    }

    public abstract void disparar();

    public abstract void poderEspecial();
}