import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Ejercicio44 {
    public static void main(String[] args) {
//         Ejercicio 44 : Consulta el pdf de la librería “java time” y busca las clases LocalDate y
// DateTimeFormatter. Haz un programa que muestre por pantalla la fecha actual en formato
// día/mes/año y después en formato día-mes-año.
        try {
            System.out.println(LocalDate.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
            System.out.println(LocalDate.now());
        } catch (DateTimeException e) {
            System.out.println(e);
        }
    }
}
