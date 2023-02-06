package paqueteria;

import java.util.*;

public class EmpresaPremium implements EmpresaPaqueteria {
    private Transportista rapido;
    private Transportista medio;
    private Transportista lento;

    public EmpresaPremium() {

    }

    @Override
    public void registrarPedido(Paquete p) {
        Map<Integer, Transportista> m = Map.of(
                Paquete.BAJA, lento,
                Paquete.MEDIA, medio,
                Paquete.ALTA, rapido).get(p.getPrioridad()).subirCamion(p);
        // m.get(p.getPrioridad()).subirCamion(p);

    }

    @Override
    public List<Transportista> getTransportistas() {
        // TODO Auto-generated method stub
        return null;
    }

}
