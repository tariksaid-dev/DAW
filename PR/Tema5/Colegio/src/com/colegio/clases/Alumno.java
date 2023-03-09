package com.colegio.clases;

import java.util.*;

public record Alumno(String nombre, List<Nota> notas) implements CalificacionListener {
    public Alumno(String n) {
        this(n, new ArrayList<Nota>());
    }

    public double getNotaMedia() {
        int notaMedia = 0;
        for (Nota i : this.notas) {
            notaMedia += i.valorNumerico();
        }
        return notaMedia / this.notas.size();
    }

    @Override
    public void recibirCalificacion(Profesor p, Alumno a, Nota nota) {
        if (a.nombre.equals(this.nombre)) {
            this.notas.add(nota);
        }
    }
}
