package juegonavidad.ieshlanz.clases.juego;

import juegonavidad.ieshlanz.clases.matrix.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.*;
import bpc.daw.consola.*;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;
import javax.imageio.ImageIO;
import java.util.*;
import java.util.List;
import java.io.*;
import java.awt.*;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.Random;

public class SpritesCustom {
    private Sprite sprite;
    private char letra;

    public SpritesCustom(CapaSprites sprites, char letra) throws IOException {
        SpritesLetras spritesLetras = new SpritesLetras();
        this.letra = letra;
        this.sprite = spritesLetras.generarLetraA(sprites);
    }

}