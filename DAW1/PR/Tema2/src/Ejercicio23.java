import bpc.daw.objetos.*;

public class Ejercicio23 {
    public static void main(String[] args) {
//         Ejercicio 23 : Haz un programa que cree una tarjeta de crédito con contraseña 2222 y saldo
// 1000€. Mostrar la información de la cuenta por pantalla. Ingresar 100 € y volver a mostrar la
// información. Retirar 2800 € de ella y volver a mostrar la información.
        TarjetaCredito tarjeta = new TarjetaCredito(1000, 2222);
        try {
            System.out.println("El saldo de la tarjeta es: " + tarjeta.getSaldo(2222));
            System.out.println("*Ingresando 100 euros...*");
            tarjeta.ingresarDinero(100);
            System.out.println("El saldo de la tarjeta es: " + tarjeta.getSaldo(2222));
            System.out.println("*Retirando 2800 euros...*");
            if (tarjeta.sacarDinero(2800, 2222) == false) {
                System.out.println("Dinero insuficiente.");
            } else {
                System.out.println("El saldo de la tarjeta es: " + tarjeta.getSaldo(2222));
            }
        } catch (Exception e) {
            System.out.println("Error");
        }
    }
}