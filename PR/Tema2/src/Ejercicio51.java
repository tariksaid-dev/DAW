import java.lang.reflect.Array;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Ejercicio51 {
    public static void main(String[] args) {
//         Ejercicio 51 : Consulta la documentación de la interfaz Set<T> y la clase HashList<T> y haz un
// programa que las use para crear un conjunto de Strings llamado “mensajes” y haga esto:
// a) Rellene el conjunto con las palabras: silla, mesa, niño, mesa, casa, silla, lápiz
// b) Muestre por pantalla el tamaño de la lista
// c) Llame al método toString de la lista y muestre por pantalla lo que produce
        String[] mensajes = {"silla", "mesa", "niño", "mesa", "casa", "silla", "lápiz"};
        Set<String> set = new HashSet<String>();
        Collections.addAll(set, mensajes);
        System.out.println(set.size());
        System.out.println(set.toString());
    }
}
