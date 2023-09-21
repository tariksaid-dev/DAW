import java.util.Scanner;

public class Ejercicio26 {
    public static void main(String[] args) throws InterruptedException {
//         Ejercicio 26 : Consulta el pdf de la “Librería Estándar de Java” y busca la clase Thread. Realiza
// un programa que pregunte al usuario “¿cuántos segundos quiere esperar?”. El usuario
// escribirá un número entero y el programa hará una pausa de dicha cantidad de segundos.
// Pasado ese tiempo se mostrará el mensaje “Programa finalizado”.
        // Thread t = new Thread();
        System.out.println("¿Cuántos segundos quiere esperar?");
        int s = new Scanner(System.in).nextInt();
        Thread.sleep(s * 1000);
        System.out.println("Programa finalizado");
    }
}
