package musica;

public class EquipoMusica {
    private Altavoz[] altavoces;

    public EquipoMusica(int numAltavoces) {
        this.altavoces = new Altavoz[numAltavoces];
        for (int i = 0; i < numAltavoces; i++) {
            this.altavoces[i] = new Altavoz();
        }
    }

    public Altavoz getAltavoz(int posición) {
        return this.altavoces[posición];
    }

    public void setVolumen(int numeroAltavoz, int volumen) {
        this.altavoces[numeroAltavoz].setVolumen(volumen);
    }
}
