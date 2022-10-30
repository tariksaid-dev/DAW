import bpc.daw.consola.*;
import java.awt.Font;
import java.io.*;
import java.awt.*;

public class Ejercicio6 {
    public static void main(String[] args) {
//         Descarga de Internet un archivo con un tipo de letra de tipo TTF (hay muchos sitios de
// Internet donde puedes hacerlo). Haz un programa que cambie el tipo de letra de la
// Consola DAW y muestre un mensaje en la pantalla.
        Consola c = new Consola();
        Teclado t = c.getTeclado();
        t.setVisible(false);
        CapaTexto ct = c.getCapaTexto();

        try {
            Font f = Font.createFont(Font.TRUETYPE_FONT, new File("fonts/ArianaVioleta-dz2K.ttf"));
            ct.setFont(f);
            ct.setTamTexto(100);
            ct.print("Hola");
            t.leerCaracter();
        } catch (IOException | FontFormatException e) {
            System.out.println(e);
        }
    }
}
