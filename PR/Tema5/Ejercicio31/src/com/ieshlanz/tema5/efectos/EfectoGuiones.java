package com.ieshlanz.tema5.efectos;

public class EfectoGuiones implements EfectoEspecial, Simetrico {
    protected EfectoGuiones() {
    }

    @Override
    public String getNombre() {
        return TipoEfecto.GUIONES.toString();
    }

    @Override
    public String aplicarEfecto(String frase) {
        return frase.replace(" ", "_");
    }
}
