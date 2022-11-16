import java.util.Random;

public class Ejercicio43 {
    public static void main(String[] args) {
//         Ejercicio 43: Haz un programa que cree una tabla de 4 filas y 3 columnas rellenada con
// booleanos aleatorios. El programa mostrará la tabla en pantalla y después la recorrerá y nos
// dirá cuántos true y cuántos false hay en la tabla.
        Random r = new Random();
        Boolean[][] x = new Boolean[4][3];

        for(int i=0; i<x.length;i++) {
            for(int j=0; j<x[i].length; j++) {
                x[i][j] = r.nextBoolean();
                System.out.print(x[i][j] + " ");
            }
            System.out.println();
        }

        int cntTrue = 0;
        int cntFalse = 0;
        for(int i=0; i<x.length; i++) {
            for(int j=0; j<x[i].length; j++) {
                if(x[i][j] == true) {
                    cntTrue++;
                } else {
                    cntFalse++;
                }
            }
        }
        System.out.println("Hay " + cntTrue + " verdaderos y " + cntFalse + " falsos.");
    }
}
