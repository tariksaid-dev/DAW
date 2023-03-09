import java.util.*;
public class Ejercicio44 {
    public static void main(String[] args) {
//         Ejercicio 44 : Realiza un programa que indique la cantidad de dinero que hay que cobrar o devolver a
// un cliente de una tienda, de esta forma:
// a) El programa comienza preguntando el precio del artículo.
// b) A continuación, se pregunta la cantidad de dinero que da el cliente. (esta cantidad puede ser
// mayor o menor que el precio del artículo)
// c) El programa indicará si al cliente le falta dinero o si es necesario darle el cambio. En ambos
// casos se indicará la cantidad de dinero necesaria. 
        System.out.println("Introduce el precio del artículo: ");
        double precio = new Scanner(System.in).nextDouble();
        System.out.println("Indica el dinero que vas a dar: ");
        double dinero = new Scanner(System.in).nextDouble();
        if (dinero > precio) {
            double cambio = dinero - precio;
            System.out.println("Tu cambio es de: " + cambio + " euros");
        } else if (dinero < precio) {
            double faltaDinero = precio - dinero; 
            System.out.println("Te faltan " + faltaDinero + " euros");
        } else {
            System.out.println("Gracias por tu compra, has dado el dinero justo");
        }
    }
}
