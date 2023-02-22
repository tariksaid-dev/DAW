package juego.juegonaves;

import hlanz.framework.consola.*;

public class Disparo extends SpriteGameObject {
    private int idJugador;
    private int vx;
    private int vy;

    public Disparo(int id, int x, int y, int vx, int vy) {
        super(CacheImagenes.getInstancia().getImagen("img/disparo.png"), x, y);
        this.vx = vx;
        this.vy = vy;
    }

    @Override
    public void ejecutarFrame() {
        this.setX(vx);
        this.setY(vy);
        if (this.getY() <= 0) {
            // eliminar de la escena?
            // this.escena.retirar(this); -> es protected pero parece el correcto
        }
        // cosas de enemigos
    }

    @Override
    public void finalizar() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'finalizar'");
    }
}
