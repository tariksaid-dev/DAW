import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
public class Ejercicio1 {
    public static void main(String[] args) {
//         Ejercicio 1: Realiza un programa que muestre estas dos opciones al usuario:
// 1) Escribir dos frases en un archivo
// 2) Leer dos frases del archivo
// Se hará un bloque switch-case que analice la opción elegida por el usuario. Si pulsa 1, se
// creará un archivo llamado “frases.txt” con dos frases (las que tú quieras) en él. Si pulsa 2,
// se leerá el archivo “frases.txt” y se mostrarán en pantalla las dos frases que contiene.
        System.out.println("Escribe 'frases' para escribir dos frases en un archivo, o 'leer' para leer dos frases escritas previamente");
        String option = new Scanner(System.in).nextLine();
        File f = new File("C:/Users/trutr/Desktop/file1.txt");
        switch (option.toLowerCase()) {
            case "frases":
            System.out.println("Escribe la primera frase");
            String frase1 = new Scanner(System.in).nextLine();
            System.out.println("Escribe la segunda frase");
            String frase2 = new Scanner(System.in).nextLine();
            try {
                FileWriter w = new FileWriter(f);
                w.write(frase1 + "\n" + frase2);
                w.close();
            } catch (IOException e) {
                System.out.println("Error");
            }
            break;
            case "leer":
            System.out.println("Las frases del archivo son:");
            try {
                Scanner r = new Scanner(f);
                System.out.println(r.nextLine() + "\n" + r.nextLine());
                r.close();
            } catch (FileNotFoundException e) {
                System.out.println("Error");
            }
        }
    }
}