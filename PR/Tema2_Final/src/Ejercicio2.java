import bpc.daw.consola.*;

public class Ejercicio2 {
    public static void main(String[] args) {
//         2) Hacer un programa que pregunte al usuario por teclado tres números R, G y B
// comprendidos entre 0 y 255 y ponga la pantalla con el color de fondo definido por los
// números R, G y B. El programa terminará al pulsar una tecla (esto se hace simplemente
// pidiendo un carácter e ignorándolo).
        Consola c = new Consola();
        CapaFondo cf = c.getCapaFondo();
        Teclado t = c.getTeclado();

        t.activarEco(true);
        t.setTipoCursor(Teclado.CURSOR_LINEA);
        System.out.println("Introduce un número para R:");
        int r = t.leerNumeroEntero();
        System.out.println("Introduce un número para G:");
        int g = t.leerNumeroEntero();
        System.out.println("Introduce un número para B:");
        int b = t.leerNumeroEntero();

        Fondo f = new FondoColorSolido(r, g, b);
        cf.setFondo(f);
        t.activarEco(false);
        t.leerCaracter();
        // try {
        //     Thread.sleep(10000);
        // } catch (InterruptedException e) {
        //     System.out.println(e);
        // }

        // CapaFondo f = 
    }
}
