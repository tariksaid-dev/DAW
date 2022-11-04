import bpc.daw.consola.*;
import java.awt.*;
import java.lang.Thread;
import java.util.Random;

public class Ejercicio9 {
    public static void main(String[] args) {
//         Ejercicio 9: Usa la Consola DAW para realizar un programa que pregunte al usuario "¿Cuántos
// círculos desea dibujar?". El usuario escribirá un número entero (si el número es incorrecto o
// negativo, el programa dirá "Número incorrecto" y finalizará sin hacer nada más) y la pantalla
// se borrará y se dibujarán tantos círculos como haya indicado el usuario. Cada círculo tendrá un
// color con valores RGB aleatorios entre 0 y 255, y sus coordenadas también serán aleatorias
// entre (0,0) y la resolución de la pantalla.
        Consola c = new Consola();
        CapaTexto ct = c.getCapaTexto();
        Teclado t = c.getTeclado();
        CapaCanvas canvas = c.getCapaCanvas();
        Graphics2D g2d = canvas.getGraphics2D();
        Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
        
        ct.print("¿Cuántos círculos desea dibujar? ");
        int ent = t.leerNumeroEntero();
        if(ent != (int)ent || ent < 0) {
            ct.print("Número incorrecto");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        } else {
            ct.cls();
            for(int i=0; i != ent; i++) {
                int R = new Random().nextInt(256);
                int G = new Random().nextInt(256);
                int B = new Random().nextInt(256);
                Color x = new Color(R, G, B);
                int height = new Random().nextInt(d.height);
                int width = new Random().nextInt(d.width);
                g2d.setColor(x);
                g2d.fillOval(width, height, 100, 100);
            }
            t.setVisible(false);
            t.leerCaracter();
        }
    }
}
