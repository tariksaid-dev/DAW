package juego.juegonaves;

public class Nave2 extends Nave {
    public Nave2(int ti, int tde, int tdi) {
        super(ti, tde, tdi, 5, CacheImagenes.getInstancia().getImagen("img/nave2.png"), 0, 0);
    }

    @Override
    public void realizarDisparo() {
        // same casi, leer doc
    }

    @Override
    public void finalizar() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'finalizar'");
    }
}
