package juego.juegonaves;

import hlanz.framework.consola.GameObject;
import java.awt.*;

public class Fondo extends GameObject {
    private Image imagen;
    private Rectangle camara;
    private int velocidadCamara;

    public Fondo(int vc) {
        this.imagen = CacheImagenes.getInstancia().getImagen("img/fondo.png");
        this.velocidadCamara = vc;
    }

    @Override
    public void inicializar() {
        this.camara = new Rectangle(0, 0, this.juego.getAnchuraPantalla(), this.juego.getAlturaPantalla());
    }

    @Override
    public void ejecutarFrame() {
        this.consola.getCapaCanvas().getGraphics2D().drawImage(this.imagen, 0, 0, this.juego.getAnchuraPantalla(),
                this.juego.getAlturaPantalla(),
                0, 0, 0 + this.juego.getAnchuraPantalla(), this.juego.getAlturaPantalla(), null);

        this.camara.setFrame(this.camara.getX(), this.camara.getY() + this.velocidadCamara, this.camara.getWidth(),
                this.camara.getWidth());

        if (this.camara.getMaxY() > this.juego.getAlturaPantalla()) {
            this.camara.setFrame(0, 0, this.juego.getAnchuraPantalla(), this.juego.getAlturaPantalla());
        }

    }

    @Override
    public void finalizar() {
    }
}
