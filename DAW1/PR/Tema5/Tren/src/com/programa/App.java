package com.programa;

import com.tren.*;

public class App {
    public static void main(String... a) {
        Locomotora l = new Locomotora();
        VagonEquipaje ve = new VagonEquipaje(1000);
        VagonEquipaje ve2 = new VagonEquipaje(2000);
        VagonPasajeros vp = new VagonPasajeros(1000);
        VagonPasajeros vp2 = new VagonPasajeros(3000);
        Persona p = new Persona("Pepe", 80, 10);
        Persona p2 = new Persona("Juan", 80, 10);
        Persona p3 = new Persona("Pedro", 80, 10);

        l.enganchar(vp);
        vp.enganchar(vp2);
        vp2.enganchar(ve);
        ve.enganchar(ve2);

        System.out.println(l.getNumeroVagonesTren());
        vp.subir(p3);
        vp.subir(p2);
        vp2.subir(p);
        System.out.println(l.getPesoTren());
        vp.bajar(p3);
        vp2.bajar(p);
        System.out.println(l.getPesoTren());
    }
}
