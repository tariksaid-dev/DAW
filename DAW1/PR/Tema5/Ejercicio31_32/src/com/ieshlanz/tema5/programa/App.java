package com.ieshlanz.tema5.programa;

import java.util.*;
import com.ieshlanz.tema5.efectos.*;

public class App {
    public static void main(String... args) {
        System.out.println("\nEscribe un refrán.");
        // String respuesta = new Scanner(System.in).nextLine();
        String respuesta = "Ningún mar en calma hizo experto a un marinero.";
        System.out.print("""
                1) Aplicar todos los efectos a la frase
                2) Aplicar solo los efectos simétricos

                ->""");

        switch (new Scanner(System.in).nextInt()) {
            case 1 -> {
                for (TipoEfecto tp : TipoEfecto.values()) {
                    System.out.println(EfectoFactory.getEfecto(tp).aplicarEfecto(respuesta) + "\n");
                }
            }
            case 2 -> {
                for (TipoEfecto tp : TipoEfecto.values()) {
                    if (tp.name().equalsIgnoreCase("inverso") ||
                            tp.name().equalsIgnoreCase("corchetes")) {
                        System.out.println(EfectoFactory.getEfecto(tp).aplicarEfecto(respuesta) + "\n");
                    }

                    // Si utilizamos el siguiente condicional, se crea un objeto EfectoEspecial,
                    // cuyo constructor por defecto printea por pantalla una línea.

                    // if (EfectoFactory.getEfecto(tp) instanceof Simetrico s) {
                    // System.out.println(EfectoFactory.getEfecto(tp).aplicarEfecto(respuesta) +
                    // "\n");
                    // }
                }
            }
            default -> new IllegalArgumentException("Error, introduce 1 o 2");
        }
    }
}
