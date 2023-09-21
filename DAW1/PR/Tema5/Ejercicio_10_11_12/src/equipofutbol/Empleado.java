package equipofutbol;

public class Empleado implements Nombrable {
    private String nombre;
    private double sueldo;
    private double dinero;

    public Empleado(String n, double s) {
        this.nombre = n;
        this.sueldo = s;
    }

    public double getSueldo() {
        return sueldo;
    }

    public double getDinero() {
        return dinero;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    public void cobrar(double cantidad) throws CabreoException {
        if (cantidad < this.sueldo) {
            this.sueldo += cantidad;
            throw new CabreoException(
                    "Al empleado " + this.nombre + " no se le han pagado " + (this.sueldo - cantidad) + " euros");
        } else {
            this.sueldo += cantidad;
        }
    }
}
