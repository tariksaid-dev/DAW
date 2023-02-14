package com.colegio.clases;

import java.util.*;

public class JefeEstudios extends EmpleadoColegio {
    private Map<String, Integer> notasAsignaturas;

    public JefeEstudios(String nombre, String nombreColegio) {
        super(nombre, nombreColegio);
        this.notasAsignaturas = new HashMap<>();
    }

    public int getNumeroSuspensos(String asignatura) {
        return this.notasAsignaturas.get(asignatura);
    }

    @Override
    public void recibirCalificacion(Profesor p, Alumno a, Nota nota) {
        if (nota.getValoracion().ordinal() < 2) {
            if (this.notasAsignaturas.containsKey(p.getAsignatura())) {
                notasAsignaturas.put(p.getAsignatura(), notasAsignaturas.get(p.getAsignatura()) + 1);
            }
        }
    }

    public String getColegio() {
        return super.getColegio();
    }
}
