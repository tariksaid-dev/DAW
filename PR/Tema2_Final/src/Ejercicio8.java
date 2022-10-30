import java.awt.*;
import javax.imageio.ImageIO;
import bpc.daw.consola.*;
import java.awt.image.*;
import java.io.*;

public class Ejercicio8 {
    public static void main(String[] args) {
//         Haz un programa en el que se muestren dos fotografías tal y como se muestra en la
// imagen. Hacer que cuando se pulse una tecla se borre la pantalla y las dos fotografías
// intercambien su posición. Si se pulsa una tecla nuevamente, el programa finalizará.
        Consola c = new Consola();

        // Teclado
        Teclado t = c.getTeclado();
        t.setVisible(true);
        t.activarEco(true);
        
        // Fondo
        CapaFondo cf = c.getCapaFondo();
        Fondo f = new FondoColorSolido(Color.white);
        cf.setFondo(f);

        // Texto
        CapaTexto ct = c.getCapaTexto();
        ct.setColorTexto(Color.BLACK);
        ct.print(3, 10, "Pulsa una tecla para intercambiar las fotografías");

        // Canvas
        CapaCanvas canvas = c.getCapaCanvas();

        try {
            Graphics2D g2d = canvas.getGraphics2D();

            // Foto1
            BufferedImage i1 = ImageIO.read(new File("C:/Users/trutr/Downloads/FameHistory.jpg"));
            g2d.drawImage(i1, 100, 200, 500, 600, null);
            // Foto2
            BufferedImage i2 = ImageIO.read(new File("C:/Users/trutr/Downloads/Hendrick.jpg"));
            g2d.drawImage(i2, 800, 200, 500, 600, null);
            
            t.leerCaracter();

            // Intercambio
            if(t.hayTeclaPulsada()) {
                // Canvas
                canvas.cls();
                // Foto1
                g2d.drawImage(i1, 800, 200, 500, 600, null);
                // Foto2
                g2d.drawImage(i2, 100, 200, 500, 600, null);

                // Texto
                ct.cls();
                ct.setColorTexto(Color.BLACK);
                ct.print(3, 20, "Pulsa una tecla para salir");
            }
            
            t.leerCaracter();
        } catch (IOException e) {
            System.out.println(e);
        }
    }    
}
