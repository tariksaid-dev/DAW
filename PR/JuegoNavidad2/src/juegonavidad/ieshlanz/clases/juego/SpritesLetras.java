package juegonavidad.ieshlanz.clases.juego;

import juegonavidad.ieshlanz.clases.matrix.*;
import javax.imageio.ImageIO;
import java.io.*;
import java.awt.*;
import bpc.daw.consola.*;

public class SpritesLetras {

    private Image imagen = ImageIO.read(new File("img/letrasGreen.png"));

    public SpritesLetras() throws IOException {
    }

    public Sprite generarLetraA(CapaSprites sprites) {
        return sprites.crearSprite(this.imagen, Letras.rectangulosLetras[0][0], 0, 0);
    }

    public Sprite generarLetraB(CapaSprites sprites) {
        return sprites.crearSprite(this.imagen, Letras.rectangulosLetras[0][1], 0, 0);
    }

    public Sprite generarLetraC(CapaSprites sprites) {
        return sprites.crearSprite(this.imagen, Letras.rectangulosLetras[0][2], 0, 0);
    }

    public Sprite generarLetraD(CapaSprites sprites) {
        return sprites.crearSprite(this.imagen, Letras.rectangulosLetras[0][3], 0, 0);
    }

    public Sprite generarLetraE(CapaSprites sprites) {
        return sprites.crearSprite(this.imagen, Letras.rectangulosLetras[0][4], 0, 0);
    }

    public Sprite generarLetraF(CapaSprites sprites) {
        return sprites.crearSprite(this.imagen, Letras.rectangulosLetras[0][5], 0, 0);
    }

    public Sprite generarLetraG(CapaSprites sprites) {
        return sprites.crearSprite(this.imagen, Letras.rectangulosLetras[0][6], 0, 0);
    }

    public Sprite generarLetraH(CapaSprites sprites) {
        return sprites.crearSprite(this.imagen, Letras.rectangulosLetras[0][7], 0, 0);
    }

    public Sprite generarLetraI(CapaSprites sprites) {
        return sprites.crearSprite(this.imagen, Letras.rectangulosLetras[1][0], 0, 0);
    }

    public Sprite generarLetraJ(CapaSprites sprites) {
        return sprites.crearSprite(this.imagen, Letras.rectangulosLetras[1][1], 0, 0);
    }

    public Sprite generarLetraK(CapaSprites sprites) {
        return sprites.crearSprite(this.imagen, Letras.rectangulosLetras[1][2], 0, 0);
    }

    public Sprite generarLetraL(CapaSprites sprites) {
        return sprites.crearSprite(this.imagen, Letras.rectangulosLetras[1][3], 0, 0);
    }

    public Sprite generarLetraM(CapaSprites sprites) {
        return sprites.crearSprite(this.imagen, Letras.rectangulosLetras[1][4], 0, 0);
    }

    public Sprite generarLetraN(CapaSprites sprites) {
        return sprites.crearSprite(this.imagen, Letras.rectangulosLetras[1][5], 0, 0);
    }

    public Sprite generarLetraO(CapaSprites sprites) {
        return sprites.crearSprite(this.imagen, Letras.rectangulosLetras[1][6], 0, 0);
    }

    public Sprite generarLetraP(CapaSprites sprites) {
        return sprites.crearSprite(this.imagen, Letras.rectangulosLetras[1][7], 0, 0);
    }

    public Sprite generarLetraQ(CapaSprites sprites) {
        return sprites.crearSprite(this.imagen, Letras.rectangulosLetras[2][0], 0, 0);
    }

    public Sprite generarLetraR(CapaSprites sprites) {
        return sprites.crearSprite(this.imagen, Letras.rectangulosLetras[2][1], 0, 0);
    }

    public Sprite generarLetraS(CapaSprites sprites) {
        return sprites.crearSprite(this.imagen, Letras.rectangulosLetras[2][2], 0, 0);
    }

    public Sprite generarLetraT(CapaSprites sprites) {
        return sprites.crearSprite(this.imagen, Letras.rectangulosLetras[2][3], 0, 0);
    }

    public Sprite generarLetraU(CapaSprites sprites) {
        return sprites.crearSprite(this.imagen, Letras.rectangulosLetras[2][4], 0, 0);
    }

    public Sprite generarLetraV(CapaSprites sprites) {
        return sprites.crearSprite(this.imagen, Letras.rectangulosLetras[2][5], 0, 0);
    }

    public Sprite generarLetraW(CapaSprites sprites) {
        return sprites.crearSprite(this.imagen, Letras.rectangulosLetras[2][6], 0, 0);
    }

    public Sprite generarLetraX(CapaSprites sprites) {
        return sprites.crearSprite(this.imagen, Letras.rectangulosLetras[2][7], 0, 0);
    }

    public Sprite generarLetraY(CapaSprites sprites) {
        return sprites.crearSprite(this.imagen, Letras.rectangulosLetras[3][0], 0, 0);
    }

    public Sprite generarLetraZ(CapaSprites sprites) {
        return sprites.crearSprite(this.imagen, Letras.rectangulosLetras[3][1], 0, 0);
    }
}
