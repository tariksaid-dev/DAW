import java.util.*;
public class Ejercicio18 {
    public static void main(String[] args) {
//         Ejercicio 18 : Haz un programa que pregunte al usuario por su dirección de correo y la
// descomponga en su nombre de usuario y su dominio.
        System.out.println("Introduce tu email: ");
        String email = new Scanner(System.in).nextLine();
        int index = email.indexOf("@");
        
        String nombre = email.substring(0, index);
        String dominio = email.substring(index + 1);
        System.out.println("-Tu nombre de usuario es: " + nombre + "\n-Tu dominio es: " + dominio);
    }
}