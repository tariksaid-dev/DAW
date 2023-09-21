import java.util.*;
public class Ejercicio16 {
    public static void main(String[] args) {
//         Ejercicio 16 : Haz un programa que pregunte al usuario por teclado dos frases. El programa
// deberá mostrar por pantalla si la segunda frase está incluida dentro de la primera frase.
        System.out.println("Introduce la primera frase: ");
        String frase1 = new Scanner(System.in).nextLine();
        System.out.println("Introduce la segunda frase: ");
        String frase2 = new Scanner(System.in).nextLine();
        System.out.println(frase1.contains(frase2));
    }
}