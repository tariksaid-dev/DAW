package daw.persona;
import java.time.LocalDate;

public class Persona {
    public String nombre;
    public DNI dni;
    public double sueldo;
    public LocalDate fechaNacimiento;

    public Persona(String n, DNI d, double s, LocalDate fn) {
        this.nombre = n;
        this.dni = d;
        this.sueldo = s;
        this.fechaNacimiento = fn;
    }

    public Persona(String n, int numDNI, char letraDNI, double s, LocalDate fn) {
        this(n, new DNI(numDNI, letraDNI), s, fn);
        //this.nombre = n;
        //this.dni = new DNI(numDNI, letraDNI);
        //this.sueldo = s;
        //this.fechaNacimiento = fn;
    }

    public Persona(String n, DNI d) {
        this(n, d, 900, LocalDate.now().minusYears(20));
    }

    public Persona(String n, int numDNI, char letraDNI) {
        this(n, new DNI(numDNI, letraDNI), 900, LocalDate.now().minusYears(20));
        // this.nombre = n;
        // this.dni = new DNI(numDNI, letraDNI);
        // this.sueldo = 900;
        // this.fechaNacimiento = LocalDate.now().minusYears(20);
    }
}
