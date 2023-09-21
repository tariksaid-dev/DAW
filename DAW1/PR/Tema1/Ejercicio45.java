import java.util.*;
public class Ejercicio45 {
    public static void main(String[] args) {
//         Haz un programa que nos diga el tipo de triángulo que forman tres longitudes A, B y C:
//  Rectángulo: A² = B² + C²
//  Acutángulo: A² < B² + C²
//  Obtusángulo: A² > B² + C²
        System.out.println("Introduce la longitud de A: ");
        double a = new Scanner(System.in).nextDouble();
        System.out.println("Introduce la longitud de B: ");
        double b = new Scanner(System.in).nextDouble();
        System.out.println("Introduce la longitud de C: ");
        double c = new Scanner(System.in).nextDouble();
        if (a*a == (b*b) + (c*c)) {
            System.out.println("Es un triángulo rectángulo.");
        } else if (a*a < (b*b) + (c*c)) {
            System.out.println("Es un triángulo acutángulo.");
        } else if (a*a > (b*b) + (c*c)) {
            System.out.println("Es un triángulo obtusángulo.");
        }
    }
}
