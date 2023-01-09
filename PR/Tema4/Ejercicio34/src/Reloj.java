import java.time.*;

public class Reloj {
    private LocalTime hora;

    public Reloj() {
        this.hora = LocalTime.now();
    }

    public void añadir(int segundos) {
        this.hora = this.hora.plusSeconds(segundos);
    }

    public boolean esNoche() {
        return this.hora.isAfter(LocalTime.of(20, 0)) || this.hora.isBefore(LocalTime.of(6, 0));
    }

    public void esperar(int segundos) {
        try {
            Thread.sleep(segundos * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public String toString() {
        // devuelve la hora escrita ene l siguiente formato: hora minutos segundos
        return this.hora.getHour() + " " + this.hora.getMinute() + " " + this.hora.getSecond();
    }
}
