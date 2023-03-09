import bpc.daw.consola.*;
import java.awt.*;

public class Ejercicio1 {
    public static void main(String[] args) {
//         1) Realiza un programa que abra una ConsolaDAW a pantalla completa y muestre por
// pantalla en el centro de la pantalla con letras rojas la frase "Bienvenidos al instituto" y
// hacer que el programa finalice al pasar 10 segundos.
        Consola c = new Consola("Ejercicio1", 800, 800);
        CapaTexto ct = c.getCapaTexto();

        // Point p = new Point(400, 400);
        // eC.setDimensiones(10, 10, 10, p);
        // text.setDimensiones(10, 10, 10, p);
        ct.setColorTexto(Color.RED);
        ct.print(12, 8, "Bienvenidos al instituto");
        ct.mostrarCuadricula(false);
        
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }    
}
