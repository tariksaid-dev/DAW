import java.util.*;
import java.io.*;
public class Ejercicio52 {
    public static void main(String[]args) {
        // Ejercicio 52 : Con el bloc de notas haz un archivo llamado palabras.txt y rellénalo con las 10
// palabras que tú quieras. A continuación, haz un programa que abra ese archivo y lea todas las
// palabras del archivo, guardándolas en un List<String>. Por último, recorre ese List<String>
// usando un for mejorado y muestra cada palabra en pantalla.
        List<String> words = new ArrayList<>();
        try {
            File f = new File("palabras.txt");
            Scanner sc = new Scanner(f);
            for(String word : words) {
                System.out.println(word);
            }
            sc.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error al leer el archivo");
            e.printStackTrace();
        }   
    }
}
