import java.io.PrintWriter;
import java.util.*;
public class Ejercicio24 {
    public static void main(String[] args) {
//         Ejercicio 24 : Consulta el pdf de la librería “java io” y busca la clase PrintWriter. Realiza un
// programa que pregunte por teclado al usuario dos frases. El ordenador creará un archivo
// llamado “d:/frases.txt” (asegúrate de tener permisos de escritura, si no, pon otra carpeta) y
// escribirá las dos frases en él.
        System.out.println("Introduce una primera frase: ");
        String frase1 = new Scanner(System.in).nextLine();
        System.out.println("Introduce una segunda frase: ");
        String frase2 = new Scanner(System.in).nextLine();
        String ruta = "C:/Users/trutr/Desktop/frases.txt";
        try {
            PrintWriter newFile = new PrintWriter(ruta);
            newFile.println(frase1 + "\n" + frase2);
            newFile.close();
        } catch (Exception e) {
            System.out.println("Error");
        }
    }
}