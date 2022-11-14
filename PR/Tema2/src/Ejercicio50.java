import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ejercicio50 {
    public static void main(String[] args) {
//         Ejercicio 50 : Consulta la documentación de la interfaz List<T> y la clase ArrayList<T> y haz un
// programa que las use para crear una lista de Strings llamada “mensajes” y haga estas acciones:
// a) Rellene la lista con 5 palabras (las que tú quieras)
// b) Muestre por pantalla el tamaño de la lista
// c) Muestre por pantalla la palabra de la posición 3 de la lista.
// d) Llame al método toString de la lista y muestre por pantalla lo que produce
// e) Elimine el primer dato de la lista
// f) Muestre el tamaño de la lista
// g) Muestre por pantalla la palabra de la posición 3 de la lista
// h) Llame al método toString de la lista y muestre por pantalla lo que produce
        

        String[] mensajes = {"a", "b", "c", "d", "e"};
        List<String> list = new ArrayList<String>(Arrays.asList(mensajes));
        // Collections.addAll(list, mensajes); ¿Cuál es mejor?
        System.out.println(list.size());
        System.out.println(list.get(3));
        System.out.println(list.toString());
        list.remove(0);
        System.out.println(list.size());
        System.out.println(list.get(3));
        System.out.println(list.toString());
    }
}