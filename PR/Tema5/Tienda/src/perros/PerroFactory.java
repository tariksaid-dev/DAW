package perros;

import java.util.*;

public class PerroFactory {

    public static Perro generarPerroAleatorio() {
        Perro resultado = null;
        Random ra = new Random();
        double aleatorio = ra.nextDouble();
        String[] nombres = { "boby", "max", "luna", "eros" };
        String[] razas = { "bulldog", "golden", "setter", "labrador" };
        String nombre = nombres[ra.nextInt(nombres.length)];
        String raza = razas[ra.nextInt(razas.length)];
        if (aleatorio < 0.5) {
            resultado = new Perro(nombre, ra.nextInt(200, 1000), raza);
        } else {
            resultado = new PerroAbandonado(nombre, ra.nextInt(100, 300), raza);
        }
        return resultado;
    }
}