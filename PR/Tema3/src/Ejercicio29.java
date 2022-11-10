import java.util.ArrayList;
import java.util.*;
public class Ejercicio29 {
    public static void main(String[] args) {
//         Ejercicio 29: Un profesor hace diez exámenes y calcula la nota de la asignatura haciendo la
// nota media, pero si alguna de las notas es suspenso, entonces la calificación de la asignatura es
// suspenso. Realiza un programa que pida una por una las notas y muestre al final la nota de la
// asignatura. El programa deberá detenerse si alguno de los exámenes está suspenso.
        List<Double> list = new ArrayList<>();
        double nota = 10;
        double x = 0;
        for(int i=0; i<10 && nota >=5; i++) {
            System.out.println("Introduce la nota del exámen: ");
            nota = new Scanner(System.in).nextDouble();
            list.add(nota);
        }

        if(list.size() < 10) {
            System.out.println("Suspendiste un examen, estás suspenso");
        } else {
            for(int i=0; i<list.size(); i++) {
                x += list.get(i);
            }
            System.out.println("Tu nota media es: " + x / list.size());
        }
    }    
}
