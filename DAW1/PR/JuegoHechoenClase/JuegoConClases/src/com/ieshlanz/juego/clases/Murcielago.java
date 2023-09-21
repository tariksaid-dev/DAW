package com.ieshlanz.juego.clases;
import bpc.daw.consola.*;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;
import javax.imageio.ImageIO;
import java.util.*;
import java.io.*;
import java.awt.*;
public class Murcielago {
    private static Rectangle[] rectangulos = {
        new Rectangle (29, 3, 118, 82),
        new Rectangle (164, 19, 149, 68), 
        new Rectangle( 356, 9, 114, 97)
    };

    private Sprite sprite;
    private int lineaTiempo;
    private int rectangulo;
    private int alturaInicial;
    private int amplitud;
    private int frecuencia;
    
    public Murcielago(CapaSprites sprite, Image imagen) {
        this.rectangulo = 0;
        lineaTiempo = 360;
        this.amplitud = new Random().nextInt(80, 200);
        this.frecuencia = new Random().nextInt(3, 15);
        int resX = Toolkit.getDefaultToolkit().getScreenSize().width-400;
        int resY = Toolkit.getDefaultToolkit().getScreenSize().height-200;
        int y = new Random().nextInt(resY);
        this.alturaInicial = new Random().nextInt(resY);
        this.sprite = sprite.crearSprite(imagen, rectangulos[0], resX, y);
    }

    public void actuar() {
        sprite.moverX(-5);
        int y = (int)(this.alturaInicial + this.amplitud * Math.sin(Math.toRadians(lineaTiempo)));
        lineaTiempo-=this.frecuencia;
        if(lineaTiempo<0) {
            lineaTiempo = 360;
        }
        sprite.setPosicion(this.sprite.getX(), y);
    }

    public Sprite getSprite() {
        return this.sprite;
    }


    
}
