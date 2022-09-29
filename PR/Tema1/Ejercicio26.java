import java.util.*;

public class Ejercicio26 {
    public static void main(String[] args) {
//         Ejercicio 26 : Realiza un programa que pregunte al usuario su nota final del examen. El programa
// mostrará si está aprobado y también si está suspenso.
        System.out.println("Introduce tu nota final del examen: ");
        double nota = new Scanner(System.in).nextDouble();
        // boolean aprobado = nota >= 5;
        // System.out.println(aprobado);
        if (nota >= 5) {
            System.out.println("Estás aprobado.");
        } else {
            System.out.println("Estás suspenso.");
        }
    }
}
