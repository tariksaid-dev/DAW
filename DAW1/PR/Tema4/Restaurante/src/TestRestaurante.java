import static org.junit.Assert.*;
import org.junit.Test;

public class TestRestaurante {
    @Test
    public void testGetPrecio() {
        Restaurante r = new Restaurante("El Pimpi");
        assertEquals(5, r.getPrecio("bocadillo"));
        assertEquals(8, r.getPrecio("sopa"));
        assertEquals(10, r.getPrecio("filete"));
        assertEquals(0, r.getPrecio("ensalada"));
    }

    @Test
    public void testGetNombre() {
        Restaurante r = new Restaurante("El Pimpi");
        assertEquals("El Pimpi", r.getNombre());
    }

    @Test
    public void testEstaDisponible() {
        Restaurante r = new Restaurante("El Pimpi");
        assertTrue(r.estaDisponible("bocadillo"));
        assertTrue(r.estaDisponible("sopa"));
        assertTrue(r.estaDisponible("filete"));
        assertFalse(r.estaDisponible("ensalada"));
    }

    @Test
    public void testGetPlatosCaros() {
        Restaurante r = new Restaurante("El Pimpi");
        assertEquals(1, r.getPlatosCaros().size());
        assertEquals("filete", r.getPlatosCaros().get(0));
    }

    @Test
    public void testGetCuenta() {
        Restaurante r = new Restaurante("El Pimpi");
        assertEquals(23, r.getCuenta(new String[] { "bocadillo", "sopa", "filete" }));
    }
}
