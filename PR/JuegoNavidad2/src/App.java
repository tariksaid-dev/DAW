import juegonavidad.ieshlanz.clases.matrix.*;

import java.awt.Graphics;
import java.util.List;
import java.awt.Image;
import java.awt.event.KeyEvent;
import javax.imageio.ImageIO;
import java.util.*;
import java.io.*;
import java.awt.*;
import bpc.daw.consola.*;

public class App {
    public static void main(String[] args) {
        Consola c = new Consola(
            "Typix",
            Toolkit.getDefaultToolkit().getScreenSize().width,
            Toolkit.getDefaultToolkit().getScreenSize().height
            );
        Teclado t = c.getTeclado();
        CapaTexto ct = c.getCapaTexto();
        CapaCanvas canvas = c.getCapaCanvas();
        CapaSprites sprites = c.getCapaSprites();
        Graphics g = canvas.getGraphics();
        Rain r = new Rain();



        new Thread() {
            public synchronized void run() {
                try {
                    r.dibujar(g, ct);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }.start();

        try {
            Image foto = ImageIO.read(new File("img/title.png"));
            Title the = new Title(sprites, foto, 0);
            Title matrix = new Title(sprites, foto, 1);
            for (int i = 0; i < 1000; i++) {
                the.actuarThe();
                matrix.actuarMatrix();
                Thread.sleep(15);
            }

        } catch (Exception e) {
            // TODO: handle exception
        }





















        t.leerCaracter();




    }
}
