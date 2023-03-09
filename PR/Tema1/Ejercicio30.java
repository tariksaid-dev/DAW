public class Ejercicio30 {
    public static void main(String[] args) {
//         Ejercicio 30 : Un alumno ha sacado un 6.5, un 4.2, un 5.75, un 3.5 y un 8 en sus exámenes, y además,
// tiene 10 faltas. Realiza un programa que nos diga si el alumno ha aprobado, teniendo en cuenta que
// para aprobar se siguen estos criterios: 
//  Si el número de faltas es superior a 10, la nota media de los exámenes debe ser mayor que 5
//  Si el número de faltas está entre 15 y 20, la nota media de los exámenes debe ser más de 7
//  Si el número de faltas es superior a 20, está suspenso

        // Podemos usar un array para introducir los datos, ahorrar variables y obtener así la nota media.
        double[] arrayNotas = {6.5, 4.2, 5.75, 3.5, 8};
        double notaMedia = (arrayNotas[0] + arrayNotas[1] + arrayNotas[2] + arrayNotas[3] + arrayNotas[4]) / arrayNotas.length; 
        double faltas = 10;
        // System.out.println(notaMedia);

        // Ahora usamos un else if con las condiciones para que nos printee si está aprobado o suspenso.
        // Importante los 2 últimos elseif y else, para validar notas menoras a 5 y notas superiores a 5
        // sin faltas.
        if (faltas > 10) {
            if (notaMedia > 5) {
                System.out.println("Estás aprobado");
            } else {
                System.out.println("Estás suspenso");
            }
        } else if (faltas >= 15 && faltas <= 20) {
            if (notaMedia > 7) {
                System.out.println("Estás aprobado");
            } else {
                System.out.println("Estás suspenso");
            }
        } else if (faltas > 20 ) {
            System.out.println("Estás suspenso");
        } else if (notaMedia > 5) {
            System.out.println("Estás aprobado");
        } else {
            System.out.println("Estás suspenso");
        }
    }
}