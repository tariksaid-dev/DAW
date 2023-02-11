package com.animales;

public abstract class Animal {
    private String nombre;
    private int peso;
    private boolean encerrado;

    public Animal(String n, int p) {
        this.nombre = n;
        this.peso = p;
        this.encerrado = false;
    }

    public String getNombre() {
        return this.nombre;
    }

    public int getPeso() {
        return this.peso;
    }

    public boolean isEncerrado() {
        return this.encerrado;
    }

    public void setEncerrado(boolean b) {
        this.encerrado = b;
    }

    public abstract void emitirSonido();

    @Override
    public String toString() {
        return this.nombre + " - " + this.peso;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
        result = prime * result + peso;
        result = prime * result + (encerrado ? 1231 : 1237);
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Animal other = (Animal) obj;
        if (nombre == null) {
            if (other.nombre != null)
                return false;
        } else if (!nombre.equals(other.nombre))
            return false;
        if (peso != other.peso)
            return false;
        if (encerrado != other.encerrado)
            return false;
        return true;
    }
}
