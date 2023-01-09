package musica;

public class Altavoz {
    public static final int VOL_MAX = 255;
    public static final int VOL_MIN = 0;
    private int volumen;

    public Altavoz() {
        this.volumen = VOL_MIN;
    }

    public void ponerVolumenMaximo() {
        this.volumen = VOL_MAX;
    }

    public void setVolumen(int v) {
        if (v < VOL_MIN) {
            this.volumen = VOL_MIN;
        } else if (v > VOL_MAX) {
            this.volumen = VOL_MAX;
        } else {
            this.volumen = v;
        }
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

    public static void main(String[] args) {
        Altavoz a = new Altavoz();
        a.setVolumen(253);
        System.out.println(a.toString());
    }
}
