package daw.persona;
import java.time.LocalDate;

public class Persona {
    private String nombre;
    private DNI dni;
    private double sueldo;
    private LocalDate fechaNacimiento;
    private CuentaCorriente cuenta;

    public Persona(String n, DNI d, double s, LocalDate fn, CuentaCorriente c) {
        this.nombre = n;
        this.dni = d;
        this.sueldo = s;
        this.fechaNacimiento = fn;
        this.cuenta = c;
    }

    public Persona(String n, int numDNI, char letraDNI, double s, LocalDate fn) {
        this(n, new DNI(numDNI, letraDNI), s, fn, new CuentaCorriente());
    }

    public Persona(String n, DNI d) {
        this(n, d, 900, LocalDate.now().minusYears(20), new CuentaCorriente());
    }

    public Persona(String n, int numDNI, char letraDNI) {
        this(n, new DNI(numDNI, letraDNI), 900, LocalDate.now().minusYears(20), new CuentaCorriente());
    }

    public void aumentarSueldo(int porcentaje) {
        this.sueldo += this.sueldo * porcentaje / 100;
    }

    public void cobrarSueldo() {
        this.cuenta.añadirDinero((int)this.sueldo);
    }

    public String getNombre() {
        return this.nombre;
    }

    public DNI getDNI() {
        return this.dni;
    }

    public double getSueldo() {
        return this.sueldo;
    }

    public LocalDate getFechaNacimiento() {
        return this.fechaNacimiento;
    }

    public CuentaCorriente getCuenta() {
        return this.cuenta;
    }

    public boolean esMayorEdad() {
        return this.fechaNacimiento.isBefore(LocalDate.now().minusYears(18));
    }

    public boolean tieneDinero() {
        return this.cuenta.saldo > 0;
    }

    public boolean esMileurista() {
        return this.sueldo < 1200;
    }
}
