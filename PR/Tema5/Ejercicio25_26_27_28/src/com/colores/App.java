package com.colores;

import bpc.daw.consola.*;
import java.awt.*;

public class App {
    public static void main(String... args) {
        Consola c = new Consola();
        Teclado t = c.getTeclado();
        CapaCanvas canvas = c.getCapaCanvas();
        Graphics2D g = canvas.getGraphics2D();

        // Circulo r = new Circulo(new Point(600, 600), 200, Color.red);
        // r.dibujar(g);
        // r.crearCuadradoIgualArea(new Point(800, 800)).dibujar(g);

        Rectangulo cuad = new Rectangulo(new Point(200, 200), new Point(600, 300),
                Color.green);
        // System.out.println(cuad.getLongitudAltura());
        // System.out.println(cuad.getLongitudBase());
        cuad.dibujar(g);

        System.out.println(cuad.getArea());
        System.out.println(cuad.crearCuadradoIgualArea(new Point(0, 0)).getArea());
        // Cuadrado cuadr = new Cuadrado(new Point(200, 200), 590, Color.RED);
        // cuadr.dibujar(g);

        Triangulo tr = new Triangulo(new Point(1200, 600), new Point(1100, 800), new Point(1300, 900));
        tr.dibujar(g);
        tr.crearCuadradoIgualArea(new Point(1300, 600)).dibujar(g);
        t.leerCaracter();
    }
}
