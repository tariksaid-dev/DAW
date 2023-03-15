package juegonavidad.ieshlanz.clases.matrix;

import java.awt.*;
import java.io.*;

public class EfectoMatrix {
    private static int width = Toolkit.getDefaultToolkit().getScreenSize().width;
    private static int height = Toolkit.getDefaultToolkit().getScreenSize().height;
    private static int columnas = (int) Math.floor(width / 20) + 1;
    private static int[] posicion_y = new int[columnas];

    public static void matrix(Graphics g) throws Exception {
        g.setColor(new Color(0, 0, 0));
        g.fillRect(0, 0, width, height);
        Font f = Font.createFont(Font.TRUETYPE_FONT, new File("fonts/matrix.ttf"));
        g.setFont(f.deriveFont(44f));

        while (true) {
            Thread.sleep(30);

            g.setColor(new Color(0, 0, 0, 15));
            g.fillRect(0, 0, width, height);
            g.setColor(new Color(0, 255, 0));

            for (int i = 0; i < columnas; i++) {
                String c = String.valueOf((char) (Math.random() * 64 + 32));
                int x = i * 20;
                g.drawString(c, x, posicion_y[i] * 20);
                if (posicion_y[i] > 100 + Math.random() * 5000) {
                    posicion_y[i] = 0;
                } else {
                    posicion_y[i] = posicion_y[i] + 1;
                }
            }
        }
    }
}
