import java.util.*;

public class Ejercicio54 {
    public static void main(String[] args) {
//         Ejercicio 54 : Haz un programa que haga esto:
// a) Crea una lista de 10 palabras (las que tú quieras)
// b) Muestra por pantalla la salida del método toString de la lista
// c) Busca en la clase Collections un método que nos ordene la lista y llámalo.
// d) Una vez ordenada, muestra por pantalla la salida del método toString de la lista
        String[] palabras = {"uno", "dos", "tres", "cuatro", "cinco", "seis", "siete", "ocho", "nueve", "diez"};
        List<String> list = new ArrayList<String>(Arrays.asList(palabras));
        System.out.println(list.toString());
        Collections.sort(list);
        System.out.println(list.toString());
    }
}
