package com.animales;

import java.util.*;

public abstract class ContenedorAnimales {
    protected Set<Animal> animales;

    public ContenedorAnimales() {
        this.animales = new HashSet<>();
    }

    public boolean añadir(Animal a) {
        boolean puedeAñadir = this.comprobarDisponibilidadPlaza(a);
        if (animales.contains(a)) {
            animales.add(a);
            a.setEncerrado(true);
        }
        return puedeAñadir;
    }

    public boolean retirar(Animal a) {
        return this.animales.remove(a);
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
