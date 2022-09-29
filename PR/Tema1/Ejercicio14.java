import java.util.*;

public class Ejercicio14 {
    public static void main(String[] args) {
        // Ejercicio 14 : Realiza un programa que pregunte al usuario por teclado un número de “euros” y el
        // programa mostrará por pantalla el cambio de dicha cantidad a las siguientes monedas: 
    System.out.println("Introduce la cantidad de euros que quieres cambiar:");
    double euros = new Scanner(System.in).nextDouble();
    double dolares = euros * 1.42;
    double libras = euros * 0.8713;
    double yens = euros * 113.86;
    double pesetas = euros * 166.386;
    System.out.println("Tus " + euros + " euros, al cambio son " + dolares + " dolares.");
    System.out.println("Tus " + euros + " euros, al cambio son " + libras + " libras.");
    System.out.println("Tus " + euros + " euros, al cambio son " + yens + " yens.");
    System.out.println("Tus " + euros + " euros, al cambio son " + pesetas + " pesetas.");    
    }
}
