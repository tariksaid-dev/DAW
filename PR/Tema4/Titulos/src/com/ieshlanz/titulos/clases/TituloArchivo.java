package com.ieshlanz.titulos.clases;

public class TituloArchivo implements Titulo {
    private String dni;
    private String nombre;
    private String estudios;
    private Estado estado;

    public TituloArchivo(String d, String n, String e, Estado s) {
        dni = d;
        nombre = n;
        estudios = e;
        estado = s;
    }

    public String toString() {
        return dni + ";" + nombre + ";" + estudios + ";" + estado.ordinal();
    }

    @Override
    public String getDNI() {
        return dni;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public String getEstudios() {
        return estudios;
    }

    @Override
    public Estado getEstado() {
        return estado;
    }

    @Override
    public void setEstado(Estado e) {
        estado = e;
    }
}
