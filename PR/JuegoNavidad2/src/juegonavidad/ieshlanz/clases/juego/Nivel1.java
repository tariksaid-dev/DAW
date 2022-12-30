package juegonavidad.ieshlanz.clases.juego;

import bpc.daw.consola.*;
import juegonavidad.ieshlanz.clases.matrix.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.*;
import java.io.IOException;
import java.util.*;
import bpc.daw.consola.*;
import java.awt.Image;
import javax.imageio.ImageIO;
import java.io.*;
import java.awt.*;
import java.util.List;

public class Nivel1 {

    private Image imagenFondo;
    private Image corazonesImg;
    private List<Sprite> corazones;
    private int nivel = 1;
    private int width = Toolkit.getDefaultToolkit().getScreenSize().width;
    private int height = Toolkit.getDefaultToolkit().getScreenSize().height;
    private int vidas;
    private int timer;
    private boolean acabado;
    private boolean success;
    private Map<Character, Sprite> spritesMap = new HashMap<>();

    public Nivel1(Jugador j, CapaSprites sprites) throws IOException {
        this.vidas = j.getDificultad();
        this.timer = 0;
        this.corazonesImg = ImageIO.read(new File("img/corazon.png"));
        this.imagenFondo = ImageIO.read(new File("img/fondoNiveles.png"));
        this.corazones = new ArrayList<>();
        switch (this.vidas) {
            case 1:
                // this.corazones.add(sprites.crearSprite(imagen, null, nivel, height));

        }
    }

    public void actuar(CapaSprites sprites, Teclado t) throws Exception {
        spritesMap.forEach((k, v) -> {
            v.moverY(1);
            if (v.getY() > height) {
                v.setPosicion(this.ejeXAleatorio(), this.ejeYAleatorio());
                vidas--;
            }
        });
        Thread hilo = new Thread() {
            public void run() {
                while (true) {
                    char x = t.leerCaracter();
                    if (spritesMap.containsKey(x)) {
                        System.out.println("Tecla: " + x);
                        spritesMap.get(x).setPosicion(ejeXAleatorio(), ejeYAleatorio());
                    }
                }
            }
        };
        hilo.start();
    }

    private int ejeXAleatorio() {
        return new Random().nextInt(10, this.width - 10);
    }

    private int ejeYAleatorio() {
        return new Random().nextInt(-500, 0);
    }

    public int getNivel() {
        return this.nivel;
    }
}
