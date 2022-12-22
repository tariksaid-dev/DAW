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
    
    public Murcielago(CapaSprites sprite, Image imagen) {
        rectangulo = 0;
        lineaTiempo = 360;
        int resX = Toolkit.getDefaultToolkit().getScreenSize().width-400;
        int resY = Toolkit.getDefaultToolkit().getScreenSize().height-600;
        int y = new Random().nextInt(resY);
        this.sprite = sprite.crearSprite(imagen, rectangulos[0], resX, y);
    }

    public void actuar() {
        
    }


    
}
