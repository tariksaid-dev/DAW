import bpc.daw.consola.*;

public class Ejercicio17 {
    public static void main(String[] args) {
//         Ejercicio 17: Usa la Consola DAW para realizar un programa que muestre 20 veces por pantalla
// la frase "En clase no se juega" cada una en renglón diferente. Las veces impares se alinearán a
// la izquierda y las pares a la derecha.
        Consola c = new Consola();
        Teclado t = c.getTeclado();
        CapaTexto ct = c.getCapaTexto();

        int j = 1;
        int z = 0;
        for(int i=0; i<10; i++){
            ct.situarCursor(z, 0);
            z++;
            ct.print(j +") En clase no se juega");
            j+=2;
            ct.situarCursor(z, 40);
            z++;
            ct.print(j-1 +") En clase no se juega"); 
        }
        t.setVisible(false);
        t.leerCaracter();
    }
}
