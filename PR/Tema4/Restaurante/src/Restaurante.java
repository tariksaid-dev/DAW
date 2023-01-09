import java.util.*;

public class Restaurante {
    private String nombre;
    private String[] platos;
    private int[] precios;

    public Restaurante(String nombre, String[] platos, int[] precios) {
        this.nombre = nombre;
        this.platos = platos;
        this.precios = precios;
    }

    public Restaurante(String nombre) {
        this(nombre, new String[] { "bocadillo", "sopa", "filete" }, new int[] { 5, 8, 10 });
    }

    public String getNombre() {
        return nombre;
    }

    public int getPrecio(String plato) {
        int p = 0;
        for (int i = 0; i < platos.length; i++) {
            if (platos[i].equals(plato)) {
                p = precios[i];
            }
        }
        return p;
    }

    public boolean estaDisponible(String plato) {
        boolean p = false;
        for (int i = 0; i < platos.length; i++) {
            if (platos[i].contains(plato)) {
                p = true;
            }
        }
        return p;
    }

    public List<String> getPlatosCaros() {
        List<String> platosCaros = new ArrayList<>();
        for (int i = 0; i < precios.length; i++) {
            if (precios[i] > 12) {
                platosCaros.add(platos[i]);
            }
        }
        return platosCaros;
    }

    public int getCuenta(String[] platos) {
        int cuenta = 0;
        for (int i = 0; i < platos.length; i++) {
            cuenta += getPrecio(platos[i]);
        }
        return cuenta;
    }
}