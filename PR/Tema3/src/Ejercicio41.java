public class Ejercicio41 {
    public static void main(String[] args) {
//         Ejercicio 41: Repite el ejercicio 24 de esta forma:
// a) Crea una lista para guardar los nombres de los alumnos
// b) Crea una tabla para guardar las notas de los alumnos, de tal forma que la fila 0 guarde
// las notas del alumno que ocupe la posición 0 de la lista y así sucesivamente.
// c) Haz un for para recorrer la lista de alumnos y después de mostrar el nombre de un
//     alumno, haz un for anidado que recorra la fila de la tabla donde están sus notas y
// calcule su nota media.
        // Data
        String[] names = {"Pepe", "Ana", "Juan", "Roberta"};
        int[][] marks = {
            {9, 5, 4, 3},
            {4, 8, 6, 5},
            {2, 5, 10, 2},
            {10, 10, 10, 9}
        };
        
        // loop
        for(int i=0; i<names.length; i++) {
            double mark = 0;
            System.out.println(names[i] + " ");
            for(int j=0; j<marks[i].length; j++) {
                mark += marks[i][j];
            }
            System.out.println("Su nota media es " + (mark/marks[i].length));
        }
    }
}
