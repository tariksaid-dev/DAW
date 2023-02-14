package com.tren;

import java.util.*;

public class VagonEquipaje extends VagonPesoLimitado {
    private List<Maleta> almacen;

    public VagonEquipaje(int pm) {
        super(pm);
        this.almacen = new ArrayList<>();
    }

    public void añadir(Maleta m) {
        if (this.getPeso() < this.getPesoMaximo()) {
            // No queda claro si la comprobación es antes o después de añadir la maleta. En
            // caso de serlo, la condición sería (this.getPeso() + m.peso <
            // this.getPesoMaximo())
            this.almacen.add(m);
        }
    }

    public void retirar(Maleta m) {
        this.almacen.remove(m);
    }

    @Override
    public int getPeso() {
        int peso = 0;
        for (Maleta p : this.almacen) {
            peso += p.peso();
        }
        return peso;
    }

    @Override
    public void enganchar(Vagon v) {
        if (v instanceof VagonEquipaje ve) {
            super.enganchar(ve);
        } else {
            // Debería tirar un illegalArgumentException. De lo contrario, se engancharan
            // los vagones por separado.
        }
    }

    public Maleta getMaleta(Persona p) {
        Maleta maleta = null;
        for (Maleta m : this.almacen) {
            if (m.dueño().equals(p)) {
                maleta = m;
            }
        }
        return maleta;
    }
}