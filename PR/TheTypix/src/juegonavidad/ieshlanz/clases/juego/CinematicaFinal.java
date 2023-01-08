package juegonavidad.ieshlanz.clases.juego;

import bpc.daw.consola.*;
import java.awt.Image;
import javax.imageio.ImageIO;
import java.io.*;
import java.awt.*;

public class CinematicaFinal {
    private static int width = Toolkit.getDefaultToolkit().getScreenSize().width;
    private static int height = Toolkit.getDefaultToolkit().getScreenSize().height;

    public static void primeraPantalla(Graphics g, String jugador, CapaSprites sprites) throws Exception {
        int tiempoLetras = 20;
        Image fondo1 = ImageIO.read(new File("img/fondo1_conejo.png"));
        Image fondo2 = ImageIO.read(new File("img/fondo1_villain.png"));
        Sprite mecanografo = sprites.crearSprite(
                fondo2,
                new Rectangle(0, 0, fondo2.getWidth(null), height),
                0, 0);
        String texto1 = "Nooo! Maltida seas, " + jugador + "!";
        char[] texto1C = texto1.toCharArray();
        FontMetrics fm = g.getFontMetrics();
        int anchoActual = 0;
        int anchuraMáxima = 680;
        int x = 690;
        int y = 350;
        for (char caracter : texto1C) {
            int anchoCaracter = fm.charWidth(caracter);
            if (anchoActual + anchoCaracter > anchuraMáxima) {
                x = 690;
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
        sprites.eliminarSprite(mecanografo);

        Sprite conejo = sprites.crearSprite(
                fondo1,
                new Rectangle(0, 0, fondo1.getWidth(null), height),
                0, 0);

        String texto2 = "Maravilloso, " + jugador
                + ", has de-rrotado al Mecanógrafo y la humanidad puede volver a la realidad. ¡Enhorabuena!";
        char[] texto2C = texto2.toCharArray();
        anchoActual = 0;
        anchuraMáxima = 680;
        x = 690;
        y = 350;
        for (char caracter : texto2C) {
            int anchoCaracter = fm.charWidth(caracter);
            if (anchoActual + anchoCaracter > anchuraMáxima) {
                x = 690;
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
