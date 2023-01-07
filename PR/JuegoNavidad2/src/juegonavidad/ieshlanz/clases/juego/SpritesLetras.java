package juegonavidad.ieshlanz.clases.juego;

import juegonavidad.ieshlanz.clases.matrix.*;
import java.awt.*;
import bpc.daw.consola.*;
import java.util.*;

public class SpritesLetras {
    private static int width = Toolkit.getDefaultToolkit().getScreenSize().width;
    // private static Image imagen = ImageIO.read(new File("img/letrasGreen.png"));

    public static Sprite generarLetra_A(CapaSprites sprites, Image imagen, int ejeY) {
        return sprites.crearSprite(imagen, Letras.rectangulosLetras[0][0], ejeXAleatorio(), ejeYAleatorio(ejeY));
    }

    public static Sprite generarLetra_B(CapaSprites sprites, Image imagen, int ejeY) {
        return sprites.crearSprite(imagen, Letras.rectangulosLetras[0][1], ejeXAleatorio(), ejeYAleatorio(ejeY));
    }

    public static Sprite generarLetra_C(CapaSprites sprites, Image imagen, int ejeY) {
        return sprites.crearSprite(imagen, Letras.rectangulosLetras[0][2], ejeXAleatorio(), ejeYAleatorio(ejeY));
    }

    public static Sprite generarLetra_D(CapaSprites sprites, Image imagen, int ejeY) {
        return sprites.crearSprite(imagen, Letras.rectangulosLetras[0][3], ejeXAleatorio(), ejeYAleatorio(ejeY));
    }

    public static Sprite generarLetra_E(CapaSprites sprites, Image imagen, int ejeY) {
        return sprites.crearSprite(imagen, Letras.rectangulosLetras[0][4], ejeXAleatorio(), ejeYAleatorio(ejeY));
    }

    public static Sprite generarLetra_F(CapaSprites sprites, Image imagen, int ejeY) {
        return sprites.crearSprite(imagen, Letras.rectangulosLetras[0][5], ejeXAleatorio(), ejeYAleatorio(ejeY));
    }

    public static Sprite generarLetra_G(CapaSprites sprites, Image imagen, int ejeY) {
        return sprites.crearSprite(imagen, Letras.rectangulosLetras[0][6], ejeXAleatorio(), ejeYAleatorio(ejeY));
    }

    public static Sprite generarLetra_H(CapaSprites sprites, Image imagen, int ejeY) {
        return sprites.crearSprite(imagen, Letras.rectangulosLetras[0][7], ejeXAleatorio(), ejeYAleatorio(ejeY));
    }

    public static Sprite generarLetra_I(CapaSprites sprites, Image imagen, int ejeY) {
        return sprites.crearSprite(imagen, Letras.rectangulosLetras[1][0], ejeXAleatorio(), ejeYAleatorio(ejeY));
    }

    public static Sprite generarLetra_J(CapaSprites sprites, Image imagen, int ejeY) {
        return sprites.crearSprite(imagen, Letras.rectangulosLetras[1][1], ejeXAleatorio(), ejeYAleatorio(ejeY));
    }

    public static Sprite generarLetra_K(CapaSprites sprites, Image imagen, int ejeY) {
        return sprites.crearSprite(imagen, Letras.rectangulosLetras[1][2], ejeXAleatorio(), ejeYAleatorio(ejeY));
    }

    public static Sprite generarLetra_L(CapaSprites sprites, Image imagen, int ejeY) {
        return sprites.crearSprite(imagen, Letras.rectangulosLetras[1][3], ejeXAleatorio(), ejeYAleatorio(ejeY));
    }

    public static Sprite generarLetra_M(CapaSprites sprites, Image imagen, int ejeY) {
        return sprites.crearSprite(imagen, Letras.rectangulosLetras[1][4], ejeXAleatorio(), ejeYAleatorio(ejeY));
    }

    public static Sprite generarLetra_N(CapaSprites sprites, Image imagen, int ejeY) {
        return sprites.crearSprite(imagen, Letras.rectangulosLetras[1][5], ejeXAleatorio(), ejeYAleatorio(ejeY));
    }

