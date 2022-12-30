package juegonavidad.ieshlanz.clases.juego;

import juegonavidad.ieshlanz.clases.matrix.*;

import java.io.IOException;
import java.util.*;
import bpc.daw.consola.*;
import java.awt.Image;
import javax.imageio.ImageIO;
import java.io.*;
import java.awt.*;

public class MapasNiveles {

    private static int width = Toolkit.getDefaultToolkit().getScreenSize().width;
    private static int height = Toolkit.getDefaultToolkit().getScreenSize().height;
    private int vidas = 3;
    private static Map<Character, Sprite> spritesMap = new HashMap<>();

    public static void mapNivel1(CapaSprites sprites) throws IOException {
        Map<Character, Sprite> spritesMap = new HashMap<>();
        Image imagen = ImageIO.read(new File("img/letrasGreen.png"));
        spritesMap.put('a', sprites.crearSprite( // a
                imagen,
                Letras.rectangulosLetras[0][0],
                ejeXAleatorio(),
                ejeYAleatorio()));
        spritesMap.put('s', sprites.crearSprite( // s
                imagen,
                Letras.rectangulosLetras[2][2],
                ejeXAleatorio(),
                ejeYAleatorio()));
        spritesMap.put('d', sprites.crearSprite( // d
                imagen,
                Letras.rectangulosLetras[0][3],
                ejeXAleatorio(),
                ejeYAleatorio()));
        spritesMap.put('f', sprites.crearSprite( // f
                imagen,
                Letras.rectangulosLetras[0][5],
                ejeXAleatorio(),
                ejeYAleatorio()));
        spritesMap.put('g', sprites.crearSprite( // g
                imagen,
                Letras.rectangulosLetras[0][6],
                ejeXAleatorio(),
                ejeYAleatorio()));
        spritesMap.put('h', sprites.crearSprite( // h
                imagen,
                Letras.rectangulosLetras[0][7],
                ejeXAleatorio(),
                ejeYAleatorio()));
        spritesMap.put('j', sprites.crearSprite( // j
                imagen,
                Letras.rectangulosLetras[1][1],
                ejeXAleatorio(),
                ejeYAleatorio()));
        spritesMap.put('k', sprites.crearSprite( // k
                imagen,
                Letras.rectangulosLetras[1][2],
                ejeXAleatorio(),
                ejeYAleatorio()));
        spritesMap.put('l', sprites.crearSprite( // l
                imagen,
                Letras.rectangulosLetras[1][3],
                ejeXAleatorio(),
                ejeYAleatorio()));
    }

    public static void mapNivel2(CapaSprites sprites) throws IOException {
        Map<Character, Sprite> spritesMap = new HashMap<>();
        Image imagen = ImageIO.read(new File("img/letrasGreen.png"));
        spritesMap.put('a', sprites.crearSprite( // a
                imagen,
                Letras.rectangulosLetras[3][2],
                ejeXAleatorio(),
                ejeYAleatorio()));
        spritesMap.put('s', sprites.crearSprite( // s
                imagen,
                Letras.rectangulosLetras[5][4],
                ejeXAleatorio(),
                ejeYAleatorio()));
        spritesMap.put('d', sprites.crearSprite( // d
                imagen,
                Letras.rectangulosLetras[3][5],
                ejeXAleatorio(),
                ejeYAleatorio()));
        spritesMap.put('f', sprites.crearSprite( // f
                imagen,
                Letras.rectangulosLetras[3][7],
                ejeXAleatorio(),
                ejeYAleatorio()));
        spritesMap.put('g', sprites.crearSprite( // g
                imagen,
                Letras.rectangulosLetras[4][0],
                ejeXAleatorio(),
                ejeYAleatorio()));
        spritesMap.put('h', sprites.crearSprite( // h
                imagen,
                Letras.rectangulosLetras[4][1],
                ejeXAleatorio(),
                ejeYAleatorio()));
        spritesMap.put('j', sprites.crearSprite( // j
                imagen,
                Letras.rectangulosLetras[4][3],
                ejeXAleatorio(),
                ejeYAleatorio()));
        spritesMap.put('k', sprites.crearSprite( // k
                imagen,
                Letras.rectangulosLetras[4][4],
                ejeXAleatorio(),
                ejeYAleatorio()));
        spritesMap.put('l', sprites.crearSprite( // l
                imagen,
                Letras.rectangulosLetras[4][5],
                ejeXAleatorio(),
                ejeYAleatorio()));
        spritesMap.put('A', sprites.crearSprite( // A
                imagen,
                Letras.rectangulosLetras[0][0],
                ejeXAleatorio(),
                ejeYAleatorio()));
        spritesMap.put('S', sprites.crearSprite( // S
                imagen,
                Letras.rectangulosLetras[2][2],
                ejeXAleatorio(),
                ejeYAleatorio()));
        spritesMap.put('D', sprites.crearSprite( // D
                imagen,
                Letras.rectangulosLetras[0][3],
                ejeXAleatorio(),
                ejeYAleatorio()));
        spritesMap.put('F', sprites.crearSprite( // F
                imagen,
                Letras.rectangulosLetras[0][5],
                ejeXAleatorio(),
                ejeYAleatorio()));
        spritesMap.put('G', sprites.crearSprite( // G
                imagen,
                Letras.rectangulosLetras[0][6],
                ejeXAleatorio(),
                ejeYAleatorio()));
        spritesMap.put('H', sprites.crearSprite( // H
                imagen,
                Letras.rectangulosLetras[0][7],
                ejeXAleatorio(),
                ejeYAleatorio()));
        spritesMap.put('J', sprites.crearSprite( // J
                imagen,
                Letras.rectangulosLetras[1][1],
                ejeXAleatorio(),
                ejeYAleatorio()));
        spritesMap.put('K', sprites.crearSprite( // K
                imagen,
                Letras.rectangulosLetras[1][2],
                ejeXAleatorio(),
                ejeYAleatorio()));
        spritesMap.put('L', sprites.crearSprite( // L
                imagen,
                Letras.rectangulosLetras[1][3],
                ejeXAleatorio(),
                ejeYAleatorio()));
    }

