import bpc.daw.consola.*;
import java.util.*;

public class Ejercicio46{
    public static void main(String[] args) {
        // OBJETOS
        Consola c = new Consola();
        Teclado t = c.getTeclado();
        CapaTexto ct = c.getCapaTexto();

        ct.mostrarCuadricula(false);
        t.setVisible(false);
        // Proximidad tesoro
        String quemando = "QUEMANDO";  
        String caliente = "CALIENTE";
        String frio = "FRIO";
        String muyFrio = "MUY FRIO";
        String win = "HAS GANADO";
        //  PUNTOS Y NIVEL
        int puntos = 0;
        int nivel = 1;
        
        // STARTER POINT
        int x = 45;
        int y = 15;
        ct.print(y, x, "O");
        // Tesoro (random)
        int trX = new Random().nextInt(0, 73);
        int trY = new Random().nextInt(2, 25);
        
        // FUNCIONALIDAD
        for(int movimientos=80; movimientos>0; movimientos--) {
            // TESORO (debug purposes)
            ct.print(trY, trX, "$");
            double distance = Math.sqrt(Math.pow((x - trX), 2) + Math.pow((y - trY), 2));
            // HEADER
            // Win condition
            if (distance == 0) {
                ct.print(0, 60, win);
                puntos+= movimientos;
                movimientos += 10;
                nivel++;
                trX = new Random().nextInt(0, 73);
                trY = new Random().nextInt(2, 25);
                distance = Math.sqrt(Math.pow((x - trX), 2) + Math.pow((y - trY), 2));
            // Else
            } else if(distance < 5) {
                ct.print(0, 60, quemando);
            } else if(distance < 15) {
                ct.print(0, 60, caliente);
            } else if(distance < 35) {
                ct.print(0, 60, frio);
            } else if(distance >= 35) {
                ct.print(0, 60, muyFrio);
            } 
            ct.print(0, 0, "Nivel: " + nivel);
            ct.print(0, 14, "Puntos: " + puntos);
            ct.print(0, 30, "Movimientos restantes: " + movimientos);
            ct.print(1, 0, "-------------------------------------------------------------------------");
            // MOVIMIENTOS
            char mov = t.leerCaracter();
            System.out.println("Tecla leída");
            if(mov=='w') {
                ct.cls();
                ct.print(y--, x, "O");
                System.out.println("W");
            } else if (mov=='s') {
                ct.cls();
                ct.print(y++, x, "O");
                System.out.println("S");
            } else if (mov=='a') {
                ct.cls();
                ct.print(y, x--, "O");
                System.out.println("A");
            } else if (mov=='d') {
                ct.cls();
                ct.print(y, x++, "O");
                System.out.println("D");
            }
        }
        // FIN DEL JUEGO
        ct.cls();
        ct.print(trY, trX, "$");
        ct.print(12, 32, "GAME OVER");

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    
    }
}
