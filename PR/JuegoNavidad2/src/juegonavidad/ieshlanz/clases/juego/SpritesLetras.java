package juegonavidad.ieshlanz.clases.juego;

import juegonavidad.ieshlanz.clases.matrix.*;
import javax.imageio.ImageIO;
import java.io.*;
import java.awt.*;
import bpc.daw.consola.*;
import java.util.*;

public class SpritesLetras {
    private static int width = Toolkit.getDefaultToolkit().getScreenSize().width;
    // private static Image imagen = ImageIO.read(new File("img/letrasGreen.png"));

    public static Sprite generarLetra_a(CapaSprites sprites, Image imagen) {
        return sprites.crearSprite(imagen, Letras.rectangulosLetras[3][2], ejeXAleatorio(), ejeYAleatorio());
    }

    public static Sprite generarLetra_b(CapaSprites sprites, Image imagen) {
        return sprites.crearSprite(imagen, Letras.rectangulosLetras[3][3], ejeXAleatorio(), ejeYAleatorio());
    }

    public static Sprite generarLetra_c(CapaSprites sprites, Image imagen) {
        return sprites.crearSprite(imagen, Letras.rectangulosLetras[3][4], ejeXAleatorio(), ejeYAleatorio());
    }

    public static Sprite generarLetra_d(CapaSprites sprites, Image imagen) {
        return sprites.crearSprite(imagen, Letras.rectangulosLetras[3][5], ejeXAleatorio(), ejeYAleatorio());
    }

    public static Sprite generarLetra_e(CapaSprites sprites, Image imagen) {
        return sprites.crearSprite(imagen, Letras.rectangulosLetras[3][6], ejeXAleatorio(), ejeYAleatorio());
    }

    public static Sprite generarLetra_f(CapaSprites sprites, Image imagen) {
        return sprites.crearSprite(imagen, Letras.rectangulosLetras[3][7], ejeXAleatorio(), ejeYAleatorio());
    }

    public static Sprite generarLetra_g(CapaSprites sprites, Image imagen) {
        return sprites.crearSprite(imagen, Letras.rectangulosLetras[4][0], ejeXAleatorio(), ejeYAleatorio());
    }

    public static Sprite generarLetra_h(CapaSprites sprites, Image imagen) {
        return sprites.crearSprite(imagen, Letras.rectangulosLetras[4][1], ejeXAleatorio(), ejeYAleatorio());
    }

    public static Sprite generarLetra_i(CapaSprites sprites, Image imagen) {
        return sprites.crearSprite(imagen, Letras.rectangulosLetras[4][2], ejeXAleatorio(), ejeYAleatorio());
    }

    public static Sprite generarLetra_j(CapaSprites sprites, Image imagen) {
        return sprites.crearSprite(imagen, Letras.rectangulosLetras[4][3], ejeXAleatorio(), ejeYAleatorio());
    }

    public static Sprite generarLetra_k(CapaSprites sprites, Image imagen) {
        return sprites.crearSprite(imagen, Letras.rectangulosLetras[4][4], ejeXAleatorio(), ejeYAleatorio());
    }

    public static Sprite generarLetra_l(CapaSprites sprites, Image imagen) {
        return sprites.crearSprite(imagen, Letras.rectangulosLetras[4][5], ejeXAleatorio(), ejeYAleatorio());
    }

    public static Sprite generarLetra_m(CapaSprites sprites, Image imagen) {
        return sprites.crearSprite(imagen, Letras.rectangulosLetras[4][6], ejeXAleatorio(), ejeYAleatorio());
    }

    public static Sprite generarLetra_n(CapaSprites sprites, Image imagen) {
        return sprites.crearSprite(imagen, Letras.rectangulosLetras[4][7], ejeXAleatorio(), ejeYAleatorio());
    }

    public static Sprite generarLetra_o(CapaSprites sprites, Image imagen) {
        return sprites.crearSprite(imagen, Letras.rectangulosLetras[5][0], ejeXAleatorio(), ejeYAleatorio());
    }

    public static Sprite generarLetra_p(CapaSprites sprites, Image imagen) {
        return sprites.crearSprite(imagen, Letras.rectangulosLetras[5][1], ejeXAleatorio(), ejeYAleatorio());
    }

