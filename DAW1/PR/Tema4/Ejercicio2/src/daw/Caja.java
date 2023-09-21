package daw;

public class Caja {
    private boolean abierto;
    private String mensaje;


    public Caja (String m) {
        this(false, m);
    }

    public Caja(boolean a, String m) {
        this.abierto = a;
        this.mensaje = m;
    }

    public Caja() {
        this(false, "Viva el tema 7");
    }

    public void setMensaje(String m) {
        this.mensaje = m;
    }

    public void pasarMayusculas() {
        this.mensaje = this.mensaje.toUpperCase();
    }

    public void abrir() {
        this.abierto = true;
    }

    public void cerrar() {
        this.abierto = false;
    }

    public String getMensaje() {
        if(this.abierto) {
            return this.mensaje;
        } else {
            return null;
        }
    }
}
