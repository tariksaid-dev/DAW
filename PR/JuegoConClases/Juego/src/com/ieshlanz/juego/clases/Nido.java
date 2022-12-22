package com.ieshlanz.juego.clases;
import bpc.daw.consola.*;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;
import javax.imageio.ImageIO;
import java.util.*;
import java.io.*;
import java.awt.*;
import java.util.List;

public class Nido {
    private List<Murcielago> murcielagos;
    private int lineaTiempo;
    private int aleatorio;

    public Nido(){
        murcielagos = new ArrayList<>();
        this.lineaTiempo = 0;
        this.aleatorio = new Random().nextInt(500);
    }
    
    public void actuar(CapaSprites sprites, Image imagen) {
        for(Murcielago m : murcielagos) {
            m.actuar();
        }
        lineaTiempo++;
        if(lineaTiempo== aleatorio) {
            lineaTiempo = 0;
            aleatorio = new Random().nextInt(500);
            murcielagos.add(new Murcielago(sprites, imagen));
        }

    }
}
