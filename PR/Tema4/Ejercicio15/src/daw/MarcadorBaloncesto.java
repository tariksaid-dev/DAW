package daw;


import java.time.LocalDate;
import java.io.*;

public class MarcadorBaloncesto {
    private String nombreLocal;
    private String nombreVisitante;
    private int puntosLocal;
    private int puntosVisitante;
    private LocalDate fecha;

    public MarcadorBaloncesto(String nL, String nV) {
        this(nL, 0, nV, 0, LocalDate.now());
    }

    public MarcadorBaloncesto(String nL, String nV, LocalDate f) {
        this(nL, 0, nV, 0, f);

    }

    private MarcadorBaloncesto(String nL, int pL, String nVI, int pV, LocalDate fecha) {
        this.nombreLocal = nL;
        this.puntosLocal = pL;
        this.nombreVisitante = nVI;
        this.puntosVisitante = pV;
        this.fecha = LocalDate.now();
    }

    public void reset() {
        this.puntosLocal = 0;
        this.puntosVisitante = 0;
    }

    public int getPuntosLocal() {
        return this.puntosLocal;
    }

    public int getPuntosVisitante() {
        return this.puntosVisitante;
    }

    public boolean ganaLocal() {
        return this.puntosLocal > this.puntosVisitante;
    }

    public boolean ganaVisitante() {
        return this.puntosVisitante > this.puntosLocal;
    }

    public boolean hayEmpate() {
        return this.puntosLocal == this.puntosVisitante;
    }

    public void guardar(String ruta) throws IOException  {
        FileWriter fw = new FileWriter(ruta);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write(
            "Nombre equipo local: " + this.nombreLocal +
            "\nPuntos equipo local: " + this.puntosLocal +
            "\nNombre equipo visitante: " + this.nombreVisitante + 
            "\nPuntos equipo visitante: " + this.puntosVisitante);
        bw.close();
    }

    public void añadirCanasta(char equipo, int puntos) {
        if (equipo == 'L' && puntos > 0 && puntos <= 3) {
            this.puntosLocal += puntos;
        } else if (equipo == 'V' && puntos > 0 && puntos <= 3) {
            this.puntosVisitante += puntos;
        } else {
            throw new IllegalArgumentException("El equipo debe ser L o V");
        }
    }
}
