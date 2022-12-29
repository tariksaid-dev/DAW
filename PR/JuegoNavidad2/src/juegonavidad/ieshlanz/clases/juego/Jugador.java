package juegonavidad.ieshlanz.clases.juego;

import juegonavidad.ieshlanz.clases.matrix.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.*;

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
