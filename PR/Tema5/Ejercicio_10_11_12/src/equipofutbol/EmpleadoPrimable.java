package equipofutbol;

public class EmpleadoPrimable extends Empleado {

    private boolean primado;

    public EmpleadoPrimable(String n, double s) {
        super(n, s);
    }

    public void primar() {
        if (this.esPrimado() == false) {
            this.primado = true;
        }
    }

    public boolean esPrimado() {
        return primado;
    }

}
