package com.ieshlanz.juego.programa;
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

        // Cargamos los sprites
        

        Rectangle [][] rectangulosPersonajePrincipal = {
            {
                new Rectangle (21, 11, 83, 116),
                new Rectangle (123, 12, 95, 126),
                new Rectangle (215, 2, 116, 118), 
                new Rectangle (331, 10, 102, 123), 
                new Rectangle (451, 13, 83, 110), 
                new Rectangle (551, 12, 91, 123), 
                new Rectangle (641, 10, 114, 129),
                new Rectangle (776, 5, 98, 121)
            }, 
            {
                new Rectangle (2, 148, 99, 115),
                new Rectangle (101, 151, 114, 112),
                new Rectangle (222, 152, 94, 121),
                new Rectangle (325, 145, 93, 122),
                new Rectangle (433, 152, 94, 105),
                new Rectangle (540, 153, 109, 101),
                new Rectangle (645, 159, 103, 131),
                new Rectangle (763, 115, 82, 112)
            }
        };

        // Fila y columna del rectángulo del frame del personaje principal 
        int filaPersonajePrincipal = 0;
        int columnaPersonajePrincipal = 0;
        
        
        Sprite player = sprites.crearSprite(
            fotos.get("animacion.png"),
            rectangulosPersonajePrincipal[filaPersonajePrincipal][columnaPersonajePrincipal],
            150, 
            900
        );
        
        
        boolean repetir = true; 
        // Game loop
        while (repetir) {
            
            if(t.teclaPulsada(KeyEvent.VK_ESCAPE)) {
                repetir = false;
            }
            // movemos el muñeco con W A S D
            if(t.teclaPulsada(KeyEvent.VK_W)) {
                player.moverY(-4);
            }
            if(t.teclaPulsada(KeyEvent.VK_S)) {
                player.moverY(4);
            }
            if(t.teclaPulsada(KeyEvent.VK_A)) {
                player.moverX(-4);
            }
            if(t.teclaPulsada(KeyEvent.VK_D)) {
                player.moverX(4);
            }
            
            // Con esto el while va a 60FPS
            c.esperarSiguienteFrame();
        }


        // t.leerCaracter();
    }
}
