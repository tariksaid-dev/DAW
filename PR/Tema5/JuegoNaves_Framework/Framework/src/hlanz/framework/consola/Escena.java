package hlanz.framework.consola;

import java.util.*;
import bpc.daw.consola.*;

public abstract class Escena implements ElementoJuego {
    protected Juego juego;
    protected Consola consola;
    private List<GameObject> objetos;

    protected abstract void añadirObjetosIniciales();

    protected void añadir(GameObject obj) {
        obj.consola = this.consola;
        obj.juego = this.juego;
        obj.escena = this;
        obj.inicializar();
    }

    protected void retirar(GameObject obj) {
        obj.finalizar();
        this.objetos.remove(obj);
        obj.consola = null;
        obj.escena = null;
    }

    @Override
    public void ejecutarFrame() {
        for (int i = 0; i < this.objetos.size(); i++) {
            this.objetos.get(i).ejecutarFrame();
        }
    }

    @Override
    public void finalizar() {
        for (int i = 0; i < this.objetos.size(); i++) {
            this.objetos.remove(i);
            // this.retirar(this.objetos.get(i));
        }
    }

    @Override
    public void inicializar() {
        if (this.consola == null || this.juego == null) {
            throw new IllegalArgumentException("Hay que añadir la escena al juego para poder inicializarla");
        } else {
            this.objetos = new ArrayList<>();
            this.añadirObjetosIniciales();
        }
    }
}
