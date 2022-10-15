import java.io.*;
import javax.imageio.*;
import java.awt.image.BufferedImage;
import daw.efectoimagen.*;
public class Ejercicio49 {
    public static void main(String[] args) throws IOException {
//         Ejercicio 49 : En la librería “Efecto Imagen” se encuentra la clase EfectoBuilder, que sirve para
// aplicar efectos a una imagen. Consulta su documentación y realiza un programa que haga esto:

//      Pregunte al usuario la ruta de un archivo con una imagen
//      Utiliza la clase ImageIO de la librería “java 2d” para cargar la imagen
//      Utiliza la clase EfectoImagen para aplicar, en este orden, los efectos “invertir”,

//          “blurred” y “escala de grises” a la fotografía.
//      Cuando hayas terminado de aplicar los efectos, muestra una ventana en la que se vea
// la imagen final.
        String r = "C:/Users/trutr/Downloads/FameGlory.jpg";
        BufferedImage i = ImageIO.read(new File(r));
        EfectoBuilder e = new EfectoBuilder(i);
        e.aplicarEfecto(EfectoBuilder.INVERTIR);
        e.aplicarEfecto(EfectoBuilder.BLURRED);
        e.aplicarEfecto(EfectoBuilder.ESCALA_GRISES);
        e.build();
    }
}