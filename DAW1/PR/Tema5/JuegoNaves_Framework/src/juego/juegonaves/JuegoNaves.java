package juego.juegonaves;

import java.awt.event.KeyEvent;
import java.util.*;
import hlanz.framework.consola.*;

public class JuegoNaves extends Escena {

    private List<Enemigo> enemigos = new ArrayList<>();

    public List<Enemigo> getEnemigos() {
        return this.enemigos;
    }

    @Override
    public void añadir(GameObject obj) {
        super.añadir(obj);
        if (obj instanceof Enemigo e) {
            enemigos.add(e);
        }
    }

    @Override
    public void retirar(GameObject obj) {
        super.retirar(obj);
        if (obj instanceof Enemigo e) {
            enemigos.add(e);
        }
    }

    @Override
    protected void añadirObjetosIniciales() {

        this.añadir(new Nave1(KeyEvent.VK_A, KeyEvent.VK_D, KeyEvent.VK_SPACE));
        this.añadir(new Fondo(5));
        // Faltaría añadir enemigos.
    }

    public static void main(String... args) {
        Juego j = new Juego();
        j.iniciar(new JuegoNaves(), Resolucion.VENTANA_FULLHD);
    }

}
