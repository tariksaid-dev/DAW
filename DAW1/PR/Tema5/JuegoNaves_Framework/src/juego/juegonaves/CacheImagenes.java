package juego.juegonaves;

import java.awt.*;
import java.io.File;
import java.util.*;

import javax.imageio.ImageIO;

public class CacheImagenes {
    private static CacheImagenes instancia;
    private Map<String, Image> imagenes;

    private CacheImagenes() {
        this.imagenes = new HashMap<>();
    }

    public static CacheImagenes getInstancia() {
        if (instancia == null) {
            instancia = new CacheImagenes();
        }
        return instancia;
    }

    public Image getImagen(String archivo) {
        Image i = null;
        if (imagenes.containsKey(archivo)) {
            i = imagenes.get(archivo);
        } else {
            try {
                i = ImageIO.read(new File(archivo));
                imagenes.put(archivo, i);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return i;
    }
}
