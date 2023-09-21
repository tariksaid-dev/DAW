package juegonavidad.ieshlanz.clases.matrix;

import bpc.daw.consola.*;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;
import javax.imageio.ImageIO;
import java.util.*;
import java.util.List;
import java.io.*;
import java.awt.*;

public class MenuCargar {

    private int width = Toolkit.getDefaultToolkit().getScreenSize().width;
    private int height = Toolkit.getDefaultToolkit().getScreenSize().height;
    private List<Integer> ejeX;
    private List<Integer> ejeY;
    private int numPartidasGuardadas = Guardar.nombre.size();
    private boolean done;
    private static int option;
    private Sprite sprite;
    private Image image;

    public static String jugador;
    public static double dificultad;

    public MenuCargar(CapaSprites sprites, Image imagen) {
        this.image = imagen;
    }

    public void actuar(Teclado t, Selector s, CapaSprites sprites) throws Exception {
        // aqui crearemos el loop con el selector y la opción que cargará al dar a enter
        if (this.numPartidasGuardadas == 0) {
            this.volver(t);
        } else {
            this.movimientoSelector(t, s);
            if (t.teclaPulsada(KeyEvent.VK_ENTER)) {
                Thread.sleep(100);
                jugador = Guardar.nombre.get(option);
                dificultad = Guardar.dificultad.get(option);
                this.done = true;
                s.borrar(sprites);
                sprites.eliminarSprite(this.sprite);
            }
        }
    }

    public void generarPantallaCarga(Graphics g, Selector s, CapaSprites sprites) throws IOException {
        this.pantalla();
        if (this.numPartidasGuardadas == 0) {
            s.moveTo(width / 2 - 300, height / 2 - 25);
            g.drawString("No hay partidas guardadas", width / 2 - 300, height / 2 - 200);
            this.sprite = sprites.crearSprite(
                    ImageIO.read(new File("img/nuevaPartida.png")),
                    new Rectangle(0, 0,
                            ImageIO.read(new File("img/nuevaPartida.png")).getWidth(null),
                            ImageIO.read(new File("img/nuevaPartida.png")).getHeight(null)),
                    width / 2 - 300, height / 2 - 150);
        } else {
            s.moveTo(this.ejeX.get(0) - 200, this.ejeY.get(0) - 60);
            this.sprite = sprites.crearSprite(
                    ImageIO.read(new File("img/loadScreen.png")).getScaledInstance(this.width, this.height,
                            Image.SCALE_SMOOTH),
                    new Rectangle(0, 0,
                            ImageIO.read(new File("img/loadScreen.png"))
                                    .getScaledInstance(this.width, this.height, Image.SCALE_SMOOTH).getWidth(null),
                            ImageIO.read(new File("img/loadScreen.png"))
                                    .getScaledInstance(this.width, this.height, Image.SCALE_SMOOTH).getHeight(null)),
                    0, 0);
            int contador = 0;
            int contador2 = 1;
            for (int i = 0; i < 3 && contador < this.numPartidasGuardadas; i++) {
                for (int j = 0; j < 3 && contador < this.numPartidasGuardadas; j++) {
                    g.drawString(contador2 + ". " + Guardar.nombre.get(contador), this.ejeX.get(j) - 50,
                            this.ejeY.get(i));
                    g.drawString("Nivel: " + Guardar.dificultad.get(contador).intValue(), this.ejeX.get(j) - 50,
                            this.ejeY.get(i) + 50);
                    contador++;
                    contador2++;
                }
            }
        }
    }

    private void pantalla() {
        this.ejeX = new ArrayList<Integer>();
        this.ejeY = new ArrayList<Integer>();
        for (int i = 1; i < 4; i++) {
            ejeX.add((this.width / 3) * i - ((this.width / 3) / 2));
        }
        for (int i = 1; i < 4; i++) {
            ejeY.add((this.height / 3) * i - ((this.height / 3) / 2));
        }
    }

    private void volver(Teclado t) {
        if (t.teclaPulsada(KeyEvent.VK_ENTER)) {
            System.exit(0);
        }
    }

    public boolean isDone() {
        return this.done;
    }

    private void movimientoSelector(Teclado t, Selector s) {
        if (t.teclaPulsada(KeyEvent.VK_1) && this.numPartidasGuardadas >= 1) {
            s.moveTo(ejeX.get(0) - 200, ejeY.get(0) - 75);
            option = 0;
        }
        if (t.teclaPulsada(KeyEvent.VK_2) && this.numPartidasGuardadas >= 2) {
            s.moveTo(ejeX.get(1) - 200, ejeY.get(0) - 75);
            option = 1;
        }
        if (t.teclaPulsada(KeyEvent.VK_3) && this.numPartidasGuardadas >= 3) {
            s.moveTo(ejeX.get(2) - 200, ejeY.get(0) - 75);
            option = 2;
        }

        if (t.teclaPulsada(KeyEvent.VK_4) && this.numPartidasGuardadas >= 4) {
            s.moveTo(ejeX.get(0) - 200, ejeY.get(1) - 75);
            option = 3;
        }
        if (t.teclaPulsada(KeyEvent.VK_5) && this.numPartidasGuardadas >= 5) {
            s.moveTo(ejeX.get(1) - 200, ejeY.get(1) - 75);
            option = 4;
        }
        if (t.teclaPulsada(KeyEvent.VK_6) && this.numPartidasGuardadas >= 6) {
            s.moveTo(ejeX.get(2) - 200, ejeY.get(1) - 75);
            option = 5;
        }
        if (t.teclaPulsada(KeyEvent.VK_7) && this.numPartidasGuardadas >= 7) {
            s.moveTo(ejeX.get(0) - 200, ejeY.get(2) - 75);
            option = 6;
        }
        if (t.teclaPulsada(KeyEvent.VK_8) && this.numPartidasGuardadas >= 8) {
            s.moveTo(ejeX.get(1) - 200, ejeY.get(2) - 75);
            option = 7;
        }
        if (t.teclaPulsada(KeyEvent.VK_9) && this.numPartidasGuardadas >= 9) {
            s.moveTo(ejeX.get(2) - 200, ejeY.get(2) - 75);
            option = 8;
        }
    }

    public static int getOption() {
        return option;
    }
}
