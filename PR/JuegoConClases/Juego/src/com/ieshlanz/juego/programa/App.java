package com.ieshlanz.juego.programa;
import com.ieshlanz.juego.clases.*;
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
        Consola c = new Consola();
        CapaTexto ct = c.getCapaTexto();
        CapaCanvas canvas = c.getCapaCanvas();
        CapaSprites sprites = c.getCapaSprites();
        Graphics g = canvas.getGraphics();
        Teclado t = c.getTeclado();

        // Guardo la asociación nombre foto -> foto cargada
        Map<String, Image> fotos = new HashMap<>();

        // Cargamos las fotos
        List<String> nombreFotos=List.of(
            "animacion.png", "bat.png", "esqueleto.png", "fondo1.jpg", "fondo2.jpg",
            "fondo3.jpg", "monstruo.png", "skull.png", "skull2.png"
        );

        int contador = 0;
        for (String i: nombreFotos) {
            ct.cls();
            int porcentaje = (contador * 100) / nombreFotos.size();
            ct.println("Cargando... " +i + " " + porcentaje + "%");
            InputStream datos = ClassLoader.getSystemResourceAsStream("com/ieshlanz/juego/recursos/" + i);
            try {
                Image fotoCargada = ImageIO.read(datos);
                fotos.put(i, fotoCargada);
            } catch (IOException e) {
                ct.println("Error al cargar el archivo " + i);
                ct.println("Motivo" + e.getMessage());
            }
            contador ++;
        }
        ct.cls();


        PersonajePrincipal player = new PersonajePrincipal(sprites, fotos);
        Escenario e = new Escenario(fotos.get("fondo1.jpg"));
        ActualizadorCamara ac = new ActualizadorCamara(player, e);
        Nido m = new Nido();
        
        // Game loop
        boolean repetir = true;
        while (repetir) {
            if(t.teclaPulsada(KeyEvent.VK_ESCAPE)) {
                repetir = false;
            }
            player.actuar(g, t);
            ac.actuar();
            e.actuar(g, t);
            m.actuar(sprites, fotos.get("bat.png"));

            // Con esto el while va a 60FPS
            c.esperarSiguienteFrame();
        }


        // t.leerCaracter();
    }
}
