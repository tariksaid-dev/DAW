import java.util.*;
public class Ejercicio7 {
    public static void main(String[] args) {
//         Ejercicio 7: Según el reglamento de la federación de caza, un cazador no puede cazar más
// piezas de las que se permiten en un día. Queremos hacer un programa que nos lleve la cuenta
// de piezas cazadas e indique cuando se ha excedido el límite. Para ello primero se leerá por
// teclado el límite del día y a continuación los valores de las piezas cazadas en el orden que se
// obtienen. El programa imprimirá un mensaje en el momento en que el límite haya sido
// excedido. Después de que cada pieza ha sido registrada, el programa mostrará el número total
// de piezas que se llevan hasta ese momento cazadas. Ejemplo:
        System.out.println("Cuántas piezas se pueden carzar hoy? ");
        int ans = new Scanner(System.in).nextInt();
        int ans2 = 0;
        while (ans>ans2) {
            System.out.println("Introduzca el número de piezas cazadas: ");
            ans2 += new Scanner(System.in).nextInt();
            if (ans>=ans2) {
                System.out.println("Usted lleva cazadas " + ans2 + " piezas de "+ ans + " posibles");
            } else {
                System.out.println("El número máximo de piezas ha sido excedido");
            }
        }
        System.out.println("Pulse una tecla para finalizar");
    }
}
