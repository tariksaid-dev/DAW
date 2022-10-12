import java.util.Scanner;
import java.io.*;

public class Ejercicio25 {
    public static void main(String[] args) {
//         Ejercicio 25 : Consulta el pdf de la “Librería Estándar de Java” y busca la clase Scanner. Realiza
// un programa que abra el archivo “d:/frase.txt” que has creado en el ejercicio anterior y nos
// muestre por pantalla las dos frases que hay guardadas en él.
        try {
            File f = new File("C:/Users/trutr/Desktop/frases.txt");
            Scanner s = new Scanner(f);
            System.out.println(s.nextLine() + "\n" + s.nextLine());
        } catch (FileNotFoundException e) {
            System.out.println("Error de lectura");
        }
    }
}