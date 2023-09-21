package perros;

public interface Descuento {
    // 5% de descuento al precio total del carrito si el cliente compra al menos un
    // perro
    // abandonado con enfermades.
    // Además, se deberá informar al cliente si consigue dicha bonificación o no.

    default boolean tienePerroAbandonadoConEnfermedades(Carrito carrito) {
        for (Perro p : carrito.getLista()) {
            if (p instanceof PerroAbandonado pa) {
                if (!pa.estaSano()) {
                    return true;
                }
            }
        }
        return false;
    }

    default void informarBonificacion() {
        System.out.println("¡Enhorabuena! Has conseguido un 5% de descuento.");

    }

}
