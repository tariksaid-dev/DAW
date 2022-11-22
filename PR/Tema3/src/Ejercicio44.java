import java.util.*;
public class Ejercicio44 {
    public static void main(String[] args) {
//         Ejercicio 44: Haz un programa que pregunte al usuario el número total de filas y el número
// total de columnas, y cree una tabla de números, en la que cada número es la suma de su
// número de fila y número de columna. Aquí tienes un ejemplo si elegimos 3 filas y 3 columnas:
        // Input
        System.out.println("Introduce un número de filas:");
        int rows = new Scanner(System.in).nextInt();
        System.out.println("Introduce un número de columnas:");
        int cols = new Scanner(System.in).nextInt();
        
        // Data
        int[][] x = new int[rows][cols];

        // Loop
        for(int i=0; i<x.length; i++) {
            for(int j=0; j<x[i].length; j++) {
                x[i][j] = i + j;
                System.out.print(x[i][j] + " ");
            }
            System.out.println();
        }
    }
}