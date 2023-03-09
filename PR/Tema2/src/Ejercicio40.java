public class Ejercicio40 {
    public static void main(String[] args) {
//         Ejercicio 40 : Consulta el pdf de la “Librería Estándar de Java” y busca la clase Runtime. Haz un
// programa que muestre por pantalla el número de procesadores de tu ordenador y la cantidad
// de memoria total asociada al proceso de Java por el sistema operativo.
        Runtime r = Runtime.getRuntime();
        System.out.println("Tu ordador tiene " + r.availableProcessors() + " procesadores.");
        System.out.println("La memoria asociada a Java es: " + r.totalMemory() / 1024 / 1024 + " MB");
    }
}
