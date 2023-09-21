import java.util.*;
public class Ejercicio6 {
    public static void main(String[] args) {
//         Ejercicio 6: Realiza un programa que pregunte al usuario "¿Eres mayor de edad (si/no)?". Si el
// usuario escribe "Si", el ordenador mostrará un mensaje "El usuario es mayor de edad". Si el
// usuario escribe "No", el ordenador mostrará "El usuario es menor de edad". Si el usuario
// escribe cualquier otra cosa, el ordenador mostrará "No te entiendo" y volverá a hacer la
// pregunta hasta que el usuario escriba lo correcto.
        boolean x = true;
        // while (x) {
        //     System.out.println("¿Eres mayor de edad (si/no)?");
        //     String ans = new Scanner(System.in).nextLine();
        //     if(ans.toLowerCase().equals("si")) {
        //         System.out.println("El usuario es mayor de edad");
        //         x = false;
        //     } else if (ans.toLowerCase().equals("no")) {
        //         System.out.println("El usuario es menor de edad");
        //         x = false;
        //     } else {
        //         System.out.println("No te entiendo");
        //     }
        // }
        
        while(x) {
            System.out.println("¿Eres mayor de edad?");
            String ans = new Scanner(System.in).nextLine();
            switch(ans.toLowerCase()) {
                case "si" -> {
                    System.out.println("El usuario es mayor de edad");
                    x = false;
                }
                case "no" -> {
                    System.out.println("El usuario es menor de edad");
                    x = false;
                }
                default -> System.out.println("No te entiendo");
            }
        }
    }
}
