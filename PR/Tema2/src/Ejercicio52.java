import java.awt.*;
import java.util.*;
import java.util.List;
public class Ejercicio52 {
    public static void main(String[] args) {
//         Ejercicio 52 : En este ejercicio vamos a guardar las asociaciones entre la matrícula de un coche
// y el color de dicho coche. Consulta la documentación de la interfaz Map<K,V>, la clase
// HashMap<K,V> y la clase Color del paquete java.awt y haz un programa que haga esto:
// a) Crea un Map<String,Color> y rellenarlo con un HashMap<String,Color> vacío
// b) Añade al objeto creado en el apartado anterior estas asociaciones:
// c) Muestra en pantalla el tamaño del map
// d) Llama al método toString del map y muestra lo que produce por pantalla
// e) Muestra en pantalla el color del coche cuya matrícula se introduce por teclado. En

//     caso de introducir una matrícula que no esté en el map, se mostrará el mensaje “No
// existe esa matrícula”
        String[] Skey = {"123535ABC", "98525KWX", "17632MSE", "85321ABC"};
        Color[] Svalue = {Color.red, Color.yellow, Color.green, Color.yellow};
        Map<String, Color> map = new HashMap<String, Color>();

        map.put(Skey[0], Svalue[0]);
        map.put(Skey[1], Svalue[1]);
        map.put(Skey[2], Svalue[2]);
        map.put(Skey[3], Svalue[3]);
        System.out.println(map.size());
        System.out.println(map.toString());
        System.out.println("Para saber el color, introduce una matrícula: ");
        String s = new Scanner(System.in).nextLine();
        if (map.containsKey(s)) {
            System.out.println("El color del coche es " + map.get(s));
        } else {
            System.out.println("Matrícula no encontrada.");
        }       
    }
}
