import java.time.Duration;
import java.time.Instant;
import java.util.Random;

public class Ejercicio46 {
    public static void main(String[] args) {
//         Ejercicio 46 : Consulta la “Librería estándar de Java” y busca las clases Thread y Random. Haz
// un programa que haga una pausa de una cantidad aleatoria de segundos entre 0 y 10.
// Consulta ahora el pdf de la librería “java time” y busca las clases Instant y Duration. Obtén un
// objeto Instant antes de que empiece la pausa y luego otro objeto Instant cuando la pausa
// termine. A partir de dichos dos objetos, obtén un objeto Duration y úsalo para mostrar
// cuántos segundos ha durado la pausa.
        Random r = new Random();
        Instant a = Instant.now();
        System.out.println(a);
        try {
            Thread.sleep(r.nextInt(0, 10000));
            Instant b = Instant.now();
            System.out.println(b);
            System.out.println(Duration.between(a, b).toSeconds());
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}
