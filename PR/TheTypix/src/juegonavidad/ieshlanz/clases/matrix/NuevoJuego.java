package juegonavidad.ieshlanz.clases.matrix;

import bpc.daw.consola.CapaSprites;
import bpc.daw.consola.*;
import java.awt.Image;
import java.awt.*;

public class NuevoJuego {
    private String nombre;
    private int dificultad;
    private boolean saved;
    private int width = Toolkit.getDefaultToolkit().getScreenSize().width;
    private int height = Toolkit.getDefaultToolkit().getScreenSize().height;
    private Sprite sprite;

    public NuevoJuego(CapaSprites sprites, Image imagen) {
        this.nombre = "";
        this.dificultad = 0;

        this.sprite = sprites.crearSprite(
                imagen,
                new Rectangle(0, 0, imagen.getWidth(null), imagen.getHeight(null)),
                this.width / 3,
                this.height - (this.height - 200));

    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDificultad(int dificultad) {
        this.dificultad = dificultad;
    }

    public void borrar(CapaSprites sprites) {
        sprites.eliminarSprite(this.sprite);
    }
}
