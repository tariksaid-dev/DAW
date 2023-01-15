package juegonavidad.ieshlanz.clases.matrix;

import bpc.daw.consola.*;
import java.awt.Image;
import java.awt.event.KeyEvent;
import javax.imageio.ImageIO;
import java.util.*;
import java.util.List;
import java.io.*;
import java.awt.*;

public class Letras {

    public static Rectangle[][] rectangulosLetras = {
            {
                    new Rectangle(9, 11, 38, 51), // A
                    new Rectangle(69, 11, 38, 51), // B
                    new Rectangle(138, 11, 38, 51), // C
                    new Rectangle(202, 11, 38, 51), // D
                    new Rectangle(267, 11, 38, 51), // E
                    new Rectangle(332, 11, 38, 51), // F
                    new Rectangle(404, 11, 38, 51), // G
                    new Rectangle(467, 11, 38, 51), // H
            },
            {
                    new Rectangle(0, 95, 38, 51), // I
                    new Rectangle(69, 95, 38, 51), // J
                    new Rectangle(137, 95, 38, 51), // K
                    new Rectangle(200, 95, 38, 51), // L
                    new Rectangle(271, 95, 38, 51), // M
                    new Rectangle(335, 95, 38, 51), // N
                    new Rectangle(406, 95, 38, 51), // O
                    new Rectangle(465, 95, 38, 51), // P
            },
            {
                    new Rectangle(7, 179, 46, 63), // resized Q
                    new Rectangle(69, 179, 38, 51), // R
                    new Rectangle(138, 179, 38, 51), // S
                    new Rectangle(203, 179, 38, 51), // T
                    new Rectangle(269, 179, 38, 51), // U
                    new Rectangle(337, 179, 38, 51), // V
                    new Rectangle(407, 177, 46, 53), // resized W
                    new Rectangle(470, 179, 38, 51), // X
            },
            {
                    new Rectangle(7, 264, 38, 51), // Y
                    new Rectangle(71, 264, 38, 51), // Z
                    new Rectangle(136, 264, 38, 51), // a
                    new Rectangle(200, 264, 38, 51), // b
                    new Rectangle(267, 264, 38, 51), // c
                    new Rectangle(333, 264, 38, 51), // d
                    new Rectangle(400, 264, 38, 51), // e
                    new Rectangle(462, 264, 38, 51), // f

            },
            {
                    new Rectangle(6, 360, 38, 51), // g
                    new Rectangle(68, 348, 38, 51), // h
                    new Rectangle(125, 348, 38, 51), // i
                    new Rectangle(203, 349, 37, 62), // j
                    new Rectangle(265, 348, 38, 51), // k
                    new Rectangle(325, 348, 38, 51), // l
                    new Rectangle(401, 356, 49, 44), // m
                    new Rectangle(464, 355, 38, 44), // n
            },
            {
                    new Rectangle(3, 435, 38, 51), // o
                    new Rectangle(68, 444, 38, 51), // p
                    new Rectangle(138, 444, 44, 51), // q
                    new Rectangle(196, 435, 38, 51), // r
                    new Rectangle(268, 435, 38, 51), // s
                    new Rectangle(331, 435, 38, 51), // t
                    new Rectangle(400, 435, 38, 51), // u
                    new Rectangle(467, 435, 38, 51), // v
            },
            { // NUMEROS
                    new Rectangle(8, 518, 47, 51), // w
                    new Rectangle(70, 518, 38, 51), // x
                    new Rectangle(135, 528, 38, 51), // y
                    new Rectangle(201, 518, 38, 51), // z
                    new Rectangle(267, 515, 38, 51), // 0
                    new Rectangle(330, 515, 38, 51), // 1
                    new Rectangle(400, 515, 38, 51), // 2
                    new Rectangle(467, 515, 38, 51), // 3
            },
            {

                    new Rectangle(5, 602, 38, 51), // 4
                    new Rectangle(68, 602, 38, 51), // 5
                    new Rectangle(136, 602, 38, 51), // 6
                    new Rectangle(201, 602, 38, 51), // 7
                    new Rectangle(267, 602, 38, 51), // 8
                    new Rectangle(332, 602, 38, 51), // 9
                    new Rectangle(392, 602, 38, 51), // .
                    new Rectangle(455, 608, 38, 51), // ,
            },
            {
                    new Rectangle(0, 695, 28, 51), // ;
                    new Rectangle(66, 689, 28, 51), // :
                    new Rectangle(136, 685, 38, 51), // ?
                    new Rectangle(194, 685, 38, 51), // !
                    new Rectangle(263, 685, 38, 51), // -
                    new Rectangle(335, 694, 38, 51), // _
                    new Rectangle(401, 685, 38, 51), // ~
                    new Rectangle(467, 685, 38, 51), // #
            },
            {
                    new Rectangle(0, 772, 38, 51), // ""
                    new Rectangle(59, 772, 38, 51), // ''
                    new Rectangle(135, 772, 38, 51), // &
                    new Rectangle(197, 768, 38, 59), // (
                    new Rectangle(262, 768, 38, 59), // )
                    new Rectangle(328, 768, 38, 59), // [
                    new Rectangle(395, 768, 38, 59), // ]
                    new Rectangle(356, 768, 38, 59), // |

            },
            {
                    new Rectangle(6, 854, 38, 51), // ` (no se ve)
                    new Rectangle(64, 854, 38, 51), // \
                    new Rectangle(131, 854, 38, 51), // /
                    new Rectangle(203, 854, 44, 57), // @
                    new Rectangle(264, 854, 38, 51), // º
                    new Rectangle(334, 853, 38, 51), // +
                    new Rectangle(399, 853, 38, 51), // =
                    new Rectangle(466, 853, 38, 51), // *
            },
            {
                    new Rectangle(4, 939, 38, 51), // $
                    new Rectangle(68, 939, 38, 51), // ?? libra creo
                    new Rectangle(139, 939, 38, 51), // €
                    new Rectangle(200, 939, 38, 51), // <
                    new Rectangle(267, 939, 38, 51), // >
                    new Rectangle(337, 939, 38, 51), // %
            // tengo 2 espacios vacíos por si necesito {} o algo así
            }
    };
    private boolean done = false;
    private String nombre;
    private int filaLetra = 0;
    private int columnaLetra = 0;
    private Sprite sprite;
    private int PosicionY = 360;
    private List<Integer> posicionLetra = new ArrayList<>(List.of(785, 840, 900, 960, 1020, 1080, 1140));
    private List<Sprite> caracteres;
    private int posicionPuntero;