    public static Sprite generarLetra_O(CapaSprites sprites, Image imagen, int ejeY) {
        return sprites.crearSprite(imagen, Letras.rectangulosLetras[1][6], ejeXAleatorio(), ejeYAleatorio(ejeY));
    }

    public static Sprite generarLetra_P(CapaSprites sprites, Image imagen, int ejeY) {
        return sprites.crearSprite(imagen, Letras.rectangulosLetras[1][7], ejeXAleatorio(), ejeYAleatorio(ejeY));
    }

    public static Sprite generarLetra_Q(CapaSprites sprites, Image imagen, int ejeY) {
        return sprites.crearSprite(imagen, Letras.rectangulosLetras[2][0], ejeXAleatorio(), ejeYAleatorio(ejeY));
    }

    public static Sprite generarLetra_R(CapaSprites sprites, Image imagen, int ejeY) {
        return sprites.crearSprite(imagen, Letras.rectangulosLetras[2][1], ejeXAleatorio(), ejeYAleatorio(ejeY));
    }

    public static Sprite generarLetra_S(CapaSprites sprites, Image imagen, int ejeY) {
        return sprites.crearSprite(imagen, Letras.rectangulosLetras[2][2], ejeXAleatorio(), ejeYAleatorio(ejeY));
    }

    public static Sprite generarLetra_T(CapaSprites sprites, Image imagen, int ejeY) {
        return sprites.crearSprite(imagen, Letras.rectangulosLetras[2][3], ejeXAleatorio(), ejeYAleatorio(ejeY));
    }

    public static Sprite generarLetra_U(CapaSprites sprites, Image imagen, int ejeY) {
        return sprites.crearSprite(imagen, Letras.rectangulosLetras[2][4], ejeXAleatorio(), ejeYAleatorio(ejeY));
    }

    public static Sprite generarLetra_V(CapaSprites sprites, Image imagen, int ejeY) {
        return sprites.crearSprite(imagen, Letras.rectangulosLetras[2][5], ejeXAleatorio(), ejeYAleatorio(ejeY));
    }

    public static Sprite generarLetra_W(CapaSprites sprites, Image imagen, int ejeY) {
        return sprites.crearSprite(imagen, Letras.rectangulosLetras[2][6], ejeXAleatorio(), ejeYAleatorio(ejeY));
    }

    public static Sprite generarLetra_X(CapaSprites sprites, Image imagen, int ejeY) {
        return sprites.crearSprite(imagen, Letras.rectangulosLetras[2][7], ejeXAleatorio(), ejeYAleatorio(ejeY));
    }

    public static Sprite generarLetra_Y(CapaSprites sprites, Image imagen, int ejeY) {
        return sprites.crearSprite(imagen, Letras.rectangulosLetras[3][0], ejeXAleatorio(), ejeYAleatorio(ejeY));
    }

    public static Sprite generarLetra_Z(CapaSprites sprites, Image imagen, int ejeY) {
        return sprites.crearSprite(imagen, Letras.rectangulosLetras[3][1], ejeXAleatorio(), ejeYAleatorio(ejeY));
    }

    public static Sprite generarLetra_a(CapaSprites sprites, Image imagen, int ejeY) {
        return sprites.crearSprite(imagen, Letras.rectangulosLetras[3][2], ejeXAleatorio(), ejeYAleatorio(ejeY));
    }

    public static Sprite generarLetra_b(CapaSprites sprites, Image imagen, int ejeY) {
        return sprites.crearSprite(imagen, Letras.rectangulosLetras[3][3], ejeXAleatorio(), ejeYAleatorio(ejeY));
    }

    public static Sprite generarLetra_c(CapaSprites sprites, Image imagen, int ejeY) {
        return sprites.crearSprite(imagen, Letras.rectangulosLetras[3][4], ejeXAleatorio(), ejeYAleatorio(ejeY));
    }

    public static Sprite generarLetra_d(CapaSprites sprites, Image imagen, int ejeY) {
        return sprites.crearSprite(imagen, Letras.rectangulosLetras[3][5], ejeXAleatorio(), ejeYAleatorio(ejeY));
    }

    public static Sprite generarLetra_e(CapaSprites sprites, Image imagen, int ejeY) {
        return sprites.crearSprite(imagen, Letras.rectangulosLetras[3][6], ejeXAleatorio(), ejeYAleatorio(ejeY));
    }