    public static void mapNivel3(CapaSprites sprites) throws IOException {
        Map<Character, Sprite> spritesMap = new HashMap<>();
        Image imagen = ImageIO.read(new File("img/letrasGreen.png"));
        spritesMap.put('a', sprites.crearSprite( // a
                imagen,
                Letras.rectangulosLetras[3][2],
                ejeXAleatorio(),
                ejeYAleatorio()));
        spritesMap.put('s', sprites.crearSprite( // s
                imagen,
                Letras.rectangulosLetras[5][4],
                ejeXAleatorio(),
                ejeYAleatorio()));
        spritesMap.put('d', sprites.crearSprite( // d
                imagen,
                Letras.rectangulosLetras[3][5],
                ejeXAleatorio(),
                ejeYAleatorio()));
        spritesMap.put('f', sprites.crearSprite( // f
                imagen,
                Letras.rectangulosLetras[3][7],
                ejeXAleatorio(),
                ejeYAleatorio()));
        spritesMap.put('g', sprites.crearSprite( // g
                imagen,
                Letras.rectangulosLetras[4][0],
                ejeXAleatorio(),
                ejeYAleatorio()));
        spritesMap.put('h', sprites.crearSprite( // h
                imagen,
                Letras.rectangulosLetras[4][1],
                ejeXAleatorio(),
                ejeYAleatorio()));
        spritesMap.put('j', sprites.crearSprite( // j
                imagen,
                Letras.rectangulosLetras[4][3],
                ejeXAleatorio(),
                ejeYAleatorio()));
        spritesMap.put('k', sprites.crearSprite( // k
                imagen,
                Letras.rectangulosLetras[4][4],
                ejeXAleatorio(),
                ejeYAleatorio()));
        spritesMap.put('l', sprites.crearSprite( // l
                imagen,
                Letras.rectangulosLetras[4][5],
                ejeXAleatorio(),
                ejeYAleatorio()));
        spritesMap.put('A', sprites.crearSprite( // A
                imagen,
                Letras.rectangulosLetras[0][0],
                ejeXAleatorio(),
                ejeYAleatorio()));
        spritesMap.put('S', sprites.crearSprite( // S
                imagen,
                Letras.rectangulosLetras[2][2],
                ejeXAleatorio(),
                ejeYAleatorio()));
        spritesMap.put('D', sprites.crearSprite( // D
                imagen,
                Letras.rectangulosLetras[0][3],
                ejeXAleatorio(),
                ejeYAleatorio()));
        spritesMap.put('F', sprites.crearSprite( // F
                imagen,
                Letras.rectangulosLetras[0][5],
                ejeXAleatorio(),
                ejeYAleatorio()));
        spritesMap.put('G', sprites.crearSprite( // G
                imagen,
                Letras.rectangulosLetras[0][6],
                ejeXAleatorio(),
                ejeYAleatorio()));
        spritesMap.put('H', sprites.crearSprite( // H
                imagen,
                Letras.rectangulosLetras[0][7],
                ejeXAleatorio(),
                ejeYAleatorio()));
        spritesMap.put('J', sprites.crearSprite( // J
                imagen,
                Letras.rectangulosLetras[1][1],
                ejeXAleatorio(),
                ejeYAleatorio()));
        spritesMap.put('K', sprites.crearSprite( // K
                imagen,
                Letras.rectangulosLetras[1][2],
                ejeXAleatorio(),
                ejeYAleatorio()));
        spritesMap.put('L', sprites.crearSprite( // L
                imagen,
                Letras.rectangulosLetras[1][3],
                ejeXAleatorio(),
                ejeYAleatorio()));
        spritesMap.put('q', sprites.crearSprite( // q
                imagen,
                Letras.rectangulosLetras[5][0],
                ejeXAleatorio(),
                ejeYAleatorio()));
        spritesMap.put('w', sprites.crearSprite( // w
                imagen,
                Letras.rectangulosLetras[5][2],
                ejeXAleatorio(),
                ejeYAleatorio()));
        spritesMap.put('e', sprites.crearSprite( // e
                imagen,
                Letras.rectangulosLetras[3][1],
                ejeXAleatorio(),
                ejeYAleatorio()));
        spritesMap.put('r', sprites.crearSprite( // r
                imagen,
                Letras.rectangulosLetras[5][1],
                ejeXAleatorio(),
                ejeYAleatorio()));
        spritesMap.put('t', sprites.crearSprite( // t
                imagen,
                Letras.rectangulosLetras[5][3],
                ejeXAleatorio(),
                ejeYAleatorio()));
        spritesMap.put('y', sprites.crearSprite( // y
                imagen,
                Letras.rectangulosLetras[5][5],
                ejeXAleatorio(),
                ejeYAleatorio()));
        spritesMap.put('u', sprites.crearSprite( // u
                imagen,
                Letras.rectangulosLetras[5][6],
                ejeXAleatorio(),
                ejeYAleatorio()));
        spritesMap.put('i', sprites.crearSprite( // i
                imagen,
                Letras.rectangulosLetras[3][3],
                ejeXAleatorio(),
                ejeYAleatorio()));
        spritesMap.put('o', sprites.crearSprite( // o
                imagen,
                Letras.rectangulosLetras[5][7],
                ejeXAleatorio(),
                ejeYAleatorio()));
        spritesMap.put('p', sprites.crearSprite( // p
                imagen,
                Letras.rectangulosLetras[5][8],
                ejeXAleatorio(),
                ejeYAleatorio()));
        spritesMap.put('Q', sprites.crearSprite( // Q
                imagen,
                Letras.rectangulosLetras[4][0],
                ejeXAleatorio(),
                ejeYAleatorio()));
        spritesMap.put('W', sprites.crearSprite( // W
                imagen,
                Letras.rectangulosLetras[4][2],
                ejeXAleatorio(),
                ejeYAleatorio()));
        spritesMap.put('E', sprites.crearSprite( // E
                imagen,
                Letras.rectangulosLetras[2][1],
                ejeXAleatorio(),
                ejeYAleatorio()));
        spritesMap.put('R', sprites.crearSprite( // R
                imagen,
                Letras.rectangulosLetras[4][1],
                ejeXAleatorio(),
                ejeYAleatorio()));
        spritesMap.put('T', sprites.crearSprite( // T
                imagen,
                Letras.rectangulosLetras[4][3],
                ejeXAleatorio(),
                ejeYAleatorio()));
        spritesMap.put('Y', sprites.crearSprite( // Y
                imagen,
                Letras.rectangulosLetras[4][5],
                ejeXAleatorio(),
                ejeYAleatorio()));
        spritesMap.put('U', sprites.crearSprite( // U
                imagen,
                Letras.rectangulosLetras[4][6],
                ejeXAleatorio(),
                ejeYAleatorio()));
        spritesMap.put('I', sprites.crearSprite( // I
                imagen,
                Letras.rectangulosLetras[2][3],
                ejeXAleatorio(),
                ejeYAleatorio()));
        spritesMap.put('O', sprites.crearSprite( // O
                imagen,
                Letras.rectangulosLetras[4][7],
                ejeXAleatorio(),
                ejeYAleatorio()));
        spritesMap.put('P', sprites.crearSprite( // P
                imagen,
                Letras.rectangulosLetras[4][8],
                ejeXAleatorio(),
                ejeYAleatorio()));
    }

    private static int ejeXAleatorio() {
        return new Random().nextInt(10, width - 10);
    }

    private static int ejeYAleatorio() {
        return new Random().nextInt(-500, 0);
    }

    public int getVidas() {
        return vidas;
    }
}
