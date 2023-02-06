package com.ieshlanz.tema5.efectos;

public class EfectoGuiones implements EfectoEspecial {
    protected EfectoGuiones() {
        System.out.println("Creado el efecto especial " + this.getNombre() + ".");
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
