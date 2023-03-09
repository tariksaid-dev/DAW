import java.io.*;
import java.util.*;

public class Ejercicio12 {
    public static void main(String[] args) {
//         Ejercicio 12: Utiliza las clases y métodos de la librería de entrada y salida que se indican a
// continuación para hacer un programa que pregunte por teclado la ruta de un archivo de texto
// (.txt) y a continuación, use un BufferedReader para leer una por una todas sus líneas y
// mostrarlas por pantalla a la vez.
        System.out.println("Introduzca la ruta de un archivo .txt: ");
        // String r = "C:/Users/trutr/Desktop/a.txt";
        String r = new Scanner(System.in).nextLine();
        File f = new File(r);
        try {
            BufferedReader bf = new BufferedReader(new FileReader(f));
            String l = bf.readLine();
            while (l != null) {
                System.out.println(l);
                l = bf.readLine();
            }
            bf.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
