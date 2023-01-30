package ejercicio9;

import java.time.*;

public class Adivinanza {
    private String enunciado;
    private String respuestaCorrecta;
    private Instant inicio;

    public Adivinanza(String e, String c) {
        enunciado = e;
        respuestaCorrecta = c;
        inicio = null;
    }

    public String getEnunciado() {
        inicio = Instant.now();
        return enunciado;
    }

    public void comprobar(String respuesta) throws AdivinanzaException {
        if (Duration.between(inicio, Instant.now()).getSeconds() > 30) {
            throw new TiempoSuperadoException("Se ha superado el tiempo");
        } else if (!respuestaCorrecta.equals(respuesta)) {
            throw new AdivinanzaIncorrectaException("Respuesta incorrecta");
        } else {
            System.out.println("Respuesta correcta");
        }
    }
}
