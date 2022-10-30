import java.awt.*;
import java.awt.Color;
import bpc.daw.consola.*;

public class Ejercicio7 {
    public static void main(String[] args) {
//         Realiza un programa que calcule la resolución de la pantalla (busca en los pdf la clase
// Toolkit) y úsala para hacer el siguiente dibujo. El radio del círculo es de 50 píxeles. El
// programa deberá funcionar correctamente en cualquier monitor, sea cual sea su
// resolución.
        Consola c = new Consola();

        // Toolkit + Dimension
        Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
          
        // Teclado
        Teclado t = c.getTeclado();
        t.setVisible(false);
        t.activarEco(true);
            
        // Canvas
        CapaCanvas canvas = c.getCapaCanvas();
        Graphics2D g2d = canvas.getGraphics2D();
        
        // Línea I
        g2d.setColor(Color.red);
        g2d.drawLine(0, 0, d.width, d.height);
        // Línea D
        g2d.setColor(Color.green);
        g2d.drawLine(d.width, 0, 0, d.height);
        // Círculo
        g2d.setColor(Color.blue);
        g2d.drawOval(d.width/2-50, d.height/2-50, 100, 100);

        // End
        t.leerCaracter();

    }
}
