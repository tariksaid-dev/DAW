package daw.persona;
import java.time.LocalDate;
import java.util.*;

public class Oficina {
    private String nombre;
    private ArrayList<Persona> trabajadores;
    
    private Oficina(String nombre) {
        this(nombre, 0);
    }

    private Oficina(String nombre, int tipo) {
        this.nombre = nombre;
        if(tipo == 0 || tipo > 3 ) {
            this.trabajadores = new ArrayList<Persona>();
        } else if(tipo == 1) {
            this.trabajadores = new ArrayList<Persona>(List.of(
                new Persona("Antonio Pérez Pérez", 11111111, 'H', 900, LocalDate.of(2000, 2, 28))));
        } else if (tipo == 2) {
            this.trabajadores = new ArrayList<Persona>(List.of(
                new Persona("Antonio Pérez Pérez", 11111111, 'H', 900, LocalDate.of(2000, 2, 28)), 
                new Persona("Luis López López", 22222222, 'J', 1000, LocalDate.of(1995, 9, 10))));
        } else if (tipo == 3) {
            this.trabajadores = new ArrayList<Persona>(List.of(
                new Persona("Antonio Pérez Pérez", 11111111, 'H', 900, LocalDate.of(2000, 2, 28)), 
                new Persona("Luis López López", 22222222, 'J', 1000, LocalDate.of(1995, 9, 10)), 
                new Persona("Ana Díaz Díaz", 33333333, 'P', 1200, LocalDate.of(1985, 5, 21))));
        }             
    }

    private Oficina() {
        this("Industrias DAW", 3);
    }

    public void añadirEmpleado(Persona p) {
        this.trabajadores.add(p);
    }

    public void añadirEmpleado(String nombre, String DNI, double sueldo, LocalDate fechaNac) {
        this.trabajadores.add(new Persona(nombre, new DNI(DNI), sueldo, fechaNac, new CuentaCorriente()));
    }

    public int getTotalEmpleados() {
        return this.trabajadores.size();
    }

    public int getTotalEmpleadosMileuristas() {
        int total = 0;
        for(Persona p : this.trabajadores) {
            if(p.getSueldo() < 1200) {
                total++;
            }
        }
        return total;
    }

    public List<Persona> getMileuristas() {
        List<Persona> mileuristas = new ArrayList<Persona>();
        for(Persona p : this.trabajadores) {
            if(p.getSueldo() < 1200) {
                mileuristas.add(p);
            }
        }
        return mileuristas;
    }

    public boolean trabaja(Persona p) {
        return this.trabajadores.contains(p);
    }

    public void pagarEmpleados() {
        for(Persona p : this.trabajadores) {
            p.cobrarSueldo();
        }
    }

    public void mostrarInformeEmpleados() {
        for (Persona p : this.trabajadores) {
            System.out.println(p.getNombre() + ", DNI: " + p.getDNI() + ", sueldo: " + p.getSueldo());
            if(p.esMileurista()) {
                System.out.print(", es mileurista");
            } else {
                System.out.print(", no es mileurista");
            }
        }
    }

    public double getMediaSueldos() throws Exception {
        if(this.trabajadores.size() == 0) {
            throw new Exception("No hay empleados en la oficina");
        }
        double total = 0;
        for(Persona p : this.trabajadores) {
            total += p.getSueldo();
        }
        return total / this.trabajadores.size();
    }

    public static Oficina getOficinaVacia(String nombre) {
        return new Oficina(nombre);
    }

    public static Oficina getOficinaPequeña(String nombre) {
        return new Oficina(nombre, 1);
    }

    public static Oficina getOficinaMediana(String nombre) {
        return new Oficina(nombre, 2);
    }

    public static Oficina getOficinaGrande(String nombre) {
        return new Oficina(nombre, 3);
    }
}
