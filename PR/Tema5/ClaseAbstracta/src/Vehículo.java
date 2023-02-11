import java.awt.*;

public abstract class Vehículo {
    private String[] pasajeros;
    private int velocidadMaximaReglamentaria;
    private Color color;

    public Vehículo(int numeroPlazas, int vm, Color c) {
        this.pasajeros = new String[numeroPlazas];
        this.velocidadMaximaReglamentaria = vm;
        this.color = c;
    }

    public void añadirPasajero(String nombre, int sitio) {
        this.pasajeros[sitio] = nombre;
    }

    public int getNumeroPasajeros() {
        int contador = 0;
        for (String i : pasajeros) {
            if (i != null) {
                contador++;
            }
        }
        return contador;
    }

    // Las clases abstractas pueden tener métodos abstractos, que deberán ser
    // programados obligatoriamente en sus clases hijas (a menos que sean
    // abstractas)

    // Las clases abstractas solo tienen sentido si se hacen clases hijas
    public abstract void mover(int x, int y);
}

class Coche extends Vehículo {
    private String matricula;
    private int potencia;

    public Coche(String m, int p, Color c, int numPasajeros) {
        super(numPasajeros, 120, c);
        matricula = m;
        potencia = p;
    }

    @Override
    public void mover(int x, int y) {
        System.out.println("El coche se mueve al punto " + x + ", " + y);
    }
}

class Bici extends Vehículo {
    private boolean timbre;

    public Bici(Color c, boolean timbre) {
        super(1, 45, c);
        this.timbre = timbre;
    }

    @Override
    public void mover(int x, int y) {
        System.out.println("La bici se mueve al punto " + x + ", " + y);

    }
}

class app {
    public static void main(String... args) {
        // No podremos usar new para crear un objeto de una clase abstracta.
        // Para obtener un objeto de una clase abstracta tendremos que hacer clases
        // hijas y usar abstracción

        // Vehículo v = new Vehículo(4,100,Color.black); -> Error

        Vehículo v = new Coche("1111aaa", 200, Color.black, 5);
        Vehículo v2 = new Bici(Color.blue, true);

        v.mover(10, 10);
        v2.mover(20, 20);
    }
}
