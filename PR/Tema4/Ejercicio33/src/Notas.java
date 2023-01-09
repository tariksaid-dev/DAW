import java.util.*;

public class Notas {
    private List<Double> notas;

    public Notas() {
        notas = new ArrayList<>();
    }

    public void añadirNota(double n) {
        notas.add(n);
    }

    public int getTotalNotas() {
        return notas.size();
    }

    public double calcularNotaMedia() {
        double suma = 0;
        for (double n : notas) {
            suma += n;
        }
        return suma / notas.size();
    }

    public double calcularNotaMaxima() {
        double max = 0;
        for (double n : notas) {
            if (n > max) {
                max = n;
            }
        }
        return max;
    }
}
