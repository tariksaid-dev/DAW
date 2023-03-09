import java.util.*;
public class Ejercicio39 {
    public static void main(String[] args) {
//         Ejercicio 39 : Realiza un programa que pregunte al usuario dos números enteros y nos diga si el
// primero es mayor o igual que el segundo 
        System.out.println("Introduce un primer número: ");
        double numero1 = new Scanner(System.in).nextDouble();
        System.out.println("Introduce un segundo número: ");
        double numero2 = new Scanner(System.in).nextDouble();
        if (numero1 > numero2) {
            System.out.println("El primer número es mayor que el segundo.");
        } else {
            System.out.println("El segundo número es mayor que el primero");
        }
    }
}