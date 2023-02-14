package com.colegio.clases;

public enum Valoracion {
    MUY_DEFICIENTE, INSUFICIENTE, SUFICIENTE, BIEN, NOTABLE, SOBRESALIENTE;

    public boolean esAprobado() {
        boolean aprobado = false;
        if (this.ordinal() > 1) {
            aprobado = true;
        }
        return aprobado;
    }

    public boolean esSuspenso() {
        boolean suspenso = false;
        if (this.ordinal() < 2) {
            suspenso = true;
        }
        return suspenso;
    }
}
