import java.io.File;
import java.io.IOException;
import java.awt.*;

public class Ejercicio47 {
    public static void main(String[] args) {
//         Ejercicio 47 : Consulta el pdf de la “Librería Estándar de Java” y busca la clase Desktop. Haz un
// programa que pregunte al usuario la ruta de un archivo. El programa abrirá dicho archivo
// usando para ello el programa que esté configurado en el sistema operativo.
        String ruta = "C:/Users/trutr/Desktop/El refugio subterráneo.pdf";
        File f = new File(ruta);
        try {
            Desktop.getDesktop().open(f);
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
