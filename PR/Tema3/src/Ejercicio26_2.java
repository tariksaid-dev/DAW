import java.util.*;
public class Ejercicio26_2 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        boolean on = true;
        while (on) {
            System.out.println("\n1. Añade mensaje a la lista");
            System.out.println("2. Consultar el número d emensajes de la lista");
            System.out.println("3. Consultar mensaje");
            System.out.println("4. Comprobar mensaje");
            System.out.println("5. Consultar todos los mensajes");
            System.out.println("6. Borrar toda la lista");
            System.out.println("7. Salir");

            int opt = new Scanner(System.in).nextInt();
            
            switch (opt) {
                case 1 -> {
                    System.out.println("Introduce una frase:");
                    String frase = new Scanner(System.in).nextLine();
                    list.add(frase);
                }
                case 2 -> {
                    System.out.println("El número de mensajes de la lista es: " + list.size());
                }
                case 3 -> {
                    if(list.size() == 0) {
                        System.out.println("No hay mensajes");
                    } else {
                        System.out.println("Qué número de mensaje deseas consultar?");
                        int opt3 = new Scanner(System.in).nextInt();
                        if(opt3<0 || opt3>list.size()) {
                            System.out.println("Número fuera de rango");
                        } else {
                            System.out.println(list.get(opt3));
                        }
                    }
                }
                case 4 -> {
                    System.out.println("Escribe un mensaje");
                    String opt4 = new Scanner(System.in).nextLine();
                    if(list.contains(opt4)) {
                        System.out.println("El mensaje se encuentra en la posición " + list.indexOf(opt4));
                    } else {
                        System.out.println("El mensaje no se encuentra en la lista");
                    }
                }
                case 5 -> {
                    for(int i=0; i<list.size(); i++) {
                        System.out.println("El mensaje de la posición " + i + " es " + list.get(i));
                    }
                }
                case 6 -> {
                    list.clear();
                    System.out.println("Se han borrado todos los mensajes de la lista");
                }
                case 7 -> {
                    on = false;
                }
            }
        }
    }
}
