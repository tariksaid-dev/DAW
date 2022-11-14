import java.util.*;


public class Ejercicio27 {
    public static void main(String[] args) {
//         Ejercicio 27 : Haz un programa que pida 6 palabras al usuario y las guarde en un List<String>. El
// programa deberá recorrer dicha lista y mostrará por pantalla las que contienen la letra “a”.
        System.out.println("Introduce 6 palabras separadas por un espacio:");
        String ans = new Scanner(System.in).nextLine();
        String[] words = ans.split(" ");
        List<String> list = Arrays.asList(words);
        for(String i : list) {
            if(i.contains("a")) {
                System.out.println(i);
            }
        }
    }   
}
