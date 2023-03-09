public class Ejercicio31 {
    public static void main(String[] args) {
//         Ejercicio 31: Las notas de un alumno en una asignatura son: 4,6,8,5,2,9,6. El profesor solo
// calcula la media del alumno si todas sus notas son mayores o iguales a 3. Realiza un programa
// que muestre por pantalla si el alumno tiene derecho o no a que se calcule su nota media. El
// programa deberá ser eficiente, lo que significa que si se descubre una nota menor que 3, el
// programa deberá finalizar inmediatamente el bucle sin continuar analizando más notas.
        int[] list = {4,6,8,5,2,9,6};
        for(int i=0; i<list.length; i++) {
            System.out.println("a");
            if(list[i] < 3) {
                System.out.println("Estás suspenso porque una de tus notas es menor a 3");
                i=list.length;
            }
        }
    }
}
