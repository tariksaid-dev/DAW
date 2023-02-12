package com.tren;

import java.util.*;

public class Locomotora extends Vagon {
    public Locomotora() {
    };

    public int getNumeroVagonesTren() {
        List<Vagon> vga = new ArrayList<>(List.of(this));
        for (int i = 0; i < vga.size(); i++) {
            if (vga.get(i).getVagonSiguiente() != null) {
                vga.add(vga.get(i).getVagonSiguiente());
            }
        }
        return vga.size();
    }

    public int getPesoTren() {
        int peso = 0;
        List<Vagon> vga = new ArrayList<>(List.of(this));
        for (int i = 0; i < vga.size(); i++) {
            peso += vga.get(i).getPeso();
            if (vga.get(i).getVagonSiguiente() != null) {
                vga.add(vga.get(i).getVagonSiguiente());
            }
        }
        return peso;
    }

    public void arrancar() {
        if (getPesoTren() < 145600) {
            System.out.println("Tren en marcha");
        } else {
            throw new IllegalArgumentException("La locomotora no puede tirar del tren");
        }
    }

    @Override
    public int getPeso() {
        return 76400;
    };

    @Override
    public void enganchar(Vagon v) {
        if (v instanceof Locomotora l) {
            throw new IllegalArgumentException("Solo puede haber una locomotora.");
        } else {
            super.enganchar(v);
        }
    }
}
