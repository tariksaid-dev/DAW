package com.ieshlanz.juego.clases;
import java.awt.Graphics;
import java.util.List;
import java.awt.Image;
import java.awt.event.KeyEvent;
import javax.imageio.ImageIO;
import java.util.*;
import java.io.*;
import java.awt.*;
import bpc.daw.consola.*;

public class ActualizadorCamara {
    private PersonajePrincipal personaje;
    private Escenario escenario;

    public ActualizadorCamara(PersonajePrincipal p, Escenario e) {
        this.personaje = p;
        this.escenario = e;
    }

    public void actuar() {
        int xPersonaje = personaje.getX();
        int mitadPantalla = escenario.getMitadPantallaX();
        if(mitadPantalla -50 <= xPersonaje && xPersonaje <= mitadPantalla + 50) {
            if(escenario.moverCamara(4)) {
            personaje.moverX(-4);
            }
        }
    }
}
