package juegonavidad.ieshlanz.clases.juego;

import juegonavidad.ieshlanz.clases.matrix.*;

public class Jugador {
    private String nombre;
    private int dificultad;

    public Jugador(String nombre, int dificultad) {
        this.nombre = MenuCargar.jugador;
        this.dificultad = (int) MenuCargar.dificultad;
    }

    public String getNombre() {
        return this.nombre;
    }

    public int getDificultad() {
        return this.dificultad;
    }

}
