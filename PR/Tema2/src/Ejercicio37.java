import java.util.*;
public class Ejercicio37 {
    public static void main(String[] args) {
//         Ejercicio 37 : Consulta el pdf de la “Librería Estándar de Java” y busca la clase Integer, que está
// en la hoja de “clases envoltorio”. Haz un programa que pregunte al usuario por teclado un
// número. El programa mostrará ese número escrito en binario y hexadecimal.
        System.out.println("Introduce un número: ");
        int num = new Scanner(System.in).nextInt();
        // Integer i = new Integer(num);
        System.out.println("El número introducido en binario es: " + Integer.toBinaryString(num));
        System.out.println("El número introducido en hexadecimal es: " + Integer.toHexString(num));
    }
}