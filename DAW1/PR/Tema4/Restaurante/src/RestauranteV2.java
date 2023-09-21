import java.io.IOException;
import java.util.*;
import java.io.*;

public class RestauranteV2 {
    private String nombre;
    private Map<String, Integer> carta;

    public RestauranteV2(String n, Map<String, Integer> p) {
        nombre = n;
        carta = p;
    }

    public RestauranteV2(String n) {
        this(n, new HashMap<String, Integer>() {
            {
                put("bocadillo", 5);
                put("sopa", 8);
                put("filete", 10);
            }
        });
    }

    public String getNombre() {
        return nombre;
    }

    public void añadir(String plato, int precio) {
        carta.put(plato, precio);
    }

    public int getPrecio(String plato) {
        if (!carta.containsKey(plato)) {
            throw new IllegalArgumentException("Ese plato no se ofrece");
        }
        return carta.get(plato);
    }

    public boolean estaDisponible(String plato) {
        return carta.containsKey(plato);
    }

    public List<String> getPlatosCaros() {
        List<String> platosCaros = new ArrayList<>();
        for (String plato : carta.keySet()) {
            if (carta.get(plato) > 12) {
                platosCaros.add(plato);
            }
        }
        return platosCaros;
    }

    public int getCuenta(String[] platos) {
        int cuenta = 0;
        for (String plato : platos) {
            cuenta += getPrecio(plato);
        }
        return cuenta;
    }

    public void guardar() throws IOException {
        try (PrintWriter pw = new PrintWriter(new FileWriter("menu.txt"))) {
            for (String plato : carta.keySet()) {
                pw.println(plato + " " + carta.get(plato));
            }
        }
    }
}
