import java.util.*;
public class Ejercicio13 {
    public static void main(String[] args) {
//         Ejercicio 13 : Consulta el pdf de la “Librería Estándar de Java” y busca la clase String. Haz un
// programa que pregunte tu nombre por teclado, y el ordenador lo muestre en mayúsculas,
// minúsculas y diga cuántos caracteres tiene.
        System.out.println("Introduce tu nombre: ");
        String nombre = new Scanner(System.in).nextLine();
        System.out.println(nombre.toUpperCase());
        System.out.println(nombre.toLowerCase());
        System.out.println(nombre.length());
    }
}
