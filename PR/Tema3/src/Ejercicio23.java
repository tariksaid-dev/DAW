import java.util.*;
public class Ejercicio23 {
    public static void main(String[] args) {
//         Ejercicio 23: Realiza un programa que cree la lista de números del ejercicio anterior. A
// continuación, el programa preguntará al usuario: “Escribe un número” y nos mostrará en
// pantalla cuántas veces aparece el número en la lista y si el número está o no en la lista.
        int[] lista = {2,9,4,5,6,1,2,3,45,2,1,2,65,3,2,6,1,2,3,5,2,2,6,67,11,67,3,2,1,7,8,5,3,27,8,93,1,6};
        System.out.println("Escribe un número:");
        int ans = new Scanner(System.in).nextInt();
        int x = 0;
        for(int i : lista) {
            if (i == ans) {
                x+=1;
            }
        }   
        if(x==0) {
            System.out.println("Tu número no aparece en la lista");
        } else {
            System.out.println("Tu número aparece " + x + " veces en la lista.");
        }
    }
}
