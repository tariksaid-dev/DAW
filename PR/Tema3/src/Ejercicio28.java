import java.util.*;
public class Ejercicio28 {
    public static void main(String[] args) {
//         Ejercicio 28 : Haz un programa que pida 6 palabras al usuario y las guarde en un List<String>. El
// programa deberá mostrar por pantalla las palabras únicas (o sea, las palabras repetidas no se
// mostrarán).
        System.out.println("Introduce 6 palabras separadas por un espacio:");
        String ans = new Scanner(System.in).nextLine();
        String[] words = ans.split(" ");
        List<String> list = Arrays.asList(words);
        Set<String> set = new HashSet<>(list);
        for(String i : set) {
            System.out.println(i);
        }
        
    }
}
