package perros;

public class Perro {
    private String nombre;
    private int precio;
    private String raza;

    public Perro(String n, int p, String r) {
        if (p < 0) {
            throw new IllegalArgumentException("El precio no puede ser negativo");
        }
        nombre = n;
        precio = p;
        raza = r;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public String getRaza() {
        return raza;
    }

}
