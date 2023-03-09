import java.util.*;
import java.awt.*;
public class Ejercicio53 {
    public static void main(String[] args) {
//         Ejercicio 53 : Repite los apartados a,b,c y d del ejercicio anterior pero rellenando el
// Map<String,Color> con un TreeMap<String,Color>. ¿Notas alguna diferencia en la salida del
// programa?
        String[] Skey = {"123535ABC", "98525KWX", "17632MSE", "85321ABC"};
        Color[] Svalue = {Color.red, Color.yellow, Color.green, Color.yellow};
        Map<String, Color> tmap = new TreeMap<String, Color>();
        tmap.put(Skey[0], Svalue[0]);
        tmap.put(Skey[1], Svalue[1]);
        tmap.put(Skey[2], Svalue[2]);
        tmap.put(Skey[3], Svalue[3]);
        System.out.println(tmap.size());
        System.out.println(tmap.toString());
        // Diferente orden en la salida.
    }
}
