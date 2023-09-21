import java.awt.Color;
import bpc.daw.consola.*;
import javax.imageio.*;
import java.awt.image.*;
import java.io.*;

public class Ejercicio4 {
    public static void main(String[] args) {
//         Realiza un programa en el que la pantalla tenga el fondo de color azul, color del texto
// amarillo y cursor invisible. El ordenador preguntará al usuario que escriba la ruta de un
// archivo con una imagen. La pantalla pasará a tener como fondo la imagen de dicho
// archivo, que se mostrará escalada para ocupar toda la pantalla. Al pulsar una tecla, el
// programa finalizará.
        Consola c = new Consola();
        
        // Fondo
        CapaFondo cf = c.getCapaFondo();
        Fondo f = new FondoColorSolido(0, 0, 255);
        cf.setFondo(f);
        
        // Texto
        CapaTexto ct = c.getCapaTexto();
        ct.setColorTexto(Color.YELLOW);

        // Teclado
        Teclado t = c.getTeclado();
        t.setVisible(false);
        t.activarEco(true);
        String r = t.leerCadenaCaracteres();
        // String r = "C:/Users/trutr/Downloads/FameGlory.jpg";

        // Funcionalidad
        System.out.println("Escribe la ruta de una archivo con una imagen");
        try {
            BufferedImage i = ImageIO.read(new File(r));
            FondoImagen fi = new FondoImagen(i);
            fi.setEscalado(true);
            cf.setFondo(fi);
        } catch (IOException e) {
            System.out.println(e);
        }
        t.leerCaracter();
    }
}