    public static Sprite generarLetra_q(CapaSprites sprites, Image imagen) {
        return sprites.crearSprite(imagen, Letras.rectangulosLetras[5][2], ejeXAleatorio(), ejeYAleatorio());
    }

    public static Sprite generarLetra_r(CapaSprites sprites, Image imagen) {
        return sprites.crearSprite(imagen, Letras.rectangulosLetras[5][3], ejeXAleatorio(), ejeYAleatorio());
    }

    public static Sprite generarLetra_s(CapaSprites sprites, Image imagen) {
        return sprites.crearSprite(imagen, Letras.rectangulosLetras[5][4], ejeXAleatorio(), ejeYAleatorio());
    }

    public static Sprite generarLetra_t(CapaSprites sprites, Image imagen) {
        return sprites.crearSprite(imagen, Letras.rectangulosLetras[5][5], ejeXAleatorio(), ejeYAleatorio());
    }

    public static Sprite generarLetra_u(CapaSprites sprites, Image imagen) {
        return sprites.crearSprite(imagen, Letras.rectangulosLetras[5][6], ejeXAleatorio(), ejeYAleatorio());
    }

    public static Sprite generarLetra_v(CapaSprites sprites, Image imagen) {
        return sprites.crearSprite(imagen, Letras.rectangulosLetras[5][7], ejeXAleatorio(), ejeYAleatorio());
    }

    public static Sprite generarLetra_w(CapaSprites sprites, Image imagen) {
        return sprites.crearSprite(imagen, Letras.rectangulosLetras[6][0], ejeXAleatorio(), ejeYAleatorio());
    }

    public static Sprite generarLetra_x(CapaSprites sprites, Image imagen) {
        return sprites.crearSprite(imagen, Letras.rectangulosLetras[6][1], ejeXAleatorio(), ejeYAleatorio());
    }

    public static Sprite generarLetra_y(CapaSprites sprites, Image imagen) {
        return sprites.crearSprite(imagen, Letras.rectangulosLetras[6][2], ejeXAleatorio(), ejeYAleatorio());
    }

    public static Sprite generarLetra_z(CapaSprites sprites, Image imagen) {
        return sprites.crearSprite(imagen, Letras.rectangulosLetras[6][3], ejeXAleatorio(), ejeYAleatorio());
    }

    public static Sprite generarLetra_0(CapaSprites sprites, Image imagen) {
        return sprites.crearSprite(imagen, Letras.rectangulosLetras[6][4], ejeXAleatorio(), ejeYAleatorio());
    }

    public static Sprite generarLetra_1(CapaSprites sprites, Image imagen) {
        return sprites.crearSprite(imagen, Letras.rectangulosLetras[6][5], ejeXAleatorio(), ejeYAleatorio());
    }

    public static Sprite generarLetra_2(CapaSprites sprites, Image imagen) {
        return sprites.crearSprite(imagen, Letras.rectangulosLetras[6][6], ejeXAleatorio(), ejeYAleatorio());
    }

    public static Sprite generarLetra_3(CapaSprites sprites, Image imagen) {
        return sprites.crearSprite(imagen, Letras.rectangulosLetras[6][7], ejeXAleatorio(), ejeYAleatorio());
    }

    public static Sprite generarLetra_4(CapaSprites sprites, Image imagen) {
        return sprites.crearSprite(imagen, Letras.rectangulosLetras[7][0], ejeXAleatorio(), ejeYAleatorio());
    }

    public static Sprite generarLetra_5(CapaSprites sprites, Image imagen) {
        return sprites.crearSprite(imagen, Letras.rectangulosLetras[7][1], ejeXAleatorio(), ejeYAleatorio());
    }

    public static Sprite generarLetra_6(CapaSprites sprites, Image imagen) {
        return sprites.crearSprite(imagen, Letras.rectangulosLetras[7][2], ejeXAleatorio(), ejeYAleatorio());
    }

    public static Sprite generarLetra_7(CapaSprites sprites, Image imagen) {
        return sprites.crearSprite(imagen, Letras.rectangulosLetras[7][3], ejeXAleatorio(), ejeYAleatorio());
    }

