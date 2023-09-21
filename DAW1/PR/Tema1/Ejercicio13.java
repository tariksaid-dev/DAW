import java.util.*;

public class Ejercicio13 {
    public static void main(String[] args) {
//         Ejercicio 13 : Haz un programa que pregunte al usuario tres números enteros y guárdalos en
// variables llamadas horas, minutos y segundos. El programa mostrará el número total de segundos
// que hay juntando las cantidades de tiempo expresadas en las tres variables. 
    System.out.println("Di un número de horas:");
    int horas = new Scanner(System.in).nextInt();
    System.out.println("Di un número de minutos:");
    int minutos = new Scanner(System.in).nextInt();
    System.out.println("Di un número de segundos:");
    int segundos = new Scanner(System.in).nextInt();
    System.out.println("En tus 3 cifras hay un total de " + (segundos + (minutos * 60) + (horas * 3600)) + " segundos.");
    }
}
