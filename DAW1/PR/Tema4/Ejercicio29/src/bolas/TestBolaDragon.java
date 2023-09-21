package bolas;

import static org.junit.Assert.*;
import org.junit.Test;

public class TestBolaDragon {
    @Test
    public void testCrearBolaDragon() {
        try {
            for (int i = 1; i < 9; i++) {
                BolaDragon bola = BolaDragon.crearBolaDragon();
                assertEquals(i, bola.getNumero());
            }
            fail("No se lanzó la excepción esperada.");
        } catch (Exception e) {
            assertEquals("Ya se han creado 7 bolas de dragón.", e.getMessage());
        }
    }
}
