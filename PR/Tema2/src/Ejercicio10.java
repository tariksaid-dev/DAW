import bpc.daw.objetos.*;

public class Ejercicio10 {
    public static void main(String[] args) {
//         Ejercicio 10 : Haz otro programa que cree una caja con un mensaje cualquiera. Abrir la caja,
// consultar el mensaje y mostrarlo por pantalla. Sustituir el mensaje por otro. Volver a
// consultarlo y mostrar el resultado.
        Caja c = new Caja("Cualquiera");
        c.abrirCaja();
        System.out.println(c.getMensaje());
        c.cambiarMensaje("Otro mensaje");
        System.out.println(c.getMensaje());
    }
}
