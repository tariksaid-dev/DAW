import punto.*;

public class App {
    public static void main(String[] args) throws Exception {
        Punto p = new Punto(200, 100);
        Punto p2 = new Punto(p);
        Punto p3 = new Punto(0.5, 100);
        System.out.println(p.x + " " + p.y);
        System.out.println(p2.x + " " + p2.y);
        System.out.println(p3.x + " " + p3.y);
    }
}
