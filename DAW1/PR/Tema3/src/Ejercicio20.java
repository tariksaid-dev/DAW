import bpc.daw.consola.*;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.lang.Thread;



public class Ejercicio20 {
    public static void main(String[] args) {
//         Ejercicio 20: Usa la Consola DAW y las clases de Java Time para realizar un programa que
// muestre en el centro de la pantalla la hora, minutos y segundos actuales. Durante medio
// minuto, a cada segundo la pantalla se borrará y se volverá a imprimir la hora actual, dando la
// apariencia de un reloj.
        Consola c = new Consola();
        CapaTexto ct = c.getCapaTexto();
        Teclado t = c.getTeclado();
        DateTimeFormatter df = DateTimeFormatter.ofPattern("HH:mm:ss");

        while(!t.hayTeclaPulsada()) {
            ct.situarCursor(12, 30);
            LocalTime time = LocalTime.now();
            ct.print(df.format(time));
            // Podemos ahcerlo sin sleep, la condición de salida será más accesible pero el programa consumirá más recursos
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}
