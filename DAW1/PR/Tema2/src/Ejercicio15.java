import java.util.*;
public class Ejercicio15 {
    public static void main(String[] args) {
//         Ejercicio 15 : Haz un programa en el que haya una variable String llamada “clave” con el texto
// que tú quieras. A continuación, el programa pedirá que introduzcas una contraseña por
// teclado. El ordenador mostrará si la variable “clave” coincide con la contraseña introducida.
        String clave = "Hola";
        System.out.println("Escribe la contraseña: ");
        String claveIn = new Scanner(System.in).nextLine();
        
        if (clave.equals(claveIn)) {
            System.out.println("Contraseña correcta.");
        } else {
            System.out.println("Contraseña incorrecta.");
        }                     
    }
}
