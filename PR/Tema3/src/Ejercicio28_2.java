import java.util.*;
public class Ejercicio28_2 {
    public static void main(String[] args) {
//         Ejercicio 28 : Haz un programa que pida 6 palabras al usuario y las guarde en un List<String>. El
// programa deberá mostrar por pantalla las palabras únicas (o sea, las palabras repetidas no se
// mostrarán).
        System.out.println("Introduce 6 palabras separadas por un espacio:");
        String ans = new Scanner(System.in).nextLine();
        String[] words = ans.split(" ");
        List<String> noRep = new ArrayList<>();
        
        for(String i : words) {
            if(!noRep.contains(i)) {
                noRep.add(i);
            }
        }
        System.out.println(noRep.toString());
    }
}