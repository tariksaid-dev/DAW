
public class Ejercicio38 {
    public static void main(String[] args) {
        // Ejercicio 38 : Haz un programa que calcule las dos soluciones de la ecuación 
        // ecuación: 1x^2 -5x +6 = 0
        // x = (-b ± √(b2-4ac)) / (2a)
        // root1 = (-b + √(b2-4ac)) / (2a)
        // root1 = (-b - √(b2-4ac)) / (2a)

        double a = 1;
        double b = -5;
        double c = 6;
        double resultado1 = ((-b + Math.sqrt(Math.pow(b, 2) - 4*a*c)) / (2*a));
        double resultado2 = ((-b - Math.sqrt(Math.pow(b, 2) - 4*a*c)) / (2*a));
        System.out.println(resultado1);
        System.out.println(resultado2);

    }
}    
