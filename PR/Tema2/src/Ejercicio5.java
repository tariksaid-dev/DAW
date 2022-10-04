import bpc.daw.mario.*;

public class Ejercicio5 {
    public static void main(String[] args)  {
//         Ejercicio 5 : Realiza un programa con la librería de Mario Bros en el que haya dos cañones. Haz
// que el primero dispare dos veces y el segundo tres. Pregunta a los dos cañones cuántas veces
// han disparado y muestra dichos valores por pantalla.
        Cañon c1 = new Cañon(500, 500);
        Cañon c2 = new Cañon(500, 700);

        c1.disparar(100, 100);
        c1.disparar(100, 500);
        
        c2.disparar(100, 100);
        c2.disparar(200, 500);
        c2.disparar(300, 900);

        int disparosc1 = c1.getTotalDisparosRealizados();
        int disparosc2 = c2.getTotalDisparosRealizados();

        System.out.println("El cañón 1 ha disparado " + disparosc1 + " veces.");
        System.out.println("El cañón 2 ha disparado " + disparosc2 + " veces.");
    }
}
