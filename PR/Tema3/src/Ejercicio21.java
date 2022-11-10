import bpc.daw.consola.*;
import java.time.*;

import javax.swing.text.Position;

import java.awt.*;
public class Ejercicio21 {
    public static void main(String[] args) {
//         Ejercicio 21: Usa la Consola DAW para hacer un programa que pregunte al usuario un número
// de segundos. El programa finalizará cuando pase la cantidad de segundos introducida y
// durante ese tiempo se dibujará y actualizar en la pantalla una barra de progreso como esta:
        Consola c = new Consola();
        CapaTexto ct = c.getCapaTexto();
        CapaCanvas canvas = c.getCapaCanvas();
        Teclado t = c.getTeclado();
        Graphics2D g2d = canvas.getGraphics2D();
        CapaFondo cf = c.getCapaFondo();
        FondoColorSolido fcs = new FondoColorSolido(Color.white);
        
        // ct.mostrarCuadricula(true);
        // Ventana
        Point p = new Point(280, 230);
        Dimension d = new Dimension(910, 200);
        Rectangle rectangle = new Rectangle(p, d);
        cf.setDimensiones(rectangle);
        cf.setFondo(fcs);

        g2d.drawRect(290, 230, 900, 200);

        // Data
        ct.setColorTexto(Color.black);
        ct.print(7, 15, "Introduce el número de segundos: ");
        int s = t.leerNumeroEntero();
        // ct.cls();
        

        // Barra progreso
        // Texto
        ct.print(11, 20, "Esperando finalización... ");
        ct.print(9, 49, "0%");

        // Barra
        g2d.setColor(Color.black);
        g2d.drawRect(500, 300, 500, 30);
        g2d.setColor(Color.BLUE);
        int j = 500/s;
        int z = 1;
        for(int i=0; i<s; i++) {
            g2d.fillRect(500, 300, j, 30);
            j += 500/s;
            ct.print(11, 42, "(" + z + " seg de " + s + ")");
            z++;
            double x = 100.0/s * (z-1);
            ct.print(9, 49, "" + (int)x + "%");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }


        t.leerCaracter();
    }
}
