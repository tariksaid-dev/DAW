package com.tema5.persona.clases;

public class PersonaBuilder {

    private String nombre;
    private String apellido1;
    private String apellido2;
    private int edad;
    private String calle;
    private String ciudad;
    private String pais;
    private String telefono;
    private EstadoCivil estadoCivil;
    private Persona pareja;

    public PersonaBuilder(String nombre, String apellido1, String apellido2) {
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.edad = 0;
        this.calle = null;
        this.ciudad = null;
        this.pais = "España";
        this.telefono = null;
        this.estadoCivil = EstadoCivil.SOLTERO;
        this.pareja = null;
    }

    public PersonaBuilder setEdad(int edad) {
        this.edad = edad;
        return this;
    }

    public PersonaBuilder setDireccion(String calle, String ciudad, String pais) {
        this.calle = calle;
        this.ciudad = ciudad;
        this.pais = pais;
        return this;
    }

    public PersonaBuilder setTelefono(String telefono) {
        this.telefono = telefono;
        return this;
    }

    public PersonaBuilder setEstadoCivil(EstadoCivil estadoCivil) {
        this.estadoCivil = estadoCivil;
        return this;
    }

    public PersonaBuilder setPareja(Persona pareja) {
        this.pareja = pareja;
        return this;
    }

    public Persona build() {
        return new ImplementacionPersona(nombre, apellido1, apellido2, edad, new Direccion(calle, ciudad, pais),
                telefono,
                estadoCivil, pareja);
    }

}
