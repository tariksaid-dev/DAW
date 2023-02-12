package com.tren;

public abstract class VagonPesoLimitado extends Vagon {
    private int pesoMaximo;

    public VagonPesoLimitado(int pesoMaximo) {
        this.pesoMaximo = pesoMaximo;
        if (pesoMaximo <= 0) {
            throw new IllegalArgumentException("El peso máximo debe ser positivo");
        }
    }

    public int getPesoMaximo() {
        return this.pesoMaximo;
    }

    protected void comprobarPesoMaximoExcedido() {
        if (this.getPeso() > this.pesoMaximo) {
            throw new IllegalArgumentException("Se ha superado el peso máximo");
        }
    };

}
