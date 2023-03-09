import java.util.Arrays;
import java.util.stream.IntStream;

public class Ejercicio25 {
    public static void main(String[] args) {
//         Ejercicio 25: Haz un programa en el que haya un array rellenado con 5000 ceros. A
// continuación el programa modificará las posiciones impares y guardará un 1 en ellas. Al
// terminar, se mostrarán todos los números del array en pantalla.
        int[] x = new int[5000];
        for(int i=0; i<x.length;i++) {
            if(i%2 != 0) {
                x[i] = 1;
            }
        }
        System.out.println(Arrays.toString(x));
    }
}
