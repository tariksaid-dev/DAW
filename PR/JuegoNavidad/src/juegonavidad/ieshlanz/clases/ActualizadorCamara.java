package juegonavidad.ieshlanz.clases;

public class ActualizadorCamara {
    private PersonajePrincipal personaje;
    private Escenario escenario;

    public ActualizadorCamara(PersonajePrincipal p, Escenario e) {
        this.personaje = p;
        this.escenario = e;
    }
    
    public void actuar() {
        int xPersonaje = personaje.getX();
        int mitadPantalla = escenario.getMitadPantallaX();
        if(mitadPantalla -50 <= xPersonaje && xPersonaje <= mitadPantalla + 50) {
            if(escenario.moverCamara(4)) {
                personaje.moverX(-4);
            }
        }
    }
}