    public static Sprite generarLetra_f(CapaSprites sprites, Image imagen, int ejeY) {
        return sprites.crearSprite(imagen, Letras.rectangulosLetras[3][7], ejeXAleatorio(), ejeYAleatorio(ejeY));
    }

    public static Sprite generarLetra_g(CapaSprites sprites, Image imagen, int ejeY) {
        return sprites.crearSprite(imagen, Letras.rectangulosLetras[4][0], ejeXAleatorio(), ejeYAleatorio(ejeY));
    }

    public static Sprite generarLetra_h(CapaSprites sprites, Image imagen, int ejeY) {
        return sprites.crearSprite(imagen, Letras.rectangulosLetras[4][1], ejeXAleatorio(), ejeYAleatorio(ejeY));
    }

    public static Sprite generarLetra_i(CapaSprites sprites, Image imagen, int ejeY) {
        return sprites.crearSprite(imagen, Letras.rectangulosLetras[4][2], ejeXAleatorio(), ejeYAleatorio(ejeY));
    }

    public static Sprite generarLetra_j(CapaSprites sprites, Image imagen, int ejeY) {
        return sprites.crearSprite(imagen, Letras.rectangulosLetras[4][3], ejeXAleatorio(), ejeYAleatorio(ejeY));
    }

    public static Sprite generarLetra_k(CapaSprites sprites, Image imagen, int ejeY) {
        return sprites.crearSprite(imagen, Letras.rectangulosLetras[4][4], ejeXAleatorio(), ejeYAleatorio(ejeY));
    }

    public static Sprite generarLetra_l(CapaSprites sprites, Image imagen, int ejeY) {
        return sprites.crearSprite(imagen, Letras.rectangulosLetras[4][5], ejeXAleatorio(), ejeYAleatorio(ejeY));
    }

    public static Sprite generarLetra_m(CapaSprites sprites, Image imagen, int ejeY) {
        return sprites.crearSprite(imagen, Letras.rectangulosLetras[4][6], ejeXAleatorio(), ejeYAleatorio(ejeY));
    }

    public static Sprite generarLetra_n(CapaSprites sprites, Image imagen, int ejeY) {
        return sprites.crearSprite(imagen, Letras.rectangulosLetras[4][7], ejeXAleatorio(), ejeYAleatorio(ejeY));
    }

    public static Sprite generarLetra_o(CapaSprites sprites, Image imagen, int ejeY) {
        return sprites.crearSprite(imagen, Letras.rectangulosLetras[5][0], ejeXAleatorio(), ejeYAleatorio(ejeY));
    }

    public static Sprite generarLetra_p(CapaSprites sprites, Image imagen, int ejeY) {
        return sprites.crearSprite(imagen, Letras.rectangulosLetras[5][1], ejeXAleatorio(), ejeYAleatorio(ejeY));
    }

    public static Sprite generarLetra_q(CapaSprites sprites, Image imagen, int ejeY) {
        return sprites.crearSprite(imagen, Letras.rectangulosLetras[5][2], ejeXAleatorio(), ejeYAleatorio(ejeY));
    }

    public static Sprite generarLetra_r(CapaSprites sprites, Image imagen, int ejeY) {
        return sprites.crearSprite(imagen, Letras.rectangulosLetras[5][3], ejeXAleatorio(), ejeYAleatorio(ejeY));
    }

    public static Sprite generarLetra_s(CapaSprites sprites, Image imagen, int ejeY) {
        return sprites.crearSprite(imagen, Letras.rectangulosLetras[5][4], ejeXAleatorio(), ejeYAleatorio(ejeY));
    }

    public static Sprite generarLetra_t(CapaSprites sprites, Image imagen, int ejeY) {
        return sprites.crearSprite(imagen, Letras.rectangulosLetras[5][5], ejeXAleatorio(), ejeYAleatorio(ejeY));
    }

    public static Sprite generarLetra_u(CapaSprites sprites, Image imagen, int ejeY) {
        return sprites.crearSprite(imagen, Letras.rectangulosLetras[5][6], ejeXAleatorio(), ejeYAleatorio(ejeY));
    }

