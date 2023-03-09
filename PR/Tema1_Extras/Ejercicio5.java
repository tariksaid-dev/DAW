public class Ejercicio5 {
    public static void main(String[] args) {
        // refactorizar usando char.at para el sexo y poder hacer ==, y refactorizar
        // M = 109|| N = 110
        String nombre = "antonio";
        String sexo = "hombre";
        char letraNombre = nombre.charAt(0);
        int numLetraNombre = letraNombre;
        System.out.println(numLetraNombre);
        if (sexo.charAt(0) == 109) { // m
            if (numLetraNombre <= 109) {
                System.out.println("Pertenece al grupo A");
            } else {
                System.out.println("Pertenece al grupo B");
            }
        }
        if (sexo == "hombre") {
            if (numLetraNombre >= 110) {
                System.out.println("Pertenece al grupo A");
            } else {
                System.out.println("Pertenece al grupo B");
            }
        }
    }
}
