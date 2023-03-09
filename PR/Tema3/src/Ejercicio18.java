import bpc.daw.consola.*;

public class Ejercicio18 {
    public static void main(String[] args) {
        // Ejercicio 18: Usa la Consola DAW para realizar un programa que muestre 20 veces por pantalla
        // la frase "En clase no se juega" de forma que las primeras 10 veces aparezcan pegadas a la
        // izquierda y las siguientes 10 veces aparezcan pegadas a la derecha.        
        Consola c = new Consola();
        Teclado t = c.getTeclado();
        CapaTexto ct = c.getCapaTexto();

        int j = 1;
        for(int i=1; i<11; i++){
            ct.situarCursor(i-1, 0);
            ct.print(j +") En clase no se juega");
            j+=2;
            ct.situarCursor(i-1, 40);
            ct.print(i*2 +") En clase no se juega"); 
        }
        t.setVisible(false);
        t.leerCaracter();
    }
}
