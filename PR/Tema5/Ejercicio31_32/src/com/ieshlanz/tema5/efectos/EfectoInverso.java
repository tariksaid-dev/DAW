package com.ieshlanz.tema5.efectos;

public class EfectoInverso implements EfectoEspecial, Simetrico {
    EfectoInverso() {
        System.out.println("Creado el efecto especial " + this.getNombre() + ".");
    }

    @Override
    public String getNombre() {
        return TipoEfecto.INVERSO.toString();
    }

    @Override
    public String aplicarEfecto(String frase) {
        return new StringBuilder(frase).reverse().toString();
    }
}
