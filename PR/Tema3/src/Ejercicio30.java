import java.util.*;
public class Ejercicio30 {
    public static void main(String[] args) {
//         Ejercicio 30: Realiza un programa en el que haya una variable llamada "contraseña" iniciada
// con el valor que tú quieras. A continuación el programa pedirá al usuario que introduzca la
// contraseña. El usuario solo tiene 5 intentos para ponerla bien. En caso de que el usuario la
// acierte, el programa dirá "Acceso permitido". Si se agotan los intentos, se mostrará "Acceso
// denegado". En todo momento el programa mostrará el número de intentos restantes.
        String contraseña = "1234";
        String ans = "";
        for(int i=0; !ans.equals(contraseña) && i<5; i++) {
            System.out.println("Escribe la contraseña:");
            ans = new Scanner(System.in).nextLine();
            System.out.println("Intentos restantes: " + (4-i));
        }
        if(ans.equals(contraseña)) {
            System.out.println("Acceso permitido.");

        } else {
            System.out.println("Acceso denegado");
        }

        // String contraseña = "1234";
        // String ans = "";
        // for(int i=0; i<5; i++) {
        //     System.out.println("Escribe la contraseña:");
        //     ans = new Scanner(System.in).nextLine();
        //     if(ans.equals(contraseña)) {
        //         System.out.println("Acceso permitido");
        //         i = 5;
        //     } else {
        //         System.out.println("Intentos restantes: " + (4-i));
        //         if(i == 4) {
        //             System.out.println("Acceso denegadao");
        //         }
        //     }
        // }
    }
}
