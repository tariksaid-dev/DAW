package juegonavidad.ieshlanz.clases.juego;

import bpc.daw.consola.*;
import java.awt.Image;
import javax.imageio.ImageIO;
import java.io.*;
import java.awt.*;

public class Cinematica4 {
    private static int width = Toolkit.getDefaultToolkit().getScreenSize().width;
    private static int height = Toolkit.getDefaultToolkit().getScreenSize().height;

    public static void primeraPantalla(Graphics g, String jugador, CapaSprites sprites) throws Exception {
        int tiempoLetras = 20;
        Image fondo1 = ImageIO.read(new File("img/fondo1.png"));
        Sprite conejo = sprites.crearSprite(
                fondo1,
                new Rectangle(0, 0, fondo1.getWidth(null), height),
                0, 0);
        String texto1 = "INCREÍBLE! No sabía que fu-eras tan rápido. Ya solo nos queda un último paso y estar-ás listo para enfrentarte al Mecanógrofo. Vamos a añadir los números, así que no te confíes.";
        char[] texto1C = texto1.toCharArray();
        FontMetrics fm = g.getFontMetrics();
        int anchoActual = 0;
        int anchuraMáxima = 700;
        int x = 670;
        int y = 350;
        for (char caracter : texto1C) {
            int anchoCaracter = fm.charWidth(caracter);
            if (anchoActual + anchoCaracter > anchuraMáxima) {
                x = 670;
                y += 50;
                anchoActual = 0;
            } else {
                anchoActual += anchoCaracter;
            }

            g.drawChars(new char[] { caracter }, 0, 1, x, y);
            x += fm.charWidth(caracter);
            Thread.sleep(tiempoLetras);
        }

        Thread.sleep(4000);

        g.clearRect(0, 0, width, height);

        String texto2 = "Recuerda, puedes mirar la guía adjunta en cualquier momento, donde te enseño como colocar los dedos y    que tecla debes pulsar. ";
        char[] texto2C = texto2.toCharArray();
        anchoActual = 0;
        anchuraMáxima = 672;
        x = 700;
        y = 350;
        for (char caracter : texto2C) {
            int anchoCaracter = fm.charWidth(caracter);
            if (anchoActual + anchoCaracter > anchuraMáxima) {
                x = 700;
                y += 50;
                anchoActual = 0;
            } else {
                anchoActual += anchoCaracter;
            }

            g.drawChars(new char[] { caracter }, 0, 1, x, y);
            x += fm.charWidth(caracter);
            Thread.sleep(tiempoLetras);
        }

        Thread.sleep(4000);

        g.clearRect(0, 0, width, height);

        String texto3 = "Buena suerte " + jugador + "!";
        char[] texto3C = texto3.toCharArray();
        anchoActual = 0;
        anchuraMáxima = 672;
        x = 700;
        y = 350;
        for (char caracter : texto3C) {
            int anchoCaracter = fm.charWidth(caracter);
            if (anchoActual + anchoCaracter > anchuraMáxima) {
                x = 700;
                y += 50;
                anchoActual = 0;
            } else {
                anchoActual += anchoCaracter;
            }

            g.drawChars(new char[] { caracter }, 0, 1, x, y);
            x += fm.charWidth(caracter);
            Thread.sleep(tiempoLetras);
        }
        Thread.sleep(4000);

        g.clearRect(0, 0, width, height);
        sprites.eliminarSprite(conejo);
    }
}
