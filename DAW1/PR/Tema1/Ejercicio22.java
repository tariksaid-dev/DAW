public class Ejercicio22 {
    public static void main(String[] args) {
//         Ejercicio 22 : Un profesor realiza un test a sus alumnos. El test tiene 30 preguntas (todas las
// preguntas valen lo mismo) con cuatro opciones cada una. Se supone que tres preguntas falladas te
// quitan una bien. Las preguntas sin contestar no quitan puntos. Realiza un programa que calcule y
// muestre por pantalla la nota de un alumno que tiene 22 preguntas bien, 6 mal y 2 sin contestar. 

        int preguntasTotales = 30;
        int notaMáxima = 10;
        int preguntasCorrectas = 22;
        int preguntasIncorrectas = 6;
        int numeroPreguntasParaRestar = 3;

        // Calculamos los puntos por pregunta.
        double puntosPorPregunta = (double)notaMáxima / preguntasTotales;

        // Calculamos los positivos y los negativos, diviendo las incorrectas entre el número de preguntas 
        // mínimo para restar.
        double puntosPositivos = puntosPorPregunta * preguntasCorrectas;
        double puntosNegativos = (preguntasIncorrectas / numeroPreguntasParaRestar) * puntosPorPregunta;

        // Restamos los negativos a los positivos y printeamos.
        double notaTotal = puntosPositivos - puntosNegativos;
        System.out.println("La nota del examen es de: " + notaTotal);
    }
}
