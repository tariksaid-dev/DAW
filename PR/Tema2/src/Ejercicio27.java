import java.io.IOException;
import java.net.*;
import java.util.Scanner;
public class Ejercicio27 {
    public static void main(String[] args){
        //     Ejercicio 27 : Consulta el pdf de la librería “java net” y busca la clase InetAddress. Realiza un
        // programa que pregunte por teclado al usuario una dirección IP y un número llamado timeout.
        // El ordenador nos indicará si puede hacer ping a la IP indicada, esperando el tiempo que dice la
        // variable timeout.
        try {
            System.out.println("Escriba una dirección IP: ");
            String s = new Scanner(System.in).nextLine();
            System.out.println("Escriba el tiempo de timeout en milisegundos: ");
            int t = new Scanner(System.in).nextInt();
            String ip = "192.168.1.196";
            int timeout = 3;
            InetAddress a = InetAddress.getByName(ip);
            System.out.println("Haciendo ping a " + ip + " ... " 
            + a.isReachable(timeout * 1000));

        } catch (IOException e) {
            System.out.println("Error");
        } 
    }
}
