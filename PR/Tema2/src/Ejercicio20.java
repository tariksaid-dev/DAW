import java.io.File;
import java.util.Scanner;
public class Ejercicio20 {
    public static void main(String[] args) {
//         Ejercicio 20 : Realiza un programa que pregunte al usuario por la ruta de un archivo del disco
// duro. Si dicho archivo existe y es directorio, el programa dirá "La ruta introducida corresponde
// a un directorio" y terminará sin hacer nada más. En caso de que sea un archivo, el programa
// mostrará "La ruta introducida es un archivo de tamaño ... bytes. ¿Desea borrarlo (si/no)?". Si el
// usuario introduce la palabra "si", el archivo se borrará y el ordenador mostrará si se ha
// borrado correctamente o se ha producido un error al borrar. En caso de que el usuario escriba
// cualquier otra cosa el programa responderá "Borrado cancelado" y finalizará.
        String r = "C:/Users/trutr/Desktop/mp3/1.mp3";
        File f = new File(r);
        if(f.isDirectory()) {
            System.out.println("La ruta introducida corresponde a un directorio");
        } else if (f.isFile()) {
            System.out.println("La ruta introducida es un archivo de tamaño " + f.length() + " bytes.\n" +
            "¿Desea borrarlo? (si/no) ");
            String delete = new Scanner(System.in).nextLine();
            if (delete.equals("si")) {
                f.delete();
                System.out.println("El archivo ha sido borrado correctamente.");
            } else {
                System.out.println("Borrado cancelado.");
            }
        }
    }
}
