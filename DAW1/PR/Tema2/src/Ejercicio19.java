import java.io.File;
import java.util.*;
public class Ejercicio19 {
    public static void main(String[] args) {
//         Ejercicio 19 : Consulta el pdf de la librería “java io” y encuentra la clase File. Realiza un
// programa que pregunte al usuario por teclado la ruta de un archivo. El programa deberá decir
// cuántos bytes y cuántos megabytes ocupa en el disco duro.
        System.out.println("Introduce la ruta de un archivo: ");
        String ruta = new Scanner(System.in).nextLine();
        File f = new File(ruta);
        long tamañoBytes = f.length();
        double tamañoMb = (double)tamañoBytes / 1024 / 1024;
        System.out.println("El programa tiene " + tamañoBytes + " bytes.");
        System.out.println("El programa tiene " + tamañoMb + " megabytes.");
    }
}