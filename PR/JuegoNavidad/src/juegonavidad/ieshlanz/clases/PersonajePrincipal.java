package juegonavidad.ieshlanz.clases;
import bpc.daw.consola.*;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;
import javax.imageio.ImageIO;
import java.util.*;
import java.io.*;
import java.awt.*;
public class PersonajePrincipal {
    private static Rectangle [] rectangulosPersonajePrincipalIdle = {
            new Rectangle (3, 7, 34, 41), 
            new Rectangle (39, 7, 34, 41), 
            new Rectangle (77, 7, 34, 41), 
            new Rectangle (116, 7, 34, 41)
        };

    private int columnaPersonajePrincipalIdle = 0;
    private int lineaTiempoPersonajePrincipal = 0;
    private Sprite sprite;

    public PersonajePrincipal(CapaSprites sprites, Map<String, Image> fotos) {
        this.columnaPersonajePrincipalIdle = 0;
        this.lineaTiempoPersonajePrincipal = 0;
        this.sprite = sprites.crearSprite(
            fotos.get("hero/gothic-hero-idle.png"),
            rectangulosPersonajePrincipalIdle[columnaPersonajePrincipalIdle],
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
            this.sprite.moverX(-4);
        }
        if(t.teclaPulsada(KeyEvent.VK_D)) {
            this.sprite.moverX(4);
        }
        if(!t.hayTeclaPulsada()) {
            //idle movement
        }
    }

    private void gestionarLineaDeTiempoIdle() {
        // Calculo con la linea de tiempo el frame que debo mostrar
        if(lineaTiempoPersonajePrincipal < 0) {
            lineaTiempoPersonajePrincipal = 39;
        }
        if(lineaTiempoPersonajePrincipal > 50) {
            lineaTiempoPersonajePrincipal = 0;
        }
        columnaPersonajePrincipalIdle = lineaTiempoPersonajePrincipal<10?0:
            lineaTiempoPersonajePrincipal<20?1:
            lineaTiempoPersonajePrincipal<30?2:
            lineaTiempoPersonajePrincipal<40?3:0;
        if(lineaTiempoPersonajePrincipal == 50)
           lineaTiempoPersonajePrincipal = 0;
        
        this.sprite.setRectanguloFrame(rectangulosPersonajePrincipalIdle[columnaPersonajePrincipalIdle]);
    }

    private void idleMov() {
        lineaTiempoPersonajePrincipal ++;
        this.gestionarLineaDeTiempoIdle();
    }

    // private void moverDerecha() {
    //     this.sprite.moverX(4);
    //     lineaTiempoPersonajePrincipal ++;
    //     this.gestionarLineaDeTiempo();
    // }

    // private void moverIzquierda() {
    //     this.sprite.moverX(-4);
    //     lineaTiempoPersonajePrincipal --;
    //     this.gestionarLineaDeTiempo();
    // }



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
