package paqueteria;

public class Paquete implements Comparable<Paquete> {
    public static final int ALTA = 1;
    public static final int MEDIA = 2;
    public static final int BAJA = 3;
    private String producto;
    private String direccionDestino;
    private int prioridad;

    public Paquete(String pro, String dd, int pri) {
        if (pri < ALTA || pri > BAJA) {
            throw new IllegalArgumentException();
        }
        this.producto = pro;
        this.direccionDestino = dd;
        this.prioridad = pri;
    }

    public String getProducto() {
        return this.producto;
    }

    public String getDireccionDestino() {
        return this.direccionDestino;
    }

    public int getPrioridad() {
        return this.prioridad;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((producto == null) ? 0 : producto.hashCode());
        result = prime * result + ((direccionDestino == null) ? 0 : direccionDestino.hashCode());
        result = prime * result + prioridad;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Paquete other = (Paquete) obj;
        if (producto == null) {
            if (other.producto != null)
                return false;
        } else if (!producto.equals(other.producto))
            return false;
        if (direccionDestino == null) {
            if (other.direccionDestino != null)
                return false;
        } else if (!direccionDestino.equals(other.direccionDestino))
            return false;
        if (prioridad != other.prioridad)
            return false;
        return true;
    }

    @Override
    public int compareTo(Paquete p) {
        return this.prioridad - p.getPrioridad();
    }

}
