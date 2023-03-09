import java.util.*;
public class Ejercicio49 {
    public static void main(String[] args) {
//         Ejercicio 49 : La siguiente gráfica nos muestra el número de asignaturas suspensas de unos alumnos.
// Se supone que un alumno pasa de curso si no tiene asignaturas suspensas. Realiza un programa que pregunte al usuario por un número de lista entre 0 y 4 y nos muestre por pantalla el nombre del alumno seleccionado, su número de suspensos y si pasa de curso o no.

        // Agrupamos los datos en arrays:
        String[] alumnos = {"Antonio", "Jaime", "Pedro", "Manuel", "Maite"};
        int[] numeroSuspensos = {3, 8, 2, 0, 0};

        // Preguntamos por un número de la lista: 
        System.out.println("Introduce un número de lista del 0 al 4: ");
        int numeroLista = new Scanner(System.in).nextInt();

        // Añadimos un if para asegurarnos que se ha introducido el número correcto: 
        if (numeroLista < 0 || numeroLista > 4) {
            System.out.println("Número no válido, introduce un número del 0 al 4.");
        } else {
            
            // Printeamos seleccionando los datos de los arrays, y la posición con la variable que hemos pedido: 
            System.out.println("Alumno seleccionado: " + alumnos[numeroLista]);
            System.out.println("Número de suspensos: " + numeroSuspensos[numeroLista]);
            if(numeroSuspensos[numeroLista] == 0) {
                System.out.println(alumnos[numeroLista] + " pasa de curso.");
            } else {
                System.out.println(alumnos[numeroLista] + " tendrá que repetir");
            }
        }
    }
}
