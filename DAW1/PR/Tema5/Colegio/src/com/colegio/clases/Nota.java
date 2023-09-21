package com.colegio.clases;

public record Nota(double valorNumerico) {
    public Valoracion getValoracion() {
        Valoracion valoracion = null;
        if (this.valorNumerico < 3) {
            valoracion = Valoracion.MUY_DEFICIENTE;
        } else if (this.valorNumerico >= 3 && this.valorNumerico < 5) {
            valoracion = Valoracion.INSUFICIENTE;
        } else if (this.valorNumerico >= 5 && this.valorNumerico < 6) {
            valoracion = Valoracion.SUFICIENTE;
        } else if (this.valorNumerico >= 6 && this.valorNumerico < 7) {
            valoracion = Valoracion.BIEN;
        } else if (this.valorNumerico >= 7 && this.valorNumerico < 9) {
            valoracion = Valoracion.NOTABLE;
        } else if (this.valorNumerico >= 9) {
            valoracion = Valoracion.SOBRESALIENTE;
        }

        return valoracion;
    }
}
