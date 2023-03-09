import java.util.*;

public class Ejercicio10 {
    public static void main(String[] args) {
//         Ejercicio 10: Usa la clase StringTokenizer para hacer un programa que pregunte al usuario
// "Escriba una frase" y nos muestre en una línea diferente cada palabra de la frase y además, el
// número total de palabras encontradas.
        System.out.println("Escriba una frase:");
        String s = new Scanner(System.in).nextLine();
        StringTokenizer st = new StringTokenizer(s);
        // int i = 1;
        // while (st.hasMoreTokens()) {
        //     System.out.println(i++ + ": " + st.nextToken());
        for (int i = 1; st.hasMoreTokens(); i++) {
            System.out.println(i + ": " + st.nextToken());
        }
    }
}