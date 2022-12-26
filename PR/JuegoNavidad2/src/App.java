import juegonavidad.ieshlanz.clases.matrix.*;

import java.util.List;
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
        Title the = null;
        Title matrix = null;
        PressAnyButton pab = null;

        Thread hilo = new Thread() {
            public synchronized void run() {
                try {
                    r.dibujar(g, ct);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        hilo.start();

        try {
            Image foto = ImageIO.read(new File("img/title.png"));
            the = new Title(sprites, foto, 0, ct);
            matrix = new Title(sprites, foto, 1, ct);
            while (the.getX() < Toolkit.getDefaultToolkit().getScreenSize().width / 2 - 100 || matrix.getX() > Toolkit.getDefaultToolkit().getScreenSize().width/2 - 300) {
                the.actuarThe();
                matrix.actuarMatrix();
                Thread.sleep(15);
            }
            Image foto2 = ImageIO.read(new File("img/paraContinuar.png"));
            pab = new PressAnyButton(sprites, foto2.getScaledInstance(700, 100, Image.SCALE_FAST));
            

            boolean seguir = false; 
            if(t.leerCaracter() == (KeyEvent.VK_ENTER)) {
                Thread.sleep(150);
                c.esperarSiguienteFrame();
                seguir = true;
                System.out.println("traza2");
                pab.borrar(sprites);
                the.borrar(sprites);
                matrix.borrar(sprites);
            };

            Image foto3 = ImageIO.read(new File("img/mainMenu.png"));
            Image foto4 = ImageIO.read(new File("img/selector.png"));
            MainMenu mm = new MainMenu(sprites, foto3);
            Selector s = new Selector(sprites, foto4);
            while (seguir) {
                mm.actuar(t, sprites, s);

                c.esperarSiguienteFrame();

                if(mm.getState() == false) {
                    mm.borrar(sprites);
                    s.borrar(sprites);
                    seguir = false;
                }
            }
            Thread.sleep(200);
            System.out.println("traza4");
            Image foto5 = ImageIO.read(new File("img/introduceNombre.png"));
            NuevoJuego nj = new NuevoJuego(sprites, foto5);

            Image foto6 = ImageIO.read(new File("img/letrasGreen.png"));
            Letras l = new Letras(sprites, foto6);

            while (l.isDone()== false) {
                Thread.sleep(130);
                c.esperarSiguienteFrame();
                l.actuar(t, foto6, sprites);
                System.out.println(l.getNombre());
                System.out.println(l.getPosicionPuntero());
                }
            System.out.println("traza5 postDone");
            if (l.isDone() == true) {
                l.borrar(sprites);
                nj.borrar(sprites);
            }

            Image foto7 = ImageIO.read(new File("img/dificultades.png"));
            ElegirDificultad ed = new ElegirDificultad(sprites, foto7);
            Selector s2 = new Selector(sprites, foto4);
            while (ed.isDone() == false) {
                Thread.sleep(130);
                c.esperarSiguienteFrame();
                ed.actuar(t, sprites, s2);
            }
            if (ed.isDone() == true) {
                ed.borrar(sprites);
                s2.borrar(sprites);
            }
            System.out.println(sprites.getNumeroSprites() + "numero sprites" );
            sprites.setVisible(false);




            hilo.stop();


        } catch (Exception e) {
            e.printStackTrace();
        }
        CapaFondo fondo = c.getCapaFondo();
        FondoColorSolido f = new FondoColorSolido(Color.BLACK);
        fondo.setFondo(f);
        g.clearRect(0, 0, (int)Toolkit.getDefaultToolkit().getScreenSize().getWidth(), (int)Toolkit.getDefaultToolkit().getScreenSize().getHeight());
        






        t.leerCaracter();
        












        
    }
}
