import java.util.*;
public class test3 {
    public static void main(String[] args) {
                // COORDENADAS
        // Starter point
        int x = 45;
        int y = 15;
        // Tesoro
        int trX = new Random().nextInt(0, 73);
        int trY = new Random().nextInt(0, 25);
        // Proximidad tesoro
        double distance = Math.sqrt(Math.pow((x - trX), 2) + Math.pow((y - trY), 2));
        System.out.println(distance);
    }
}
