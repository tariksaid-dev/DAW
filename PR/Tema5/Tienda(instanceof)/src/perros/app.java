package perros;

import java.util.*;

public class app {
    public static void main(String[] args) {
        List<Perro> catalogo = new ArrayList<Perro>();
        for (int i = 0; i < 8; i++) {
            catalogo.add(PerroFactory.generarPerroAleatorio());
        }

        Carrito carrito = new Carrito();

        // Bucle para elegir perro y añadirlo al carrito

        boolean repetir = true;
        while (repetir) {
            System.out.println("""
                    Tienda de perros HLANZ
                    ----------------------
                    Elige el número de perros para
                    añadirlo al carrito y pulsa 0 para
                    finalizar la compra.
                    """);

            // mostramos una lista numerada con los perros
            for (int i = 0; i < catalogo.size(); i++) {
                if (catalogo.get(i) instanceof PerroAbandonado pa) {
                    System.out.println((i + 1) + ". " + catalogo.get(i).getNombre() + " ... "
                            + catalogo.get(i).getRaza() + " ... " + catalogo.get(i).getPrecio() + " ... "
                            + pa.getEnfermedades());
                } else {
                    System.out.println((i + 1) + ". " + catalogo.get(i).getNombre() + " ... "
                            + catalogo.get(i).getRaza() + " ... " + catalogo.get(i).getPrecio());
                }
            }
            // pedimos al usuario que elija un perro
            int opcion = new Scanner(System.in).nextInt();
            if (opcion == 0) {
                repetir = false;
                ResultadoCompra r = carrito.getPrecio();
                if (r.hayDescuento()) {
                    carrito.informarBonificacion();
                }
                System.out.println("El precio total es: " + r.precioFinal() + "€");

            } else {
                Perro p = catalogo.get(opcion - 1);
                carrito.comprar(p);
                catalogo.remove(p);
            }
        }
    }
}
