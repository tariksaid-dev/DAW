import java.util.*;
import java.io.*;

public class Ejercicio {

    public class GeneradorContraseñas {
        private Random random;

        public GeneradorContraseñas() {
            random = new Random();
        }

        public GeneradorContraseñas(Random r) {
            random = r;
        }

        public String generarContraseña(int longitud) {
            String contraseña = "";
            for (int i = 0; i < longitud; i++) {
                int tipo = random.nextInt(3);
                int numero = 0;
                if (tipo == 0) {
                    numero = random.nextInt(48, 58);
                } else if (tipo == 1) {
                    numero = random.nextInt(65, 91);
                } else {
                    numero = random.nextInt(97, 123);
                }
                contraseña += (char) numero;
            }
            return contraseña;
        }

        public String generarContraseña() {
            return generarContraseña(8);
        }

    }

    public class GeneradorContraseñasUnicas extends GeneradorContraseñas {
        private Set<String> contraseñasGeneradas;

        public GeneradorContraseñasUnicas() {
            super();
            contraseñasGeneradas = new HashSet<>();
        }

        public GeneradorContraseñasUnicas(Random r) {
            super(r);
            contraseñasGeneradas = new HashSet<>();
        }

        @Override
        public String generarContraseña(int longitud) {
            String contraseña = "";
            do {
                contraseña = super.generarContraseña(longitud);
            } while (contraseñasGeneradas.contains(contraseña));
            contraseñasGeneradas.add(contraseña);
            return contraseña;
        }

        @Override
        public String generarContraseña() {
            return generarContraseña(8);
        }
    }

    public class GeneradorContraseñasArchivo extends GeneradorContraseñas {
        private File archivo;

        public GeneradorContraseñasArchivo(String ruta) {
            super();
            archivo = new File(ruta);
        }

        public GeneradorContraseñasArchivo(String ruta, Random r) {
            super(r);
            archivo = new File(ruta);
        }

        @Override
        public String generarContraseña(int longitud) {
            String contraseña = super.generarContraseña(longitud);
            try (PrintWriter pw = new PrintWriter(new FileWriter(archivo, true))) {
                pw.println(contraseña);
            } catch (IOException e) {
                System.out.println("Error al escribir en el archivo");
            }
            return contraseña;
        }
    }

    public class GeneradorContraseñasInvertidas extends GeneradorContraseñasUnicas {
        public GeneradorContraseñasInvertidas() {
            super();
        }

        public GeneradorContraseñasInvertidas(Random r) {
            super(r);
        }

        @Override
        public String generarContraseña(int longitud) {
            String contraseña = super.generarContraseña(longitud);
            String contraseñaInvertida = "";
            for (int i = 0; i < contraseña.length(); i++) {
                char c = contraseña.charAt(i);
                if (Character.isUpperCase(c)) {
                    contraseñaInvertida += Character.toLowerCase(c);
                } else if (Character.isLowerCase(c)) {
                    contraseñaInvertida += Character.toUpperCase(c);
                } else {
                    contraseñaInvertida += c;
                }
            }
            return contraseñaInvertida;
        }
    }

    public class GeneradorContraseñasRaras extends GeneradorContraseñasUnicas {
        public GeneradorContraseñasRaras() {
            super();
        }

        public GeneradorContraseñasRaras(Random r) {
            super(r);
        }

        @Override
        public String generarContraseña(int longitud) {
            // Genera una contraseña única y sustituye cada uno de sus caracteres por el que
            // se obtiene sumando 122 a su código ASCII
            String contraseña = super.generarContraseña(longitud);
            String contraseñaRara = "";
            for (int i = 0; i < contraseña.length(); i++) {
                char c = contraseña.charAt(i);
                contraseñaRara += (char) (c + 122);
            }
            return contraseñaRara;
        }
    }
}
