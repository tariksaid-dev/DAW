package juego.juegonaves;

import hlanz.framework.consola.GameObject;

public class Marcador extends GameObject {
    private int[] puntos;

    public Marcador() {
        this.puntos = new int[2];
    }

    public void incrementarPuntos(int jugador, int puntos) {
        if (puntos < 0) {
            throw new IllegalArgumentException("La puntuación no puede ser negativa");
        } else {
            switch (jugador) {
                case 0 -> this.puntos[0] += puntos;
                case 1 -> this.puntos[1] += puntos;
            }
        }
    }

    @Override
    public void inicializar() {
        // Redundante?
        this.puntos[0] = 0;
        this.puntos[1] = 0;
    }

    @Override
    public void ejecutarFrame() {
        this.consola.getCapaCanvas().getGraphics2D().drawString("J1: " + this.puntos[0] + " J2: " + this.puntos[1], 300,
                120);
    }

    @Override
    public void finalizar() {
        // No hace nada
    }
}
