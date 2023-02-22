package juego.juegonaves;

import hlanz.framework.consola.*;

import java.time.*;
import bpc.daw.consola.Consola;
import java.awt.*;

public abstract class Nave extends SpriteGameObject {
    private int teclaIzquierda;
    private int teclaDerecha;
    private int teclaDisparo;
    private int velocidad;
    private Instant ultimoDisparoRealizado;

    public Nave(int ti, int tde, int tdi, int v, Image imagen, int x, int y) {
        super(imagen, 0, 0);
        this.teclaIzquierda = ti;
        this.teclaDerecha = tde;
        this.teclaDisparo = tdi;
        this.velocidad = v;
    }

    @Override
    public void ejecutarFrame() {
        if (this.consola.getTeclado().teclaPulsada(teclaIzquierda)) {
            this.moverX(-velocidad);
        } else if (this.consola.getTeclado().teclaPulsada(teclaDerecha)) {
            this.moverX(velocidad);
        } else if (this.consola.getTeclado().teclaPulsada(teclaDisparo)) {
            this.disparar();
        }
    }

    public void disparar() {
        Instant one = Instant.now();
        if (Instant.now().compareTo(one) > 1000) {
            this.ultimoDisparoRealizado = Instant.now();
            this.realizarDisparo();
        }
    }

    protected abstract void realizarDisparo();
}
