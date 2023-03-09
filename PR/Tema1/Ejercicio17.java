public class Ejercicio17 {
    public static void main(String[] args) {
//         Ejercicio 17 : Considera la función, haz un programa que muestre por pantalla los valores de f(0), f(1) y f(-2)
        double f0 = (3.0 * (0.0 / 2.0) * (0.0 / 2.0) * (0.0 / 2.0)) / ((0.0 * 0.0) - (0.0) + (3.0));
        double f1 = (3.0 * (1.0 / 2.0) * (1.0 / 2.0) * (1.0 / 2.0)) / ((1.0 * 1.0) - (1.0) + (3.0));
        double f2 = (3.0 * (-2.0 / 2.0) * (-2.0 / 2.0) * (-2.0 / 2.0)) / ((-2.0 * -2.0) - (-2.0) + (3.0));
        System.out.println(f0);
        System.out.println(f1);
        System.out.println(f2);
    }
}
