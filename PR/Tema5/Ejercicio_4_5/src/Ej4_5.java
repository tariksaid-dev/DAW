import java.util.*;

public class Ej4_5 {
    public class Edificio {
        private String direccion;
        private int numeroPlantas;

        public Edificio(String d, int np) {
            direccion = d;
            numeroPlantas = np;
        }

        public String getDireccion() {
            return direccion;
        }

        public int getNumeroPlantas() {
            return numeroPlantas;
        }
    }

    public class Hotel extends Edificio {
        private List<String> clientes;
        private int maximo;

        public Hotel(String d, int np, int m) {
            super(d, np);
            if (m < 0) {
                throw new IllegalArgumentException("Maximo no puede ser negativo");
            }
            maximo = m;
            clientes = new ArrayList<String>();
        }

        public void añadirCliente(String c) {
            if (clientes.size() < maximo) {
                clientes.add(c);
            } else {
                throw new IllegalArgumentException("No hay plazas disponibles");
            }
        }

        public void retirarCliente(String c) {
            if (clientes.contains(c)) {
                clientes.remove(c);
            } else {
                throw new IllegalArgumentException("El cliente no está en el hotel");
            }
        }
    }

    public class Rascacielos extends Edificio {
        private int altura;

        public Rascacielos(String d, int np, int a) {
            super(d, np);
            if (a < 0)
                throw new IllegalArgumentException("Altura no puede ser negativa");
            altura = a;
        }

        public int getAltura() {
            return altura;
        }
    }

    public class CasaRural extends Hotel {

        public CasaRural(String d) {
            super(d, 3, 6);
        }
    }
}