    public static Sprite generarLetra_v(CapaSprites sprites, Image imagen, int ejeY) {
        return sprites.crearSprite(imagen, Letras.rectangulosLetras[5][7], ejeXAleatorio(), ejeYAleatorio(ejeY));
    }

    public static Sprite generarLetra_w(CapaSprites sprites, Image imagen, int ejeY) {
        return sprites.crearSprite(imagen, Letras.rectangulosLetras[6][0], ejeXAleatorio(), ejeYAleatorio(ejeY));
    }

    public static Sprite generarLetra_x(CapaSprites sprites, Image imagen, int ejeY) {
        return sprites.crearSprite(imagen, Letras.rectangulosLetras[6][1], ejeXAleatorio(), ejeYAleatorio(ejeY));
    }

    public static Sprite generarLetra_y(CapaSprites sprites, Image imagen, int ejeY) {
        return sprites.crearSprite(imagen, Letras.rectangulosLetras[6][2], ejeXAleatorio(), ejeYAleatorio(ejeY));
    }

    public static Sprite generarLetra_z(CapaSprites sprites, Image imagen, int ejeY) {
        return sprites.crearSprite(imagen, Letras.rectangulosLetras[6][3], ejeXAleatorio(), ejeYAleatorio(ejeY));
    }

    public static Sprite generarLetra_0(CapaSprites sprites, Image imagen, int ejeY) {
        return sprites.crearSprite(imagen, Letras.rectangulosLetras[6][4], ejeXAleatorio(), ejeYAleatorio(ejeY));
    }

    public static Sprite generarLetra_1(CapaSprites sprites, Image imagen, int ejeY) {
        return sprites.crearSprite(imagen, Letras.rectangulosLetras[6][5], ejeXAleatorio(), ejeYAleatorio(ejeY));
    }

    public static Sprite generarLetra_2(CapaSprites sprites, Image imagen, int ejeY) {
        return sprites.crearSprite(imagen, Letras.rectangulosLetras[6][6], ejeXAleatorio(), ejeYAleatorio(ejeY));
    }

    public static Sprite generarLetra_3(CapaSprites sprites, Image imagen, int ejeY) {
        return sprites.crearSprite(imagen, Letras.rectangulosLetras[6][7], ejeXAleatorio(), ejeYAleatorio(ejeY));
    }

    public static Sprite generarLetra_4(CapaSprites sprites, Image imagen, int ejeY) {
        return sprites.crearSprite(imagen, Letras.rectangulosLetras[7][0], ejeXAleatorio(), ejeYAleatorio(ejeY));
    }

    public static Sprite generarLetra_5(CapaSprites sprites, Image imagen, int ejeY) {
        return sprites.crearSprite(imagen, Letras.rectangulosLetras[7][1], ejeXAleatorio(), ejeYAleatorio(ejeY));
    }

    public static Sprite generarLetra_6(CapaSprites sprites, Image imagen, int ejeY) {
        return sprites.crearSprite(imagen, Letras.rectangulosLetras[7][2], ejeXAleatorio(), ejeYAleatorio(ejeY));
    }

    public static Sprite generarLetra_7(CapaSprites sprites, Image imagen, int ejeY) {
        return sprites.crearSprite(imagen, Letras.rectangulosLetras[7][3], ejeXAleatorio(), ejeYAleatorio(ejeY));
    }

    public static Sprite generarLetra_8(CapaSprites sprites, Image imagen, int ejeY) {
        return sprites.crearSprite(imagen, Letras.rectangulosLetras[7][4], ejeXAleatorio(), ejeYAleatorio(ejeY));
    }

    public static Sprite generarLetra_9(CapaSprites sprites, Image imagen, int ejeY) {
        return sprites.crearSprite(imagen, Letras.rectangulosLetras[7][5], ejeXAleatorio(), ejeYAleatorio(ejeY));
    }

    public static Sprite generarLetra_punto(CapaSprites sprites, Image imagen, int ejeY) {
        return sprites.crearSprite(imagen, Letras.rectangulosLetras[7][6], ejeXAleatorio(), ejeYAleatorio(ejeY));
    }

