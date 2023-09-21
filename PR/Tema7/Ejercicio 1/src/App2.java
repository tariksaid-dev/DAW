import java.io.IOException;
import java.util.*;

public class App2 {
    private static void trabajar(Persona p) {
        try {
            p.trabajar();
        } catch (IOException error) {
            System.out.println(error.getMessage());
        }
    }

    public static void main(String... args) {
        // Persona p = new Persona("Antonio", 30, new Persona("Ana", 10));

        // p.getHijo().ifPresentOrElse(
        // hijo -> System.out.println(hijo.getNombre()),
        // () -> System.out.println("No tiene hijos"));

        // Optional<Persona> optHijo = p.getHijo();
        // if (optHijo.isEmpty()) {
        // System.out.println("No tiene hijos");
        // } else {
        // Persona hijo = optHijo.get();
        // System.out.println(hijo.getNombre());
        // }

        List<Persona> personas = List.of(
                new Persona("Antonio", 40),
                new Persona("Luis", 15),
                new Persona("Manuel", 60),
                new Persona("Maria", 12)

        );

        personas.forEach(App2::trabajar); // referencia a método
        personas.forEach(p -> trabajar(p)); // lambda

    }
}
