package com.programa;

import com.tren.*;

public class App {
    public static void main(String... a) {
        Locomotora l = new Locomotora();
        VagonEquipaje ve = new VagonEquipaje(100);
        VagonEquipaje ve2 = new VagonEquipaje(200);
        VagonPasajeros vp = new VagonPasajeros(100);
        VagonPasajeros vp2 = new VagonPasajeros(300);
        Persona p = new Persona("Pepe", 80, 1);
        Persona p2 = new Persona("Juan", 80, 1);
        Persona p3 = new Persona("Pedro", 80, 1);

        l.enganchar(vp);
        vp.enganchar(vp2);
        vp2.enganchar(ve);
        ve.enganchar(ve2);

        System.out.println(l.getNumeroVagonesTren());
        vp.subir(p3);
        System.out.println(l.getPesoTren());
        vp.bajar(p3);
        System.out.println(l.getPesoTren());
    }
}
