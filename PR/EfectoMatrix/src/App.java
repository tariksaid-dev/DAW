import bpc.daw.consola.*;
import java.awt.*;
import java.awt.Color;
import java.io.*;

public class App {
    private static int w = Toolkit.getDefaultToolkit().getScreenSize().width;
    private static int h = Toolkit.getDefaultToolkit().getScreenSize().height;
    private static int columnas = (int) Math.floor(w / 20) + 1;
    private static int[] posicion_y = new int[columnas];
    private static Graphics2D g;

    private static void matrix() throws Exception {

        g.setColor(new Color(0, 0, 0, 15)); // aumentando el alfa reducimos la longitud de la columna
        g.fillRect(0, 0, w, h);
        g.setColor(new Color(0, 255, 0));

        for (int i = 0; i < columnas; i++) {
            String c = String.valueOf((char) (Math.random() * 64 + 32));
            int x = i * 20;
            g.drawString(c, x, posicion_y[i] * 20);

            // probabilidad de que se reinicia y con ello la cantidad de carácteres en la
            // parte superior de la pantalla, menos fiel al original
            // if (posicion_y[i] * 20 > 100 && Math.random() < 0.05) { // aumenta la

            // apenas se reinicia y fomenta las columnas largas y
            // estilizadas
            if (posicion_y[i] > 100 + Math.random() * 5000) {
                posicion_y[i] = 0;
            } else {
                posicion_y[i] = posicion_y[i] + 1;
            }
        }
    }

    public static void main(String[] args) throws Exception {
        Consola c = new Consola();
        CapaCanvas canvas = c.getCapaCanvas();
        g = canvas.getGraphics2D();
        g.setColor(new Color(0, 0, 0, 0));
        g.fillRect(0, 0, w, h);
        Font f = Font.createFont(Font.TRUETYPE_FONT, new File("fonts/matrix.ttf"));
        g.setFont(f.deriveFont(44f));
        while (true) {
            matrix();
            Thread.sleep(15);
        }
    }
}
