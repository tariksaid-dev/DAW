package com.tema5.persona.clases;

public interface Persona {

    public String getNombre();

    public String getApellido1();

    public String getApellido2();

    public default String[] getApellidos() {
        return new String[] { getApellido1(), getApellido2() };
    }

    public Direccion getDireccion();

    public String getTelefono();

    public EstadoCivil getEstadoCivil();

    public Persona getPareja();

}
