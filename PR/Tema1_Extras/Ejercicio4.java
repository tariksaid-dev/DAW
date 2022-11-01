public class Ejercicio4 {
    public static void main(String[] args) {
        double precio = 54.44;
        int precioInt = (int)precio;
        double precioDecimales = precio - precioInt;
        System.out.println("Precio entero: " + precioInt 
        + "\nPrecio céntimos: " + precioDecimales);
    }
}
