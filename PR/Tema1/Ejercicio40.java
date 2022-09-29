import java.util.*;
public class Ejercicio40 {
    public static void main(String[] args) {
//         Ejercicio 40 : Realiza un programa que pregunte al usuario tres números enteros y el programa nos
// muestre el mayor de ellos.
        System.out.println("Introduce un primer número: ");
        double numero1 = new Scanner(System.in).nextDouble();
        System.out.println("Introduce un segundo número: ");
        double numero2 = new Scanner(System.in).nextDouble();
        System.out.println("Introduce un tercer número: ");
        double numero3 = new Scanner(System.in).nextDouble();
        if (numero1 > numero2 && numero1 > numero3) {
            System.out.println("El primer número es el mayor.");
        } else if (numero2 > numero1 && numero2 > numero3) {
            System.out.println("El segundo número es el mayor.");
        } else {
            System.out.println("El tercer número es el mayor.");
        }
    }
}