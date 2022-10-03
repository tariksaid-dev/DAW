public class ejercicio34 {
    public static void main(String[] args) {
//         Ejercicio 34 : Realiza un programa con las variables que aparecen a continuación, y a continuación
// muestre por pantalla su suma y su producto.
        String n1 = "125";
        String n2 = "156";

        int n1Convertido = Integer.parseInt(n1);
        int n2Convertido = Integer.parseInt(n2);

        int suma = n1Convertido + n2Convertido;
        int producto = n1Convertido * n2Convertido;

        System.out.println(suma);
        System.out.println(producto);

    }
}
