package juego.juegonaves;

import hlanz.framework.consola.SpriteGameObject;
import java.awt.*;

public abstract class Enemigo extends SpriteGameObject {
    public Enemigo(int x, int y, Image img) {
        super(img, x, y);
    }

    public abstract int getPuntuacion();
}
