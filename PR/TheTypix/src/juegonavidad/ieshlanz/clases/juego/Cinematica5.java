package juegonavidad.ieshlanz.clases.juego;

import bpc.daw.consola.*;
import java.awt.Image;
import javax.imageio.ImageIO;
import java.io.*;
import java.awt.*;

public class Cinematica5 {
    private static int width = Toolkit.getDefaultToolkit().getScreenSize().width;
    private static int height = Toolkit.getDefaultToolkit().getScreenSize().height;

    public static void primeraPantalla(Graphics g, String jugador, CapaSprites sprites) throws Exception {
        int tiempoLetras = 20;
        Image fondo1 = ImageIO.read(new File("img/fondo1_conejo.png"));
        Sprite conejo = sprites.crearSprite(
                fondo1,
                new Rectangle(0, 0, fondo1.getWidth(null), height),
                0, 0);
        String texto1 = "Fantástico! No esperaba   que te resultara tan sencillo Está bien, ha llegado el   momento de luchar contra el Mecanógrafo...";
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
        sprites.eliminarSprite(conejo);

        Image fondo2 = ImageIO.read(new File("img/fondo1_villain.png"));
        Sprite mecanogrofo = sprites.crearSprite(
                fondo2,
                new Rectangle(0, 0, fondo2.getWidth(null), height),
                0, 0);

        String texto2 = "Vaya, así que tu eres el el-egido, ¿eh? Podrías haberte quedado tranquilo en la ma-trix que hice para ti, pero   no, tenías que intentar destruirlo todo. ";
        char[] texto2C = texto2.toCharArray();
        anchoActual = 0;
        anchuraMáxima = 690;
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

        String texto3 = "Ahora te enfrentarás a mi, el Mecanógrafo, el dios de la escritura. ¡Prepárate para morir!";
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
        sprites.eliminarSprite(mecanogrofo);
    }
}
