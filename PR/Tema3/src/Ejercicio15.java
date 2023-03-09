import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Ejercicio15 {
    public static void main(String[] args){
// Ejercicio 15: Usa las clases LocalDate y DateTimeFormatter para hacer un programa que pregunte al usuario un número de mes (entre 1 y 12) y un año. El programa mostrará por
// pantalla todos los días de ese mes, con el siguiente formato: “día/mes/año y día de la semana”

        System.out.println("Escribe un número d eun mes (entre 1 y 12): ");
        int month = new Scanner(System.in).nextInt();
        System.out.println("Escribe un año: ");
        int año = new Scanner(System.in).nextInt();

        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter day = DateTimeFormatter.ofPattern("EEEE");

        int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        for (int i=0; i<days[month -1]; i++) {
            System.out.println(df.format(LocalDate.of(año, month, i+1)) + " " + 
            day.format(LocalDate.of(año, month, i+1)));
        }
    }
}
