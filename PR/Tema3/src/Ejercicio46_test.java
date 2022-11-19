
import bpc.daw.consola.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.*;

public class Ejercicio46_test {
    public static void main(String[] args) {
        // Items
        Consola c = new Consola();
        Teclado t = c.getTeclado();
        CapaTexto ct = c.getCapaTexto();
        CapaTexto ct2 = c.getCapaTexto();
        
        // Coordenadas
        int x = 45;
        int y = 15;
        // int x = new Random().nextInt(0, 100);
        // int y = new Random().nextInt(0, 100);
        
        ct.mostrarCuadricula(false);
        t.setVisible(false);


        ct.print(y, x, "O");
        for(int i =0; i<80; i++) {
            // Header
            ct2.print(0, 0, "Nivel: 1");
            ct2.print(0, 14, "Puntos: 0");
            ct2.print(0, 30, "Movimientos restantes: " + (80-i));
            ct2.print(0, 60, "MUY FRIO");
            ct2.print(1, 0, "-------------------------------------------------------------------------");
            

            // Ejercicio46_thread2 t2 = new Ejercicio46_thread2();
            // t2.start();
            // if(t.teclaPulsada(KeyEvent.VK_W)) {
            //     ct.cls();
            //     ct.print(y--, x, "O");
            //     t.reset();
            // } else if (t.teclaPulsada(KeyEvent.VK_S)) {
            //     ct.cls();
            //     ct.print(y++, x, "O");
            // } else if (t.teclaPulsada(KeyEvent.VK_A)) {
            //     ct.cls();
            //     ct.print(y, x--, "O");
            // } else if (t.teclaPulsada(KeyEvent.VK_D)) {
            //     ct.cls();
            //     ct.print(y, x++, "O");
            // }


            // t.leerCaracter();
            // while(!t.hayTeclaPulsada()) {
            //     if(t.teclaPulsada(KeyEvent.VK_W)) {
            //         ct.cls();
            //         ct.print(y--, x, "O");
            //         t.reset();
            //     } else if (t.teclaPulsada(KeyEvent.VK_S)) {
            //         ct.cls();
            //         ct.print(y++, x, "O");
            //     } else if (t.teclaPulsada(KeyEvent.VK_A)) {
            //         ct.cls();
            //         ct.print(y, x--, "O");
            //     } else if (t.teclaPulsada(KeyEvent.VK_D)) {
            //         ct.cls();
            //         ct.print(y, x++, "O");
            //     }
            // }
            // t.reset();


            // char mov = new Scanner(System.in).next().charAt(0);
            // char mov = t.leerCaracter();
            // System.out.println("Tecla leída");
            // if(mov=='w') {
            //     ct.cls();
            //     ct.print(y--, x, "O");
            //     System.out.println("W");
                
            // } else if (mov=='s') {
            //     ct.cls();
            //     ct.print(y++, x, "O");
            //     System.out.println("S");

            // } else if (mov=='a') {
            //     ct.cls();
            //     ct.print(y, x--, "O");
            //     System.out.println("A");

            // } else if (mov=='d') {
            //     ct.cls();
            //     ct.print(y, x++, "O");
            //     System.out.println("D");
                
            // }
        }
        
    }
}
