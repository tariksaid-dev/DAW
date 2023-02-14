package com.colegio.clases;

import java.util.*;

public record Alumno(String nombre, List<Nota> notas) implements CalificacionListener {
    public double getNotaMedia() {
        int notaMedia = 0;

        for (Nota i : this.notas) {
            notaMedia += i.valorNumerico();
        }

        return notaMedia;
    }

    @Override
    public void recibirCalificacion(Profesor p, Alumno a, Nota nota) {
        // si a tiene igual nombre que el alumno que estamos programando,
        if (a.nombre.equals(this.nombre)) {
            // añade la nota a la de notas,
            this.notas.add(nota);
        }
        // si no no hace nada
    }
}
