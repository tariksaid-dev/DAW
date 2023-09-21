import java.io.IOException;
import java.util.Optional;

public class Persona {
    private int edad;
    private String nombre;
    private Persona hijo;

    public Persona(String nombre, int edad) {
        this(nombre, edad, null);
    }

    public Persona(String nombre, int e, Persona h) {
        this.nombre = nombre;
        this.edad = e;
        this.hijo = h;
    }

    public void trabajar() throws IOException {
        if (this.edad < 18) {
            throw new IOException("Un menor no puede trabajar");
        } else {
            System.out.println("La persona " + nombre + " está trabajando");
        }
    }

    public int getEdad() {
        return this.edad;
    }

    public Optional<Persona> getHijo() {
        // Optional<Persona> o = Optional.empty();
        // if (this.hijo != null) {
        // o = Optional.of(this.hijo);
        // }
        // return o;

        // return this.hijo == null ? Optional.empty() : Optional.of(this.hijo);

        // si hijo es null, devuelve caja vacio, si no, devuelve caja con hijo
        return Optional.ofNullable(this.hijo);
    }

    public String getNombre() {
        return this.nombre;
    }

}