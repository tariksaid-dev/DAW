public class Ejercicio21 {
    public static void main(String[] args) {
//         Ejercicio 21 : Un profesor hace un examen en el que la teoría vale un 40% de la nota y los problemas
// un 60%. En total hay 8 preguntas de teoría (todas valen lo mismo) y 4 problemas (todos valen lo
// mismo). Un alumno contesta correctamente 6 preguntas de teoría y hace bien 1 problema. Realiza
// un programa que muestre por pantalla la nota del alumno. 
        
        // Calculamos lo que vale cada respuesta correcta diviendo el número de puntos máximos totales
        // entre el número de preguntas, y lo multiplicamos por las respuestas acertadas.
        double puntosPosiblesTeoría = 4;
        int numeroPreguntasTeoría = 8;
        double puntosMáximosTeoría = puntosPosiblesTeoría / numeroPreguntasTeoría;
        int preguntasTeoríaCorrectas = 6;
        double puntosTeoríaTotal = puntosMáximosTeoría * preguntasTeoríaCorrectas;

        double puntosPosiblesProblemas = 6;
        int numeroPreguntasProblemas = 4;
        double puntosMáximosProblemas = puntosPosiblesProblemas / numeroPreguntasProblemas;
        int preguntasProblemasCorrectas = 1;
        double puntosProblemasTotal = puntosMáximosProblemas * preguntasProblemasCorrectas;

        // Finalmente sumamos los puntos obtenidos de los problemas y de la teoría y los printeamos.
        double notaTotal = (puntosTeoríaTotal) + (puntosProblemasTotal);
        System.out.println("La nota final del alumno será " + notaTotal + ".");
    }
}
