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
        this.spritesMap.put('a', SpritesLetras.generarLetra_a(sprites, imagen));
        this.spritesMap.put('s', SpritesLetras.generarLetra_s(sprites, imagen));
        this.spritesMap.put('d', SpritesLetras.generarLetra_d(sprites, imagen));
        this.spritesMap.put('f', SpritesLetras.generarLetra_f(sprites, imagen));
        this.spritesMap.put('g', SpritesLetras.generarLetra_g(sprites, imagen));
        this.spritesMap.put('h', SpritesLetras.generarLetra_h(sprites, imagen));
        this.spritesMap.put('j', SpritesLetras.generarLetra_j(sprites, imagen));
        this.spritesMap.put('k', SpritesLetras.generarLetra_k(sprites, imagen));
        this.spritesMap.put('l', SpritesLetras.generarLetra_l(sprites, imagen));
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