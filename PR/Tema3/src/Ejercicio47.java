import java.util.*;
public class Ejercicio47 {
    public static void main(String[] args) {
        // data
        String[] array1 = {"hola", "casa", "caballo", "hacha", "manzana", "ventana", "tortuga", "ratón", "mesa"};
        String[] array2 = {"hello", "house", "horse", "axe", "apple", "window", "turtle", "mouse", "table"};

        String[][] matrix = {
            {"hola", "casa", "caballo", "hacha", "manzana", "ventana", "tortuga", "ratón", "mesa"},
            {"hello", "house", "horse", "axe", "apple", "window", "turtle", "mouse", "table"}
        };

        Map<String, String> map = new HashMap<>();
        for (int i = 0; i < array1.length; i++) {
            map.put(array1[i], array2[i]);
        }

        // input
        System.out.println("Escribe una de las palabras de la lista: ");
        for(String word : array1) {
            System.out.print(word + " ");
        }
        System.out.println();
        String input = new Scanner(System.in).nextLine();

        // output 1

        for (int i = 0; i < array1.length; i++) {
            if (array1[i].equals(input)) {
                System.out.println(array2[i]);
            }
        }

        // output 2
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j].equals(input)) {
                    System.out.println(matrix[i + 1][j]);
                }
            }
        }

        // output 3
        System.out.println(map.get(input));

    }
}