    public static Sprite generarLetra_coma(CapaSprites sprites, Image imagen, int ejeY) {
        return sprites.crearSprite(imagen, Letras.rectangulosLetras[7][7], ejeXAleatorio(), ejeYAleatorio(ejeY));
    }

    public static Sprite generarLetra_puntoComa(CapaSprites sprites, Image imagen, int ejeY) {
        return sprites.crearSprite(imagen, Letras.rectangulosLetras[8][0], ejeXAleatorio(), ejeYAleatorio(ejeY));
    }

    public static Sprite generarLetra_dosPuntos(CapaSprites sprites, Image imagen, int ejeY) {
        return sprites.crearSprite(imagen, Letras.rectangulosLetras[8][1], ejeXAleatorio(), ejeYAleatorio(ejeY));
    }

    public static Sprite generarLetra_interrogacion(CapaSprites sprites, Image imagen, int ejeY) {
        return sprites.crearSprite(imagen, Letras.rectangulosLetras[8][2], ejeXAleatorio(), ejeYAleatorio(ejeY));
    }

    public static Sprite generarLetra_exclamacion(CapaSprites sprites, Image imagen, int ejeY) {
        return sprites.crearSprite(imagen, Letras.rectangulosLetras[8][3], ejeXAleatorio(), ejeYAleatorio(ejeY));
    }

    public static Sprite generarLetra_guion(CapaSprites sprites, Image imagen, int ejeY) {
        return sprites.crearSprite(imagen, Letras.rectangulosLetras[8][4], ejeXAleatorio(), ejeYAleatorio(ejeY));
    }

    public static Sprite generarLetra_guionBajo(CapaSprites sprites, Image imagen, int ejeY) {
        return sprites.crearSprite(imagen, Letras.rectangulosLetras[8][5], ejeXAleatorio(), ejeYAleatorio(ejeY));
    }

    public static Sprite generarLetra_virgulilla(CapaSprites sprites, Image imagen, int ejeY) {
        return sprites.crearSprite(imagen, Letras.rectangulosLetras[8][6], ejeXAleatorio(), ejeYAleatorio(ejeY));
    }

    public static Sprite generarLetra_hashtag(CapaSprites sprites, Image imagen, int ejeY) {
        return sprites.crearSprite(imagen, Letras.rectangulosLetras[8][7], ejeXAleatorio(), ejeYAleatorio(ejeY));
    }

    public static Sprite generarLetra_dobleComilla(CapaSprites sprites, Image imagen, int ejeY) {
        return sprites.crearSprite(imagen, Letras.rectangulosLetras[9][0], ejeXAleatorio(), ejeYAleatorio(ejeY));
    }

    public static Sprite generarLetra_comilla(CapaSprites sprites, Image imagen, int ejeY) {
        return sprites.crearSprite(imagen, Letras.rectangulosLetras[9][1], ejeXAleatorio(), ejeYAleatorio(ejeY));
    }

    public static Sprite generarLetra_and(CapaSprites sprites, Image imagen, int ejeY) {
        return sprites.crearSprite(imagen, Letras.rectangulosLetras[9][2], ejeXAleatorio(), ejeYAleatorio(ejeY));
    }

    public static Sprite generarLetra_abrirParentesis(CapaSprites sprites, Image imagen, int ejeY) {
        return sprites.crearSprite(imagen, Letras.rectangulosLetras[9][3], ejeXAleatorio(), ejeYAleatorio(ejeY));
    }

    public static Sprite generarLetra_cerrarParentesis(CapaSprites sprites, Image imagen, int ejeY) {
        return sprites.crearSprite(imagen, Letras.rectangulosLetras[9][4], ejeXAleatorio(), ejeYAleatorio(ejeY));
    }

    public static Sprite generarLetra_abrirCorchete(CapaSprites sprites, Image imagen, int ejeY) {
        return sprites.crearSprite(imagen, Letras.rectangulosLetras[9][5], ejeXAleatorio(), ejeYAleatorio(ejeY));
    }

    public static Sprite generarLetra_cerrarCorchete(CapaSprites sprites, Image imagen, int ejeY) {
        return sprites.crearSprite(imagen, Letras.rectangulosLetras[9][6], ejeXAleatorio(), ejeYAleatorio(ejeY));
    }

