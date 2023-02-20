package com.colegio.clases;

public interface CalificacionListener {
    public void recibirCalificacion(Profesor p, Alumno a, Nota nota);
    // p.calificar(a, nota);
}
