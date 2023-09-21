import java.util.*;

public class ejercicio12 {
    public static void main(String[] args) {
        // Ejercicio 12 : Haz un programa que pida al usuario por teclado dos números con decimales:
        // precioNormal y porcentajeRebaja. El programa mostrará por pantalla el precio normal y el rebajado,
        // tras haber aplicado el porcentaje de descuento indicado en la variable porcentajeRebaja. La salida
        // del programa deberá tener el siguiente formato: 
    System.out.println("Escribe el precio normal del artículo:");
    double precioNormal = new Scanner(System.in).nextDouble();
    System.out.println("Escribe el porcentaje de rebaja que deseas:");
    double porcentajeRebaja = new Scanner(System.in).nextDouble();
    double precioFinal = precioNormal * (1 - porcentajeRebaja / 100);
    double precioRebaja = precioNormal - precioFinal;
    System.out.println("Precio normal del artículo: " + precioNormal + " euros.");
    System.out.println("Porcentaje de rebaja aplicado: " + porcentajeRebaja + "%");
    System.out.println("Descuento aplicado: " + precioRebaja + " euros.");
    System.out.println("Precio final del artículo: " + precioFinal + " euros.");
    }
}
