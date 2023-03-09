package paqueteria;

import java.util.*;

public class Transportista {
    protected List<Paquete> paquetes;
    private long tiempoEntrega;

    public Transportista(long te) {
        this.paquetes = new ArrayList<>();
        this.tiempoEntrega = te;
    }

    public void subirCamion(Paquete p) {
        this.paquetes.add(p);
    }

    public void enviar() {
        for (Paquete p : this.paquetes) {
            try {
                Thread.sleep(tiempoEntrega * 1000 * 60);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("El paquete " + p.getProducto() + " con prioridad  " + p.getPrioridad()
                    + " ha llegado a: " + p.getDireccionDestino() + ".");
        }
        paquetes.clear();
    }
}
