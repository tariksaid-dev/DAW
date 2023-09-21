package com.test;

import com.tren.*;
import static org.junit.Assert.*;
import org.junit.Test;

public class TestLocomotora {
    @Test
    public void getNumeroVagonesTrenTest() {
        Locomotora l = new Locomotora();
        VagonPasajeros vp = new VagonPasajeros(10);
        VagonPasajeros vp2 = new VagonPasajeros(10);
        VagonEquipaje ve = new VagonEquipaje(10);
        assertEquals(4, l.getNumeroVagonesTren());
    }

    @Test
    public void getPesoTrenTest() {
        Locomotora l = new Locomotora();
        VagonPasajeros vp = new VagonPasajeros(10);
        VagonPasajeros vp2 = new VagonPasajeros(10);
        VagonEquipaje ve = new VagonEquipaje(10);
        assertEquals(76400, l.getPesoTren());
    }

    // @Test()
    // public void engancharTest(Vagon v) {
    // Locomotora l = new Locomotora();
    // VagonPasajeros vp = new VagonPasajeros(10);
    // VagonPasajeros vp2 = new VagonPasajeros(10);
    // VagonEquipaje ve = new VagonEquipaje(10);
    // VagonPasajeros vp3 = new VagonPasajeros(10);
    // ve.enganchar(vp3);
    // }

    @Test(expected = IllegalArgumentException.class)
    public void engancharExceptionTest() {
        Locomotora l = new Locomotora();
        Locomotora l2 = new Locomotora();
        l.enganchar(l2);
    }

}