    public static Sprite generarLetra_separacion(CapaSprites sprites, Image imagen, int ejeY) {
        return sprites.crearSprite(imagen, Letras.rectangulosLetras[9][7], ejeXAleatorio(), ejeYAleatorio(ejeY));
    }

    public static Sprite generarLetra_acentoInvertido(CapaSprites sprites, Image imagen, int ejeY) {
        return sprites.crearSprite(imagen, Letras.rectangulosLetras[10][0], ejeXAleatorio(), ejeYAleatorio(ejeY));
    }

    public static Sprite generarLetra_backSlash(CapaSprites sprites, Image imagen, int ejeY) {
        return sprites.crearSprite(imagen, Letras.rectangulosLetras[10][1], ejeXAleatorio(), ejeYAleatorio(ejeY));
    }

    public static Sprite generarLetra_slash(CapaSprites sprites, Image imagen, int ejeY) {
        return sprites.crearSprite(imagen, Letras.rectangulosLetras[10][2], ejeXAleatorio(), ejeYAleatorio(ejeY));
    }

    public static Sprite generarLetra_arroba(CapaSprites sprites, Image imagen, int ejeY) {
        return sprites.crearSprite(imagen, Letras.rectangulosLetras[10][3], ejeXAleatorio(), ejeYAleatorio(ejeY));
    }

    public static Sprite generarLetra_º(CapaSprites sprites, Image imagen, int ejeY) {
        return sprites.crearSprite(imagen, Letras.rectangulosLetras[10][4], ejeXAleatorio(), ejeYAleatorio(ejeY));
    }

    public static Sprite generarLetra_mas(CapaSprites sprites, Image imagen, int ejeY) {
        return sprites.crearSprite(imagen, Letras.rectangulosLetras[10][5], ejeXAleatorio(), ejeYAleatorio(ejeY));
    }

    public static Sprite generarLetra_igual(CapaSprites sprites, Image imagen, int ejeY) {
        return sprites.crearSprite(imagen, Letras.rectangulosLetras[10][6], ejeXAleatorio(), ejeYAleatorio(ejeY));
    }

    public static Sprite generarLetra_asterisco(CapaSprites sprites, Image imagen, int ejeY) {
        return sprites.crearSprite(imagen, Letras.rectangulosLetras[10][7], ejeXAleatorio(), ejeYAleatorio(ejeY));
    }

    public static Sprite generarLetra_dolar(CapaSprites sprites, Image imagen, int ejeY) {
        return sprites.crearSprite(imagen, Letras.rectangulosLetras[11][0], ejeXAleatorio(), ejeYAleatorio(ejeY));
    }

    public static Sprite generarLetra_libra(CapaSprites sprites, Image imagen, int ejeY) {
        return sprites.crearSprite(imagen, Letras.rectangulosLetras[11][1], ejeXAleatorio(), ejeYAleatorio(ejeY));
    }

    public static Sprite generarLetra_euro(CapaSprites sprites, Image imagen, int ejeY) {
        return sprites.crearSprite(imagen, Letras.rectangulosLetras[11][2], ejeXAleatorio(), ejeYAleatorio(ejeY));
    }

    public static Sprite generarLetra_menorQue(CapaSprites sprites, Image imagen, int ejeY) {
        return sprites.crearSprite(imagen, Letras.rectangulosLetras[11][3], ejeXAleatorio(), ejeYAleatorio(ejeY));
    }

    public static Sprite generarLetra_mayorQue(CapaSprites sprites, Image imagen, int ejeY) {
        return sprites.crearSprite(imagen, Letras.rectangulosLetras[11][4], ejeXAleatorio(), ejeYAleatorio(ejeY));
    }

    public static Sprite generarLetra_porcentaje(CapaSprites sprites, Image imagen, int ejeY) {
        return sprites.crearSprite(imagen, Letras.rectangulosLetras[11][5], ejeXAleatorio(), ejeYAleatorio(ejeY));
    }

    private static int ejeXAleatorio() {
        return new Random().nextInt(10, width - 10);
    }

    private static int ejeYAleatorio(int ejeY) {
        return new Random().nextInt(ejeY, 0);
    }
}
