import java.util.*;
public class Ejercicio51 {
    public static void main(String[] args) {
//         Ejercicio 51 : Haz un programa que pregunte al usuario por su número de DNI. El programa mostrará
// la letra que corresponde a dicho DNI, teniendo en cuenta que se obtiene así:

//           Calculamos el resto de dividir el número de DNI entre 23
//           Buscamos en la siguiente lista la letra que corresponde a dicho resto y esa será la letra
// del DNI
        System.out.println("Introduce tu DNI: ");
        int dni = new Scanner(System.in).nextInt();
        int letraDni = dni % 23;
        String[] letras = {"T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X", "B", "N", "J", "Z", "S", "Q", "V", "H", "L", "C", "K", "E", "T"};
        System.out.println("Tu letra del DNI es: " + letras[letraDni]);
    }
}
