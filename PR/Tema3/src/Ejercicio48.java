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
        String inputPin = new Scanner(System.in).nextLine();

        // Loop
        for(String key : map.keySet()) {
            if(key.equalsIgnoreCase(inputName)) {
                if(map.get(key).equals(Integer.parseInt(inputPin))) {
                    System.out.println("Acceso permitido");
                } else {
                    System.out.println("Usuario incorrecto");
                }
            }
        }
    }
}
