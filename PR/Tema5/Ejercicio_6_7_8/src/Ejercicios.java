import bpc.daw.consola.*;
import java.util.*;

public class Ejercicios {

    public interface Teclado {
        public void escribirTexto(String mensaje);
    }

    public class TecladoJava implements Teclado {
        public void escribirTexto(String mensaje) {
            System.out.println(mensaje);
        }
    }

    public class TecladoConsolaDAW implements Teclado {

        private CapaTexto ct;

        public TecladoConsolaDAW(CapaTexto ct) {
            this.ct = ct;
        }

        public void escribirTexto(String mensaje) {
            ct.print(mensaje);
        }
    }

    public class Trabajador {
        private String dni;
        private String nombre;
        int sueldo;

        public Trabajador(String nombre, int sueldo, int numDNI, char letraDNI) {
            this.nombre = nombre;
            this.sueldo = sueldo;
            this.dni = numDNI + "" + letraDNI;
        }

        public int getSueldo() {
            return sueldo;
        }

        public String getNombre() {
            return nombre;
        }

        public String getDni() {
            return dni;
        }
    }

    public class TrabajadorTecleante extends Trabajador {
        private int pulsacionesMinuto;
        Teclado teclado;

        public TrabajadorTecleante(String n, int s, int ndni, char ldni, int ppm) {
            super(n, s, ndni, ldni);
            this.pulsacionesMinuto = ppm;
        }

        public void setTeclado(Teclado t) {
            this.teclado = t;
        }

        public Teclado getTeclado() {
            return teclado;
        }

        public int getPulsacionesMinuto() {
            return pulsacionesMinuto;
        }
    }

    public class Programador extends TrabajadorTecleante {
        private Map<String, String> lenguajes;

        public Programador(String n, int s, String ndni, char ldni, int ppm) {
            super(n, s, Integer.parseInt(ndni), ldni, ppm);
            this.lenguajes = new HashMap<String, String>();
        }

        public void aprenderLenguaje(String lenguaje, String holaMundo) {
            lenguajes.put(lenguaje, holaMundo);
        }

        public String programarHolaMundo(String lenguaje) {
            if (!lenguajes.containsKey(lenguaje)) {
                throw new IllegalStateException("No se programar en " + lenguaje);
            } else {
                return lenguajes.get(lenguaje);
            }
        }
    }

    public class Administrativo extends TrabajadorTecleante {

        public Administrativo(String n, int s, String ndni, char ldni, int ppm) {
            super(n, s, Integer.parseInt(ndni), ldni, ppm);
        }

        public void escribirInforme(String t) {
            teclado.escribirTexto(t);
        }
    }

}