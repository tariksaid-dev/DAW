package com.ieshlanz.tema5.efectos;

public class EfectoMayusculas implements EfectoEspecial {
    protected EfectoMayusculas() {
    }

    @Override
    public String getNombre() {
        return TipoEfecto.MAYUSCULAS.toString();
    }

    @Override
    public String aplicarEfecto(String frase) {
        return frase.toUpperCase();
    }
}
