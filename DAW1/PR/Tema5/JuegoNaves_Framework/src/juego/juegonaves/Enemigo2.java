package juego.juegonaves;

public class Enemigo2 extends Enemigo {
    private int centroX;
    private int centroY;
    private int radio;
    private double angulo;
    private double velocidad;

    public Enemigo2(int x, int y, int cx, int cy, int r, int v) {
        super(x, y, CacheImagenes.getInstancia().getImagen("img/malo2.png"));
        this.centroX = cx;
        this.centroY = cy;
        this.radio = r;
        this.angulo = 0;
        this.velocidad = v;
    }

    @Override
    public void ejecutarFrame() {
        this.angulo += velocidad;
        if (this.angulo > Math.PI * 2) {
            this.angulo = 0;
        }
        // formulas trigonométricas de seno y coseno para determinar las coordenadas x y
        // y mover el enemigo a dicha posicón
    }

    @Override
    public void finalizar() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'finalizar'");
    }

    @Override
    public int getPuntuacion() {
        return (int) Math.abs(this.velocidad * 3);
    }
}
