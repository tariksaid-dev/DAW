import java.awt.*;
import bpc.daw.consola.*;

public class Boligrafo {
    // UNDONE
    private static final Color[] COLORES;
    private int color;
    private CapaTexto ct;

    public Boligrafo(CapaTexto ct) {
        this.ct = ct;
        color = 0;
    }

    public void setcolor(int n) {
        color = n;
    }

    public void escribir(String texto) {
        ct.setColorTexto(COLORES[color]);
        ct.(texto);
    }
}
