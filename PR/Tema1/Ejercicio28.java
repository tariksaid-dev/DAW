import java.util.Scanner;

public class Ejercicio28 {
    public static void main(String[] args) {
//         Ejercicio 28 : En un colegio por motivos de seguridad los niños no pueden salir solos. La puerta de
// entrada está programada para abrirse cuando llega un adulto, o cuando llega un niño acompañado
// por un familiar. Haz un programa que pregunte por teclado si la persona que llega es adulta o no, y si
// va a compañada o no. Tras recoger estos datos, el programa mostrará por pantalla si la puerta
// deberá o no abrirse. 
        System.out.println("Eres un adulto? Escribe 'true' si lo eres, y 'false' si no:");
        boolean adulto = new Scanner(System.in).nextBoolean();
        System.out.println("Si vas acompañado de un adulto, escribe 'true'; de lo contrario, introduce 'false':");
        boolean acompañadoAdulto = new Scanner(System.in).nextBoolean();
        if (adulto || acompañadoAdulto) {
            System.out.println("La puerta se abre.");
        } else {
            System.out.println("La puerta no se abre.");
        }
    }
}
