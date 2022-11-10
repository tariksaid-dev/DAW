import java.util.*;
import java.io.*;
public class Ejercicio13 {
    public static void main(String[] args) {
//         Ejercicio 13: Utiliza las clases PrintWriter y BufferedReader de la librería de entrada y salida
// para realizar un programa que muestre al usuario este menú de opciones que se repite
// continuamente hasta que se pulsa la opción de salir:
//     1. Añadir nuevo alumno
//     2. Ver los datos de un alumno
//     3. Salir
//     Al pulsar cada opción, sucede esto:
//      Opción 1: El programa preguntará el dni, nombre, dirección y teléfono de un alumno y
//          guardará estos tres últimos datos en líneas diferentes en un archivo de texto llamado
//          (poner el dni).txt
//      Opción 2: El programa pregunta un dni y recupera del archivo (poner el dni).txt el
//          nombre, dirección y teléfono del alumno, mostrándolos por pantalla.
//  Opción 3: El programa finalizará.
        boolean on = true;
        while (on) {
            System.out.println("Elija una de las siguientes opciones: "
            + "\n1. Añadir nuevo alumno"
            + "\n2. Ver los datos de un alumno"
            + "\n3. Salir");
            int option = new Scanner(System.in).nextInt();
            switch (option) {
                case 1 -> {
                    System.out.println("Introduce el DNI:");
                    String dni = new Scanner(System.in).nextLine();
                    System.out.println("Introduce el nombre:");
                    String name = new Scanner(System.in).nextLine();
                    System.out.println("Introduce la dirección:");
                    String dir = new Scanner(System.in).nextLine();
                    System.out.println("Introduce el teléfono:");
                    String tlf = new Scanner(System.in).nextLine();
                    List<String> list = new ArrayList<>(Arrays.asList(dni, name, dir, tlf));
                    try {
                        File f = new File("C:/Users/trutr/Desktop/" + dni + ".txt");
                        PrintWriter pw = new PrintWriter(f);
                        for(int i = 0; i < list.size(); i++) {
                            pw.println(list.get(i));
                        }
                        pw.close();
                    } catch (IOException e) {
                        System.out.println(e);
                    }
                }
            
                case 2 -> {
                    System.out.println("Introduce un DNI:");
                    String dni = new Scanner(System.in).nextLine();
                    File f = new File("C:/Users/trutr/Desktop/" + dni + ".txt");
                    try {
                        BufferedReader bf = new BufferedReader(new FileReader   (f));
                        List<String> list = new ArrayList<>();
                        while (bf.ready()) {
                            list.add(bf.readLine());
                        }
                        list.remove(0);
                        System.out.println(list);
                        for(int i = 0; i < list.size(); i++) {
                            System.out.println(list.get(i));
                        }
                        bf.close();
                    } catch (IOException e) {
                        System.out.println(e);
                    }
                }
                case 3 -> on = false; 
            }
        }
    }
}
