package com.ieshlanz.juego.clases;
import bpc.daw.consola.*;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;
import javax.imageio.ImageIO;
import java.util.*;
import java.io.*;
import java.awt.*;

public class PersonajePrincipal {
    private static Rectangle [][] rectangulosPersonajePrincipal = {
        {
            new Rectangle (21, 11, 83, 116),
            new Rectangle (123, 12, 95, 126),
            new Rectangle (215, 2, 116, 118), 
            new Rectangle (331, 10, 102, 123), 
            new Rectangle (451, 13, 83, 110), 
            new Rectangle (551, 12, 91, 123), 
            new Rectangle (641, 10, 114, 129),
            new Rectangle (776, 5, 98, 121)
        }, 
        {
            new Rectangle (2, 148, 99, 115),
            new Rectangle (101, 151, 114, 112),
            new Rectangle (222, 152, 94, 121),
            new Rectangle (325, 145, 93, 122),
            new Rectangle (433, 152, 94, 105),
            new Rectangle (540, 153, 109, 101),
            new Rectangle (645, 159, 103, 131),
            new Rectangle (753, 150, 82, 112)
    }

        
    };
        // Fila y columna del rectángulo del frame del personaje principal 
        private int filaPersonajePrincipal = 0;
        private int columnaPersonajePrincipal = 0;
        private int lineaTiempoPersonajePrincipal = 0;
        private Sprite sprite;

        public PersonajePrincipal(CapaSprites sprites, Map<String, Image> fotos) {
            this.filaPersonajePrincipal=0;
            this.columnaPersonajePrincipal=0;
            this.lineaTiempoPersonajePrincipal=0;
            this.sprite = sprites.crearSprite(
                fotos.get("animacion.png"),
                rectangulosPersonajePrincipal[filaPersonajePrincipal][columnaPersonajePrincipal],
                150, 
                700
            );
        }

        public void actuar(Graphics g, Teclado t) {
            // movemos el muñeco con W A S D
            if(t.teclaPulsada(KeyEvent.VK_W)) {
                this.sprite.moverY(-4);
            }
            if(t.teclaPulsada(KeyEvent.VK_S)) {
                this.sprite.moverY(4);
            }
            if(t.teclaPulsada(KeyEvent.VK_A)) {
                this.moverIzquierda();
            }
            if(t.teclaPulsada(KeyEvent.VK_D)) {
                this.moverDerecha();
            }
        }

        private void gestionarLineaDeTiempo() {
            // Calculo con la linea de tiempo el frame que debo mostrar
            if(lineaTiempoPersonajePrincipal < 0) {
                lineaTiempoPersonajePrincipal = 79;
            }
            if(lineaTiempoPersonajePrincipal > 90) {
                lineaTiempoPersonajePrincipal = 0;
            }
            columnaPersonajePrincipal = lineaTiempoPersonajePrincipal<10?0:
                lineaTiempoPersonajePrincipal<20?1:
                lineaTiempoPersonajePrincipal<30?2:
                lineaTiempoPersonajePrincipal<40?3:
                lineaTiempoPersonajePrincipal<50?4:
                lineaTiempoPersonajePrincipal<60?5:
                lineaTiempoPersonajePrincipal<70?6:
                lineaTiempoPersonajePrincipal<80?7:0;
            if(lineaTiempoPersonajePrincipal == 90) {
               lineaTiempoPersonajePrincipal = 0;
            }
            this.sprite.setRectanguloFrame(rectangulosPersonajePrincipal[filaPersonajePrincipal][columnaPersonajePrincipal]);
        }

        private void moverDerecha() {
            this.sprite.moverX(4);
            lineaTiempoPersonajePrincipal ++;
            filaPersonajePrincipal = 0;
            this.gestionarLineaDeTiempo();
        }

        public void moverIzquierda() {
            this.sprite.moverX(-4);
            lineaTiempoPersonajePrincipal --;
            filaPersonajePrincipal = 1;
            this.gestionarLineaDeTiempo();
    }

    public int getX() {
        return this.sprite.getX();
    }

    public void moverX(int px) {
        this.sprite.moverX(px);
    }

    public Sprite getSprite() {
        return this.sprite;
    }
}