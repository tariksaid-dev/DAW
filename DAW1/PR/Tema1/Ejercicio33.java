public class Ejercicio33 {
    public static void main(String[] args) {
//         Ejercicio 33 : En una clase de 26 alumnos ha aprobado el 66% de alumnos, ha suspendido el 19.5% y
// el resto no se han presentado. Realiza un programa que muestre por pantalla el número de alumnos
// de cada tipo.

        // Introducimos las variables y calculamos los porcentajes, acto seguido eliminamos decimales de la 
        // forma que convenga
        int numeroTotalAlumnos = 26;
        double aprobados = numeroTotalAlumnos * 66 / 100; 
        double suspensos = numeroTotalAlumnos * 19.5 / 100;
        double noPresentados = numeroTotalAlumnos - ((int)aprobados + (int)suspensos);
        
        System.out.println(aprobados);
        System.out.println((int)suspensos);
        System.out.println(noPresentados);
    }
}