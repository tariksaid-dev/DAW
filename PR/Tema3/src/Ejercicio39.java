public class Ejercicio39 {
    public static void main(String[] args) {
        // Ejercicio 39: Realiza un programa que muestre por pantalla todas las tablas de multiplicar del 1
        // al 10.

        for(int i=1; i<11; i++) {
            for(int j=1; j<11; j++) {
                System.out.print(i*j + " ");
            }
            System.out.println("");
        }
    }
}

