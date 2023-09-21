import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        // double renta = new Scanner(System.in).nextDouble();
        double renta = 61000;
        int[] tipo = {5, 15, 20, 30, 45};
        int[] tramos = {10000, 20000, 35000, 60000};
        if(renta < tramos[0]) { // menor de 10000
            System.out.println("El tipo impositivo que te corresponde es del " + tipo[0] + "%"); //5%
        } else if (renta >= tramos[0] && renta < tramos[1]) { // entre 10000 y 20000
            System.out.println("El tipo impositivo que te corresponde es del " + tipo[1] + "%"); // 15%
        } else if (renta >= tramos[1] && renta < tramos[2]) { // entre 20000 y 35000
            System.out.println("El tipo impositivo que te corresponde es del " + tipo[2] + "%"); // 20%
        } else if (renta >= tramos[2] && renta <= tramos[3]) {// entre 35000 y 60000
            System.out.println("El tipo impositivo que te corresponde es del " + tipo[3] + "%"); // 30%
        } else if (renta > tramos[3]) {// mayor 60000
            System.out.println("El tipo impositivo que te corresponde es del " + tipo[4] + "%"); //45%
        }
    }
}