    public static Sprite generarLetra_8(CapaSprites sprites, Image imagen) {
        return sprites.crearSprite(imagen, Letras.rectangulosLetras[7][4], ejeXAleatorio(), ejeYAleatorio());
    }

    public static Sprite generarLetra_9(CapaSprites sprites, Image imagen) {
        return sprites.crearSprite(imagen, Letras.rectangulosLetras[7][5], ejeXAleatorio(), ejeYAleatorio());
    }

    public static Sprite generarLetra_punto(CapaSprites sprites, Image imagen) {
        return sprites.crearSprite(imagen, Letras.rectangulosLetras[7][6], ejeXAleatorio(), ejeYAleatorio());
    }

    public static Sprite generarLetra_coma(CapaSprites sprites, Image imagen) {
        return sprites.crearSprite(imagen, Letras.rectangulosLetras[7][7], ejeXAleatorio(), ejeYAleatorio());
    }

    public static Sprite generarLetra_puntoComa(CapaSprites sprites, Image imagen) {
        return sprites.crearSprite(imagen, Letras.rectangulosLetras[8][0], ejeXAleatorio(), ejeYAleatorio());
    }

    public static Sprite generarLetra_dosPuntos(CapaSprites sprites, Image imagen) {
        return sprites.crearSprite(imagen, Letras.rectangulosLetras[8][1], ejeXAleatorio(), ejeYAleatorio());
    }

    public static Sprite generarLetra_interrogación(CapaSprites sprites, Image imagen) {
        return sprites.crearSprite(imagen, Letras.rectangulosLetras[8][2], ejeXAleatorio(), ejeYAleatorio());
    }

    public static Sprite generarLetra_exclamación(CapaSprites sprites, Image imagen) {
        return sprites.crearSprite(imagen, Letras.rectangulosLetras[8][3], ejeXAleatorio(), ejeYAleatorio());
    }

    public static Sprite generarLetra_guion(CapaSprites sprites, Image imagen) {
        return sprites.crearSprite(imagen, Letras.rectangulosLetras[8][4], ejeXAleatorio(), ejeYAleatorio());
    }

    public static Sprite generarLetra_guionBajo(CapaSprites sprites, Image imagen) {
        return sprites.crearSprite(imagen, Letras.rectangulosLetras[8][5], ejeXAleatorio(), ejeYAleatorio());
    }

    public static Sprite generarLetra_virgulilla(CapaSprites sprites, Image imagen) {
        return sprites.crearSprite(imagen, Letras.rectangulosLetras[8][6], ejeXAleatorio(), ejeYAleatorio());
    }

    public static Sprite generarLetra_hashtag(CapaSprites sprites, Image imagen) {
        return sprites.crearSprite(imagen, Letras.rectangulosLetras[8][7], ejeXAleatorio(), ejeYAleatorio());
    }

    public static Sprite generarLetra_doblesComillas(CapaSprites sprites, Image imagen) {
        return sprites.crearSprite(imagen, Letras.rectangulosLetras[9][0], ejeXAleatorio(), ejeYAleatorio());
    }

    public static Sprite generarLetra_comillas(CapaSprites sprites, Image imagen) {
        return sprites.crearSprite(imagen, Letras.rectangulosLetras[9][1], ejeXAleatorio(), ejeYAleatorio());
    }

    public static Sprite generarLetra_AND(CapaSprites sprites, Image imagen) {
        return sprites.crearSprite(imagen, Letras.rectangulosLetras[9][2], ejeXAleatorio(), ejeYAleatorio());
    }

    public static Sprite generarLetra_abreParentesis(CapaSprites sprites, Image imagen) {
        return sprites.crearSprite(imagen, Letras.rectangulosLetras[9][3], ejeXAleatorio(), ejeYAleatorio());
    }

    public static Sprite generarLetra_cierraParentesis(CapaSprites sprites, Image imagen) {
        return sprites.crearSprite(imagen, Letras.rectangulosLetras[9][4], ejeXAleatorio(), ejeYAleatorio());
    }

