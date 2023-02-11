package com.animales;

public class Leon extends Animal {
    public Leon(String n, int peso) {
        super(n, peso);
    }

    @Override
    public void emitirSonido() {
        System.out.println("El león ruge");
    }
}
