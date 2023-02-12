package com.tren;

public class Persona implements Pesado {
    private String nombre;
    private int peso;
    private Maleta equipaje;

    public Persona(String n, int p, int kgEquipaje) {
        this.nombre = n;
        this.peso = p;
        this.equipaje = new Maleta(this, kgEquipaje);
        if (kgEquipaje == 0) {
            this.equipaje = null;
        } else if (this.equipaje.peso() < 0) {
            throw new IllegalArgumentException("El peso de la maleta no puede ser negativo");
        }

    }

    public Persona(String n, int p) {
        this(n, p, 0);
    }

    public String getNombre() {
        return this.nombre;
    }

    @Override
    public int getPeso() {
        return this.peso;
    }

    public Maleta getMaleta() {
        return this.equipaje;
    }

    public void setMaleta(Maleta m) {
        this.equipaje = m;
    }
}
