package com.ieshlanz.titulos.clases;

import java.util.*;

public interface CatalogoTitulos {

    public List<Titulo> getTitulos();

    public boolean guardar();

    public boolean añadirTitulo(String dni, String nombre, String estudio, Estado estado);

    public default Titulo getTitulo(String dni) {
        for (Titulo t : getTitulos()) {
            if (t.getDNI().equals(dni)) {
                return t;
            }
        }
        throw new NoSuchElementException("No se ha encontrado el título con DNI " + dni);
    }
}
