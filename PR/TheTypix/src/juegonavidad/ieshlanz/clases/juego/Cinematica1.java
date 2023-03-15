package juegonavidad.ieshlanz.clases.juego;

import bpc.daw.consola.*;
import java.awt.Image;
import javax.imageio.ImageIO;
import java.io.*;
import java.awt.*;

public class Cinematica1 {
    private static int width = Toolkit.getDefaultToolkit().getScreenSize().width;
    private static int height = Toolkit.getDefaultToolkit().getScreenSize().height;

    public static void primeraPantalla(Graphics g, String jugador) throws Exception {
        String texto1S = "Wake up, " + jugador + "....";
        String texto2S = "The Typix has you....";
        String texto3S = "Follow the white rabbit. ";
        String texto4S = "Knock, knock, " + jugador + "....";
        char[] texto1 = texto1S.toCharArray();
        char[] texto2 = texto2S.toCharArray();
        char[] texto3 = texto3S.toCharArray();
        char[] texto4 = texto4S.toCharArray();
        for (int i = 0; i < texto1.length; i++) {
            g.drawChars(texto1, 0, i, 200, 200);
            Thread.sleep(50);
        }
        Thread.sleep(1000);
        g.clearRect(0, 0, width, height);
        for (int i = 0; i < texto2.length; i++) {
            g.drawChars(texto2, 0, i, 200, 200);
            Thread.sleep(50);
        }
        Thread.sleep(1000);
        g.clearRect(0, 0, width, height);
        for (int i = 0; i < texto3.length; i++) {
            g.drawChars(texto3, 0, i, 200, 200);
            Thread.sleep(50);
        }
        Thread.sleep(1000);
        g.clearRect(0, 0, width, height);
        for (int i = 0; i < texto4.length; i++) {
            g.drawChars(texto4, 0, i, 200, 200);
            Thread.sleep(50);
        }
        Thread.sleep(3000);
    }

    public static void segundaPantalla(Graphics g, String jugador, CapaSprites sprites) throws Exception {
        int tiempoLetras = 20;
        Image fondo1 = ImageIO.read(new File("img/fondo1.png"));
        Sprite conejo = sprites.crearSprite(
                fondo1,
                new Rectangle(0, 0, fondo1.getWidth(null), height),
                0, 0);
        String texto1 = "Vaya, parece que ya has   despertado... ya te habrás dado cuenta, pero has esta-do viviendo en una matrix   de letras durante mucho      tiempo.";
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

        String texto2 = "Me temo que eres el elegi-do, solo tu puedes destruir este mundo y volver a la re-alidad. Pero para ello debe-rás de derrotar al Mecanó-grafo, que crea este mundo y escribe sus infinitas líneas de código.";
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

        String texto3 = "No te preocupes, yo te en- señaré a usar ese teclado que tienes para que puedas enfrentarte a él.";
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

        Sprite consejo = sprites.crearSprite(
                ImageIO.read(new File("img/consejo.png")),
                new Rectangle(0, 0, 590, 339),
                695, 270);
        g.drawString(
                "Pon tus índices en las letras F y J, y los otros en",
                450, 800);
        g.drawString("las adyacentes como se muestra en la imagen.", 450, 840);

        Thread.sleep(4000);
        g.clearRect(0, 0, width, height);

        g.drawString("La idea es uses cada dedo para pulsar la tecla correspondiente ", 200, 800);
        g.drawString("en cada momento para hacer desaparecer las letras de la pantalla. ", 180, 840);

        Thread.sleep(4000);

        sprites.eliminarSprite(consejo);
        g.clearRect(0, 0, width, height);

        /// final
        conejo = sprites.crearSprite(
                fondo1,
                new Rectangle(0, 0, fondo1.getWidth(null), height),
                0, 0);
        String texto4 = "Vamos a practicar un poco en los primeros niveles de la Typix. ";
        char[] texto4C = texto4.toCharArray();
        anchoActual = 0;
        anchuraMáxima = 672;
        x = 700;
        y = 350;
        for (char caracter : texto4C) {
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

        String texto5 = "Recuerda que puedes pul- sar la tecla 'ESC' durante la partida para volver a ver la ayuda. Suerte! ";
        char[] texto5C = texto5.toCharArray();
        anchoActual = 0;
        anchuraMáxima = 672;
        x = 700;
        y = 350;
        for (char caracter : texto5C) {
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
