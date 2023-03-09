import java.util.Random;

public class Ejercicio42 {
    public static void main(String[] args) {
//         Ejercicio 42 : Realiza un programa que genere un número aleatorio comprendido entre 29 y 65
// y lo muestre por pantalla. Nota: Hay dos formas posibles de hacerlo: con la clase Math y con la
// clase Random de la “Librería Estándar de Java”. Mira las dos y elige la que te resulte más fácil.
        Random r = new Random();
        System.out.println(r.nextInt(29, 65));
    }
}