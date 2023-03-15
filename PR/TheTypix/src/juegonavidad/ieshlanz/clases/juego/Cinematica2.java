package juegonavidad.ieshlanz.clases.juego;

import bpc.daw.consola.*;
import java.awt.Image;
import javax.imageio.ImageIO;
import java.io.*;
import java.awt.*;

public class Cinematica2 {
    private static int width = Toolkit.getDefaultToolkit().getScreenSize().width;
    private static int height = Toolkit.getDefaultToolkit().getScreenSize().height;

    public static void primeraPantalla(Graphics g, String jugador, CapaSprites sprites) throws Exception {
        int tiempoLetras = 20;
        Image fondo1 = ImageIO.read(new File("img/fondo1.png"));
        Sprite conejo = sprites.crearSprite(
                fondo1,
                new Rectangle(0, 0, fondo1.getWidth(null), height),
                0, 0);
        String texto1 = "Bien hecho! Eso ha sido fá-cil, no? Vamos a ver si eres capaz de superar la siguiente prueba. Esta vez irás      con todas las letras.";
        char[] texto1C = texto1.toCharArray();
        FontMetrics fm = g.getFontMetrics();
        int anchoActual = 0;
        int anchuraMáxima = 672;
        int x = 700;
        int y = 350;
        for (char caracter : texto1C) {
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

        String texto2 = "Recuerda que puedes pul- sar la tecla 'ESC' durante la partida para volver a ver la ayuda. ";
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
