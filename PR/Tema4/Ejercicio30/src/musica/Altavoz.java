package musica;

public class Altavoz {
    public static final int VOL_MAX = 255;
    public static final int VOL_MIN = 0;
    private int volumen;

    public Altavoz() {
        this.volumen = 0;
    }

    public void ponerVolumenMaximo() {
        this.volumen = VOL_MAX;
    }

    public void setVolumen(int v) {
        this.volumen = v;
    }

    public int getVolumen() {
        return this.volumen;
    }

    public String toString() {
        String barra = "";
        int porcentaje = (int) (this.volumen * 10.0 / VOL_MAX);
        for (int i = 0; i < porcentaje; i++) {
            barra += "*";
        }
        for (int i = 0; i < 10 - porcentaje; i++) {
            barra += "-";
        }
        return "[" + this.volumen + "] " + barra;
    }
}
