import java.util.Random;

public class Ejercicio5 {
    public static void main(String[] args) {
//         Ejercicio 5: Realiza un programa que genere números enteros aleatorios entre 0 y 10 y los
// muestre por pantalla. El programa terminará cuando el número generado sea el 10.
        int x = 0;
        while(x!=10) {
            x = new Random().nextInt(11);
            System.out.println(x);
        }
    }
}
