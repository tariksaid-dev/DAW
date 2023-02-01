package perros;

import java.util.*;

public class PerroAbandonado extends Perro {
    private Set<String> enfermedades;

    public PerroAbandonado(String n, int p, String r) {
        super(n, p, r);
        enfermedades = new HashSet<String>();
        rellenarEnfermedadesAleatoriamente();
    }

    private void rellenarEnfermedadesAleatoriamente() {
        String[] enfermedadesPosibles = {
                "rabia", "sarna", "pulgas", "covid"
        };
        Random ra = new Random();
        int numeroEnfermedades = ra.nextInt(enfermedadesPosibles.length);
        for (int i = 0; i < numeroEnfermedades; i++) {
            int indice = ra.nextInt(enfermedadesPosibles.length);
            enfermedades.add(enfermedadesPosibles[indice]);
        }
    }

    public Set<String> getEnfermedades() {
        return enfermedades;
    }

    public boolean estaSano() {
        return enfermedades.isEmpty();
    }
}
