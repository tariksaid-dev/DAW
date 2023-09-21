import java.util.*;
public class Ejercicio17 {
    public static void main(String[] args) {
//         Ejercicio 17 : Como ya sabes, una dirección de correo tiene el formato nombre@dominio.
// Realiza un programa que pregunte al usuario su nombre y después su dominio. En caso de que
// el dominio termine en .com o .es, el programa formará una nueva variable
// llamada “correo” a partir de ellos y la mostrará por pantalla. En caso contrario, mostrará un
// mensaje de error “El dominio es incorrecto”.
        System.out.println("Introduce tu nombre: ");
        String nombre = new Scanner(System.in).nextLine();
        System.out.println("Introduce tu dominio: ");
        String dominio = new Scanner(System.in).nextLine();
        String finDominoEs = ".es";
        String finDominoCom = ".com";
        
        if (dominio.endsWith(finDominoEs) || dominio.endsWith(finDominoCom)) {
            System.out.println("Tu correo es " + nombre + dominio);
        } else {
            System.out.println("El dominio es incorrecto");
        }
    }
}