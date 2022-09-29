import java.util.*;
public class Ejercicio41 {
    public static void main(String[] args) {
//         Ejercicio 41 : Realiza un programa que pregunte un número comprendido entre 10 y 56 por teclado
// al usuario. Si el número está en dicho rango, el programa mostrará un mensaje de que es correcto, y
// en caso contrario, se indicará que no lo es. 
        System.out.println("Introduce un número entre el 10 y el 56: ");
        double numero = new Scanner(System.in).nextDouble();
        if (numero >= 10 && numero <= 56) {
            System.out.println("El número es correcto");
        } else {
            System.out.println("El número es incorrecto");
        }
    }
}