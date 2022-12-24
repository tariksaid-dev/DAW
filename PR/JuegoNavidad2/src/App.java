import java.util.*;
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
    public static void main(String[] args)  {
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


        try {
            Thread hilo1 = new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        r.dibujar(g, ct);
                    } catch (Exception e) {
                        System.out.println(e);
                    }
                }
            });
            Thread hilo2 = new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        r.dibujar(g, ct);
                    } catch (Exception e) {
                        System.out.println(e);
                    }
                }
            });
            hilo1.start();
            hilo2.start();
            t.leerCaracter();
        }   
        catch (Exception e) {
            System.out.println(e);
        }
    }

        

    
}
