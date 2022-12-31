package juegonavidad.ieshlanz.clases.juego;

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
    public static int vidas;
    private Map<Character, Sprite> spritesMap = new HashMap<>();
    private boolean acabado;

    public NivelBase(int dificultad) {
        vidas = dificultad;
    }

    public void actuar(CapaSprites sprites) throws Exception {
        spritesMap.forEach((k, v) -> {
            v.moverY(1);
            if (v.getY() > height) {
                v.setPosicion(this.ejeXAleatorio(), this.ejeYAleatorio());
                vidas--;
            }
        });
    }

    public void cazaLetras(Teclado t) throws Exception {
        Thread hilo = new Thread() {
            public void run() {
                while (NivelBase.vidas > 0) {
                    char x = t.leerCaracter();
                    System.out.println("hilo número " + Thread.currentThread().getId() + " ejecutándose");
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

    public void FondoVidas(Graphics g) throws IOException {
        switch (vidas) {
            case 1 -> this.imagen = ImageIO.read(new File("img/nivel1vidas1.png"));
            case 2 -> this.imagen = ImageIO.read(new File("img/nivel1vidas2.png"));
            case 3 -> this.imagen = ImageIO.read(new File("img/nivel1vidas3.png"));
        }
        ;
        g.drawImage(imagen, 0, 20, width, height, null);
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

    public void contador(Graphics g, NivelBase nb) throws Exception {
        Thread hilo2 = new Thread() {
            int timer = 60;
            boolean parar = false;

            public void run() {
                while (!parar && nb.getVidas() > 0) {
                    try {
                        g.drawString("" + timer, width / 2 - 30, 80);
                        Thread.sleep(1000);
                        g.clearRect(width / 2 - 60, 43, 100, 60);
                        timer--;
                        if (timer == 0) {
                            parar = true;
                            nb.setAcabado(parar);
                        }
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("hilo contador parado");
            }
        };
        hilo2.start();
    }

    public void setAcabado(boolean acabado) {
        this.acabado = acabado;
    }

    public boolean isAcabado() {
        return acabado;
    }

    public void clearScreen(Graphics g, CapaSprites sprites) {
        g.clearRect(0, 0, width, height);
        spritesMap.forEach((k, v) -> {
            sprites.eliminarSprite(v);
        });
    }
}