package juegonavidad.ieshlanz.clases.juego;

import java.io.IOException;
import java.util.*;
import bpc.daw.consola.*;
import java.awt.Image;
import java.awt.event.KeyEvent;
import javax.imageio.ImageIO;
import java.io.*;
import java.awt.*;

public class Nivel3 {
    private Image imagen;
    private int width = Toolkit.getDefaultToolkit().getScreenSize().width;
    private int height = Toolkit.getDefaultToolkit().getScreenSize().height;
    public static int vidas;
    private Map<Character, Sprite> spritesMap = new HashMap<>();
    private boolean acabado;
    public static boolean pausa;

    public Nivel3() {
        vidas = 3;
    }

    public void actuar(CapaSprites sprites, Teclado t, Graphics g) throws Exception {
        if (t.teclaPulsada(KeyEvent.VK_ESCAPE)) {
            Nivel3.pausa = true;
            Thread.sleep(7000);
            Nivel3.pausa = false;
        }
        spritesMap.forEach((k, v) -> {
            v.moverY(1);
            if (v.getY() > height) {
                v.setPosicion(this.ejeXAleatorio(), this.ejeYAleatorio());
                vidas--;
                try {
                    if (vidas == 2) {
                        this.imagen = ImageIO.read(new File("img/nivel3vidas2.png"));
                        g.drawImage(this.imagen, 0, 20, width, height, null);
                    } else if (vidas == 1) {
                        this.imagen = ImageIO.read(new File("img/nivel3vidas1.png"));
                        g.drawImage(this.imagen, 0, 20, width, height, null);
                    } else if (vidas == 0) {
                        this.imagen = ImageIO.read(new File("img/nivel3vidas0.png"));
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
                while (Nivel3.vidas > 0 && !acabado) {
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
        int y = -1500;
        this.imagen = ImageIO.read(new File("img/letrasGreen.png"));
        this.spritesMap.put('a', SpritesLetras.generarLetra_a(sprites, imagen, y));
        this.spritesMap.put('b', SpritesLetras.generarLetra_b(sprites, imagen, y));
        this.spritesMap.put('c', SpritesLetras.generarLetra_c(sprites, imagen, y));
        this.spritesMap.put('d', SpritesLetras.generarLetra_d(sprites, imagen, y));
        this.spritesMap.put('e', SpritesLetras.generarLetra_e(sprites, imagen, y));
        this.spritesMap.put('f', SpritesLetras.generarLetra_f(sprites, imagen, y));
        this.spritesMap.put('g', SpritesLetras.generarLetra_g(sprites, imagen, y));
        this.spritesMap.put('h', SpritesLetras.generarLetra_h(sprites, imagen, y));
        this.spritesMap.put('i', SpritesLetras.generarLetra_i(sprites, imagen, y));
        this.spritesMap.put('j', SpritesLetras.generarLetra_j(sprites, imagen, y));
        this.spritesMap.put('k', SpritesLetras.generarLetra_k(sprites, imagen, y));
        this.spritesMap.put('l', SpritesLetras.generarLetra_l(sprites, imagen, y));
        this.spritesMap.put('m', SpritesLetras.generarLetra_m(sprites, imagen, y));
        this.spritesMap.put('n', SpritesLetras.generarLetra_n(sprites, imagen, y));
        this.spritesMap.put('o', SpritesLetras.generarLetra_o(sprites, imagen, y));
        this.spritesMap.put('p', SpritesLetras.generarLetra_p(sprites, imagen, y));
        this.spritesMap.put('q', SpritesLetras.generarLetra_q(sprites, imagen, y));
        this.spritesMap.put('r', SpritesLetras.generarLetra_r(sprites, imagen, y));
        this.spritesMap.put('s', SpritesLetras.generarLetra_s(sprites, imagen, y));
        this.spritesMap.put('t', SpritesLetras.generarLetra_t(sprites, imagen, y));
        this.spritesMap.put('u', SpritesLetras.generarLetra_u(sprites, imagen, y));
        this.spritesMap.put('v', SpritesLetras.generarLetra_v(sprites, imagen, y));
        this.spritesMap.put('w', SpritesLetras.generarLetra_w(sprites, imagen, y));
        this.spritesMap.put('x', SpritesLetras.generarLetra_x(sprites, imagen, y));
        this.spritesMap.put('y', SpritesLetras.generarLetra_y(sprites, imagen, y));
        this.spritesMap.put('z', SpritesLetras.generarLetra_z(sprites, imagen, y));
        this.spritesMap.put('A', SpritesLetras.generarLetra_A(sprites, imagen, y));
        this.spritesMap.put('B', SpritesLetras.generarLetra_B(sprites, imagen, y));
        this.spritesMap.put('C', SpritesLetras.generarLetra_C(sprites, imagen, y));
        this.spritesMap.put('D', SpritesLetras.generarLetra_D(sprites, imagen, y));
        this.spritesMap.put('E', SpritesLetras.generarLetra_E(sprites, imagen, y));
        this.spritesMap.put('F', SpritesLetras.generarLetra_F(sprites, imagen, y));
        this.spritesMap.put('G', SpritesLetras.generarLetra_G(sprites, imagen, y));
        this.spritesMap.put('H', SpritesLetras.generarLetra_H(sprites, imagen, y));
        this.spritesMap.put('I', SpritesLetras.generarLetra_I(sprites, imagen, y));
        this.spritesMap.put('J', SpritesLetras.generarLetra_J(sprites, imagen, y));
        this.spritesMap.put('K', SpritesLetras.generarLetra_K(sprites, imagen, y));
        this.spritesMap.put('L', SpritesLetras.generarLetra_L(sprites, imagen, y));
        this.spritesMap.put('M', SpritesLetras.generarLetra_M(sprites, imagen, y));
        this.spritesMap.put('N', SpritesLetras.generarLetra_N(sprites, imagen, y));
        this.spritesMap.put('O', SpritesLetras.generarLetra_O(sprites, imagen, y));
        this.spritesMap.put('P', SpritesLetras.generarLetra_P(sprites, imagen, y));
        this.spritesMap.put('Q', SpritesLetras.generarLetra_Q(sprites, imagen, y));
        this.spritesMap.put('R', SpritesLetras.generarLetra_R(sprites, imagen, y));
        this.spritesMap.put('S', SpritesLetras.generarLetra_S(sprites, imagen, y));
        this.spritesMap.put('T', SpritesLetras.generarLetra_T(sprites, imagen, y));
        this.spritesMap.put('U', SpritesLetras.generarLetra_U(sprites, imagen, y));
        this.spritesMap.put('V', SpritesLetras.generarLetra_V(sprites, imagen, y));
        this.spritesMap.put('W', SpritesLetras.generarLetra_W(sprites, imagen, y));
        this.spritesMap.put('X', SpritesLetras.generarLetra_X(sprites, imagen, y));
        this.spritesMap.put('Y', SpritesLetras.generarLetra_Y(sprites, imagen, y));
        this.spritesMap.put('Z', SpritesLetras.generarLetra_Z(sprites, imagen, y));
        this.imagen = ImageIO.read(new File("img/nivel3vidas3.png"));
        g.drawImage(imagen, 0, 20, width, height, null);
    }

    public void FondoVidas(Graphics g) throws IOException {
        switch (vidas) {
            case 0 -> this.imagen = ImageIO.read(new File("img/nivel3vidas0.png"));
            case 1 -> this.imagen = ImageIO.read(new File("img/nivel3vidas1.png"));
            case 2 -> this.imagen = ImageIO.read(new File("img/nivel3vidas2.png"));
            case 3 -> this.imagen = ImageIO.read(new File("img/nivel3vidas3.png"));
        }
        ;
        g.drawImage(imagen, 0, 20, width, height, null);
    }

    private int ejeXAleatorio() {
        return new Random().nextInt(10, this.width - 30);
    }

    // Adaptado para más cantidad de letras
    private int ejeYAleatorio() {
        return new Random().nextInt(-2200, 0);
    }

    public int getVidas() {
        return vidas;
    }

    public void contador(Graphics g, Nivel3 nb, Teclado t) throws Exception {
        Thread hilo2 = new Thread() {
            int timer = 60;
            boolean parar = false;

            public void run() {
                while (!parar && nb.getVidas() > 0) {
                    try {
                        if (Nivel3.pausa == true) {
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
