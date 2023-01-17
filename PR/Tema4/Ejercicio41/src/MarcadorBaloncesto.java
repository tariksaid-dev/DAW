public interface MarcadorBaloncesto {
    public void añadirCanasta(TipoEquipo e, TipoCanasta t);

    public String getNombreEquipo(TipoEquipo e);

    public int getPuntos(TipoEquipo e);

    public default String mostrarMarcador() {
        return getNombreEquipo(TipoEquipo.LOCAL) + ": " + getPuntos(TipoEquipo.LOCAL) + " - "
                + getNombreEquipo(TipoEquipo.VISITANTE) + ": " + getPuntos(TipoEquipo.VISITANTE);
    }
}
