import java.util.*;

public class Ejercicio29 {
    public static void main(String[] args) {
//         Ejercicio 29 : Un usuario de un programa pulsa el botón de imprimir. Solo se puede realizar esta
// operación si la impresora está encendida, tiene tinta y el número de folios que hay en la impresora es
// mayor que el número de folios del trabajo que se van a imprimir. Realiza un programa que pida al
// usuario por teclado el porcentaje de tinta, los folios que hay en la impresora, los folios que se desean
// imprimir y si la impresora está encendida. El programa mostrará si se puede imprimir. 
        System.out.println("Introduce el porcentaje de tinta restante: ");
        double tinta = new Scanner(System.in).nextDouble();
        System.out.println("¿Cuantos folios quedan en la impresora?: ");
        double folios = new Scanner(System.in).nextDouble();
        System.out.println("Introduce el número de folios que deseas imprimir: ");
        double foliosImprimir = new Scanner(System.in).nextDouble();
        System.out.println("Escribe 'true' si la impresora está encendida, de lo contrario escribe 'false': ");
        boolean impresoraOn = new Scanner(System.in).nextBoolean();
        if (tinta > 0 && folios >= foliosImprimir && impresoraOn) {
            System.out.println("Se puede imprimir.");
        } else {
            System.out.println("No es posible realizar la impresión.");
        }
    }
}
