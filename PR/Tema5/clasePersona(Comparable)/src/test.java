import java.util.*;
import java.time.*;

public class test {
    public static void main(String[] args) {
        List<Persona> lista = new ArrayList<>();

        Localidad gr = new Localidad(1, "Granada");
        Localidad ma = new Localidad(2, "Málaga");
        Localidad ja = new Localidad(2, "Jaén");

        lista.add(new Persona("Jose", 30, LocalDate.now().minusYears(30), gr));
        lista.add(new Persona("María", 20, LocalDate.now().minusYears(20), ma));
        lista.add(new Persona("Antonio", 80, LocalDate.now().minusYears(80), gr));
        lista.add(new Persona("Ana", 50, LocalDate.now().minusYears(50), ja));
        lista.add(new Persona("Hermenegildo", 120, LocalDate.now().minusYears(120), ma));

        // Ordena la lista según el orden natural
        Collections.sort(lista);

        // Compara por edad
        ComparadorPersonaEdad comparador = new ComparadorPersonaEdad();
        Collections.sort(lista, comparador);

        for (Persona p : lista) {
            System.out.println(
                    "%s ... %d ... %s".formatted(p.getNombre(), p.getEdad(), p.getFechaNacimiento().toString()));
        }
    }

    static class Persona implements Comparable<Persona> {

        private String nombre;
        private int edad;
        private LocalDate fechaNacimiento;
        private Localidad localidad;

        public Persona(String n, int e, LocalDate fn, Localidad l) {
            nombre = n;
            edad = e;
            fechaNacimiento = fn;
            localidad = l;
        }

        public Localidad getLocalidad() {
            return localidad;
        }

        public String getNombre() {
            return nombre;
        }

        public int getEdad() {
            return edad;
        }

        public LocalDate getFechaNacimiento() {
            return fechaNacimiento;
        }

        @Override
        public int compareTo(Persona p) {
            // return this.edad - p.edad;
            // return this.nombre.compareTo(p.nombre);
            // return this.fechaNacimiento.compareTo(p.fechaNacimiento);
            return this.localidad.compareTo(p.localidad);
        }
    }

    static record Localidad(int id, String nombre) implements Comparable<Localidad> {

        @Override
        public int compareTo(Localidad o) {
            // return this.id - o.id;
            return this.nombre.compareTo(o.nombre);
        }
    }

    static class ComparadorPersonaEdad implements Comparator<Persona> {

        @Override
        public int compare(Persona o1, Persona o2) {
            return o1.getEdad() - o2.getEdad();
        }
    }
}