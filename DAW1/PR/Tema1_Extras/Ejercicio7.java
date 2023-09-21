public class Ejercicio7 {
    public static void main(String[] args) {
        double a = 2;
        double b = 2;
        double c = 2;
        // -b +-raiz b2 + 4ac /2a
        double discriminante = b*b - 4*a*c;
        double dosA = 2*a;
        // 
        double menosBe = -b;

        // 
        double x = Math.sqrt(discriminante);
        // double u = Math.sqrt(24);
        // System.out.println(u);
        System.out.println(x);
        // double solucion1 = (menosBe + (Math.sqrt(determinante))) / dosA;
        // double solucion2 = (menosBe - (Math.sqrt(determinante))) / dosA;
        // System.out.println(solucion1);
        // System.out.println(solucion2);
        // 
        if (discriminante > 0) {
            System.out.println("Son dos raíces reales distintas.");
            double solucion1 = (menosBe + (Math.sqrt(discriminante))) / dosA;
            double solucion2 = (menosBe - (Math.sqrt(discriminante))) / dosA;
            System.out.println(solucion1);
            System.out.println(solucion2);
        } else if (discriminante == 0) {
            double solucionReal = -b/(2* a);
            System.out.println("Es una raíz real y su única solución es: " + solucionReal);
        } else if (discriminante < 0) {
            System.out.println("No tiene soluciones reales.");
        }
    }
}
