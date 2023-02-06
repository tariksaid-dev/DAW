package com.ieshlanz.tema5.efectos;

public class App {
    public static void main(String... args) {
        System.out.println(EfectoFactory.getEfecto(TipoEfecto.INVERSO).aplicarEfecto("Hola"));
        System.out.println(EfectoFactory.getEfecto(TipoEfecto.CORCHETES).aplicarEfecto("Hola"));
        System.out.println(EfectoFactory.getEfecto(TipoEfecto.MAYUSCULAS).aplicarEfecto("Hola"));
        System.out.println(EfectoFactory.getEfecto(TipoEfecto.GUIONES).aplicarEfecto("Hola"));
    }
}
