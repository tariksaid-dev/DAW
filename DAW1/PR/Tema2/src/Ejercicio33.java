import bpc.daw.reproductor.ArchivoMP3;
import bpc.daw.reproductor.PlayList;
import bpc.daw.reproductor.Reproductor;
import java.io.*;
public class Ejercicio33 {
    public static void main(String[] args) {
//         Ejercicio 33 : Haz un programa que cree una lista de reproducción titulada “Lista de Ejemplo” y
// añádele tres canciones a ellas. El programa deberá guardar dicha lista en el disco duro (puedes
// inventar el nombre del archivo) y luego reproducir las tres canciones de forma síncrona.
        PlayList list = new PlayList();
        Reproductor r = new Reproductor(list, false, true);
        String ruta = "C:/Users/trutr/Desktop/mp3/playlist.txt";
        String ruta1 = "C:/Users/trutr/Desktop/mp3/1.mp3";
        String ruta2 = "C:/Users/trutr/Desktop/mp3/2.mp3";
        String ruta3 = "C:/Users/trutr/Desktop/mp3/3.mp3";
        ArchivoMP3 f1 = new ArchivoMP3(ruta1);
        ArchivoMP3 f2 = new ArchivoMP3(ruta2);
        ArchivoMP3 f3 = new ArchivoMP3(ruta3);
        ArchivoMP3[] a = {f1, f2, f3};
        list.añadirVarias(a);
        try {
            list.guardar(ruta);
        } catch (IOException e) {
            System.out.println("Error");
        }
        r.play();
    }
}