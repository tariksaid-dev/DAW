import java.util.*;

public class App {
    public static void main(String... args) {
        List<String> frases = new ArrayList<>();
        frases.add("a");
        frases.add("b");
        frases.add("c");
        frases.add("d");

        frases.removeIf(s -> s.contains("a"));
        frases.forEach(f -> System.out.println(f));

        // crea un list<Persona> con tres personas de 10, 50 y 18. Borra las personas
        // mayores de edad.

        List<Persona> list = new ArrayList<>();

        list.add(new Persona("Juan", 10));
        list.add(new Persona("Pedro", 18));
        list.add(new Persona("Maria", 35));
        list.add(new Persona("Pepe", 6));

        list.removeIf(p -> p.getEdad() >= 18);

        // Queremos actualizar cada palabra de la lista de frases pasándola a mayúscula

        frases.replaceAll(f -> f.toUpperCase());
        frases.replaceAll(String::toUpperCase);
        // frases.forEach(f -> System.out.println(f));
        frases.forEach(System.out::println); // version mejorada

    }
}