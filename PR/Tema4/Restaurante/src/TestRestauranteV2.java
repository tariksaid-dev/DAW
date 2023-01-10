import static org.junit.Assert.*;
import org.junit.Test;

public class TestRestauranteV2 {
    @Test
    public void testGetPrecio() {
        RestauranteV2 r = new RestauranteV2("El Pimpi");
        assertEquals(5, r.getPrecio("bocadillo"));
        assertEquals(8, r.getPrecio("sopa"));
        assertEquals(10, r.getPrecio("filete"));
    }

    @Test
    public void testGetNombre() {
        RestauranteV2 r = new RestauranteV2("El Pimpi");
        assertEquals("El Pimpi", r.getNombre());
    }

    @Test
    public void testEstaDisponible() {
        RestauranteV2 r = new RestauranteV2("El Pimpi");
        assertTrue(r.estaDisponible("bocadillo"));
        assertTrue(r.estaDisponible("sopa"));
        assertTrue(r.estaDisponible("filete"));
        assertFalse(r.estaDisponible("ensalada"));
    }

    @Test
    public void testGetPlatosCaros() {
        RestauranteV2 r = new RestauranteV2("El Pimpi");
        assertEquals(0, r.getPlatosCaros().size());
        // assertEquals("filete", r.getPlatosCaros().get(0));
    }

    @Test
    public void testGetCuenta() {
        RestauranteV2 r = new RestauranteV2("El Pimpi");
        assertEquals(23, r.getCuenta(new String[] { "bocadillo", "sopa", "filete" }));
    }
}
