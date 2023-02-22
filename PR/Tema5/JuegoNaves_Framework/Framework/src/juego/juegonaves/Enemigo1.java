package juego.juegonaves;

public class Enemigo1 extends Enemigo {
    private int velocidad;

    public Enemigo1(int x, int y, int v) {
        super(x, y, CacheImagenes.getInstancia().getImagen("img/malo1.png"));
        this.velocidad = v;
    }

    @Override
    public void ejecutarFrame() {
        this.setX(velocidad);
        if (this.getX() > this.juego.getAnchuraPantalla()) {
            this.velocidad = this.velocidad * -1;
        } else if (this.getX() < 0) {
            this.velocidad = this.velocidad * -1;
        }
    }

    @Override
    public void finalizar() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'finalizar'");
    }

    @Override
    public int getPuntuacion() {
        return Math.abs(this.velocidad * 2);
    }
}
