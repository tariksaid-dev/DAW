package bolas;

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
            throw new Exception("Ya se han creado 7 bolas de dragón.");
        }
        BolaDragon bola = new BolaDragon(siguienteBola);
        siguienteBola++;
        return bola;
    }
}