import bpc.daw.objetos.*;
public class Ejercicio7 {
    public static void main(String[] args) {
//         Ejercicio 7 : Haz un proyecto nuevo y añade la librería “ObjetosSencillos.jar”. En dicha librería
// encontrarás la clase DepósitoAgua. Haz un programa en el que haya un depósito de agua con
// capacidad máxima 50 litros y capacidad inicial 15 litros. Dibújalo en la pantalla y calcula el
// tanto por ciento de ocupación del depósito.
        DepositoAgua a = new DepositoAgua(15, 50);
        int cantidad = a.getCantidadActual();
        int capacidad = a.getCapacidadMaxima();
        a.dibujar();
        
        int tantoPorCiento = (cantidad * 100) / capacidad; 
        
        System.out.println("El tanto por ciento de ocupación del depósito es de " + tantoPorCiento);
    }
}
