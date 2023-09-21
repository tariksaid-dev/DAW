package com.tren;

public abstract class Vagon implements Pesado {
    private Vagon vagonSiguiente;
    private Vagon vagonAnterior;

    public void enganchar(Vagon v) {
        // 3 vagones:
        // Este -> ANTERIOR =, SIGUIENTE = V;
        // V -> ANTERIOR = ESTE, SIGUIENTE = SIGUIENTE ESTE
        // El siguiente a este -> SIGUIENTE =, ANTERIOR = V

        // v -> No puede ser una locomotora (debe ir la primera)
        if (!(v instanceof Locomotora)) {
            v.vagonAnterior = this;
            v.vagonSiguiente = this.vagonSiguiente;
        }

        // siguiente a este -> Puede no existir
        if (this.vagonSiguiente != null) {
            this.vagonSiguiente.vagonAnterior = v;
        }

        // this
        this.vagonSiguiente = v;
    }

    public Vagon getVagonSiguiente() {
        return this.vagonSiguiente;
    }

    public Vagon getVagonAnterior() {
        return this.vagonAnterior;
    }

    public abstract int getPeso();

}
