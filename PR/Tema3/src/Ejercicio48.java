import java.util.*;
public class Ejercicio48 {
    public static void main(String[] args) {
        // Data
        Map<String, Integer> map = new HashMap<>();
        map.put("Pepe", 9385);
        map.put("Manuel", 1234);
        map.put("Ana", 1085);
        
        // Input
        System.out.println("Introduce un nombre:");
        String inputName = new Scanner(System.in).nextLine();
        System.out.println("Introduce un pin:");
        int inputPin = new Scanner(System.in).nextInt();

        // Loop
        boolean found = false;
        for(String key : map.keySet()) {
            if(key.equalsIgnoreCase(inputName)) {
                if(map.get(key).equals(inputPin)) {
                    System.out.println("Acceso permitido");
                    found = true;
                }
            }
        }
        if(found == false) {
            System.out.println("Usuario/Pin incorrecto");
        }
    }
}