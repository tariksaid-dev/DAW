package com.tema5.persona.programa;

import com.tema5.persona.clases.*;

public class Programa {
    public static void main(String... args) {
        Persona p = new PersonaBuilder("Juan", "Pérez", "García")
                .setEdad(20)
                .setDireccion("Calle Falsa", "Ciudad", "País")
                .setTelefono("123456789")
                .setEstadoCivil(EstadoCivil.CASADO)
                .setPareja(new PersonaBuilder("María", "García", "Pérez")
                        .setEdad(20)
                        .setDireccion("Calle Falsa", "Ciudad", "País")
                        .setTelefono("987654321")
                        .setEstadoCivil(EstadoCivil.CASADO)
                        .build())
                .build();
    }
}