    public Letras(CapaSprites sprite, Image imagen) {
        this.done = false;
        this.nombre = "";
        this.posicionPuntero = 0;
        this.caracteres = new ArrayList<>();
    }

    public void actuar(Teclado t, Image imagen, CapaSprites sprite) throws Exception {
        System.out.println("posicion puntero: " + posicionPuntero);
        System.out.println(caracteres);
        if (t.teclaPulsada(KeyEvent.VK_BACK_SPACE)) {
            this.antiSolapamiento();

            if (this.posicionPuntero > 0) {
                this.borrarLetra(sprite);
                this.posicionPuntero--;
                this.nombre = this.nombre.substring(0, this.nombre.length() - 1);
            } else if (this.posicionPuntero == 0) {
                this.borrarLetra(sprite);
                this.nombre = "";
            } else if (this.posicionPuntero >= 7) {
                this.borrarLetra(sprite);
                this.posicionPuntero = 6;
            }

        }
        if (t.teclaPulsada(KeyEvent.VK_ENTER)) {
            this.antiSolapamiento();
            this.done = true;
        }
        if (t.teclaPulsada(KeyEvent.VK_A)) {
            this.antiSolapamiento();
            this.columnaLetra = 0;
            this.filaLetra = 0;
            if (this.caracteres.size() <= 7) {
                this.nuevaLetra(sprite);
            }
            if (this.nombre.length() < 7) {
                this.nombre += "A";
            }
        }
        if (t.teclaPulsada(KeyEvent.VK_B)) {
            this.antiSolapamiento();
            this.columnaLetra = 1;
            this.filaLetra = 0;
            if (this.caracteres.size() <= 7) {
                this.nuevaLetra(sprite);
            }
            if (this.nombre.length() < 7) {
                this.nombre += "B";
            }
        }
        if (t.teclaPulsada(KeyEvent.VK_C)) {
            this.antiSolapamiento();
            this.columnaLetra = 2;
            this.filaLetra = 0;
            if (this.caracteres.size() <= 7) {
                this.nuevaLetra(sprite);
            }
            if (this.nombre.length() < 7) {
                this.nombre += "C";
            }
        }
        if (t.teclaPulsada(KeyEvent.VK_D)) {
            this.antiSolapamiento();
            this.columnaLetra = 3;
            this.filaLetra = 0;
            if (this.caracteres.size() <= 7) {
                this.nuevaLetra(sprite);
            }
            if (this.nombre.length() < 7) {
                this.nombre += "D";
            }

        }
        if (t.teclaPulsada(KeyEvent.VK_E)) {
            this.antiSolapamiento();
            this.columnaLetra = 4;
            this.filaLetra = 0;
            if (this.caracteres.size() <= 7) {
                this.nuevaLetra(sprite);
            }
            if (this.nombre.length() < 7) {
                this.nombre += "E";
            }
        }
        if (t.teclaPulsada(KeyEvent.VK_F)) {
            this.antiSolapamiento();
            this.columnaLetra = 5;
            this.filaLetra = 0;
            if (this.caracteres.size() <= 7) {
                this.nuevaLetra(sprite);
            }
            if (this.nombre.length() < 7) {
                this.nombre += "F";
            }
        }
        if (t.teclaPulsada(KeyEvent.VK_G)) {
            this.antiSolapamiento();
            this.columnaLetra = 6;
            this.filaLetra = 0;
            if (this.caracteres.size() <= 7) {
                this.nuevaLetra(sprite);
            }
            if (this.nombre.length() < 7) {
                this.nombre += "G";
            }
        }
        if (t.teclaPulsada(KeyEvent.VK_H)) {
            this.antiSolapamiento();
            this.columnaLetra = 7;
            this.filaLetra = 0;
            if (this.caracteres.size() <= 7) {
                this.nuevaLetra(sprite);
            }
            if (this.nombre.length() < 7) {
                this.nombre += "H";
            }
        }
        if (t.teclaPulsada(KeyEvent.VK_I)) {
            this.antiSolapamiento();
            this.columnaLetra = 0;
            this.filaLetra = 1;
            if (this.caracteres.size() <= 7) {
                this.nuevaLetra(sprite);
            }
            if (this.nombre.length() < 7) {
                this.nombre += "I";
            }
        }
        if (t.teclaPulsada(KeyEvent.VK_J)) {
            this.antiSolapamiento();
            this.columnaLetra = 1;
            this.filaLetra = 1;
            if (this.caracteres.size() <= 7) {
                this.nuevaLetra(sprite);
            }
            if (this.nombre.length() < 7) {
                this.nombre += "J";
            }
        }
        if (t.teclaPulsada(KeyEvent.VK_K)) {
            this.antiSolapamiento();
            this.columnaLetra = 2;
            this.filaLetra = 1;
            if (this.caracteres.size() <= 7) {
                this.nuevaLetra(sprite);
            }
            if (this.nombre.length() < 7) {
                this.nombre += "K";
            }
        }
        if (t.teclaPulsada(KeyEvent.VK_L)) {
            this.antiSolapamiento();
            this.columnaLetra = 3;
            this.filaLetra = 1;
            if (this.caracteres.size() <= 7) {
                this.nuevaLetra(sprite);
            }
            if (this.nombre.length() < 7) {
                this.nombre += "L";
            }
        }
        if (t.teclaPulsada(KeyEvent.VK_M)) {
            this.antiSolapamiento();
            this.columnaLetra = 4;
            this.filaLetra = 1;
            if (this.caracteres.size() <= 7) {
                this.nuevaLetra(sprite);
            }
            if (this.nombre.length() < 7) {
                this.nombre += "M";
            }
        }
        if (t.teclaPulsada(KeyEvent.VK_N)) {
            this.antiSolapamiento();
            this.columnaLetra = 5;
            this.filaLetra = 1;
            if (this.caracteres.size() <= 7) {
                this.nuevaLetra(sprite);
            }
            if (this.nombre.length() < 7) {
                this.nombre += "N";
            }
        }
        if (t.teclaPulsada(KeyEvent.VK_O)) {
            this.antiSolapamiento();
            this.columnaLetra = 6;
            this.filaLetra = 1;
            if (this.caracteres.size() <= 7) {
                this.nuevaLetra(sprite);
            }
            if (this.nombre.length() < 7) {
                this.nombre += "O";
            }
        }
        if (t.teclaPulsada(KeyEvent.VK_P)) {
            this.antiSolapamiento();
            this.columnaLetra = 7;
            this.filaLetra = 1;
            if (this.caracteres.size() <= 7) {
                this.nuevaLetra(sprite);
            }
            if (this.nombre.length() < 7) {
                this.nombre += "P";
            }
        }
        if (t.teclaPulsada(KeyEvent.VK_Q)) {
            this.antiSolapamiento();
            this.columnaLetra = 0;
            this.filaLetra = 2;
            if (this.caracteres.size() <= 7) {
                this.nuevaLetra(sprite);
            }
            if (this.nombre.length() < 7) {
                this.nombre += "Q";
            }
        }
        if (t.teclaPulsada(KeyEvent.VK_R)) {
            this.antiSolapamiento();
            this.columnaLetra = 1;
            this.filaLetra = 2;
            if (this.caracteres.size() <= 7) {
                this.nuevaLetra(sprite);
            }
            if (this.nombre.length() < 7) {
                this.nombre += "R";
            }
        }
        if (t.teclaPulsada(KeyEvent.VK_S)) {
            this.antiSolapamiento();
            this.columnaLetra = 2;
            this.filaLetra = 2;
            if (this.caracteres.size() <= 7) {
                this.nuevaLetra(sprite);
            }
            if (this.nombre.length() < 7) {
                this.nombre += "S";
            }
        }
        if (t.teclaPulsada(KeyEvent.VK_T)) {
            this.antiSolapamiento();
            this.columnaLetra = 3;
            this.filaLetra = 2;
            if (this.caracteres.size() <= 7) {
                this.nuevaLetra(sprite);
            }
            if (this.nombre.length() < 7) {
                this.nombre += "T";
            }
        }
        if (t.teclaPulsada(KeyEvent.VK_U)) {
            this.antiSolapamiento();
            this.columnaLetra = 4;
            this.filaLetra = 2;
            if (this.caracteres.size() <= 7) {
                this.nuevaLetra(sprite);
            }
            if (this.nombre.length() < 7) {
                this.nombre += "U";
            }
        }
        if (t.teclaPulsada(KeyEvent.VK_V)) {
            this.antiSolapamiento();
            this.columnaLetra = 5;
            this.filaLetra = 2;
            if (this.caracteres.size() <= 7) {
                this.nuevaLetra(sprite);
            }
            if (this.nombre.length() < 7) {
                this.nombre += "V";
            }
        }
        if (t.teclaPulsada(KeyEvent.VK_W)) {
            this.antiSolapamiento();
            this.columnaLetra = 6;
            this.filaLetra = 2;
            if (this.caracteres.size() <= 7) {
                this.nuevaLetra(sprite);
            }
            if (this.nombre.length() < 7) {
                this.nombre += "W";
            }
        }
        if (t.teclaPulsada(KeyEvent.VK_X)) {
            this.antiSolapamiento();
            this.columnaLetra = 7;
            this.filaLetra = 2;
            if (this.caracteres.size() <= 7) {
                this.nuevaLetra(sprite);
            }
            if (this.nombre.length() < 7) {
                this.nombre += "X";
            }
        }
        if (t.teclaPulsada(KeyEvent.VK_Y)) {
            this.antiSolapamiento();
            this.columnaLetra = 0;
            this.filaLetra = 3;
            if (this.caracteres.size() <= 7) {
                this.nuevaLetra(sprite);
            }
            if (this.nombre.length() < 7) {
                this.nombre += "Y";
            }
        }
        if (t.teclaPulsada(KeyEvent.VK_Z)) {
            this.antiSolapamiento();
            this.columnaLetra = 1;
            this.filaLetra = 3;
            if (this.caracteres.size() <= 7) {
                this.nuevaLetra(sprite);
            }
            if (this.nombre.length() < 7) {
                this.nombre += "Z";
            }
        }
        if (t.teclaPulsada(KeyEvent.VK_1)) {
            this.antiSolapamiento();
            this.columnaLetra = 0;
            this.filaLetra = 4;
            if (this.caracteres.size() <= 7) {
                this.nuevaLetra(sprite);
            }
            if (this.nombre.length() < 7) {
                this.nombre += "1";
            }
        }
        if (t.teclaPulsada(KeyEvent.VK_2)) {
            this.antiSolapamiento();
            this.columnaLetra = 1;
            this.filaLetra = 4;
            if (this.caracteres.size() <= 7) {
                this.nuevaLetra(sprite);
            }
            if (this.nombre.length() < 7) {
                this.nombre += "2";
            }
        }
        if (t.teclaPulsada(KeyEvent.VK_3)) {
            this.antiSolapamiento();
            this.columnaLetra = 2;
            this.filaLetra = 4;
            if (this.caracteres.size() <= 7) {
                this.nuevaLetra(sprite);
            }
            if (this.nombre.length() < 7) {
                this.nombre += "3";
            }
        }
        if (t.teclaPulsada(KeyEvent.VK_4)) {
            this.antiSolapamiento();
            this.columnaLetra = 3;
            this.filaLetra = 4;
            if (this.caracteres.size() <= 7) {
                this.nuevaLetra(sprite);
            }
            if (this.nombre.length() < 7) {
                this.nombre += "4";
            }
        }
        if (t.teclaPulsada(KeyEvent.VK_5)) {
            this.antiSolapamiento();
            this.columnaLetra = 4;
            this.filaLetra = 4;
            if (this.caracteres.size() <= 7) {
                this.nuevaLetra(sprite);
            }
            if (this.nombre.length() < 7) {
                this.nombre += "5";
            }
        }
        if (t.teclaPulsada(KeyEvent.VK_6)) {
            this.antiSolapamiento();
            this.columnaLetra = 5;
            this.filaLetra = 4;
            if (this.caracteres.size() <= 7) {
                this.nuevaLetra(sprite);
            }
            if (this.nombre.length() < 7) {
                this.nombre += "6";
            }
        }
        if (t.teclaPulsada(KeyEvent.VK_7)) {
            this.antiSolapamiento();
            this.columnaLetra = 6;
            this.filaLetra = 4;
            if (this.caracteres.size() <= 7) {
                this.nuevaLetra(sprite);
            }
            if (this.nombre.length() < 7) {
                this.nombre += "7";
            }
        }
        if (t.teclaPulsada(KeyEvent.VK_8)) {
            this.antiSolapamiento();
            this.columnaLetra = 7;
            this.filaLetra = 4;
            if (this.caracteres.size() <= 7) {
                this.nuevaLetra(sprite);
            }
            if (this.nombre.length() < 7) {
                this.nombre += "8";
            }
        }
        if (t.teclaPulsada(KeyEvent.VK_9)) {
            this.antiSolapamiento();
            this.columnaLetra = 8;
            this.filaLetra = 4;
            if (this.caracteres.size() <= 7) {
                this.nuevaLetra(sprite);
            }
            if (this.nombre.length() < 7) {
                this.nombre += "9";
            }
        }
        if (t.teclaPulsada(KeyEvent.VK_0)) {
            this.antiSolapamiento();
            this.columnaLetra = 9;
            this.filaLetra = 4;
            if (this.caracteres.size() <= 7) {
                this.nuevaLetra(sprite);
            }
            if (this.nombre.length() < 7) {
                this.nombre += "0";
            }
        }
    }