    public static Sprite generarLetra_abreCorchete(CapaSprites sprites, Image imagen) {
        return sprites.crearSprite(imagen, Letras.rectangulosLetras[9][5], ejeXAleatorio(), ejeYAleatorio());
    }

    public static Sprite generarLetra_cierraCorchete(CapaSprites sprites, Image imagen) {
        return sprites.crearSprite(imagen, Letras.rectangulosLetras[9][6], ejeXAleatorio(), ejeYAleatorio());
    }

    public static Sprite generarLetra_separador(CapaSprites sprites, Image imagen) {
        return sprites.crearSprite(imagen, Letras.rectangulosLetras[9][7], ejeXAleatorio(), ejeYAleatorio());
    }

    public static Sprite generarLetra_acentoRevés(CapaSprites sprites, Image imagen) {
        return sprites.crearSprite(imagen, Letras.rectangulosLetras[10][0], ejeXAleatorio(), ejeYAleatorio());
    }

    public static Sprite generarLetra_backSlash(CapaSprites sprites, Image imagen) {
        return sprites.crearSprite(imagen, Letras.rectangulosLetras[10][1], ejeXAleatorio(), ejeYAleatorio());
    }

    public static Sprite generarLetra_slash(CapaSprites sprites, Image imagen) {
        return sprites.crearSprite(imagen, Letras.rectangulosLetras[10][2], ejeXAleatorio(), ejeYAleatorio());
    }

    public static Sprite generarLetra_arroba(CapaSprites sprites, Image imagen) {
        return sprites.crearSprite(imagen, Letras.rectangulosLetras[10][3], ejeXAleatorio(), ejeYAleatorio());
    }

    public static Sprite generarLetra_º(CapaSprites sprites, Image imagen) {
        return sprites.crearSprite(imagen, Letras.rectangulosLetras[10][4], ejeXAleatorio(), ejeYAleatorio());
    }

    public static Sprite generarLetra_mas(CapaSprites sprites, Image imagen) {
        return sprites.crearSprite(imagen, Letras.rectangulosLetras[10][5], ejeXAleatorio(), ejeYAleatorio());
    }

    public static Sprite generarLetra_igual(CapaSprites sprites, Image imagen) {
        return sprites.crearSprite(imagen, Letras.rectangulosLetras[10][6], ejeXAleatorio(), ejeYAleatorio());
    }

    public static Sprite generarLetra_asterisco(CapaSprites sprites, Image imagen) {
        return sprites.crearSprite(imagen, Letras.rectangulosLetras[10][7], ejeXAleatorio(), ejeYAleatorio());
    }

    public static Sprite generarLetra_dolar(CapaSprites sprites, Image imagen) {
        return sprites.crearSprite(imagen, Letras.rectangulosLetras[11][0], ejeXAleatorio(), ejeYAleatorio());
    }

    public static Sprite generarLetra_libra(CapaSprites sprites, Image imagen) {
        return sprites.crearSprite(imagen, Letras.rectangulosLetras[11][1], ejeXAleatorio(), ejeYAleatorio());
    }

    public static Sprite generarLetra_euro(CapaSprites sprites, Image imagen) {
        return sprites.crearSprite(imagen, Letras.rectangulosLetras[11][2], ejeXAleatorio(), ejeYAleatorio());
    }

    public static Sprite generarLetra_menorQue(CapaSprites sprites, Image imagen) {
        return sprites.crearSprite(imagen, Letras.rectangulosLetras[11][3], ejeXAleatorio(), ejeYAleatorio());
    }

    public static Sprite generarLetra_mayorQue(CapaSprites sprites, Image imagen) {
        return sprites.crearSprite(imagen, Letras.rectangulosLetras[11][4], ejeXAleatorio(), ejeYAleatorio());
    }

    public static Sprite generarLetra_porcentaje(CapaSprites sprites, Image imagen) {
        return sprites.crearSprite(imagen, Letras.rectangulosLetras[11][5], ejeXAleatorio(), ejeYAleatorio());
    }

    private static int ejeXAleatorio() {
        return new Random().nextInt(10, width - 10);
    }

    private static int ejeYAleatorio() {
        return new Random().nextInt(-500, 0);
    }
}
