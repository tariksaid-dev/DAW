package EjercicioElCine;

import java.awt.Image;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class Pelicula {
    private String titulo;
    private String rutaFoto;
    
    public Pelicula(String titulo, String rutaFoto) {
        this.titulo = titulo;
        this.rutaFoto = rutaFoto;
    }
    
    public Pelicula(String titulo) {
        this(titulo, titulo + ".png");
    }
    
    public String getTitulo() {
        return this.titulo;
    }
    
    public Image getFoto() {
        Image i = null;
        
        try {
            i = ImageIO.read(new File(this.rutaFoto));
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        return i;
    }
}
