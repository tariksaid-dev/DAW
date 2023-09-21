import java.util.*;
import java.util.stream.*;

public class App {

    private static List<String> palabras = List.of("lunes", "martes", "miércoles", "jueves", "viernes", "sábado",
            "domingo");

    private static List<Departamento> departamentos = List.of(
            new Departamento("informática", List.of(
                    new Empleado("Antonio", 1000),
                    new Empleado("Jose", 900),
                    new Empleado("Maria", 1200))),
            new Departamento("limpieza", List.of(
                    new Empleado("Luis", 900),
                    new Empleado("Manuel", 950))),
            new Departamento("transporte", List.of(
                    new Empleado("Ana", 1000),
                    new Empleado("Hermenegildo", 950))));

    public static void main(String... args) {
        // A partir de la lista de departamentos, muestra en pantalla el nombre y sueldo
        // de todos los empleados que ganan más de 1000 euros ordenados alfabeticamente

        departamentos.stream()
                .flatMap(t -> t.getEmpleados().stream())
                .filter(t -> t.sueldo() > 1000)
                .sorted(Comparator.comparing(empleado -> empleado.nombre()))
                .map(t -> t.nombre() + " " + t.sueldo())
                .forEach(System.out::println);
    }

    public static void main6(String... args) {
        // forma un String con todas las palabras pegadas y separadas por comas
        palabras.stream().collect(Collectors.joining(", "));
    }

    public static void main5(String... args) {
        Stream
                .generate(() -> new Random().nextInt(0, 501))
                .limit(1000)
                .distinct()
                .map(t -> t * t)
                .mapToInt(i -> i)
                .sum();
    }

    public static void main4(String... args) {
        // genera 1000 números aleatorios entre 0 y 500 quita los que se repitan y
        // calcula la suma de sus cuadrados
        int resutlado = Stream.generate(() -> new Random().nextInt(0)).limit(0).distinct().map(t -> t * t).reduce(0,
                (a, b) -> a + b);

    }

    public static void main3(String... args) {
        // Pide al usuario un String y muestra por pantalla cuántas veces sale la letra
        // "a"

        String frase = "aaa";
        long a = frase.chars().filter(value -> value == 'a').count();
    }

    public static void main2(String[] args) {
        // genera 500 números aleatorios diferentes entre 100 y 5000 y guárdalos en una
        // lista
        List<Integer> numeros = Stream.generate(() -> new Random().nextInt(100, 5001)).distinct().toList();
    }

    public static void main1(String[] args) throws Exception {

        // musetra en pantalla en mayúsculas las palabras que empiezan por la letra m y
        // tienen más de 5 letras y ordenadas alfabeticamente

        palabras
                .stream()
                .map(String::toUpperCase)
                .filter(t -> t.startsWith("m"))
                .filter(t -> t.length() > 5)
                .sorted()
                .forEach(System.out::println);
    }
}
