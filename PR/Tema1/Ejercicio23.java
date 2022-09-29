import java.util.*;

public class Ejercicio23 {
    public static void main(String[] args) {
//         Ejercicio 23 : Realiza un programa que pregunte por teclado al usuario las tres notas de sus
// exámenes y nos muestre por pantalla si su media le sale aprobado. 
        System.out.println("Introduce la nota de tu primer examen: ");
        double nota1 = new Scanner(System.in).nextDouble();
        System.out.println("Introduce la nota de tu segundo examen: ");
        double nota2 = new Scanner(System.in).nextDouble();
        System.out.println("Introduce la nota de tu tercer examen: ");
        double nota3 = new Scanner(System.in).nextDouble();
        double notaMedia = (nota1 + nota2 + nota3) / 3;
        boolean aprobado = notaMedia >= 5;
        if(aprobado) {
            System.out.println("Tu nota media es de " + notaMedia + ". Estás aprobado");
        } else {
            System.out.println("Tu nota media es de " + notaMedia + ". Estás suspenso");
        }
        // System.out.println("Tu nota media es de " + notaMedia + ". Estás aprobado?");
        // System.out.println(aprobado);
    }
}
