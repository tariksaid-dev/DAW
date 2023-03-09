import java.util.Arrays;


public class Ejercicio45 {
    public static void main(String[] args) {
        // data
        int[] a = {50, 26, 7, 9, 15, 27};
        // loop 1
        for (int i = 0; i < a.length; i++) {
            int temp = 0;
            // variable para index
            int min = i;
            // loop 2, i+1 (no necesito comparar último elemento)
            for (int j = i + 1; j < a.length; j++) {
                // comparo elemento loop 1 con elemento loop 2
                if (a[j] < a[min]) {
                    // guardo posición del elemento más pequeño
                    min = j; // first loop, min = a[2] == 7
                }
            }
            // para match con el proceso gráfico del enunciado
            // System.out.println("i: " + i + " min: " + min);
            if (i != 5) {
                temp = a[i]; // temp = 50
                a[i] = a[min]; // a[0] = 7
                a[min] = temp; // a[2] = 50   
                System.out.println(Arrays.toString(a));
            }
        }
    }
}
