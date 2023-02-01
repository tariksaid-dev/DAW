package perros;

import java.util.*;

public class Carrito implements Descuento {
    private List<Perro> compra;

    public Carrito() {
        compra = new ArrayList<Perro>();
    }

    public void comprar(Perro p) {
        compra.add(p);
    }

    public List<Perro> getLista() {
        return compra;
    }

    public ResultadoCompra getPrecio() {
        boolean descuento = false;
        int precio = 0;
        for (Perro p : compra) {
            precio += p.getPrecio();
            if (p instanceof PerroAbandonado pa && !pa.estaSano()) {
                descuento = true;
            }
        }
        if (descuento) {
            precio = (int) (precio * 0.95);
        }
        return new ResultadoCompra(descuento, precio);
    }
}
