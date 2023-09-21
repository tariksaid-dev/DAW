import bpc.daw.reproductor.ArchivoMP3;
import bpc.daw.reproductor.Reproductor;

public class Ejercicio35 {
    public static void main(String[] args) {
//         Ejercicio 35 : Realiza las siguientes tareas y responde las preguntas que se indican:
// a) Crea dos objetos diferentes ArchivoMP3, pero que usen la misma ruta de archivo.
//          a. Compáralos con el signo == como si fuesen tipos básicos. ¿Qué sucede?
//          b. Compáralos con el método equals. ¿Qué sucede?
//          c. Muestra los hashCode de dichos objetos. ¿Coinciden?

// b) Crea un objeto Reproductor y muestra por pantalla la salida de su método toString.
//     ¿Qué aparece?

// c) Crea un objeto ArchivoMP3 y muestra por pantalla la salida de su método toString.
//     ¿Qué aparece? ¿Tiene el mismo formato que la salida de toString de Reproductor? ¿a
// qué crees que puede ser debido?
        String r1 = "C:/Users/trutr/Desktop/mp3/2.mp3";
        String r2 = "C:/Users/trutr/Desktop/mp3/3.mp3";
        ArchivoMP3 a1 = new ArchivoMP3(r1);
        ArchivoMP3 a2 = new ArchivoMP3(r2);
        System.out.println(a1 == a2); // false
        System.out.println(a1.equals(a2)); // true
        System.out.println(a1.hashCode());
        System.out.println(a2.hashCode()); // no coinciden
        Reproductor rep = new Reproductor(a2, false, false);
        System.out.println(rep.toString()); // se printea el string que representa al objeto
        System.out.println(a1.toString()); // no aparece nada
    }    
}