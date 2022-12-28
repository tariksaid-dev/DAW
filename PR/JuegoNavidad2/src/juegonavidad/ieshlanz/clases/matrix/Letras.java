package juegonavidad.ieshlanz.clases.matrix;
import bpc.daw.consola.*;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;
import javax.imageio.ImageIO;
import java.util.*;
import java.util.List;
import java.io.*;
import java.awt.*;
public class Letras {

    private static Rectangle[][] rectangulosLetras = {
        {
            new Rectangle (9, 11, 38, 51),
            new Rectangle (69, 11, 38, 51),
            new Rectangle (138, 11, 38, 51),
            new Rectangle(202, 11, 38, 51),
            new Rectangle(267, 11, 38, 51),
            new Rectangle(332, 11, 38, 51),
            new Rectangle(404, 11, 38, 51),
            new Rectangle (467, 11, 38, 51),
        }, 
        {
            new Rectangle (0, 95, 38, 51),
            new Rectangle (69, 95, 38, 51),
            new Rectangle (137, 95, 38, 51),
            new Rectangle (200, 95, 38, 51),
            new Rectangle (271, 95, 38, 51),
            new Rectangle (335, 95, 38, 51),
            new Rectangle (406, 95, 38, 51),
            new Rectangle (465, 95, 38, 51),
        }, 
        {
            new Rectangle (0, 175, 38, 51), // resize Q
            new Rectangle (69, 179, 38, 51),
            new Rectangle (138, 179, 38, 51),
            new Rectangle (203, 179, 38, 51),
            new Rectangle (269, 179, 38, 51),
            new Rectangle (337, 179, 38, 51),
            new Rectangle (410, 179, 38, 51), // resize W
            new Rectangle (470, 179, 38, 51),
        },
        {
            new Rectangle (7, 264, 38, 51),
            new Rectangle (71, 264, 38, 51),
        }, 
        { // NUMEROS
            new Rectangle (330, 515, 38, 51),
            new Rectangle (400, 515, 38, 51),
            new Rectangle (467, 515, 38, 51),
            new Rectangle (5, 602, 38, 51),
            new Rectangle (68, 602, 38, 51),
            new Rectangle (136, 602, 38, 51),
            new Rectangle (201, 602, 38, 51),
            new Rectangle (267, 602, 38, 51),
            new Rectangle (332, 602, 38, 51),
            new Rectangle (267, 515, 38, 51),

        }
    };
    private boolean done = false;
    private String nombre;
    private int filaLetra = 0;
    private int columnaLetra = 0;
    private Sprite sprite; 
    private int PosicionY = 360;
    private List <Integer> posicionLetra = new ArrayList <>(List.of(785, 840, 900, 960, 1020, 1080, 1140));
    private List<Sprite> caracteres;
    private int posicionPuntero;

    public Letras(CapaSprites sprite, Image imagen) {
        this.done = false;
        this.nombre = "";
        this.posicionPuntero = 0;
        this.caracteres = new ArrayList <>();
    }

