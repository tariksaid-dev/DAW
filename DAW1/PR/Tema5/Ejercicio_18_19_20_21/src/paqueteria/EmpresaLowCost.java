package paqueteria;

public class EmpresaLowCost implements EmpresaPaqueteria {
    private Transportista[] transportistas;
    private int siguienteTransportista;

    public EmpresaLowCost(int n) {
        this.transportistas = new Transportista[n];
        for (int i = 0; i < transportistas.length; i++) {
            transportistas[i] = new Transportista((int) Math.random() * (80 - 40 + 1) - 40);
            this.siguienteTransportista = 0;
        }
    }

    @Override
    public void registrarPedido(Paquete p) {
        this.transportistas[this.siguienteTransportista].subirCamion(p);
        this.siguienteTransportista++;
        if (siguienteTransportista == transportistas.length) {
            siguienteTransportista = 0;
        }
    }

}
