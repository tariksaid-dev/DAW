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
        }
        // Debería tirar un illegalArgumentException. De lo contrario, se engancharan
        // los vagones por separado.
    }
}