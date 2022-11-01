import java.util.*;
public class Ejercicio2 {
    public static void main(String[] args) {
        System.out.println("Introduce la cantidad de dinero depositada: ");
        // double balance = new Scanner(System.in).nextInt();
        double balance = 100;
        double interés = 0.04;
        balance += interés * balance;
        System.out.println("El primer año, la cantidad de ahorros será " + balance);
        balance += interés * balance;
        System.out.println("El segundo año, la cantidad de ahorros será " + balance);
        balance += interés * balance;
        System.out.println("El tercer año, la cantidad de ahorros será " + balance);
    }
}
