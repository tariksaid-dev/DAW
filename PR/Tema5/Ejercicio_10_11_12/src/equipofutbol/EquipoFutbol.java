package equipofutbol;

import java.util.*;

public class EquipoFutbol implements Nombrable {
    private String nombre;
    private List<Empleado> empleados;
    private double presupuesto;

    public EquipoFutbol(String n, double p) {
        this.nombre = n;
        this.presupuesto = p;
        this.empleados = new ArrayList<>();
    }

    public List<Empleado> getEmpleados() {
        return empleados;
    }

    public double getPresupuesto() {
        return presupuesto;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    public void addEmpleado(Empleado e) {
        if (this.empleados.size() <= 25) {
            for (Empleado i : this.empleados) {
                if (i instanceof Entrenador a) {
                    throw new IllegalArgumentException();
                }
            }
            this.empleados.add(e);
        } else {
            throw new IllegalArgumentException();
        }
    }

    public void pagarSueldoEmpleados() {
        // if primado sueldo + 10%
        // if not presupuesto se divide y se paga al resto de jugadores

        // 1. iteramos
        // si es primado y hay presupuesto, se le paga y se resta
        // si no es primado y hay presupuesto, se le paga y se resta
        // si no hay presupuesto, dividimos presupuesto entre lo que quede por iterar
        for (int i = 0; i < this.empleados.size(); i++) {
            if (this.empleados.get(i) instanceof EmpleadoPrimable ep) {
                if (ep.esPrimado() && this.presupuesto > this.empleados.get(i).getSueldo() * 1.1) {
                    try {
                        double sueldoPrimado = this.empleados.get(i).getSueldo() * 1.1;
                        this.empleados.get(i).cobrar(sueldoPrimado);
                        this.presupuesto = this.presupuesto - sueldoPrimado;
                    } catch (CabreoException e) {
                        System.out.println(e);
                    }
                } else if (!ep.esPrimado() && this.presupuesto > this.empleados.get(i).getSueldo()) {
                    try {
                        this.empleados.get(i).cobrar(this.empleados.get(i).getSueldo());
                        this.presupuesto = this.presupuesto - this.empleados.get(i).getSueldo();
                    } catch (CabreoException e) {
                        System.out.println(e);
                    }
                } else {
                    double nuevoSueldo = this.presupuesto / (this.empleados.size() - i);
                    for (int j = i; j < this.empleados.size(); j++) {
                        try {
                            this.empleados.get(j).cobrar(nuevoSueldo);
                        } catch (CabreoException e) {
                            System.out.println(e);
                        }
                    }
                }
            }
        }
    }
}