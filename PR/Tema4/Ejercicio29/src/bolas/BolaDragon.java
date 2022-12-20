package bolas;

// Crea la siguiente clase, que representa una Bola de Dragón. La clase está diseñada para que solo se puedan crear en la memoria RAM un máximo de 7 bolas. Al intentar crear la octava, se lanzará una excepción.
// BolaDragón
// - static final int MAXIMO_BOLAS
// - static int siguienteBola
// - int número
// - BolaDragón(int número)
// + int getNúmero()
// + static BolaDragón crearBolaDragón() throws Exception

public class BolaDragon {
    private static final int MAXIMO_BOLAS = 7;
    private static int siguienteBola = 1;
    private int numero;

    private BolaDragon(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public static BolaDragon crearBolaDragon() throws Exception {
        if (siguienteBola > MAXIMO_BOLAS) {
            throw new Exception("Ya se hancreado 7 bolas de dragón.");
        }
        BolaDragon bola = new BolaDragon(siguienteBola);
        siguienteBola++;
        return bola;
    }
}