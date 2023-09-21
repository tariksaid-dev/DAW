import java.util.*;
import java.util.stream.*;

public class Ejemplos {
    public static void main(String... args) {
        List<String> palabras = List.of("lunes", "hola", "martes", "viernes", "sábado", "jueves", "domingo");

        // contar as
        long a = palabras.stream().filter(t -> t.contains("a")).count();

        // que muestre en mayusculas toda slas palabras con más de 3 letras que
        // contengan la a
        palabras.stream().filter(t -> t.contains("a")).filter(t -> t.length() > 3).map(t -> t.toUpperCase())
                .forEach(System.out::println);

        // proque nos dice si es un número primo
        IntStream.range(2, 12530)
                .filter(value -> 12530 % value == 0)
                .findAny()
                .ifPresentOrElse(n -> System.out.println("aaa"), () -> System.out.println("eee"));

        // programa que ordena esta lista de números de menor a mayor
        // (5,2, 9, 4, 6);

        IntStream.of(5, 2, 9, 4, 6).sorted().forEach(System.out::println);

        // creamos 4 empleados

        Empleado x = new Empleado("Antonio", "Programador", 1000);
        Empleado b = new Empleado("Manuel", "Analista", 2000);
        Empleado c = new Empleado("Ana", "Programador", 1000);
        Empleado d = new Empleado("Lucía", "Jefe de proyecto", 5000);

        // usa pr funcional para conseguir una lista de empleados ordenados de menor a
        // mayor sueldo
        // Stream.of(a,b,c,d).sorted(o1, o2 -> o1.

        // 0) sube 100 euros el sueldo a los empleados que ganan menos de 1500 euros
        Stream.of(x, b, c, d).filter(t -> t.getSueldo() < 1500).forEach(t -> t.setSueldo(t.getSueldo() + 100));
        // 1)
        List<Empleado> programadores = Stream.of(x, b, c, d).filter(t -> t.getSueldo() < 1500).toList();

        // 2)

    }
}
