import java.util.*;
public class Ejercicio14 {
    public static void main(String[] args) {
//         Ejercicio 14 : Consulta la documentación de la clase String para hacer un programa que
// pregunte una frase al usuario y se muestre la letra que hay justo en la mitad de la frase.
        System.out.println("Introduce una frase: ");
        String frase = new Scanner(System.in).nextLine();
        frase = frase.replace(" ", "");
        int longitudFrase = frase.length();
        int mitadFrase = longitudFrase / 2;
        System.out.println(frase.charAt(mitadFrase));
    }
}