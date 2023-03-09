import bpc.daw.consola.*;
import javax.imageio.*;
import java.awt.image.*;
import java.io.*;

public class Ejercicio3 {
    public static void main(String[] args) {
//         Realiza un programa en el que la pantalla tenga como fondo una imagen y el cursor
// sea invisible. El programa mostrará un mensaje "Pulsa una tecla para salir", y al pulsar
// una tecla, finalizará.
        Consola c = new Consola();
        CapaFondo cf = c.getCapaFondo();
        Teclado t = c.getTeclado();

        try {
            BufferedImage i = ImageIO.read(new File("C:/Users/trutr/Downloads/FameHistory.jpg"));
            FondoImagen fi = new FondoImagen(i);
            cf.setFondo(fi);
        } catch (IOException e) {
            System.out.println(e);
        }
        
        t.activarEco(true);
        t.setVisible(false);
        System.out.println("Pulsa una tecla para salir");
        t.leerCaracter();
    }
}
