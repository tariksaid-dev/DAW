import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

public class Ejercicio45 {
    public static void main(String[] args) {
//         Ejercicio 45 : Consulta el pdf de la librería “java time” y busca las clases LocalDate y
// DayOfWeek. Haz un programa que muestre por pantalla el nombre del día de la semana que
// será el 28 de febrero de 2100.
        System.out.println(LocalDate.of(2100, 2, 28).getDayOfWeek());
    }
}