package com.ieshlanz.juego.programa;
import java.awt.Graphics;
import java.util.List;
import java.awt.Image;
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
        Rectangle r = new Rectangle(21, 11, 83, 116);
        sprites.crearSprite(fotos.get("animacion.png"), r, 200, 200);


        t.leerCaracter();
    }
}
