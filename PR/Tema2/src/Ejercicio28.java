import java.net.*;
import java.util.Scanner;
import java.io.IOException;
public class Ejercicio28 {
    public static void main(String[] args) {
    // Ejercicio 28 : Usa la clase InetAddress para hacer un programa quepregunte por un nombre
    // de equipo de la red y nos muestre su dirección IP.
        try {
            System.out.println("Introduzca un nombre de equpo: ");
            String n = new Scanner(System.in).nextLine();
            InetAddress i = InetAddress.getByName("www.google.com");
            System.out.println("La IP de " + i.getHostName() + " es " + i.getHostAddress());
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
