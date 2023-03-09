import bpc.daw.objetos.*;
public class Ejercicio22 {
    public static void main(String[] args) {
//         Ejercicio 22 : En la librería ObjetosSencillos.jar se encuentra la clase TarjetaCrédito. Haz un
// programa que cree una tarjeta de crédito con contraseña 1111 y saldo 5000€. Mostrar la
// información de la cuenta por pantalla. Sacar 2000 € y volver a mostrar la información.
        TarjetaCredito tarjeta = new TarjetaCredito(5000, 1111);
        try {
            System.out.println("El saldo de la tarjeta es " + tarjeta.getSaldo(1111));
            System.out.println("*Extrayendo 2000 euros...* ");
            tarjeta.sacarDinero(2000, 1111);
            System.out.println("El saldo de la tarjeta es " + tarjeta.getSaldo(1111));
        } catch (Exception e) {
            System.out.println("Error.");
        }

    }
}