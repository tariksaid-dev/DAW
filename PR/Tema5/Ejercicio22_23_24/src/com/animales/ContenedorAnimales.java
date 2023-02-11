package com.animales;

import java.util.*;

public abstract class ContenedorAnimales {
    protected Set<Animal> animales;

    public ContenedorAnimales() {
        this.animales = new HashSet<>();
    }

    public boolean añadir(Animal a) {
        return this.comprobarDisponibilidadPlaza(a);
    }

    public boolean retirar(Animal a) {
        if (this.animales.contains(a)) {
            this.animales.remove(a);
        }
        return this.animales.contains(a) ? false : true;
    }

    public int getPesoActual() {
        int peso = 0;
        for (Animal a : animales) {
            peso += a.getPeso();
        }
        return peso;
    }

    public int getNumeroAnimales() {
        return this.animales.size();
    }

    protected abstract boolean comprobarDisponibilidadPlaza(Animal a);
}
