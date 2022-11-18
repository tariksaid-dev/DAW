import java.util.*;
public class Ejercicio36 {
    public static void main(String[] args) {
//         Ejercicio 36: Haz un programa que pregunte un número al usuario y nos muestre la lista de
// todos sus divisores.
        System.out.println("Introduce un número:");
        int num = new Scanner(System.in).nextInt();
        for(int i=1; i<=num; i++) {
            if(num%i==0) {
                System.out.println(i);
            }
        }
    }
}
