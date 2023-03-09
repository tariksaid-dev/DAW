package test;
import static org.junit.Assert.assertEquals;

import org.junit.Test;
import daw.persona.*;;


public class AppTest {
    
    @Test
    public void test() {
        Oficina o = new Oficina("HLanz", 3);
        Persona p = new Persona("Tarik", new DNI("49237890L"));

        assertEquals(3, o.getTotalEmpleados());
        assertEquals(2, o.getTotalEmpleadosMileuristas());
        assertEquals(false, o.getMileuristas().contains(p));
        assertEquals(false, o.trabaja(p));

        DNIMejorado x = new DNIMejorado(49237890);
        assertEquals('L', x.getLetra());
        assertEquals(49237890, x.getNumero());

    }
}
