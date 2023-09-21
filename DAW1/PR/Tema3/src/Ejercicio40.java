import java.util.*;
public class Ejercicio40 {
    public static void main(String[] args) {
//         Ejercicio 40: Realiza un programa que pida diez notas por teclado y al final muestre su nota
// media. Si alguna nota introducida es incorrecta (negativa o superior a 10) el programa la
// preguntará nuevamente.
        int notas[] = new int[10];
        double notaTotal = 0;
        for(int i=0; i<10; i++) {
            System.out.println("Escribe una nota: ");
            int nota = new Scanner(System.in).nextInt();
            if(nota<0 || nota>10) {
                System.out.println("Nota incorrecta, ponla de nuevo");
            } else {
                notas[i]= nota;
                notaTotal += nota; 
            }
        }
        System.out.println("Tu nota media es " + (notaTotal/notas.length));
    }
}