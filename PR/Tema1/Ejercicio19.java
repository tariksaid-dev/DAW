public class Ejercicio19 {
    public static void main(String[] args) {
//         Ejercicio 19 : Una academia contrata al estudiante del ejercicio anterior y le ofrece un sueldo
// mensual de 200€ fijos más el 15€ mensuales por cada alumno. Supongamos que hay 30 alumnos
// apuntados en la academia, que van una hora todas las tardes de lunes a viernes y que cada uno paga
// 100€ al mes. Realiza un programa que calcule:
// a) ¿Cuánto dinero gana el estudiante que da las clases?
// b) ¿Cuánto dinero gana la academia al mes? 
        double sueldoMensual = 200;
        double extraPorAlumno = 15;
        double numeroAlumnos = 30;
        double pagoPorAlumno = 100;
        double sueldoTotalProfesor = sueldoMensual + extraPorAlumno * numeroAlumnos;
        double gananciaAcademia = numeroAlumnos * pagoPorAlumno;
        System.out.println("El estudiante cobra cada mes un total de " + sueldoTotalProfesor + " euros.");
        System.out.println("La academia gana un total de " + gananciaAcademia +  " euros brutos al mes, los cuales se quedan en " + (gananciaAcademia - sueldoTotalProfesor) + " euros netos, al descontar el salario del estudiante que imparte clases.");
    }
}