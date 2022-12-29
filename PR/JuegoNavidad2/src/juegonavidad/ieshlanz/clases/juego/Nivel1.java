package juegonavidad.ieshlanz.clases.juego;

import juegonavidad.ieshlanz.clases.matrix.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.*;

public class Nivel1 {

    private int nivel;
    private int vidas;
    private char letras;
    private int timer;
    private boolean acabado;
    private boolean success;

    public Nivel1(Jugador j) {
        this.nivel = j.getDificultad();
        this.vidas = j.getDificultad();
        this.letras = 'A';
        this.timer = 0;
        this.acabado = false;
        this.success = false;
    }
}
