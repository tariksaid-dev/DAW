import java.util.*;
public class Ejercicio37 {
    public static void main(String[] args) {
//         Ejercicio 37: Haz un programa que pregunte un número al usuario y nos muestre por pantalla
// si es primo o no. De las dos formas que hay de hacer el ejercicio, elige la que más fácil te sea:
//     1. Se generan todos los números desde 2 hasta el que hay antes del número. Si alguno de
//          los números generados es un divisor, entonces ya sabemos que el número no es
//          primo. En ese caso, se interrumpe la generación de números y hemos terminado. Si
//          por el contrario no hay divisores, entonces el número es primo.
//     2. Se generan todos los números desde 2 hasta el que hay antes del número y se cuenta
//          en una variable auxiliar el número de divisores que se van encontrando. Si al finalizar
// el recorrido dicha variable es 0 el número es primo.
            System.out.println("Introduce un número:");
            int num = new Scanner(System.in).nextInt();
            // 1
            boolean esPrimo = true;
            for(int i=2; i<num && num%2==0; i++) {
                esPrimo = false;
            }
            if(esPrimo==true) {
                System.out.println("El número es primo");
            } else {
                System.out.println("El número no es primo");
            }
            // 2
            int div = 0;
            for(int i=2; i<num; i++) {
                if(num%i==0) {
                    div++;
                }
            }
            if(div==0) {
                System.out.println("El número es primo");
            } else {
                System.out.println("El número no es primo");
            }
    }
}
