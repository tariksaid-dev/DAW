package com.animales;

public class Jaula extends ContenedorAnimales {
    private int capacidadMaxima;
    private int pesoMaximo;

    public Jaula(int cm, int pm) {
        super();
        this.capacidadMaxima = cm;
        this.pesoMaximo = pm;
    }

    public int getCapacidadMaxima() {
        return this.capacidadMaxima;
    }

    public int getPesoMaximo() {
        return this.pesoMaximo;
    }

    @Override
    protected boolean comprobarDisponibilidadPlaza(Animal a) {
        return this.capacidadMaxima > this.getNumeroAnimales() && this.pesoMaximo > this.getPesoActual();
    }
}
