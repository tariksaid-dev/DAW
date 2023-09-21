public class Empleado implements Comparable<Empleado> {
    private String nombre;
    private String puesto;
    private int sueldo;

    public Empleado(String n, String p, int s) {
        this.nombre = n;
        this.puesto = p;
        this.sueldo = s;
    }

    @Override
    public int compareTo(Empleado o) {
        return this.sueldo - o.sueldo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return this.nombre;
    }

}
