import java.util.*;
public class Ejercicio3 {
    public static void main(String[] args) {
//         Ejercicio 3: Realiza un programa que pregunte al usuario una palabra y cree una variable de
// tipo char llamada letraCentral inicializada con cualquier valor. A continuación, se usará el
// switch mejorado para hacer lo siguiente:

//      Si la palabra tiene un número impar de letras, se guardará en letraCentral el carácter
//          de su posición central.

//      Si la palabra tiene un número par de letras, el programa preguntará al usuario: “hay
//          dos posibles letras centrales. ¿Quieres la de la izquierda (i) o la de la derecha (d)?” Si el
//          usuario elige “i” o “I”, se guardará en letraCentral la letra cuya posición pega a la
//          izquierda del centro de la palabra. Si se elige “d” o “D” se guardará en letraCentral la
//          letra cuya posición pega a la derecha del centro de la palabra. Ejemplos:
//               o Si elegimos “ADIOS”, como hay cantidad impar de letras, guardamos en
//                    letraCentral la letra I
//               o Si elegimos “HOLA”, hay dos posibles letras centrales, que serían la O (la que
// pega a la izquierda) y la L (la que pega a la derecha)
        System.out.println("Introduce una palabra: ");
        String word = new Scanner(System.in).nextLine();
        if (word.length() % 2 != 0) {
            char letraCentral = word.charAt(word.length() / 2);
            System.out.println(letraCentral);
        } else {
            System.out.println("Hay dos posibles letras centrales.\nQuieres la de la izquierda (i) o la de la derecha (d)?");
            String answer = new Scanner(System.in).nextLine();
            switch (answer) {
                case "i", "I" -> {
                    char letraCentral = word.charAt(word.length() / 2 - 1);
                    System.out.println(letraCentral);
                }
                case "d", "D" -> {
                    char letraCentral = word.charAt(word.length() / 2);
                    System.out.println(letraCentral);
                }
            }
        }
    }
}
