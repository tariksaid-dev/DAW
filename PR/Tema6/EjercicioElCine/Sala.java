package EjercicioElCine;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Sala {
    private int numero;
    private int capacidad;
    private Pelicula pelicula;
    private List<Integer> plazasLibres;
    
    public Sala(int n, int c, Pelicula p) {
        this.numero = n;
        this.capacidad = c;
        this.pelicula = p;
        this.plazasLibres = new ArrayList<>();
        
        for(int i = 1; i < this.capacidad + 1; i++) {
            this.plazasLibres.add(i);
        }
    }
    
    public int getCapacidad() {
        return this.capacidad;
    }
    
    public Pelicula getPelicula() {
        return this.pelicula;
    }
    
    public int getNumeroPlazasLibres() {
        return this.plazasLibres.size();
    }
    
    public String getPlazasLibres() {
        String x = "";
        for(int i = 0; i <this.plazasLibres.size(); i++) {
            x += this.plazasLibres.get(i) + ", ";
        }
        return x;
    }
    
    public int buscarPlazaLibre() {
        if(this.getNumeroPlazasLibres() == 0) {
            throw new IllegalArgumentException("No hay ninguna plaza libre en la sala");
        }
        return new Random().nextInt(this.getNumeroPlazasLibres() + 1);
    }
    
    public boolean reservar(int n) {
        boolean x = false;
        if(this.plazasLibres.contains(n)) {
            this.plazasLibres.remove(n -1);
            x = true;
        }
        return x;
    }
    
    @Override
    public String toString() {
        return "Sala " + this.numero + "-" + this.pelicula.getTitulo();
    }
    
}
