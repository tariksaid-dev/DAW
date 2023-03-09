import java.util.*;

public class Ejercicio15 {
    public static void main(String[] args) {
//         Ejercicio 15 : Crea un programa que pregunte al usuario un número entero llamado
// gradosCentígrados. El programa deberá convertir dicha cantidad a grados Farenheit y mostrarla por
// pantalla. La fórmula para realizar la conversión es:
        System.out.println("Introduce un número de grados centígrados: ");
        int gradosCentígrados = new Scanner(System.in).nextInt();
        System.out.println("Esos grados centígrados son " + ( (9.0/5.0 * gradosCentígrados) + 32 ) + " grados Farenheit.");
    }
}
