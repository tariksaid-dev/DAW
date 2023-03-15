package juegonavidad.ieshlanz.clases.juego;

import java.awt.Image;
import java.awt.*;

public class FadeIn {
    private static Graphics2D g2d;
    private static float alpha;
    private static Image imagen;
    private static AlphaComposite ac;

    public static void efectoFadein(Graphics g, Image img, int x, int y, int velocidadFade) throws Exception {
        g2d = (Graphics2D) g;
        alpha = 0.0f;
        imagen = img;
        for (int i = 0; i < 100; i++) {
            alpha += 0.01f;
            ac = AlphaComposite.getInstance(AlphaComposite.SRC_OVER, alpha);
            g2d.setComposite(ac);
            g2d.drawImage(imagen, x, y, null);
            Thread.sleep(velocidadFade);
        }
    }

    public static void efectoFadeout(Graphics g, Image img, int x, int y, int velocidadFade) throws Exception {
        g2d = (Graphics2D) g;
        alpha = 1.0f;
        imagen = img;
        for (int i = 0; i < 100; i++) {
            alpha -= 0.01f;
            ac = AlphaComposite.getInstance(AlphaComposite.SRC_OVER, alpha);
            g2d.setComposite(ac);
            g2d.drawImage(imagen, x, y, null);
            Thread.sleep(velocidadFade);
        }
    }
}
