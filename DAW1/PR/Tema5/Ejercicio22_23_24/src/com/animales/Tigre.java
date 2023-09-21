package com.animales;

public class Tigre extends Animal {
    public Tigre(String n, int peso) {
        super(n, peso);
    }

    @Override
    public void emitirSonido() {
        System.out.println("El tigre ruge");
    }
}
