import java.util.*;
public class Ejercicio52 {
    public static void main(String[] args) {
//         Ejercicio 52 : Estamos haciendo un programa de loterías y tenemos dos variables llamadas número y
//         NúmeroPremiado, que se encuentran inicializadas con números de 5 cifras. El programa deberá
//         mostrar por pantalla:
//         a) Si el número coincide con el número premiado.
// b) Si el número tiene reintegro, es decir, se dan a la vez las dos siguientes condiciones:
//          a. La primera cifra del número coincide con la primera cifra del número premiado
//          b. La última cifra del número coincide con la última cifra del número premiado

//     Sugerencia: Obtén el cociente y resto de dividir el número premiado entre 10, y mira si
// tienen algo que ver con su última cifra. Inventa algo parecido para obtener la primera cifra.
        
        String número = "12345";
        String númeroPremiado = "22846";

        char primerNúmero = número.charAt(0);
        char primerNúmeroPremiado = númeroPremiado.charAt(0);

        char últimoNúmero = número.charAt(número.length() - 1);
        char últimoNúmeroPremiado = númeroPremiado.charAt(númeroPremiado.length() - 1);

        String primerNúmS = String.valueOf(primerNúmero);
        String primerNúmP = String.valueOf(primerNúmeroPremiado);

        String últimoNúmS = String.valueOf(últimoNúmero);
        String últimoNúmP = String.valueOf(últimoNúmeroPremiado);

        if (número.equals(númeroPremiado)) {
            System.out.println("El número coincide");
        } else {
            System.out.println("El número no coincide");
            if (primerNúmS.equals(primerNúmP) && últimoNúmS.equals(últimoNúmP)) {
                System.out.println("Tiene reintegro");
            } else {
                System.out.println("No tiene reintegro");
            }
        }
    }
}