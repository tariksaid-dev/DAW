import java.util.*;

public class Ejercicio24 {
    public static void main(String[] args) {
//         Ejercicio 24 : Realiza un programa que pregunte al usuario la edad de dos personas. El programa
// mostrará si ambas son mayores de edad, y también si la primera persona es mayor que la segunda. 
        System.out.println("Introduce tu edad: ");
        int edad1 = new Scanner(System.in).nextInt();
        System.out.println("Introduce la edad de tu compañero: ");
        int edad2 = new Scanner(System.in).nextInt();
        // boolean mayorEdad1 = edad1 >= 18;
        // boolean mayorEdad2 = edad1 >= 18;
        if (edad1 >= 18) {
            System.out.println("Eres mayor de edad.");
        } else {
            System.out.println("Eres menor de edad.");
        }
        if (edad2 >= 18) {
            System.out.println("Tu compañero es mayor de edad.");
        } else {
            System.out.println("Tu compañero es menor de edad.");
        }
        if (edad1 > edad2) {
            System.out.println("Además, eres mayor que tu compañero.");
        } else {
            System.out.println("Tu compañero es mayor que tú.");
        }
    }
}
