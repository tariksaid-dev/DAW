package com.ieshlanz.juego.clases;
import bpc.daw.consola.*;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;
import javax.imageio.ImageIO;
import java.util.*;
import java.io.*;
import java.awt.*;

public class Escenario {
    private Image imagen;
    private int resX;
    private int resY;
    private int camaraX;


    public Escenario(Image i) {
        this.imagen = i;
        resX = Toolkit.getDefaultToolkit().getScreenSize().width;
        resY = Toolkit.getDefaultToolkit().getScreenSize().height;
        camaraX = 0;
    }

    public void actuar(Graphics g, Teclado t) {
        g.drawImage(imagen, 0, 0, resX, resY, camaraX, 0, camaraX + resX, resY, null);
    }

    public boolean moverCamara(int px) {
        boolean r = false;
        if(camaraX + resX < imagen.getWidth(null)) {
            camaraX += px;
            r= true;
        }
        return r;
    }

    public int getMitadPantallaX() {
        return resX / 2;
    }
}
