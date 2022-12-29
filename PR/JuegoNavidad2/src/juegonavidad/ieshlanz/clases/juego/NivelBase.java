package juegonavidad.ieshlanz.clases.juego;

import juegonavidad.ieshlanz.clases.matrix.*;

import java.io.IOException;
import java.util.*;
import bpc.daw.consola.*;
import java.awt.Image;
import javax.imageio.ImageIO;
import java.io.*;
import java.awt.*;

public class NivelBase {

    private Image imagen;
    private int width = Toolkit.getDefaultToolkit().getScreenSize().width;
    private int height = Toolkit.getDefaultToolkit().getScreenSize().height;
    private int vidas = 3;
    private Map<Character, Sprite> spritesMap = new HashMap<>();

    public void actuar(CapaSprites sprites, Teclado t) throws Exception {
        spritesMap.forEach((k, v) -> {
            v.moverY(1);
            if (v.getY() > height) {
                v.setPosicion(this.ejeXAleatorio(), this.ejeYAleatorio());
                // vidas--;
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

    public void añadirSpritesMapa(CapaSprites sprites) throws IOException {
        this.imagen = ImageIO.read(new File("img/letrasGreen.png"));
        this.spritesMap.put('a', sprites.crearSprite( // A
                this.imagen,
                Letras.rectangulosLetras[0][0],
                this.ejeXAleatorio(),
                this.ejeYAleatorio()));
        this.spritesMap.put('s', sprites.crearSprite( // S
                this.imagen,
                Letras.rectangulosLetras[2][2],
                this.ejeXAleatorio(),
                this.ejeYAleatorio()));
        this.spritesMap.put('d', sprites.crearSprite( // D
                this.imagen,
                Letras.rectangulosLetras[0][3],
                this.ejeXAleatorio(),
                this.ejeYAleatorio()));
        this.spritesMap.put('f', sprites.crearSprite( // F
                this.imagen,
                Letras.rectangulosLetras[0][5],
                this.ejeXAleatorio(),
                this.ejeYAleatorio()));
        this.spritesMap.put('g', sprites.crearSprite( // G
                this.imagen,
                Letras.rectangulosLetras[0][6],
                this.ejeXAleatorio(),
                this.ejeYAleatorio()));
        this.spritesMap.put('h', sprites.crearSprite( // H
                this.imagen,
                Letras.rectangulosLetras[0][7],
                this.ejeXAleatorio(),
                this.ejeYAleatorio()));
        this.spritesMap.put('j', sprites.crearSprite( // J
                this.imagen,
                Letras.rectangulosLetras[1][1],
                this.ejeXAleatorio(),
                this.ejeYAleatorio()));
        this.spritesMap.put('k', sprites.crearSprite( // K
                this.imagen,
                Letras.rectangulosLetras[1][2],
                this.ejeXAleatorio(),
                this.ejeYAleatorio()));
        this.spritesMap.put('l', sprites.crearSprite( // L
                this.imagen,
                Letras.rectangulosLetras[1][3],
                this.ejeXAleatorio(),
                this.ejeYAleatorio()));
    }

    private int ejeXAleatorio() {
        return new Random().nextInt(10, this.width - 10);
    }

    private int ejeYAleatorio() {
        return new Random().nextInt(-500, 0);
    }

    public int getVidas() {
        return vidas;
    }
}