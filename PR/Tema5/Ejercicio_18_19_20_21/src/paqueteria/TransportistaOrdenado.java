package paqueteria;

import java.util.*;

public class TransportistaOrdenado extends Transportista {
    private List<Paquete> paquetes;
    private long tiempoEntrega;

    public TransportistaOrdenado(long te) {
        super(te);
    }

    public void enviar() {
        Collections.sort(paquetes);
        super.enviar();
    }
}
