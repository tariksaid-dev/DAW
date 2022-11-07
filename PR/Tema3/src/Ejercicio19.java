import java.util.*;
import java.net.*;
import java.io.*;
import java.time.*;

public class Ejercicio19 {
    public static void main(String[] args) {
//         Ejercicio 19: Realiza un programa que pregunte por teclado una dirección IP y un número
// entero. El programa usará la clase InetAddress para realizar la cantidad de pings indicada a la
// dirección IP, midiendo el tiempo empleado en hacer cada uno (clases Instant y Duration), y
// mostrará el resultado de esta forma:
        

        System.out.println("Introduce una dirección IP:");
        String s = new Scanner(System.in).nextLine();
        System.out.println("Introduce un número:");
        int t = new Scanner(System.in).nextInt();
        try {
            InetAddress url = Inet4Address.getByName(s);
            for(int i=0; i<t; i++) {
                Instant i1 = Instant.now();
                System.out.println("Haciendo ping a " + url.getHostName() + " [" + url.getHostAddress() + "]");
                Instant i2 = Instant.now();
                System.out.println("Respuesta desde " + url.getHostAddress() + ": tiempo=" + Duration.between(i1, i2).toMillis() + "ms");
            }
        } catch (IOException e) {
            System.out.println("Error");
        } 
    }
}


