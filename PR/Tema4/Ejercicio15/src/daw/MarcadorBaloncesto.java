package daw;

import java.time.LocalDate;

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

    public void añadirCanasta(char equipo, int puntos) {
        if(equipo == 'L') {
            this.puntosLocal += puntos;
        } else if (equipo == 'V') {
            this.puntosVisitante += puntos;
        }
    }

    public void reset() {
        this.puntosLocal = 0;
        this.puntosVisitante = 0;
    }
}
