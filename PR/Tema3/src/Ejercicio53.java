import java.util.*;
public class Ejercicio53 {
    public static void main(String[] args) {
        // Ejercicio 53 : Crea un Set<String> y añádele 15 palabras. A continuación, recorre todas las
// palabras del Set y muestra por cada una, su longitud y la palabra escrita en mayúsculas.
        String[] words = {"A", "continuación", "recorre", "todas", "las", "palabras", "del", "Set", "muestra", "por", "cada", "una", "su", "longitud", "y"};
        Set<String> set = new HashSet<>(Arrays.asList(words));
        for(String word : set) {
            System.out.println("La palabra tiene " + word.length() + " letras y en mayúsculas se escribe " + word.toUpperCase());
        }
    }
}
