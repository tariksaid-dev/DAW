import java.util.*;
public class Ejercicio38 {
    public static void main(String[] args) {
//         Ejercicio 38: Realiza un programa que pregunte al usuario una cadena de caracteres con su
// NIF. El programa deberá analizarla y decir si se trata de un NIF correcto o incorrecto. Un NIF
// correcto está formado por 8 dígitos y una letra. Los dígitos deben estar comprendidos entre 0
// y 9 y la letra debe calcularse tal y como se indica en un ejercicio del tema 1.
// Calculamos el resto de dividir el número de DNI entre 23
//  Buscamos en la siguiente lista la letra que corresponde a dicho resto y esa será la letra
// del DNI

        System.out.println("Introduce tu NIF:");
        String nif = new Scanner(System.in).nextLine();
        String[] letras = {"T","R","W","A","G","M","Y","F","P","D","X","B","N","J","Z","S","Q","V","H","L","C","K","E"};
        int num = Integer.parseInt(nif.substring(0,8));
        String letra = nif.substring(8,9);
        System.out.println(num);
        if(letra.equals(letras[num%23])) {
            System.out.println("El NIF es correcto");
        } else {
            System.out.println("El NIF es incorrecto");
        }
    }
}