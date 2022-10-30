import java.awt.Color;
import bpc.daw.consola.*;
import java.awt.*;

public class Ejercicio5 {
    public static void main(String[] args) {
        // Realiza un programa que dibuje en la pantalla la siguiente imagen:
        Consola c = new Consola();
        
        // Fondo
        CapaFondo cf = c.getCapaFondo();
        Fondo f = new FondoColorSolido(0, 191, 255);
        cf.setFondo(f);
        
        // Teclado
        Teclado t = c.getTeclado();
        t.setVisible(false);
        t.activarEco(true);
        
        // Canvas
        CapaCanvas canvas = c.getCapaCanvas();
        Graphics2D g2d = canvas.getGraphics2D();
        // Suelo        
        g2d.setPaint(Color.green);
        g2d.fillRect(0, 700, 1920, 400);
        // Círculo
        g2d.setPaint(Color.yellow);
        g2d.fillOval(120, 90, 100, 100);

        // End
        t.leerCaracter();
    }
}
