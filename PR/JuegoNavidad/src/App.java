import juegonavidad.ieshlanz.clases.*;

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
        Consola c = new Consola();
        Teclado t = c.getTeclado();
        CapaTexto ct = c.getCapaTexto();
        CapaCanvas canvas = c.getCapaCanvas();
        CapaSprites sprites = c.getCapaSprites();
        Graphics g = canvas.getGraphics();

        // Map de img
        Map<String, Image> img = new HashMap<String, Image>();

        // Cargar imagenes
        List<String> imagenes = List.of(
            "hero/gothic-hero-idle.png", "hero/gothic-hero-run.png", "hero/gothic-hero-attack.png", "hero/gothic-hero-jump.png", "background/gothic-castle-preview.png"
        );

        for(String i : imagenes) {
            InputStream datos = ClassLoader.getSystemResourceAsStream("juegonavidad/ieshlanz/recursos/" + i);
            try {
                Image fotoCargada = ImageIO.read(datos);
                img.put(i, fotoCargada); 
            } catch (IOException e) {
                System.out.println("Error al cargar la imagen " + i);
            }
        }

        // Objetos
        Escenario e = new Escenario(img.get("background/gothic-castle-preview.png"));
        PersonajePrincipal player = new PersonajePrincipal(sprites, img);
        ActualizadorCamara ac = new ActualizadorCamara(player, e);

        // Game loop 
        boolean gameOn = true;
        while(gameOn) {
            // Limpiar canvas
            canvas.cls();
            if(t.teclaPulsada(KeyEvent.VK_ESCAPE)) {
                gameOn = false;
            }
            player.actuar(g, t);
            ac.actuar();
            e.actuar(g, t);
            // 60 FPS
            c.esperarSiguienteFrame();
        }

        ct.println("GAME OVER");
        // t.leerCadenaCaracteres();
    }
}
