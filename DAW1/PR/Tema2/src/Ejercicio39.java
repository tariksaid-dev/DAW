import java.util.*;

public class Ejercicio39 {
    public static void main(String[] args) {
//         Ejercicio 39 : Consulta el pdf de la “Librería Estándar de Java” y busca la clase System. Haz un
// programa que muestre por pantalla información sobre tu ordenador, de la forma que indica la
// siguiente imagen. (Nota: La carpeta de archivos temporales es la variable de entorno TMP).
        String oS = System.getProperty("os.name");
        String oSVers = System.getProperty("os.version");
        String oSArch = System.getProperty("os.arch");
        String user = System.getProperty("user.name");
        String tempDir = System.getProperty("java.io.tmpdir");
        System.out.println(oS);
        System.out.println(oSVers);
        System.out.println(oSArch);
        System.out.println(user);
        System.out.println(tempDir);
    }
}
