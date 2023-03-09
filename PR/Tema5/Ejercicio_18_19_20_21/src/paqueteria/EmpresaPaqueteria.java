package paqueteria;

import java.util.*;

public interface EmpresaPaqueteria {
    public void registrarPedido(Paquete p);

    public List<Transportista> getTransportistas();

    public default void enviarPaquetes() {
        List<Transportista> t = getTransportistas();
        for (Transportista i : t) {
            i.enviar();
        }

    }
}
