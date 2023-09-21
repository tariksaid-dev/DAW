import bpc.daw.mario.*;
import java.util.*;
public class Ejercicio6 {
    public static void main(String[] args) {
//         Ejercicio 6 : Crea un programa que pida por teclado dos coordenadas y cree un muñeco de
// Mario en ellas.
        System.out.println("Introduce la coordenada X: ");
        int coordX = new Scanner(System.in).nextInt();
        
        System.out.println("Introduce la coordenada Y: ");
        int coordY = new Scanner(System.in).nextInt();

        Mario m = new Mario(coordX, coordY);
    }
}
