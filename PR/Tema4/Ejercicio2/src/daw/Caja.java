package daw;

public class Caja {
    public boolean abierto;
    public String mensaje;


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
}
