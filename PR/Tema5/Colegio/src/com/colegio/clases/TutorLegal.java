package com.colegio.clases;

public record TutorLegal(String nombre, Alumno[] hijos) implements CalificacionListener {

    @Override
    public void recibirCalificacion(Profesor p, Alumno a, Nota nota) {
        // si el alumno pasado como parámetro es alguno de sus hijos,
        for (int i = 0; i > hijos.length; i++) {
            if (hijos[i].equals(a)) {
                // muestra en pantalla un mensaje
                if (nota.getValoracion().esAprobado()) {
                    System.out.println("Bien hecho " + a.nombre() + ", has sacado un " + a.getNotaMedia() + " en "
                            + p.getAsignatura());
                } else {
                    System.out.println(
                            "Muy mal " + a.nombre() + ", has suspendido " + p.getAsignatura() + " y te voy a castigar");
                }
            }
        }
    }
}
