package com.ieshlanz.tema5.efectos;

public class EfectoCorchetes implements Simetrico, EfectoEspecial {
    EfectoCorchetes() {
        System.out.println("Creado el efecto especial " + this.getNombre() + ".");
    }

    @Override
    public String getNombre() {
        return TipoEfecto.CORCHETES.toString();
    }

    @Override
    public String aplicarEfecto(String frase) {
        return frase.startsWith("[") && frase.endsWith("]") ? frase.substring(1, frase.length() - 1)
                : "[" + frase + "]";
    }
}
