package com.tema5.persona.clases;

class ImplementacionPersona implements Persona {
    private String nombre;
    private String apellido1;
    private String apellido2;
    private int edad;
    private Direccion direccion;
    private String telefono;
    private EstadoCivil estadoCivil;
    private Persona pareja;

    public ImplementacionPersona(String nombre, String apellido1, String apellido2, int edad, Direccion direccion,
            String telefono, EstadoCivil estadoCivil, Persona pareja) {
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.edad = edad;
        this.direccion = direccion;
        this.telefono = telefono;
        this.estadoCivil = estadoCivil;
        this.pareja = pareja;

        if (!comprobarEdad() || !comprobarEstadoCivil()) {
            throw new IllegalArgumentException("La persona no cumple los requisitos para ser creada");
        }
    }

    private boolean comprobarEdad() {
        return edad >= 0;
    }

    private boolean comprobarEstadoCivil() {
        return estadoCivil != EstadoCivil.CASADO || pareja != null;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public String getApellido1() {
        return apellido1;
    }

    @Override
    public String getApellido2() {
        return apellido2;
    }

    @Override
    public Direccion getDireccion() {
        return direccion;
    }

    @Override
    public String getTelefono() {
        return telefono;
    }

    @Override
    public EstadoCivil getEstadoCivil() {
        return estadoCivil;
    }

    @Override
    public Persona getPareja() {
        return pareja;
    }

}