    private void nuevaLetra(CapaSprites sprite) throws Exception {
        Image foto = ImageIO.read(new File("img/letrasGreen.png"));
        if (this.caracteres.size() < 7) {
            caracteres.add(
                    sprite.crearSprite(
                            foto,
                            rectangulosLetras[this.filaLetra][this.columnaLetra],
                            this.posicionLetra.get(this.posicionPuntero),
                            this.PosicionY));
        }
        this.posicionPuntero++;
        if (this.posicionPuntero >= 7) {
            this.posicionPuntero = 7;
        }
    }

    public boolean isDone() {
        return this.done;
    }

    public String getNombre() {
        return this.nombre;
    }

    public int getPosicionPuntero() {
        return this.posicionPuntero;
    }

    public void borrar(CapaSprites sprites) {
        sprites.eliminarSprite(this.sprite);
    }

    private void borrarLetra(CapaSprites sprites) {
        if (this.caracteres.size() > 0) {
            sprites.eliminarSprite(this.caracteres.get(this.posicionPuntero - 1));
            caracteres.remove(this.posicionPuntero - 1);
        }
    }

    public void borrarTodasLasLetras(CapaSprites sprites) {
        for (int i = 0; i < this.caracteres.size(); i++) {
            sprites.eliminarSprite(this.caracteres.get(i));
        }
    }

    private void antiSolapamiento() throws InterruptedException {
        Thread.sleep(200);
    }
}
