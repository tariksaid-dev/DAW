import java.util.*;
public class Ejercicio11 {
    public static void main(String[] args) {
//         Ejercicio 11: Realiza un programa que calcule de forma aproximada la raíz cuadrada de un
// número positivo N introducido desde el teclado usando el Método de Newton-Raphson, que
// consiste en lo siguiente:
//      Creamos dos variables de tipo double llamadas S y A, y les damos valor inicial uno.
//      Actualizamos S con la siguiente fórmula:
//      Si el valor absoluto de la diferencia entre S y A es menor de 0.000001 entonces ya
//          hemos terminado y la raíz cuadrada aproximada es S. En caso contrario, le damos a A
// el valor de S y repetimos el proceso a partir del punto anterior.
        System.out.println("Introduce un número positivo:");
        double num = new Scanner(System.in).nextDouble();
        double a = 1;
        double s = 1.0/2.0 * (a + num/a);

        while (s-a > 0.000001) {
            a = s;
            s = 1.0/2.0 * (a + num/a);
        }
        System.out.println("La raíz cuadrada aproximada es " + s);
    }
}
