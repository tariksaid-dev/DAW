package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import daw.MarcadorBaloncesto;

public class AppTest {
    
    @Test
    public void test() {
        MarcadorBaloncesto m = new MarcadorBaloncesto("Local", "Visitante");
        assertEquals(0, m.getPuntosLocal());
        assertEquals(0, m.getPuntosVisitante());
        m.añadirCanasta('L', 10);
        m.añadirCanasta('V', 20);
        assertEquals(10, m.getPuntosLocal());
        assertEquals(20, m.getPuntosVisitante());
        assertEquals(true, m.ganaVisitante());
        assertEquals(false, m.ganaLocal());
        m.añadirCanasta('L', 10);
        assertEquals(true, m.hayEmpate());
    }
}
