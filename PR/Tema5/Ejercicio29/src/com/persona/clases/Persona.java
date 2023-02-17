package com.persona.clases;

import java.util.*;

public record Persona(String nombre, int edad, boolean soltero) {
    public static void mostrarEnPantalla(List<Persona> personas, Filtro filtro) {
        for (Persona i : personas) {
            if (filtro.aceptar(i)) {
                System.out.println(i.nombre);
            }
        }
    }
}
