import java.util.*;

public class Ejercicio27 {
    public static void main(String[] args) {
//         Ejercicio 27 : Una tienda realiza descuentos a personas menores de edad y también a personas
// mayores de 60 años. Realiza un programa que pregunte una edad y nos muestre si tiene descuento.
        System.out.println("Introduce tu edad: ");
        int edad = new Scanner(System.in).nextInt();
        if (edad <= 18 || edad >= 60) {
            System.out.println("Tienes descuento");
        } else {
            System.out.println("Lo siento, no te podemos hacer descuento.");
        }
    }
}