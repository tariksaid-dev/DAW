package bpc.framework.consola;

import java.awt.*;
import java.awt.event.KeyEvent;

import bpc.daw.consola.*;

public class Juego {
    private Consola consola;
    private Escena escena;
    private boolean detener;
    private Resolucion resolucion;

    public void iniciar(Escena e, Resolucion r) {
        this.consola = new Consola();
        Teclado t = this.consola.getTeclado();
        this.resolucion = r;
        setEscena(e);
        this.detener = false;
        while (detener == false) {
            this.consola.esperarSiguienteFrame();
            if (t.teclaPulsada(KeyEvent.VK_ESCAPE)) {
                detener = true;
            }
        }
    }

    public void setEscena(Escena e) {
        this.escena = e;
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
