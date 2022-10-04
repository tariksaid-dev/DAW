import bpc.daw.objetos.*;
public class Ejercicio11 {
    public static void main(String[] args) {
//         Ejercicio 11 : Haz otro programa que cree dos cajas, cada una con un mensaje diferente. Hacer
// un programa que intercambie los mensajes de las dos cajas.
        Caja c1 = new Caja("Mensaje 1");
        Caja c2 = new Caja("Mensaje 2");
        c1.abrirCaja();
        c2.abrirCaja();

        String mc1 = c1.getMensaje();
        String mc2 = c2.getMensaje();

        c1.cambiarMensaje(mc2);
        c2.cambiarMensaje(mc1);

        System.out.println(c1.getMensaje());
        System.out.println(c2.getMensaje());
        
    }
}
