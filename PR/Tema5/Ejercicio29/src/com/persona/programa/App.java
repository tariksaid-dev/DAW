package com.persona.programa;

import com.persona.clases.*;
import java.util.*;

public class App {
    public static void main(String... ar) {
        System.out.println("""
                1) Ver personas casadas
                2) Ver personas solteras mayores de edad
                3) Ver personas cuyo nombre empieza por la letra J
                """);

        int opcion = new Scanner(System.in).nextInt();
        switch (opcion) {
            case 1 -> {
                Persona.mostrarEnPantalla(new ArrayList<Persona>(List.of(new Persona("Juan Pérez", 25, true),
                        new Persona("María López", 39, false),
                        new Persona("Javier Presley", 19, false),
                        new Persona("Robert Jiménez", 30, false))),
                        new Filtro() {
                            @Override
                            public boolean aceptar(Persona p) {
                                return p.soltero();
                            }
                        });
            }
            case 2 -> {
                Persona.mostrarEnPantalla(new ArrayList<Persona>(List.of(new Persona("Juan Pérez", 25, true),
                        new Persona("María López", 39, false),
                        new Persona("Javier Presley", 39, false),
                        new Persona("Robert Jiménez", 30, false))),
                        new Filtro() {

                            @Override
                            public boolean aceptar(Persona p) {
                                return p.edad() >= 18 && !p.soltero();
                            }
                        });
            }
            case 3 -> {
                Persona.mostrarEnPantalla(new ArrayList<Persona>(List.of(new Persona("Juan Pérez", 25, true),
                        new Persona("María López", 39, false),
                        new Persona("Javier Presley", 19, false),
                        new Persona("Robert Jiménez", 30, false))),
                        new Filtro() {
                            @Override
                            public boolean aceptar(Persona p) {
                                return p.nombre().startsWith("J");
                            }
                        });
            }
        }
    }
}
