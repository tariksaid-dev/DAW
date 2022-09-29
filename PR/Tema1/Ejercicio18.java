public class Ejercicio18 {
    public static void main(String[] args) {
//         Ejercicio 18 : Un estudiante de universidad cobra 7€ por cada hora de sus clases particulares. Haz un
// programa que muestre por pantalla: 
// a) Cuánto ganará en un mes si tiene dos alumnos, a los que les da 2 y 3 clases semanales
// respectivamente.
// b) ¿Cuántas horas de clase debe dar al mes si quiere ganar 900€? 
        double sueldoClase = 7;
        double sueldoSemana1 = sueldoClase * 2;
        double sueldoSemana2 = sueldoClase * 3;
        double sueldoMes1 = sueldoSemana1 * 4.3;
        double sueldoMes2 = sueldoSemana2 * 4.3; 
        System.out.println("En un mes, si tiene dos alumnos, nuestro estudiante ganará " + (sueldoMes1 + sueldoMes2) + " euros.\nSi quiere ganar 900 euros, deberá dar al mes " + 900 / 7 + " clases.");
    }
}
