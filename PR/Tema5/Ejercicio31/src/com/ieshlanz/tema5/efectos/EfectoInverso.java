package com.ieshlanz.tema5.efectos;

public class EfectoInverso implements EfectoEspecial, Simetrico {
    protected EfectoInverso() {
    }

    @Override
    public String getNombre() {
        return TipoEfecto.INVERSO.toString();
    }

    @Override
    public String aplicarEfecto(String frase) {
        String nuevaFrase = new StringBuilder(frase).reverse().toString();
        return nuevaFrase;
    }
}
