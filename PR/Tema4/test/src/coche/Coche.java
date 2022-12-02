package coche;


public class Coche {
    public String matrícula;
    public int velocidad;
    public boolean encendido;


    public void setVelocidad(int velocidadNueva) {
        if(velocidad > 0) {
            this.velocidad = velocidadNueva;
            this.encendido = true;
        } else {
            this.velocidad = 0; 
            this.encendido = false;
        };
    }       

    public void setVelocidadMaxima(int velocidadMaxima) {
        this.setVelocidad(velocidadMaxima);
    }
}
