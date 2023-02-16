package hlanz.juego.consola;

import bpc.daw.consola.*;
import java.util.*;

public abstract class Escena {
    protected Juego juego;
    protected Consola consola;
    private List<GameObject> objetos;

    public Escena() {
    };

    protected abstract void añadirObjetosIniciales();

    protected void añadir(GameObject obj) {
        this.objetos.add(obj);
    };

    protected void retirar(GameObject obj) {
        this.objetos.remove(obj);
    };

}
