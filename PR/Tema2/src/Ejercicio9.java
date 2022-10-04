import bpc.daw.objetos.*;
public class Ejercicio9 {
    public static void main(String[] args) {
        // Ejercicio 9 : En la librería ObjetosSencillos.jar se encuentra la clase Caja. Haz un programa que
        // cree una caja que contenga el mensaje “Bienvenidos al instituto”. Consultar el mensaje con la
        // caja cerrada y mostrar el resultado. Abrir la caja y consultar el mensaje. Mostrar el resultado.
            Caja c = new Caja("Bienvenidos al isntituto");
            System.out.println(c.getMensaje());
            c.abrirCaja();
            System.out.println(c.getMensaje());
    }
    
}
