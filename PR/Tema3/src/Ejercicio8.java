import javax.imageio.ImageIO;
import bpc.daw.consola.*;
import java.awt.*;
import java.awt.image.*;
import java.io.*;

public class Ejercicio8 {
    public static void main(String[] args) {
//         Ejercicio 8: Usa la Consola DAW para hacer un programa que pregunte al usuario por la ruta de
// una imagen y la ponga como imagen de fondo. El programa entonces preguntará "¿Desea
// poner otra imagen?". Si el usuario pulsa la tecla S, se repetirá el proceso, y si pulsa cualquier
// otra tecla, finalizará.
        Consola c = new Consola();
        Teclado t = c.getTeclado();
        CapaTexto ct = c.getCapaTexto();
        CapaCanvas canvas = c.getCapaCanvas();
        Graphics2D g2d = canvas.getGraphics2D();

        ct.print("Introduce la ruta de una imagen: ");
        String ans = t.leerCadenaCaracteres();
        try {
            BufferedImage i = ImageIO.read(new File(ans));
            g2d.drawImage(i, 500, 200, 500, 600, null);
            ct.cls();
        } catch (IOException e) {
            System.out.println(e);
        }
        
        ct.print("Poner otra imagen?");

        while (t.leerCaracter() == 's') {
            ct.print("\nIntroduce la ruta de la imagen: ");
            ans = t.leerCadenaCaracteres();
            try {
                BufferedImage i = ImageIO.read(new File(ans));
                g2d.drawImage(i, 500, 200, 500, 600, null);
            } catch (IOException e) {
                System.out.println(e);
            }
            ct.cls();
            ct.print("Poner otra imagen? ");
        }
    }
}