    public void actuar(Teclado t, Image imagen, CapaSprites sprite) throws Exception{
        if (t.teclaPulsada(KeyEvent.VK_BACK_SPACE)){
            this.antiSolapamiento();

            if(this.posicionPuntero > 0) {
                System.out.println("traza delete");
                this.borrarLetra(sprite);
                this.posicionPuntero--;
                this.nombre = this.nombre.substring(0, this.nombre.length() -1);
            } else if (this.posicionPuntero == 0) {
                System.out.println("traza delete pos 0");
                this.borrarLetra(sprite);
                this.nombre = "";
            } else if (this.posicionPuntero >= 7) {
                System.out.println("traza delete pos 7");
                this.borrarLetra(sprite);
                this.posicionPuntero = 6;
            }

        }
        if (t.teclaPulsada(KeyEvent.VK_ENTER)) {
            this.antiSolapamiento();
            this.done = true;
        }
        if(t.teclaPulsada(KeyEvent.VK_A)) {
            this.antiSolapamiento();
            this.columnaLetra = 0;
            this.filaLetra = 0;
            if(this.caracteres.size() <= 7) {
                this.nuevaLetra(sprite);
            }
            if(this.nombre.length() < 7) {
                this.nombre += "A";
            }
        }
        if(t.teclaPulsada(KeyEvent.VK_B)) {
            this.antiSolapamiento();
            this.columnaLetra = 1;
            this.filaLetra = 0;
            if(this.caracteres.size() <= 7) {
                this.nuevaLetra(sprite);
            }
            if(this.nombre.length() < 7) {
                this.nombre += "B";
            }
        }
        if(t.teclaPulsada(KeyEvent.VK_C)) {
            this.antiSolapamiento();
            this.columnaLetra = 2;
            this.filaLetra = 0;
            if(this.caracteres.size() <= 7) {
                this.nuevaLetra(sprite);
            }
            if(this.nombre.length() < 7) {
                this.nombre += "C";
            }
        }
        if(t.teclaPulsada(KeyEvent.VK_D)) {
            this.antiSolapamiento();
            this.columnaLetra = 3;
            this.filaLetra = 0;
            if(this.caracteres.size() <= 7) {
                this.nuevaLetra(sprite);
            }
            if(this.nombre.length() < 7) {
                this.nombre += "D";
            }

        }
        if(t.teclaPulsada(KeyEvent.VK_E)) {
            this.antiSolapamiento();
            this.columnaLetra = 4;
            this.filaLetra = 0;
            if(this.caracteres.size() <= 7) {
                this.nuevaLetra(sprite);
            }
            if(this.nombre.length() < 7) {
                this.nombre += "E";
            }
        }
        if(t.teclaPulsada(KeyEvent.VK_F)) {
            this.antiSolapamiento();
            this.columnaLetra = 5;
            this.filaLetra = 0;
            if(this.caracteres.size() <= 7) {
                this.nuevaLetra(sprite);
            }
            if(this.nombre.length() < 7) {
                this.nombre += "F";
            }
        }
        if(t.teclaPulsada(KeyEvent.VK_G)) {
            this.antiSolapamiento();
            this.columnaLetra = 6;
            this.filaLetra = 0;
            if(this.caracteres.size() <= 7) {
                this.nuevaLetra(sprite);
            }
            if(this.nombre.length() < 7) {
                this.nombre += "G";
            }
        }
        if(t.teclaPulsada(KeyEvent.VK_H)) {
            this.antiSolapamiento();
            this.columnaLetra = 7;
            this.filaLetra = 0;
            if(this.caracteres.size() <= 7) {
                this.nuevaLetra(sprite);
            }
            if(this.nombre.length() < 7) {
                this.nombre += "H";
            }
        }
        if(t.teclaPulsada(KeyEvent.VK_I)) {
            this.antiSolapamiento();
            this.columnaLetra = 0;
            this.filaLetra = 1;
            if(this.caracteres.size() <= 7) {
                this.nuevaLetra(sprite);
            }
            if(this.nombre.length() < 7) {
                this.nombre += "I";
            }
        }
        if(t.teclaPulsada(KeyEvent.VK_J)) {
            this.antiSolapamiento();
            this.columnaLetra = 1;
            this.filaLetra = 1;
            if(this.caracteres.size() <= 7) {
                this.nuevaLetra(sprite);
            }
            if(this.nombre.length() < 7) {
                this.nombre += "J";
            }
        }
        if(t.teclaPulsada(KeyEvent.VK_K)) {
            this.antiSolapamiento();
            this.columnaLetra = 2;
            this.filaLetra = 1;
            if(this.caracteres.size() <= 7) {
                this.nuevaLetra(sprite);
            }
            if(this.nombre.length() < 7) {
                this.nombre += "K";
            }
        }
        if(t.teclaPulsada(KeyEvent.VK_L)) {
            this.antiSolapamiento();
            this.columnaLetra = 3;
            this.filaLetra = 1;
            if(this.caracteres.size() <= 7) {
                this.nuevaLetra(sprite);
            }
            if(this.nombre.length() < 7) {
                this.nombre += "L";
            }
        }
        if(t.teclaPulsada(KeyEvent.VK_M)) {
            this.antiSolapamiento();
            this.columnaLetra = 4;
            this.filaLetra = 1;
            if(this.caracteres.size() <= 7) {
                this.nuevaLetra(sprite);
            }
            if(this.nombre.length() < 7) {
                this.nombre += "M";
            }
        }
        if(t.teclaPulsada(KeyEvent.VK_N)) {
            this.antiSolapamiento();
            this.columnaLetra = 5;
            this.filaLetra = 1;
            if(this.caracteres.size() <= 7) {
                this.nuevaLetra(sprite);
            }
            if(this.nombre.length() < 7) {
                this.nombre += "N";
            }
        }
        if(t.teclaPulsada(KeyEvent.VK_O)) {
            this.antiSolapamiento();
            this.columnaLetra = 6;
            this.filaLetra = 1;
            if(this.caracteres.size() <= 7) {
                this.nuevaLetra(sprite);
            }
            if(this.nombre.length() < 7) {
                this.nombre += "O";
            }
        }
        if(t.teclaPulsada(KeyEvent.VK_P)) {
            this.antiSolapamiento();
            this.columnaLetra = 7;
            this.filaLetra = 1;
            if(this.caracteres.size() <= 7) {
                this.nuevaLetra(sprite);
            }
            if(this.nombre.length() < 7) {
                this.nombre += "P";
            }
        }
        if(t.teclaPulsada(KeyEvent.VK_Q)) {
            this.antiSolapamiento();
            this.columnaLetra = 0;
            this.filaLetra = 2;
            if(this.caracteres.size() <= 7) {
                this.nuevaLetra(sprite);
            }
            if(this.nombre.length() < 7) {
                this.nombre += "Q";
            }
        }
        if(t.teclaPulsada(KeyEvent.VK_R)) {
            this.antiSolapamiento();
            this.columnaLetra = 1;
            this.filaLetra = 2;
            if(this.caracteres.size() <= 7) {
                this.nuevaLetra(sprite);
            }
            if(this.nombre.length() < 7) {
                this.nombre += "R";
            }
        }
        if(t.teclaPulsada(KeyEvent.VK_S)) {
            this.antiSolapamiento();
            this.columnaLetra = 2;
            this.filaLetra = 2;
            if(this.caracteres.size() <= 7) {
                this.nuevaLetra(sprite);
            }
            if(this.nombre.length() < 7) {
                this.nombre += "S";
            }
        }
        if(t.teclaPulsada(KeyEvent.VK_T)) {
            this.antiSolapamiento();
            this.columnaLetra = 3;
            this.filaLetra = 2;
            if(this.caracteres.size() <= 7) {
                this.nuevaLetra(sprite);
            }
            if(this.nombre.length() < 7) {
                this.nombre += "T";
            }
        }
        if(t.teclaPulsada(KeyEvent.VK_U)) {
            this.antiSolapamiento();
            this.columnaLetra = 4;
            this.filaLetra = 2;
            if(this.caracteres.size() <= 7) {
                this.nuevaLetra(sprite);
            }
            if(this.nombre.length() < 7) {
                this.nombre += "U";
            }
        }
        if(t.teclaPulsada(KeyEvent.VK_V)) {
            this.antiSolapamiento();
            this.columnaLetra = 5;
            this.filaLetra = 2;
            if(this.caracteres.size() <= 7) {
                this.nuevaLetra(sprite);
            }
            if(this.nombre.length() < 7) {
                this.nombre += "V";
            }
        }
        if(t.teclaPulsada(KeyEvent.VK_W)) {
            this.antiSolapamiento();
            this.columnaLetra = 6;
            this.filaLetra = 2;
            if(this.caracteres.size() <= 7) {
                this.nuevaLetra(sprite);
            }
            if(this.nombre.length() < 7) {
                this.nombre += "W";
            }
        }
        if(t.teclaPulsada(KeyEvent.VK_X)) {
            this.antiSolapamiento();
            this.columnaLetra = 7;
            this.filaLetra = 2;
            if(this.caracteres.size() <= 7) {
                this.nuevaLetra(sprite);
            }
            if(this.nombre.length() < 7) {
                this.nombre += "X";
            }
        }
        if(t.teclaPulsada(KeyEvent.VK_Y)) {
            this.antiSolapamiento();
            this.columnaLetra = 0;
            this.filaLetra = 3;
            if(this.caracteres.size() <= 7) {
                this.nuevaLetra(sprite);
            }
            if(this.nombre.length() < 7) {
                this.nombre += "Y";
            }
        }
        if(t.teclaPulsada(KeyEvent.VK_Z)) {
            this.antiSolapamiento();
            this.columnaLetra = 1;
            this.filaLetra = 3;
            if(this.caracteres.size() <= 7) {
                this.nuevaLetra(sprite);
            }
            if(this.nombre.length() < 7) {
                this.nombre += "Z";
            }
        }
        if(t.teclaPulsada(KeyEvent.VK_1)) {
            this.antiSolapamiento();
            this.columnaLetra = 0;
            this.filaLetra = 4;
            if(this.caracteres.size() <= 7) {
                this.nuevaLetra(sprite);
            }
            if(this.nombre.length() < 7) {
                this.nombre += "1";
            }
        }
        if(t.teclaPulsada(KeyEvent.VK_2)) {
            this.antiSolapamiento();
            this.columnaLetra = 1;
            this.filaLetra = 4;
            if(this.caracteres.size() <= 7) {
                this.nuevaLetra(sprite);
            }
            if(this.nombre.length() < 7) {
                this.nombre += "2";
            }
        }
        if(t.teclaPulsada(KeyEvent.VK_3)) {
            this.antiSolapamiento();
            this.columnaLetra = 2;
            this.filaLetra = 4;
            if(this.caracteres.size() <= 7) {
                this.nuevaLetra(sprite);
            }
            if(this.nombre.length() < 7) {
                this.nombre += "3";
            }
        }
        if(t.teclaPulsada(KeyEvent.VK_4)) {
            this.antiSolapamiento();
            this.columnaLetra = 3;
            this.filaLetra = 4;
            if(this.caracteres.size() <= 7) {
                this.nuevaLetra(sprite);
            }
            if(this.nombre.length() < 7) {
                this.nombre += "4";
            }
        }
        if(t.teclaPulsada(KeyEvent.VK_5)) {
            this.antiSolapamiento();
            this.columnaLetra = 4;
            this.filaLetra = 4;
            if(this.caracteres.size() <= 7) {
                this.nuevaLetra(sprite);
            }
            if(this.nombre.length() < 7) {
                this.nombre += "5";
            }
        }
        if(t.teclaPulsada(KeyEvent.VK_6)) {
            this.antiSolapamiento();
            this.columnaLetra = 5;
            this.filaLetra = 4;
            if(this.caracteres.size() <= 7) {
                this.nuevaLetra(sprite);
            }
            if(this.nombre.length() < 7) {
                this.nombre += "6";
            }
        }
        if(t.teclaPulsada(KeyEvent.VK_7)) {
            this.antiSolapamiento();
            this.columnaLetra = 6;
            this.filaLetra = 4;
            if(this.caracteres.size() <= 7) {
                this.nuevaLetra(sprite);
            }
            if(this.nombre.length() < 7) {
                this.nombre += "7";
            }
        }
        if(t.teclaPulsada(KeyEvent.VK_8)) {
            this.antiSolapamiento();
            this.columnaLetra = 7;
            this.filaLetra = 4;
            if(this.caracteres.size() <= 7) {
                this.nuevaLetra(sprite);
            }
            if(this.nombre.length() < 7) {
                this.nombre += "8";
            }
        }
        if(t.teclaPulsada(KeyEvent.VK_9)) {
            this.antiSolapamiento();
            this.columnaLetra = 8;
            this.filaLetra = 4;
            if(this.caracteres.size() <= 7) {
                this.nuevaLetra(sprite);
            }
            if(this.nombre.length() < 7) {
                this.nombre += "9";
            }
        }
        if(t.teclaPulsada(KeyEvent.VK_0)) {
            this.antiSolapamiento();
            this.columnaLetra = 9;
            this.filaLetra = 4;
            if(this.caracteres.size() <= 7) {
                this.nuevaLetra(sprite);
            }
            if(this.nombre.length() < 7) {
                this.nombre += "0";
            }
        }

        System.out.println(this.caracteres.size());
        System.out.println(this.getNombre());
        System.out.println(this.getPosicionPuntero());
    }

    private void nuevaLetra(CapaSprites sprite) throws Exception {
        Image foto = ImageIO.read(new File("img/letrasGreen.png"));
        if(this.caracteres.size() < 7 ) {
            caracteres.add(
                sprite.crearSprite(
                    foto,
                    rectangulosLetras[this.filaLetra][this.columnaLetra],
                    this.posicionLetra.get(this.posicionPuntero),
                    this.PosicionY)
                    );
                }
        this.posicionPuntero++;
        if (this.posicionPuntero >= 7) {
            this.posicionPuntero = 6;
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
        if(this.caracteres.size() > 0) {
        sprites.eliminarSprite(this.caracteres.get(this.posicionPuntero));
        caracteres.remove(this.posicionPuntero);
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
