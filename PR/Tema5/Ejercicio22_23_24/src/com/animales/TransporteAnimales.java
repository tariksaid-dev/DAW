package com.animales;

public class TransporteAnimales extends Jaula {
    public TransporteAnimales() {
        super(6, 500);
    }

    @Override
    protected boolean comprobarDisponibilidadPlaza(Animal a) {
        boolean x = true;
        if (this.getCapacidadMaxima() > this.getNumeroAnimales() && this.getPesoMaximo() > this.getPesoActual()) {
            for (Animal b : this.animales) {
                if (!a.equals(b)) {
                    x = false;
                }
            }
        }
        return x;
    }
}