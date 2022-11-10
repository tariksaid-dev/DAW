import java.util.*;

public class Ejercicio26 {
    public static void main(String[] args) {
//         Ejercicio 26: Consulta la documentación del “Java Collection Framework” para hacer este
// programa:
//     a) Se comenzará creando un objeto List<String> y lo rellenará con un objeto
//          ArrayList<String> (se usará abstracción para ello como se vio en el tema 2).
//     b) El programa mostrará este menú de opciones, que se repetirá hasta que el usuario
//          pulse la opción de salir.
//               1. Añadir mensaje a la lista
//               2. Consultar el número de mensajes de la lista
//               3. Consultar mensaje
//               4. Comprobar mensaje
//               5. Consultar todos los mensajes
//               6. Borrar toda la lista
//               7. Salir
//     c) Lo que hay que hacer en cada opción es:
//               1. Pide al usuario que introduzca una frase y la añadirá al List<String>
//               2. Muestra en pantalla el número de elementos que hay en el List<String>
//               3. Cuando se selecciona, pueden pasar dos cosas
//                         1. Si la lista está vacía, se mostrará “No hay mensajes” y volverá al menú.
//                         2. Si la lista no está vacía, el programa preguntará el número del mensaje
//                              que se desea consultar y el usuario deberá introducir un número entre
//                              0 y la última posición válida de la lista. Si se introduce un número fuera
//                              de ese rango, el programa avisará de ello. En caso contrario, se
//                              mostrará el mensaje indicado.
//               4. Pedirá al usuario que escriba un mensaje y el programa mostrará si el mensaje
//                    está o no en la lista. En caso de que si esté, se mostrará también su número de
//                    posición.
//               5. Mostrará todos los mensajes de la lista, cada uno en una línea con el formato
//                    “El mensaje de la posición … es …”
// 6. Borra todos los mensajes de la lista
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