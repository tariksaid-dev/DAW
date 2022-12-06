package daw.persona;
import java.time.LocalDate;
import java.util.*;

public class Oficina {
    public String nombre;
    public ArrayList<Persona> trabajadores;
    
    public Oficina(String nombre) {
        this(nombre, 0);
    }

    public Oficina(String nombre, int tipo) {
        this.nombre = nombre;
        if(tipo == 0 || tipo > 3 ) {
            this.trabajadores = new ArrayList<Persona>();
        } else if(tipo == 1) {
            this.trabajadores = new ArrayList<Persona>(List.of(
                new Persona("Antonio Pérez Pérez", 11111111, 'H', 900, LocalDate.of(2000, 2, 28))));
        } else if (tipo == 2) {
            // trabajador nuevo y el trabajador del tipo 1
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

    public Oficina() {
        this("Industrias DAW", 3);
    }
}
