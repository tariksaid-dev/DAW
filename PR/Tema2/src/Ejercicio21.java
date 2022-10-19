import java.io.File;

public class Ejercicio21 {
    public static void main(String[] args) {
//         Ejercicio 21 : Realiza un programa que pida por teclado la ruta de un directorio. En caso de que
// la ruta introducida no sea un directorio, el programa mostrará un mensaje de error. En caso
// contrario, el programa mostrará el número total de archivos y carpetas que contiene.
        String r = "C:/Users/trutr/Desktop/mp3";
        File f = new File(r);
        if(f.isDirectory() == false) {
            System.out.println("Error");
        } else {
            System.out.println("Existen " + f.listFiles().length + " archivos en esta carpeta.");
        }
    }
}