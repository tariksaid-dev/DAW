package juego.juegonaves;

public class Nave1 extends Nave {
    public Nave1(int ti, int tde, int tdi) {
        super(ti, tde, tdi, 5, CacheImagenes.getInstancia().getImagen("img/nave1.png"), 1000, 100);
    }

    @Override
    public void realizarDisparo() {
        this.inicializar();
    }

    @Override
    public void finalizar() {
        // ?=??? método heredado sin querer por toa la cara
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'finalizar'");
    }
}
