package juegonavidad.ieshlanz.clases.juego;

import java.io.IOException;
import java.util.*;
import bpc.daw.consola.*;
import java.awt.Image;
import java.awt.event.KeyEvent;
import javax.imageio.ImageIO;
import java.io.*;
import java.awt.*;

public class NivelBase {

    private Image imagen;
    private int width = Toolkit.getDefaultToolkit().getScreenSize().width;
    private int height = Toolkit.getDefaultToolkit().getScreenSize().height;
    private static int vidas;
    private Map<Character, Sprite> spritesMap = new HashMap<>();
    private boolean acabado;
    public static boolean pausa;

    public NivelBase() {
        vidas = 3;
    }

    public void actuar(CapaSprites sprites, Teclado t, Graphics g) throws IOException, InterruptedException {
        if (t.teclaPulsada(KeyEvent.VK_ESCAPE)) {
            NivelBase.pausa = true;
            Thread.sleep(7000);
            NivelBase.pausa = false;
        }
        spritesMap.forEach((k, v) -> {
            v.moverY(1);
            if (v.getY() > height) {
                v.setPosicion(this.ejeXAleatorio(), this.ejeYAleatorio());
                vidas--;
                try {
                    if (vidas == 2) {
                        this.imagen = ImageIO.read(new File("img/nivel1vidas2.png"));
                        g.drawImage(this.imagen, 0, 20, width, height, null);
                    } else if (vidas == 1) {
                        this.imagen = ImageIO.read(new File("img/nivel1vidas1.png"));
                        g.drawImage(this.imagen, 0, 20, width, height, null);
                    } else if (vidas == 0) {
                        this.imagen = ImageIO.read(new File("img/nivel1vidas0.png"));
                        g.drawImage(this.imagen, 0, 20, width, height, null);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public void cazaLetras(Teclado t, CapaSprites sprites) throws Exception {
        Thread hilo = new Thread() {
            public void run() {
                while (NivelBase.vidas > 0 && !acabado) {
                    char x = t.leerCaracter();
                    if (spritesMap.containsKey(x)) {
                        System.out.println("Tecla: " + x);
                        spritesMap.get(x).setPosicion(ejeXAleatorio(), ejeYAleatorio());
                    }
                    if (t.teclaPulsada(KeyEvent.VK_ESCAPE)) {
                        try {
                            Sprite consejo = sprites.crearSprite(
                                    ImageIO.read(new File("img/consejo.png")),
                                    new Rectangle(0, 0, 590, 339),
                                    695, 270);
                            Thread.sleep(7000);
                            sprites.eliminarSprite(consejo);
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        };
        hilo.start();
    }

    public void añadirSpritesMapa(CapaSprites sprites, Graphics g) throws IOException {

        int y = -500;
        this.imagen = ImageIO.read(new File("img/letrasGreen.png"));
        this.spritesMap.put('a', SpritesLetras.generarLetra_a(sprites, imagen, y));
        this.spritesMap.put('s', SpritesLetras.generarLetra_s(sprites, imagen, y));
        this.spritesMap.put('d', SpritesLetras.generarLetra_d(sprites, imagen, y));
        this.spritesMap.put('f', SpritesLetras.generarLetra_f(sprites, imagen, y));
        this.spritesMap.put('g', SpritesLetras.generarLetra_g(sprites, imagen, y));
        this.spritesMap.put('h', SpritesLetras.generarLetra_h(sprites, imagen, y));
        this.spritesMap.put('j', SpritesLetras.generarLetra_j(sprites, imagen, y));
        this.spritesMap.put('k', SpritesLetras.generarLetra_k(sprites, imagen, y));
        this.spritesMap.put('l', SpritesLetras.generarLetra_l(sprites, imagen, y));
        this.imagen = ImageIO.read(new File("img/nivel1vidas3.png"));
        g.drawImage(this.imagen, 0, 20, width, height, null);
    }

    public void FondoVidas(Graphics g) throws IOException {
        this.imagen = ImageIO.read(new File("img/nivel1vidas3.png"));
        g.drawImage(imagen, 0, 20, width, height, null);
    }

    private int ejeXAleatorio() {
        return new Random().nextInt(10, this.width - 30);
    }

    private int ejeYAleatorio() {
        return new Random().nextInt(-500, 0);
    }

    public int getVidas() {
        return vidas;
    }

    public void contador(Graphics g, NivelBase nb, Teclado t) throws Exception {
        Thread hilo2 = new Thread() {
            int timer = 60;
            boolean parar = false;

            public void run() {
                while (!parar && nb.getVidas() > 0) {
                    try {
                        if (NivelBase.pausa == true) {
                            Thread.sleep(7000);
                        }
                        g.drawString("" + timer, width / 2 - 30, 80);
                        Thread.sleep(1000);
                        g.clearRect(width / 2 - 60, 43, 100, 60);
                        timer--;
                        if (timer == 0) {
                            parar = true;
                            nb.setAcabado(true);
                        }
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
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