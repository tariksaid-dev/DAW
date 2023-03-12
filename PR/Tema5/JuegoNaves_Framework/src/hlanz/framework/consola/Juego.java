package hlanz.framework.consola;

import java.awt.event.KeyEvent;
import bpc.daw.consola.*;

public class Juego {
    private Consola consola;
    private Escena escena;
    private boolean detener;
    private Resolucion resolucion;

    public void iniciar(Escena e, Resolucion r) {
        this.consola = new Consola("", (int) r.getResolucion().getWidth(), (int) r.getResolucion().getHeight());
        Teclado t = this.consola.getTeclado();
        this.resolucion = r;
        setEscena(e);
        this.detener = false;
        while (detener == false) {
            this.consola.esperarSiguienteFrame();
            if (t.teclaPulsada(KeyEvent.VK_ESCAPE)) {
                detener = true;
                // detener();
            }
            this.escena.ejecutarFrame();
        }
    }

    public void setEscena(Escena e) {
        this.escena = e;
        this.escena.juego = this;
        this.escena.consola = this.consola;
        this.escena.inicializar();
    }

    public void detener() {
        this.detener = true;
    }

    public int getAnchuraPantalla() {
        return (int) this.resolucion.getResolucion().getWidth();
    }

    public int getAlturaPantalla() {
        return (int) this.resolucion.getResolucion().getHeight();
    }
}
