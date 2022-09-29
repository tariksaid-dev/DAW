import java.util.*;

public class Ejercicio31 {
    public static void main(String[] args) {
//         Ejercicio 31 : En los ciclos de Formación Profesional, un alumno que falte más de un 20% de las horas
// de clase pierde el derecho a la evaluación continua. 
// a) Realiza un programa que muestre por pantalla la cantidad máxima de faltas permitidas para
// cada una de estas asignaturas
// b) Haz que el programa pregunte al usuario por el número de faltas de un alu
        double horasLm = 128;
        double faltasPermitidasLm = horasLm * 20 / 100;
        double horasRedes = 192;
        double faltasPermitidasRedes = horasRedes * 20 / 100;
        double horasHard = 96;
        double faltasPermitidasHard = horasHard * 20 / 100;
        
        System.out.println("La cantidad de faltas permitidas en Lenguaje de marcas es de " + faltasPermitidasLm + " horas.");
        System.out.println("La cantidad de faltas permitidas en Redes es de " + faltasPermitidasRedes + " horas.");
        System.out.println("La cantidad de faltas permitidas en Hardware es de " + faltasPermitidasHard + " horas.");
        System.out.println("Introduce el número de horas que has faltado en Redes: ");
        double faltasRedes = new Scanner(System.in).nextDouble();
        if (faltasRedes < faltasPermitidasRedes) {
            System.out.println("No has superado el número de faltas máximo, no estás suspenso.");
        } else {
            System.out.println("Has superado el número de faltas máximo, estás suspenso.");
        }
    }
}
