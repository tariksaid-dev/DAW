public enum TipoCanasta {
    TIRO_LIBRE, CANASTA_NORMAL, TRIPLE;

    public int getValor() {
        switch (this) {
            case TIRO_LIBRE:
                return 1;
            case CANASTA_NORMAL:
                return 2;
            case TRIPLE:
                return 3;
            default:
                return 0;
        }
    }
}